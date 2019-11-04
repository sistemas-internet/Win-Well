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
        <div class="container col-md-8 col-md-offset-2">
            <div class="table-responsive">
                <div class="panel panel-primary">
                    <div class="panel-heading">
                        <h2 class="panel-title h1">Pessoas Cadastradas</h2>
                    </div>
                    <div class="panel-body">
                        <table class="table table-striped">
                            <thead>
                                <tr>
                                    <th>Nome</th>
                                    <th>Telefone</th>
                                    <th>E-mail</th>
                                    <th>&nbsp;</th>
                                    <th>&nbsp;</th>
                                </tr>
                            </thead>
                            <tbody>                     
                                <%
                                    /**
                                     * Cria uma lista para receber os registros
                                     * do atributo listaPessoas originado do
                                     * servlet Controle
                                     */
                                    List<Pessoa> pessoas = (ArrayList) request.getAttribute("listaPessoas");

                                    // Percorre a lista dos registros e apresenta no navegador
                                    for (Pessoa p : pessoas) {
                                %>

                                <tr>
                                    <td><%=p.getNome()%></td>
                                    <td><%=p.getTelefone()%></td>
                                    <td><%=p.getEmail()%></td>
                                    <td><a href="Controle?acao=editar&id=<%=p.getId()%>"><span class="glyphicon glyphicon-edit" aria-hidden="true"></span>&nbsp;Editar</a></td>
                                    <td><a data-toggle="modal" data-target="#modal<%=p.getId()%>"><span class="glyphicon glyphicon-remove" aria-hidden="true"></span>&nbsp;Excluir</a></td>
                                    
                                    <!-- Modal -->
                                    <div class="modal fade" id="modal<%=p.getId()%>" tabindex="-1" role="dialog" aria-labelledby="TituloModalCentralizado" aria-hidden="true">
                                      <div class="modal-dialog modal-dialog-centered" role="document">
                                        <div class="modal-content">
                                          <div class="modal-header">
                                            <h5 class="modal-title" id="TituloModalCentralizado">Confirmação para deletar</h5>
                                            <button type="button" class="close" data-dismiss="modal" aria-label="Fechar">
                                              <span aria-hidden="true">&times;</span>
                                            </button>
                                          </div>
                                          <div class="modal-body">
                                            Deseja mesmo deletar o contato <%=p.getNome()%> ?
                                          </div>
                                          <div class="modal-footer">
                                            <button type="button" class="btn btn-secondary" data-dismiss="modal">Fechar</button>
                                            <a type="button" class="btn btn-primary" href="Controle?acao=excluir&id=<%=p.getId()%>">Confirmar</a>
                                          </div>
                                        </div>
                                      </div>
                                    </div>
                                </tr>
                                <%
                                    } // Fim do laço de repetição
                                %>
                        </table>
                    </div>
                </div>
            </div>
        </div>
    <!-- JavaScript (Opcional) -->
    <!-- jQuery primeiro, depois Popper.js, depois Bootstrap JS -->
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>
    </body>
</html>
