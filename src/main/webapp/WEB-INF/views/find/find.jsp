<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <style>
        <%@include file='/resources/scripts/css.css' %>
    </style>
    <title>Realty House</title>
</head>
<body class="find">
<jsp:include page="/header"></jsp:include>
<c:forEach items="${addsFind}" var="add">
    <div class="preview_home">
        <div class="ratio_image_home ratio_image_1x1_home">
            <img src="${add.photo1}" alt="/resources/images/noimage.png">
        </div>
        <div class="text_add_home">${add.announcementText}</div>
        <div class="price_home">${add.price}$</div>
        <div class="city_home">г. ${add.city}</div>
        <div class="rooms_home">Комнат: ${add.rooms}</div>
        <div class="area_home">${add.totalArea}/${add.livingSpace}/${add.kitchen}</div>
        <div class="floor_home">${add.floor}/${add.numberFloors}</div>
        <form action="info" method="get">
            <input type="text" name="id" hidden value="${add.id}">
            <input class="button_home" type="submit" value="Подробнее">
        </form>
    </div>
</c:forEach>

<div class="fot"></div>
<div class="bot">
    <p>Copyright Realty House, Inc. 2018-2019.</p>
</div>
</body>
</html>
