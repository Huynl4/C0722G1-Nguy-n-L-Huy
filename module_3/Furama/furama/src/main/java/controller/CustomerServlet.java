package controller;

import model.Customer;
import service.ICustomerService;
import service.ICustomerTypeService;
import service.impl.CustomerService;
import service.impl.CustomerTypeService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "CustomerServlet", value = "/furama")
public class CustomerServlet extends HttpServlet {
    private ICustomerService customerService = new CustomerService();
    private ICustomerTypeService customerTypeService = new CustomerTypeService();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");

        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "addCustomer":
                createCustomer(request, response);
                break;
            case "edit":
                editCustomer(request, response);
                break;
        }
    }


    private void editCustomer(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("id"));
        int customer_type_id = Integer.parseInt(request.getParameter("CustomerType"));
        String name = request.getParameter("Name");
        String date_of_birth = request.getParameter("Birthday");
        boolean gender = Boolean.parseBoolean(request.getParameter("Gender"));
        String id_card = request.getParameter("IdCard");
        String phone_number = request.getParameter("PhoneNumber");
        String email = request.getParameter("Email");
        String address = request.getParameter("Address");
        Customer customer = new Customer(id, customer_type_id, name, date_of_birth, gender, id_card, phone_number, email, address);
        boolean check = customerService.edit(customer);
        String mess = "Cập nhật không thành công";
        if (check) {
            mess = "Cập nhật thành công";
        }
        request.setAttribute("mess", mess);
        try {
            request.getRequestDispatcher("view/edit.jsp").forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private void createCustomer(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("id"));
        int customer_type_id = Integer.parseInt(request.getParameter("CustomerType"));
        String name = request.getParameter("Name");
        boolean gender = Boolean.parseBoolean(request.getParameter("Gender"));
        String date_of_birth = request.getParameter("Birthday");
        String id_card = request.getParameter("IdCard");
        String phone_number = request.getParameter("PhoneNumber");
        String email = request.getParameter("Email");
        String address = request.getParameter("Address");
        Customer customer = new Customer(id, customer_type_id, name, date_of_birth, gender, id_card, phone_number, email, address);
        String mess = "Thêm mới không thành công";
        if (customerService.add(customer)) {
            mess = "Thêm mới thành công";
        }
        request.setAttribute("mess", mess);
        try {
            request.getRequestDispatcher("view/create.jsp").forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");

        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "addCustomer":
                addCustomer(request, response);
                break;
            case "edit":
                showFormEdit(request, response);
                break;
            case "delete":
                showFormDelete(request, response);
                break;
            default:
                showCustomer(request, response);


        }

    }

    private void showFormDelete(HttpServletRequest request, HttpServletResponse response) {
        int deleteById = Integer.parseInt(request.getParameter("deleteById"));
        customerService.delete(deleteById);
        try {
            response.sendRedirect("/furama");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void showFormEdit(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("id"));
        Customer customer = customerService.findById(id);
        request.setAttribute("customer", customer);
        try {
            request.getRequestDispatcher("view/edit.jsp").forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void addCustomer(HttpServletRequest request, HttpServletResponse response) {
        try {
            request.getRequestDispatcher("/view/create.jsp").forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void showCustomer(HttpServletRequest request, HttpServletResponse response) {
        String nameSearch = request.getParameter("nameSearch");
        String addressSearch = request.getParameter("addressSearch");
        String phoneSearch = request.getParameter("phoneSearch");
        List<Customer> customerList = customerService.showList(nameSearch,addressSearch,phoneSearch);
        request.setAttribute("customerList", customerList);

        request.setAttribute("customerType", customerTypeService.showList());

        try {
            request.getRequestDispatcher("view/list.jsp").forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
