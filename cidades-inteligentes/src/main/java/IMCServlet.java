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
       
        // Lógica para cálculo de macros
        double tdee = peso * 30; // Estimativa simples de 30 kcal/kg
        
        double protein_cal = tdee * 0.30;
        double carbs_cal = tdee * 0.40;
        double fat_cal = tdee * 0.30;
        
        // Conversão de calorias para gramas
        // Proteína e carboidratos: 4 kcal/g, Gordura: 9 kcal/g
        double protein_grams = protein_cal / 4.0;
        double carbs_grams = carbs_cal / 4.0;
        double fat_grams = fat_cal / 9.0;
        
        request.setAttribute("imc", imc);
        request.setAttribute("protein_grams", protein_grams);
        request.setAttribute("carbs_grams", carbs_grams);
        request.setAttribute("fat_grams", fat_grams);
        
        request.getRequestDispatcher("resultadoIMC.jsp").forward(request, response);

    }}