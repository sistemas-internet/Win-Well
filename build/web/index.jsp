<%-- 
    Document   : index
    Created on : 16/10/2019, 18:52:05
    Author     : Rodrigo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!doctype html>
<html lang="pt-br">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <!-- CSS -->
    <link rel="stylesheet" href="css/style.css">    
    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">

    <title>Agenda pessoal</title>
  </head>
  <body>
    <div class="container">
        <div class="row">
            <div class="col-md-12">
                <div class="row">
                    <div class="col-md-4">
                        <img style="width: 100%; height: 200px;" src="img/Auniversal.gif">
                    </div>  
                    <div class="col-md-8">
                        <h1 style="padding-top: 70px;">Agenda pessoal <span style="color: red;">A</span>universal</h1>
                    </div>
                </div>
            </div>
            <div class="col-md-12">
                <div class="row">   
                    <div class="col-md-6 borda">
                        <form metho="post" action="">
                            <h2 class="text-center">Login</h2>
                            <hr>
                            <div class="form-group">
                                <label for="email">Email</label>
                                <input type="email" class="form-control" id="email">
                            </div>
                            <div class="form-group">
                                <label for="senha">Senha</label>
                                <input type="email" class="form-control" id="senha">
                            </div>
                            <div class="form-group text-center">
                                <input class="btn btn-success" type="submit" value="login">
                            </div>
                        </form>
                    </div>
                    <div class="col-md-6 borda">
                        <form metho="post" action="">
                            <h2 class="text-center">Cadastrar</h2>
                            <hr>
                            <div class="form-group">
                                <label for="email">Email</label>
                                <input type="email" class="form-control" id="email">
                            </div>
                            <div class="form-group">
                                <label for="senha">Senha</label>
                                <input type="email" class="form-control" id="senha">
                            </div>
                            <div class="form-group text-center">
                                <input class="btn btn-success" type="submit" value="Cadastrar">
                            </div>
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <%
        session.setAttribute("usuario", "Rodriigo");
        String usuario = (String) session.getAttribute("usuario");
        if(usuario == null){
            //response.sendRedirect("logout.jsp");
            out.print("<center>Você precisa logar</center>");
        }else{
            out.print("<center>Bem vindo: " + usuario + "</center>");
        }
    %>

    <!-- Optional JavaScript -->
    <!-- jQuery first, then Popper.js, then Bootstrap JS -->
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
  </body>
</html>
