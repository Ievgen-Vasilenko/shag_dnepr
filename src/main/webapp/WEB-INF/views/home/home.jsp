<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<style>
    <%@include file='/resources/scripts/css.css' %>
</style>
<head>
    <title>Realty House</title>
</head>
<body class="home">
<jsp:include page="/header"></jsp:include>


<div class="first_reg_find">
    <h1 class="h1_form_find">Быстрый поиск</h1>
    <form action="find" method="get">

        <select class="find_select" id="city" name="city">
            <option value="0 45">Город</option>
            <c:forEach items="${cities}" var="city">
                <option value="${city.id} ${city.id}">${city.cityName}</option>
            </c:forEach>
        </select>

        <select class="find_select" id="realtyType" name="realtyType">
            <option value="0 5">Тип недвижимости</option>
            <c:forEach items="${realtyTypes}" var="realtyType">
                <option value="${realtyType.id} ${realtyType.id}">${realtyType.typeName}</option>
            </c:forEach>
        </select>
        <select class="find_select" id="rooms" name="rooms">
            <option value="0 25">Колл. комнат</option>
            <option value="0 1">1</option>
            <option value="2 2">2</option>
            <option value="3 3">3</option>
            <option value="4 4">4</option>
            <option value="5 25">5+</option>
        </select>
        <select class="find_select" id="totalArea" name="totalArea">
            <option value="0 1500">Общая площадь</option>
            <option value="0 20">1-20</option>
            <option value="20 40">20-40</option>
            <option value="40 60">40-60</option>
            <option value="60 80">60-80</option>
            <option value="80 110">80-110</option>
            <option value="110 150">110-150</option>
            <option value="150 250">150-250</option>
            <option value="250 1500">250+</option>
        </select>
        <input class="submit_find" type="submit" value="Найти"/>
    </form>
</div>


<c:forEach items="${adds}" var="add">
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
