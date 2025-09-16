
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;




public class IMCServlet extends HttpServlet {
    


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String tmp = null;

        float peso = 0;

        float altura = 0;

        float imc = 0;

        tmp = request.getParameter("peso");
        peso = Float.parseFloat(tmp);

        tmp = request.getParameter("altura");
        altura = Float.parseFloat(tmp);
        imc = peso / (altura * altura);
       
        request.setAttribute("imc", imc);
        request.getRequestDispatcher("resultadoIMC.jsp").forward(request, response);

    }}

    

