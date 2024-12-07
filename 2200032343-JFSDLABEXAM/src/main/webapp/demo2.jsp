<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Demo2 Page</title>
</head>
<body>
    <h3>Arithmetic Operations on Demo2 Page</h3>
    <p><strong>Subtraction Result:</strong> 
        <c:choose>
            <c:when test="${subtraction != null}">
                ${subtraction}
            </c:when>
            <c:otherwise>
                N/A
            </c:otherwise>
        </c:choose>
    </p>
    <p><strong>Division Result:</strong> 
        <c:choose>
            <c:when test="${division != null}">
                ${division}
            </c:when>
            <c:otherwise>
                Division by zero is not allowed.
            </c:otherwise>
        </c:choose>
    </p>
</body>
</html>
