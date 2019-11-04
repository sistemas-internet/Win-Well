<%@page import="java.util.List"%>
<%@page import="model.bean.Pessoa"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    Integer id_vinculado = (Integer) session.getAttribute("id");

    String login = (String) session.getAttribute("login");
            
    if(login == null){
        RequestDispatcher redireciona = request.getRequestDispatcher("sair.jsp");
        redireciona.forward(request, response);
    }
%>
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
        
        <!-- Jquery-->
        <script src="inc/js/jquery-3.4.1.min.js"></script>
    </head>
    <body>
        <!-- Menu de navegaÃ§Ã£o fixo no topo -->
        <nav class="navbar navbar-expand-lg navbar-light bg-light">
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarTogglerDemo03" aria-controls="navbarTogglerDemo03" aria-expanded="false" aria-label="Alterna navegação">
              <span class="navbar-toggler-icon"></span>
            </button>
            <a class="navbar-brand">Agenda</a>

            <div class="collapse navbar-collapse" id="navbarTogglerDemo03">
              <ul class="navbar-nav mr-auto mt-2 mt-lg-0">
                <li class="nav-item">
                  <a class="nav-link" href="cadastrar.jsp">Cadastrar<span class="sr-only">(Página atual)</span></a>
                </li>
                <li class="nav-item">
                  <a class="nav-link" href="sair.jsp">Sair<span class="sr-only">(Página atual)</span></a>
                </li>                
              </ul>
              <form class="form-inline my-2 my-lg-0" action="Controle" method="post">
                <input type="hidden" value="<%= id_vinculado %>" name="id_vinculado">
                <input class="form-control mr-sm-2" type="search" placeholder="Pesquisar" name="nome" aria-label="Pesquisar">
                <button class="btn btn-outline-success my-2 my-sm-0" name="acao" value="pesquisar" type="submit">Pesquisar</button>
              </form>
            </div>
        </nav>
        <!-- Painel do cadastro -->
        <div class="container col-md-6 col-md-offset-3">
            <div class="panel panel-primary">
                <div class="panel-heading">
                    <h3 class="panel-title h1">Novo Cadastro</h3>
                </div>
                <div class="panel-body">
                    <form name="form_mvc" class="form-horizontal" action="Controle" method="post">
                        <div class="container">
                            <div class="row">
                                <div class="col-md-6">
                                    <div class="form-group">
                                        <label for="inputNome">Nome</label>
                                        <div class="col-lg-12">
                                            <input type="hidden" value="<%= id_vinculado%>" name="id_vinculado">
                                            <input type="text" class="form-control" id="inputNome" name="nome" placeholder="Digite seu nome" value="" required>
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label for="inputTelefone" >Telefone</label>
                                        <div class="col-lg-12">
                                            <input type="text" class="form-control" id="inputTelefone" name="telefone" placeholder="Digite seu telefone" value="" required>
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label>CEP</label>
                                        <div class="col-lg-12">
                                            <input type="number" class="form-control" id="cep teste" name="cep" placeholder="Digite seu cep" required>
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label for="Logradouro">Logradouro</label>
                                        <div class="col-lg-12">
                                            <input type="text" class="form-control" id="Logradouro" name="logradouro" placeholder="Digite seu Logradouro" required>
                                        </div>
                                    </div>
                                </div>
                                <div class="col-md-6">
                                    <div class="form-group">
                                        <label for="Bairro">Bairro</label>
                                        <div class="col-lg-12">
                                            <input type="text" class="form-control" id="Bairro" name="bairro" placeholder="Digite seu Bairro" required>
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label for="Cidade">Cidade</label>
                                        <div class="col-lg-12">
                                            <input type="text" class="form-control" id="Cidade" name="cidade" placeholder="Digite seu Cidade" required>
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label for="Estado">Estado</label>
                                        <div class="col-lg-12">
                                            <input type="text" class="form-control" maxlength="2" id="Estado" name="estado" placeholder="Digite seu Estado" required>
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label for="Mail">E-Mail</label>
                                        <div class="col-lg-12">
                                            <input type="text" class="form-control" id="Mail" name="email" placeholder="Digite seu E-Mail" value="" required>
                                        </div>
                                    </div>
                                </div>
                                <div class="col-md-12 text-center">
                                    <div class="form-group">
                                        <div class="col-lg-6 col-lg-offset-2">
                                            <button type="submit" name="acao" class="btn btn-primary" value="cadastrar">Cadastrar</button>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </form>        
                </div>      
            </div>                
        </div>
    </body>
</html>

