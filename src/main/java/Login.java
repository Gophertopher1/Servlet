import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "/Login", urlPatterns = ("/Login"))
public class Login extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       String name = request.getParameter("user");
       String pass = request.getParameter("pass");

       if (name.equals("admin") && pass.equals("pass")){
           response.sendRedirect("Welcome.jsp");
       }else{
           response.sendRedirect("index.jsp");
       }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
