<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title>Cálculo do IMC Só JSP</title>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="stylesheet" href="newcss.css">
</head>

<body>
   <div class="head">
        <h1>Bem vindo a Calculadora de IMC</h1>
    </div>

<br />
<div class="container">
<form action="IMCServlet" method="get">

            <div>
                <label for="peso">Peso (kg):</label><br>
                <input type="number" id="peso" name="peso" step="0.1" required placeholder="Ex: 70.5">
            </div>
            <div>
                <label for="altura">Altura (m):</label><br>
                <input type="number" id="altura" name="altura" step="0.01" required placeholder="Ex: 1.75">
            </div>
            <button type="submit">Calcular</button>
        </form>
    </div>
</body>
</html>