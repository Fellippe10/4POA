<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title>Treino Personalizado</title>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="stylesheet" href="primeira.css">

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
        <form action="TreinoServlet" method="get">
            <h1 class="titulo-dieta">Treino Personalizado</h1>
            <div>
                <label for="objetivo">Objetivo:</label><br>
                <select id="objetivo" name="objetivo" required>
                    <option value="ganho_massa">Ganho de Massa Muscular</option>
                    <option value="perda_peso">Perda de Peso</option>
                    <option value="manutencao">Manutenção</option>
                </select>
            </div>
            <div>
                <label for="nivel">Nível:</label><br>
                <select id="nivel" name="nivel" required>
                    <option value="iniciante">Iniciante</option>
                    <option value="intermediario">Intermediário</option>
                    <option value="avancado">Avançado</option>
                </select>
            </div>
            <button type="submit">Gerar Treino</button>
        </form>
    </div>
</body>
</html>
