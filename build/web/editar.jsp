<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="model.bean.Pessoa"%>
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

        <!-- Painel do cadastro -->
        <div class="container col-md-6 col-md-offset-3">
            <div class="panel panel-primary">
                <div class="panel-heading">
                    <h3 class="panel-title h1">Edição do Registro</h3>
                </div>
                <div class="panel-body">
                    <form name="form_mvc" class="form-horizontal" action="Controle" method="post">
                        <%
                            /**
                             * Cria uma lista para receber os registros do
                             * atributo listaPessoas originado do servlet
                             * Controle
                             */
                            List<Pessoa> pessoa = (ArrayList) request.getAttribute("listaPessoas");

                            // Percorre a lista dos registros e apresenta no navegador
                            for (Pessoa p : pessoa) {
                        %>                              
                        <fieldset>
                            <div class="form-group">
                                <label for="inputNome" class="col-lg-2 control-label">Nome</label>
                                <div class="col-lg-10">
                                    <input type="text" class="form-control" id="inputNome" name="nome" placeholder="Digite seu nome" value="<%=p.getNome()%>">
                                </div>
                            </div>
                            <div class="form-group">
                                <label for="inputEmail" class="col-lg-2 control-label">E-mail</label>
                                <div class="col-lg-10">
                                    <input type="text" class="form-control" id="inputEmail" name="email" placeholder="Digite seu email" value="<%=p.getEmail()%>">
                                </div>
                            </div> 
                            <div class="form-group">
                                <label for="inputTelefone" class="col-lg-2 control-label">Telefone</label>
                                <div class="col-lg-10">
                                    <input type="text" class="form-control" id="inputTelefone" name="telefone" placeholder="Digite seu telefone" value="<%=p.getTelefone()%>">
                                </div>
                            </div>
                            <div class="form-group">
                                <label for="inputCep" class="col-lg-2 control-label">CEP</label>
                                <div class="col-lg-10">
                                    <input type="text" class="form-control" id="inputCep" name="cep" placeholder="Digite seu cep" value="<%=p.getCep()%>">
                                </div>
                            </div> 
                            <div class="form-group">
                                <label for="inputLogradouro" class="col-lg-2 control-label">Logradouro</label>
                                <div class="col-lg-10">
                                    <input type="text" class="form-control" id="inputLogradouro" name="logradouro" placeholder="Digite seu cep" value="<%=p.getLogradouro()%>">
                                </div>
                            </div>    
                            <div class="form-group">
                                <label for="inputBairro" class="col-lg-2 control-label">Bairro</label>
                                <div class="col-lg-10">
                                    <input type="text" class="form-control" id="inputBairro" name="bairro" placeholder="Digite seu cep" value="<%=p.getBairro()%>">
                                </div>
                            </div> 
                            <div class="form-group">
                                <label for="inputCidade" class="col-lg-2 control-label">Cidade</label>
                                <div class="col-lg-10">
                                    <input type="text" class="form-control" id="inputCidade" name="cidade" placeholder="Digite seu cep" value="<%=p.getCidade()%>">
                                </div>
                            </div>   
                            <div class="form-group">
                                <label for="inputEstado" class="col-lg-2 control-label">Estado</label>
                                <div class="col-lg-10">
                                    <input type="text" class="form-control" id="inputEstado" name="estado" placeholder="Digite seu cep" value="<%=p.getEstado()%>">
                                </div>
                            </div>
                            <div class="form-group">
                                <div class="col-lg-6 col-lg-offset-2">
                                    <button type="submit" name="acao" class="btn btn-primary" value="alterar">Salvar</button>
                                </div>
                            </div>
                        </fieldset>
                        <input type="hidden" name="id" value="<%=p.getId()%>">
                        <%
                            } // Fim do laço de repetição
                        %>                        
                    </form>        
                </div>      
            </div>                
        </div>
    </body>
</html>

