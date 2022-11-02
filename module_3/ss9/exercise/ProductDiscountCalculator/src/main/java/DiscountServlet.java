import java.io.IOException;
@javax.servlet.annotation.WebServlet(name = "DiscountServlet", value = "/convert")
public class DiscountServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        float ListPrice = Float.parseFloat(request.getParameter("listprice"));
        float DiscountPercen = Float.parseFloat(request.getParameter("discountpercen"));
        float DiscountAmount = ListPrice * DiscountPercen * 0.01f;
        request.setAttribute("price", DiscountAmount);
        request.getRequestDispatcher("result.jsp").forward(request, response);
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }
}
