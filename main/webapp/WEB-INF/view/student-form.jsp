<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<title>Student Registration form</title>
</head>
<body>

    <form:form action="processForm" modelAttribute="student">
    First name: <form:input path="firstName"/>
    <br>
    Last name: <form:input path="lastName"/>
        <br>
    Course:
    <form:select path="course">

    <form:option value="Science" label="Science"/>
    <form:option value="Commerce" label="Commerce"/>
    <form:option value="Humanities" label="Humanities"/>

    </form:select>
    <br>
    Langauge:
    Java <form:radiobutton path="favLanguage" value="java"/>
    c++ <form:radiobutton path="favLanguage" value="c++"/>
    c <form:radiobutton path="favLanguage" value="c"/>
    ruby <form:radiobutton path="favLanguage" value="ruby"/>
    <br>

     <input type="submit" value="Submit"/>
     </form:form>


</body>

</html>