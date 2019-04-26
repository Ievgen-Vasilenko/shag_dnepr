<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <style>
        <%@include file='/resources/scripts/css.css' %>
    </style>
    <title>Realty House</title>
</head>
<body class="change_add">
<jsp:include page="/header"></jsp:include>
<div class="first_reg">
    <h1 class="h1_form">Изменение объявление</h1>
    <form id="myform" name="myform" action="changeAdd" method="post" enctype="multipart/form-data">
        <label class="label_form">Город:</label>
        <select class="select_add" id="city" name="city">
            <c:forEach items="${cities}" var="city">
                <c:choose>
                    <c:when test="${city.cityName == addId.city}">
                        <option selected value="${city.id}">${city.cityName}</option>
                    </c:when>
                    <c:otherwise>
                        <option value="${city.id}">${city.cityName}</option>
                    </c:otherwise>
                </c:choose>
            </c:forEach>
        </select>
        <label class="label_form">Тип недвижимости:</label>
        <select class="select_add" id="realtyType" name="realtyType">
            <c:forEach items="${realtyTypes}" var="realtyType">
                <c:choose>
                    <c:when test="${realtyType.typeName == addId.realtyType}">
                        <option selected value="${realtyType.id}">${realtyType.typeName}</option>
                    </c:when>
                    <c:otherwise>
                        <option value="${realtyType.id}">${realtyType.typeName}</option>
                    </c:otherwise>
                </c:choose>
            </c:forEach>
        </select>
        <label class="label_form">Тип стен:</label>
        <select class="select_add" id="wallType" name="wallType">
            <c:forEach items="${wallTypes}" var="wallType">
                <c:choose>
                    <c:when test="${wallType.typeName == addId.wallType}">
                        <option selected value="${wallType.id}">${wallType.typeName}</option>
                    </c:when>
                    <c:otherwise>
                        <option value="${wallType.id}">${wallType.typeName}</option>
                    </c:otherwise>
                </c:choose>
            </c:forEach>
        </select>
        <label class="label_form">Колл. комнат:</label>
        <input class="input_form" type="number" min="1" max="15" step="1" name="rooms" value="${addId.rooms}" required/>
        <label class="label_form">Общая площадь:</label>
        <input class="input_form" type="number" min="1" max="1500" step="0.1" name="totalArea"
               value="${addId.totalArea}" required/>
        <label class="label_form">Жилая площадь:</label>
        <input class="input_form" type="number" min="1" max="1000" step="0.1" name="livingSpace"
               value="${addId.livingSpace}" required/>
        <label class="label_form">Площадь кухни:</label>
        <input class="input_form" type="number" min="1" max="150" step="0.1" name="kitchen" value="${addId.kitchen}"
               required/>
        <label class="label_form">Этаж:</label>
        <input class="input_form" type="number" min="0" max="50" step="1" name="floor" value="${addId.floor}" required/>
        <label class="label_form">Этажность:</label>
        <input class="input_form" type="number" min="1" max="50" step="1" name="numberFloors"
               value="${addId.numberFloors}" required/>
        <label class="label_form">Год постройки:</label>
        <input class="input_form" type="number" min="1800" max="2019" step="1" name="yearBuilt"
               value="${addId.yearBuilt}" required/>
        <label class="label_form">Цена:</label>
        <input class="input_form" type="number" min="100" max="25000000" step="1" name="price" value="${addId.price}"
               required/>
        <label class="label_form">Текст объявления:</label>
        <textarea class="textarea_add" name="announcementText">${addId.announcementText}</textarea>
        <label class="label_form">Имя:</label>
        <input class="input_form" type="text" name="contactName" value="${addId.contactName}" required/>
        <label class="label_form">Телефон:</label>
        <input class="input_form" type="number" name="contactPhone" value="${addId.contactPhone}" required/>
        <label class="label_form">Добавить фото:</label>
        <input type="file" name="photo1"/>
        <input type="file" name="photo2"/>
        <input type="file" name="photo3"/>
        <input type="file" name="photo4"/>
        <input type="file" name="photo5"/>
        <input type="file" name="photo6"/>
        <input type="file" name="photo7"/>
        <input type="text" name="id" hidden value="${addId.id}">
        <input class="submit" type="submit" value="Изменить">
    </form>
</div>
<div class="fot"></div>
<div class="bot">
    <p>Copyright Realty House, Inc. 2018-2019.</p>
</div>
</body>
</html>