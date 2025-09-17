<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="java.util.ArrayList" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link rel="stylesheet" href="primeira.css">
    <style>
        .container {
            height: auto;
            min-height: 400px;
            top: 250px;
            padding-bottom: 50px;
        }

        h2 {
            margin-top: 20px;
        }

        ul {
            list-style-type: none;
            padding: 0;
            text-align: left;
            margin: 0 auto;
            width: 80%;
        }

        li {
            background-color: #f0f8ff;
            margin: 10px 0;
            padding: 10px;
            border-radius: 8px;
            box-shadow: 0 2px 4px rgba(0,0,0,0.1);
        }
    </style>
    <title>Resultado do Treino</title>
</head>
<body>
    <div class="head">
        <h1>Cidades Inteligentes com foco na saúde e bem-estar</h1> 
        <img class="logo" src="logo.jpg" alt="Logo Smart City">
        <nav>
            <a href="primeira.html"><p>Página Inicial</p></a>
            <a href="sobre.html"><p>Sobre Nós</p></a>
            <a href="serviços.html"><p>Serviços</p></a>
        </nav> 
    </div>
    <br />
    <div class="container">
        <h2>Seu Treino Personalizado</h2>
        <% 
            ArrayList<String> treino = (ArrayList<String>) request.getAttribute("treino");
            if (treino != null && !treino.isEmpty()) {
                out.println("<h3>" + treino.get(0) + "</h3>");
                out.println("<ul>");
                for (int i = 1; i < treino.size(); i++) {
                    out.println("<li>" + treino.get(i) + "</li>");
                }
                out.println("</ul>");
            } else {
                out.println("<p>Nenhum treino encontrado para as suas escolhas. Por favor, tente novamente.</p>");
            }
        %>
        <a href="treino.jsp"><button class="Novamente">Gerar Novo Treino</button></a>
    </div>
</body>
</html>