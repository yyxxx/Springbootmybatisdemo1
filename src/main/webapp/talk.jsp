<%--
  Created by IntelliJ IDEA.
  User: Xena
  Date: 2018/5/29
  Time: 15:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>聊天记录</title>
</head>
<body>

<center>

    <div id="main" style="border: 1px solid black; width: 600px;height: 600px ">
        客服萌萌：
            <c:forEach items="messageCatory" var="catory" varStatus="s">
                ${s.index+1},${catory.mcatory}
            </c:forEach>
        上帝有啥需求？


    </div>

    <p><input id="content" name="content" style="width: 450px"><input type="button" value="提交"> </p>
</center>


</body>
</html>
