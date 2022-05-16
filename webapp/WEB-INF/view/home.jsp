<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>

<html>
<head>
<title>HomePage</title>
</head>
<body>
<h1>Yo hello</h1>
<hr>
User: <security:authentication property="principal.username"/>
<br>
Role: <security:authentication property="principal.authorities"/>
<hr>
<security:authorize access="hasRole('Manager')">
<p>
		<a href="${pageContext.request.contextPath}/leaders">Leadership Meeting</a>
</p>
</security:authorize>
<security:authorize access="hasRole('Admin')">
<p>
		<a href="${pageContext.request.contextPath}/systems">IT Systems Meeting</a>
</p>
</security:authorize>
<hr>
<form:form action="${pageContext.request.contextPath}/logout" method="POST">
    <input type="submit" value="LOGOUT"/>
</form:form>
</body>
</html>