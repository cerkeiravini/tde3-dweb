package controle;
import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;

@WebServlet( name = "FotoSmartphone", urlPatterns = "/FotoSmartphone")
public class FotoSmartphone extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        Cookie[] cookies = request.getCookies();
        String smp = null;

        for (Cookie c : cookies) {
            if (c.getName().compareTo("Smp") == 0)
                smp = c.getValue();
        }

        response.setContentType("image/png");
        OutputStream saida = response.getOutputStream();

        File arq = new File("img/smp" + smp + "jpg");

        BufferedImage buffer = ImageIO.read(arq);
        ImageIO.write(buffer, "jpg", saida);

        saida.close();

    }
}
