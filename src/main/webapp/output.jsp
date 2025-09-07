<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!doctype html>
<html>
<head>
    <meta charset="utf-8">
    <title>Cloud Survey</title>
    <link rel="stylesheet" href="survey.css"/>
</head>

<body>
    <h1>Thanks for joining Cloud's Survey</h1>

    <p>Here is the information that you entered:</p>

   	<label>Email:</label>
	<span>${user.email}</span><br>
	
	<label>First Name:</label>
	<span>${user.firstName}</span><br>
	
	<label>Last Name:</label>
	<span>${user.lastName}</span><br>
	
	<label>Date of Birth:</label>
	<span>${user.birthday}</span><br>
	
	<p>Survey Information</p>
	
	<label>Heard From:</label>
	<span>${user.heardFrom}</span><br>
	
	<label>Wants Updates:</label>
	<span>
		<c:choose>
        	<c:when test="${not empty user.wantsUpdates}">
            	Yes
        	</c:when>
        	<c:otherwise>
            	No
       		</c:otherwise>
    	</c:choose>
	</span><br>
		
	<label>Email OK:</label>
	<span>
    	<c:choose>
        	<c:when test="${not empty user.emailOk}">
            	Yes
        	</c:when>
        	<c:otherwise>
            	No
       		</c:otherwise>
    	</c:choose>
	</span><br>
	
	<c:if test = "${not empty user.wantsUpdates}">
		<label>Contact Via:</label>
		<span>${user.contactVia[0]}</span><br>
	</c:if>
   		
<p>To enter another email address, click on the Back 
    button in your browser or the Return button shown 
    below.</p>

    <form action="" method="get">
        <input type="hidden" name="action" value="join">
        <input type="submit" value="Return">
    </form>

</body>
</html>

