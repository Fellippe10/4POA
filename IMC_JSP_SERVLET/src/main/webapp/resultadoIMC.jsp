<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>

<html>

<head>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="newcss.css">
<title>Resultado do IMCS - Só JSP</title>
</head>

<body>
 <div class="head">
        <h1>Bem vindo a Calculadora de IMC</h1>
    </div>
    
    <div class="container">
    <% float imc = Float.parseFloat(request.getAttribute("imc").toString()); %>
    
    
    
    
    <h2>O seu IMC é: <%= imc %></h2>
    <% if (imc < 18.5) { %>
    <h2>Você está abaixo do peso.</h2>
    <% } else if (imc >= 18.5 && imc < 24.9) { %>
    <h2>Você está com peso normal.</h2>
    <% } else if (imc >= 24.9 && imc < 30) { %>
    <h2>Você está acima do peso.</h2>
    <% } else if (imc >= 30 && imc <= 34.9) { %>
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
    <p>Obesidade Grau I: entre 30.0 e 34.9</p>
    <p>Obesidade Grau II: entre 35.0 e 39.9</p>
    <p>Obesidade Grau III ou Mórbida: maior que 40.0</p>
    
    <br>
    
<a href="index.jsp"><button class="Novamente">Calcular Novamente</button></a>
    <br>
</div>
</body>

</html>