<%@ include file="/WEB-INF/views/include.jsp" %>
<%@page import="org.encuesta.dao.*"  %>
<%-- Redirected because we can't set the welcome page to a virtual URL. --%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>USERS</title>
</head>
<body>
<h3> USUARIOS ELIMINADOS</h3>
<c:choose>
<c:when test="${users.size()==0}">
<em>ERROR 1</em>
</c:when>
<c:otherwise>

<c:forEach items="${users}" var="us">

<p><c:out value="${us.id_eliminados}"/> 
<c:out value="${us.username}"/>
<c:out value="${us.password}"/>
<c:out value="${us.name}"/>
<c:out value="${us.enabled}"/>
<c:out value="${us.fecha}"/>
<c:out value="${us.elim}"/></p>
</c:forEach>
</c:otherwise>
</c:choose>
<form action=<c:url value="iniciousers.htm"/>>
<input type="submit" value="Usuarios" >
</form>
</body>
</html>