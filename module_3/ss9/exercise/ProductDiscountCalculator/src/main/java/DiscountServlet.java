import java.io.IOException;
@javax.servlet.annotation.WebServlet(name = "DiscountServlet", value = "/convert")
public class DiscountServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        float listPrice = Float.parseFloat(request.getParameter("listprice"));
        float discountPercen = Float.parseFloat(request.getParameter("discountpercen"));
        float discountAmount = listPrice * discountPercen * 0.01f;
        request.setAttribute("price", discountAmount);
        request.getRequestDispatcher("result.jsp").forward(request, response);
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }
}
