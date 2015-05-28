<%@ include file="/WEB-INF/views/include.jsp" %>
<%@ page contentType="text/html; charset=utf-8" import="org.encuesta.domain.Usuario"%>
<html>
<head>
<title>USUARIOS ELIMINADOS</title>
</head>
<body>
<h2>Welcome!</h2>

<h3> USUARIOS ELIMINADOS</h3>
<c:forEach items="${model.users}" var="us">
<c:out value="${us.id_eliminados}"/> 
<c:out value="${us.username}"/>
<c:out value="${us.password}"/>
<c:out value="${us.name}"/>
<c:out value="${us.enabled}"/>
<c:out value="${us.fecha}"/>
<c:out value="${us.elim}"/>

</c:forEach>
</body>
</html>
