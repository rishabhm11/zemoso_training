<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<title>List of Students</title>
<link type="text/css"
        rel="stylesheet"
        href="${pageContext.request.contextPath}/resources/css/style.css"/>
</head>
<body>

<div id="wrapper">
		<div id="header">
			<h2>Student Manager</h2>
		</div>
	</div>
	<div id="container">

    		<div id="content">
    		<input type="button" value="Add Student"
            				   onclick="window.location.href='showFormForAdd'; return false;"
            				   class="add-button"
            />

            <table>
				<tr>
					<th>First Name</th>
					<th>Last Name</th>
					<th>Email</th>
					<th>Action</th>
				</tr>

				<!-- loop over and print our customers -->
				<c:forEach var="tempStudent" items="${students}">
                <c:url var="updateLink" value="/student/showFormForUpdate">
                <c:param name="studentId" value ="${tempStudent.id}"/>
                </c:url>
                <c:url var="deleteLink" value="/student/delete">
                <c:param name="studentId" value ="${tempStudent.id}"/>
                </c:url>
					<tr>
						<td> ${tempStudent.firstName} </td>
						<td> ${tempStudent.lastName} </td>
						<td> ${tempStudent.section} </td>
						<td>
						<a href="${updateLink}">Update</a>
						|
                        <a href="${deleteLink}" onclick="if (!(confirm('Are You Sure?'))) return false">Delete</a>
						</td>
					</tr>

				</c:forEach>

            </table>
            </div>
     </div>


</body>
</html>