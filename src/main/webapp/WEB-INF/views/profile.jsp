<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/style.css">
    <title>Title</title>
</head>
<body>
    ${client.name}<br>
    <c:forEach var="quest" items="${quests}">
        <div id="quest${quest.id}" class="quest" onclick="startGame('${quest.id}')">
            <c:forEach var="category" items="${quest.categories}">
                ${category}
            </c:forEach>
            <hr>
            ${quest.difficulty}
            <hr>
            ${quest.name}
            <hr>
            ${quest.description}
        </div>
    </c:forEach>
    <form name='logoutForm' action='logout' method="POST">
        <input name="submit" type="submit" value="submit" />
    </form>

    <script type="text/javascript" src="/js/jquery.js"></script>
    <script type="text/javascript" src="/js/global.js"></script>
    <script type="text/javascript" src="/js/game.js"></script>
    <script type="text/javascript" src="/js/handlebars.js"></script>
</body>
</html>
