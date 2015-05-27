<%@page contentType="text/html; charset=utf-8" import="org.encuesta.dao.UsuarioDaoImpl"%>
<html>
<body>
<h2>USERS</h2>
<form action="iniciousers">
<input type="submit" value="Usuarios" >

</form>
<%
UsuarioDaoImpl user=new UsuarioDaoImpl();
%>
<% out.println( user.findUsuario("Davis")); %>
</body>
</html>
