<%
    /*if(rs.next()){
        true
    }else{
        false
    }*/
    session.invalidate();
    response.sendRedirect("index.jsp");

%>