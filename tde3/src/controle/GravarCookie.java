package controle;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet( name = "GravarCookie", urlPatterns = "/GravarCookie")
public class GravarCookie extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String smp = request.getParameter("smp");

        Cookie cookieSmp = new Cookie("Smp", smp);
        response.addCookie(cookieSmp);

        PrintWriter saida = response.getWriter();

        saida.print("<script>window.alert('Obrigado pela sua opinião!');</script>");

        response.sendRedirect("index.jsp");

        //saida.print("<script>window.location.replace('formulario.jsp');</script>");

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {



    }
}
