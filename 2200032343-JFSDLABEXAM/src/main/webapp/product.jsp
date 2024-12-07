<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>Project Form</title>
</head>
<body>
    <h1>Project Form</h1>
    <form action="/SpringMVC/saveProject" method="post">
        <label for="projectId">Project ID:</label>
        <input type="text" id="projectId" name="projectId"><br><br>

        <label for="projectName">Project Name:</label>
        <input type="text" id="projectName" name="projectName"><br><br>

        <label for="duration">Decription:</label>
        <input type="text" id="duration" name="duration"><br><br>

        <label for="budget">Price:</label>
        <input type="text" id="budget" name="budget"><br><br>

        <button type="submit">Submit</button>
    </form>
</body>
</html>
