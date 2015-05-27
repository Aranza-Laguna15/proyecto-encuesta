<%@ page contentType="text/html; charset=utf-8" import="org.encuesta.domain.Usuario"%>
<html>
<head>
<title>USUARIOS ELIMINADOS</title>
</head>
<body>
<h2>Welcome!</h2>

<h3> USUARIOS ELIMINADOS</h3>

<p>
<%

Usuario user=new Usuario();
%>

<%
for (int i=0; i< 10; i++){
	
	%>
	<%= out.println( user.deleteString()) %>
	
	<% 
	}
	%>


</p>
<br>
<%--
<%
}
--%>
</body>
</html>
