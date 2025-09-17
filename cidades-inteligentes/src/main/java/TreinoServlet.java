import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.util.ArrayList;

public class TreinoServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String objetivo = request.getParameter("objetivo");
        String nivel = request.getParameter("nivel");
        
        ArrayList<String> treino = new ArrayList<>();
        
        if ("ganho_massa".equals(objetivo)) {
            if ("iniciante".equals(nivel)) {
                treino.add("Treino de Força (Iniciante)");
                treino.add("1. Agachamento: 3x10");
                treino.add("2. Supino Reto: 3x10");
                treino.add("3. Remada Curvada: 3x10");
                treino.add("4. Desenvolvimento de Ombro: 3x10");
            } else if ("intermediario".equals(nivel)) {
                treino.add("Treino de Hipertrofia (Intermediário)");
                treino.add("1. Agachamento Livre: 4x8");
                treino.add("2. Leg Press: 4x10");
                treino.add("3. Supino Inclinado: 4x8");
                treino.add("4. Puxada Alta: 4x10");
                treino.add("5. Rosca Direta: 3x12");
            } else if ("avancado".equals(nivel)) {
                treino.add("Treino Avançado de Volume (Avançado)");
                treino.add("1. Deadlift: 5x5");
                treino.add("2. Supino com Halteres: 4x8");
                treino.add("3. Barra Fixa: 4x Max");
                treino.add("4. Remada Cavalinho: 4x8");
                treino.add("5. Elevação Lateral: 4x15");
            }
        } else if ("perda_peso".equals(objetivo)) {
            if ("iniciante".equals(nivel)) {
                treino.add("Treino para Perda de Peso (Iniciante)");
                treino.add("1. Caminhada rápida: 30 minutos");
                treino.add("2. Polichinelos: 3x20");
                treino.add("3. Prancha: 3x30s");
                treino.add("4. Burpees: 3x10");
            } else if ("intermediario".equals(nivel)) {
                treino.add("Circuito Metabólico (Intermediário)");
                treino.add("1. Corrida leve: 20 minutos");
                treino.add("2. Salto na Caixa: 4x12");
                treino.add("3. Kettlebell Swing: 4x15");
                treino.add("4. Corda Naval: 3x30s");
            } else if ("avancado".equals(nivel)) {
                treino.add("Treino de Alta Intensidade (Avançado)");
                treino.add("1. HIIT na esteira: 15 minutos (20s sprint/40s descanso)");
                treino.add("2. Clean & Jerk: 5x5");
                treino.add("3. Box Jumps: 4x10");
                treino.add("4. Push-ups explosivos: 4x15");
            }
        } else if ("manutencao".equals(objetivo)) {
            treino.add("Treino de Manutenção (Foco em Equilíbrio)");
            treino.add("1. Agachamento: 3x12");
            treino.add("2. Supino: 3x12");
            treino.add("3. Remada: 3x12");
            treino.add("4. Corrida Moderada: 20 minutos");
        }
        
        request.setAttribute("treino", treino);
        request.getRequestDispatcher("resultadoTreino.jsp").forward(request, response);
    }
}