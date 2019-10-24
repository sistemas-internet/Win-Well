<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <title>Agenda de contatos</title>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">

        <link rel="shortcut icon" href="favicon.ico" type="image/x-icon">
        <link rel="icon" href="favicon.ico" type="image/x-icon">
        
        <!-- Chamada do CSS -->
        <link rel="stylesheet" href="inc/css/style.css">
        
        <!-- Bootstrap CSS -->
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
    </head>
    <body>
        <nav class="navbar navbar-expand-lg navbar-light bg-light">
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarTogglerDemo03" aria-controls="navbarTogglerDemo03" aria-expanded="false" aria-label="Alterna navegação">
              <span class="navbar-toggler-icon"></span>
            </button>
            <a class="navbar-brand">Agenda</a>

            <div class="collapse navbar-collapse" id="navbarTogglerDemo03">
              <ul class="navbar-nav mr-auto mt-2 mt-lg-0">
                <li class="nav-item">
                  <a class="nav-link" href="Controle?acao=listar">Listar todos<span class="sr-only">(Página atual)</span></a>
                </li>
                <li class="nav-item">
                  <a class="nav-link" href="cadastrar.html">Cadastrar<span class="sr-only">(Página atual)</span></a>
                </li>
                <li class="nav-item">
                  <a class="nav-link" href="sair.jsp">Sair<span class="sr-only">(Página atual)</span></a>
                </li>                
              </ul>
              <form class="form-inline my-2 my-lg-0" action="Controle" method="post">
                <input class="form-control mr-sm-2" type="search" placeholder="Pesquisar" name="nome" aria-label="Pesquisar">
                <button class="btn btn-outline-success my-2 my-sm-0" name="acao" value="pesquisar" type="submit">Pesquisar</button>
              </form>
            </div>
        </nav>

        <!-- Painel de Mensagem -->
        <div class="container col-md-6 col-md-offset-3">
            <div class="panel panel-primary">
                <div class="panel-heading">
                    <h3 class="panel-title h1">Mensagem</h3>
                </div>
                <div class="panel-body text-justify">
                    <h4>
                        <!-- A linha abaixo apresenta a mensagem gerada no Controle -->
                        <%out.print(request.getAttribute("mensagem"));%>
                    </h4>
                </div>
            </div>
        </div>
    </body>
</html>
