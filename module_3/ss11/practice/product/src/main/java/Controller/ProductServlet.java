package Controller;

import Model.Product;
import Service.IProductService;
import Service.impl.ProductService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@javax.servlet.annotation.WebServlet(name = "ProductServlet", value = "/product")
public class ProductServlet extends javax.servlet.http.HttpServlet {
   private IProductService productService=new ProductService();
    private void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        String action = request.getParameter("action");
        switch (action) {
            case "add":
               addProduct(request, response);
                break;
            case "delete":
                removeProduct(request,response);
                break;
            case "edit":
                updateProduct(request,response);
                break;
            case "search":
                searchProduct(request,response);
                break;
            default:
                break;
        }
    }

    private void searchProduct(HttpServletRequest request, HttpServletResponse response) {
        String name=request.getParameter("input");
        Product product=productService.findByName(name);
        if(product==null){
            request.setAttribute("mess","không tìm thấy");
            try {
                request.getRequestDispatcher("view/product/search.jsp").forward(request,response);
            } catch (ServletException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }else {
            request.setAttribute("product",product);
            try {
                request.getRequestDispatcher("view/product/search.jsp").forward(request,response);
            } catch (ServletException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private void updateProduct(HttpServletRequest request, HttpServletResponse response) {
        int id= Integer.parseInt(request.getParameter("id"));
        Product product=productService.findById(id);
        String name = request.getParameter("name");
        String origin = request.getParameter("origin");
        String color = request.getParameter("color");
        String price = request.getParameter("price");
        product.setName(name);
        product.setOrigin(origin);
        product.setColor(color);
        product.setPrice(price);
        request.setAttribute("mess","sửa thành công");
        try {
            request.getRequestDispatcher("view/product/edit.jsp").forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void removeProduct(HttpServletRequest request, HttpServletResponse response) {
        int id= Integer.parseInt(request.getParameter("id"));
        productService.removeById(id);
        request.setAttribute("mess","xóa thành công");
        try {
            request.getRequestDispatcher("view/product/delete.jsp").forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void addProduct(HttpServletRequest request, HttpServletResponse response) {
        int id= Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        String origin = request.getParameter("origin");
        String color = request.getParameter("color");
        String price = request.getParameter("price");
        Product product=new Product(id,name,origin,color,price);
        productService.add(product);
        request.setAttribute("mess","thêm thành công");
        try {
            request.getRequestDispatcher("view/product/create.jsp").forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        String action = request.getParameter("action");
        if (action==null){
            action="";
        }
        switch (action) {
            case "add":
                showFormCreate(request, response);
                break;
            case "delete":
                showFormDelete(request,response);
                break;
            case "edit":
                showFormEdit(request,response);
                break;
            default:
                showList(request,response);
        }
    }

    private void showFormEdit(HttpServletRequest request, HttpServletResponse response) {
        int id= Integer.parseInt(request.getParameter("id"));
        Product product=productService.findById(id);
        request.setAttribute("product",product);
        try {
            request.getRequestDispatcher("view/product/edit.jsp").forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void showFormDelete(HttpServletRequest request, HttpServletResponse response) {
        int id= Integer.parseInt(request.getParameter("id"));
        Product product=productService.findById(id);
        request.setAttribute("product",product);
        try {
            request.getRequestDispatcher("view/product/delete.jsp").forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void showList(HttpServletRequest request, HttpServletResponse response) {
        List<Product> productList=productService.display();
        request.setAttribute("products",productList);
        try {
            request.getRequestDispatcher("view/product/display.jsp").forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void showFormCreate(HttpServletRequest request, HttpServletResponse response) {
        try {
            request.getRequestDispatcher("view/product/create.jsp").forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
