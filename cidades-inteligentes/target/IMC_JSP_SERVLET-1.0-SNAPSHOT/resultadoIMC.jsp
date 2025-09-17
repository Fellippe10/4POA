<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>

<html>

<head>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="primeira.css">
<title>Resultado do IMCS - Só JSP</title>
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
    
    <div class="container">
    <% float imc = Float.parseFloat(request.getAttribute("imc").toString());
    double protein_grams = (double) request.getAttribute("protein_grams");
    double carbs_grams = (double) request.getAttribute("carbs_grams");
    double fat_grams = (double) request.getAttribute("fat_grams");
    %>
    
    
    
    
    <h2>O seu IMC é: <%= imc %></h2>
    <% if (imc < 18.5) { %>
    <h2>Você está abaixo do peso.</h2>
    <% } else if (imc >= 18.5 && imc < 24.9) { %>
    <h2>Você está com peso normal.</h2>
    <% } else if (imc >= 24.9 && imc < 30) { %>
    <h2>Você está acima do peso.</h2>
    <% } else if 
(imc >= 30 && imc <= 34.9) { %>
    <h2>Você possui obesidade grau I.</h2>
    <% } else if (imc >= 35 && imc < 40) { %>
    <h2>Você possui obesidade grau II.</h2>
    <% } else{ %>
    <h2>Você possui obesidade grau III.</h2>
    <% } %>
    
    <br>

    <p>Magreza: menor que 18.5</p>
    <p>Normal: entre 18.5 e 24.9</p>
    <p>Sobrepeso: entre 25.0 e 29.9</p>
    <p>Obesidade Grau I: entre 
30.0 e 34.9</p>
    <p>Obesidade Grau II: entre 35.0 e 39.9</p>
    <p>Obesidade Grau III ou Mórbida: maior que 40.0</p>
    
    <br>

    <div class="macros">
        <h2>Macros para Dieta</h2>
        <p>Proteína: <%= String.format("%.2f", protein_grams) %> g</p>
        <p>Carboidratos: <%= String.format("%.2f", carbs_grams) %> g</p>
        <p>Gordura: <%= String.format("%.2f", fat_grams) %> g</p>
    </div>
    
<a href="index.jsp"><button class="Novamente">Calcular Novamente</button></a>
    <br>
</div>
</body>

</html>