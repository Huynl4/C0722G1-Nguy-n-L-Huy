import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "CustomerServlet", value = "/customer")
public class CustomerServlet extends HttpServlet {
    private static List<Customer> customerList = new ArrayList<>();

    static {
        customerList.add(new Customer("Mai Văn Hoàng", "1983-08-20", "Hà Nội", "https://vcdn1-thethao.vnecdn.net/2020/05/20/EGObC-ZXUAAZPYG-4971-1589912792.jpg?w=0&h=0&q=100&dpr=2&fit=crop&s=VaS7FEZxGR9kdoETIiKkzQ"));
        customerList.add(new Customer("Nguyễn Văn Nam","1988-02-20","Bắc Ninh","https://vtv1.mediacdn.vn/thumb_w/640/2020/3/27/1-15852869744371389154458.jpg"));
        customerList.add(new Customer("Nguyễn Thái Hòa","1998-11-11","Hải Phòng","https://cdn.bongdaplus.vn/Assets/Media/2021/12/17/26/Mbappe.jpg"));
        customerList.add(new Customer("Trần Đăng Khoa","1990-07-12","Tuyên Quang","https://media.bongda.com.vn/files/hai.phan/2017/06/09/er1-1317.jpg"));
        customerList.add(new Customer("Nguyễn Đình Thi","2007-12-19","Đồng Tháp","https://nld.mediacdn.vn/291774122806476800/2022/6/5/ttbl-5-16544165666931733549542.jpg"));

    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    request.setAttribute("customerList",customerList);
    request.getRequestDispatcher("customer.jsp").forward(request,response);
    }
}
