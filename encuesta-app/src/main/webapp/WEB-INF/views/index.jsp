
<%@ include file="/WEB-INF/views/include.jsp" %>

<%-- Redirected because we can't set the welcome page to a virtual URL. --%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>USERS</title>
</head>
<body>
<h3> USUARIOS ELIMINADOS</h3>

<c:forEach items="${users}" var="us">
<p><c:out value="${us.id_eliminados}"/> 
<c:out value="${us.username}"/>
<c:out value="${us.password}"/>
<c:out value="${us.name}"/>
<c:out value="${us.enabled}"/>
<c:out value="${us.fecha}"/>
<c:out value="${us.elim}"/></p>
</c:forEach>
</body>
</html>