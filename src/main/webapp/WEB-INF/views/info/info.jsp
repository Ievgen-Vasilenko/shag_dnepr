<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <style>
        <%@include file='/resources/scripts/css.css' %>
    </style>
    <title>Realty House</title>
</head>
<body class="info">

<jsp:include page="/header"></jsp:include>

<div class="add_info">
    <div class="city_info">
        ${addId.city}
    </div>

    <div class="price_info">
        ${addId.price}$
    </div>

    <div class="text1_info">
        <p>Тип:</p>
        <p>Комнат:</p>
        <p>Этаж:</p>
        <p>Этажность:</p>
        <p>Общая:</p>
        <p>Жилая:</p>
        <p>Кухня:</p>
        <p>Тип стен:</p>
        <p>Дата подачи:</p>
    </div>
    <div class="text2_info">
        <p>${addId.realtyType}</p>
        <p>${addId.rooms}</p>
        <p>${addId.floor}</p>
        <p>${addId.numberFloors}</p>
        <p>${addId.totalArea} м2</p>
        <p>${addId.livingSpace} м2</p>
        <p>${addId.kitchen} м2</p>
        <p>${addId.wallType}</p>
        <p>${addId.addDate}</p>
    </div>

    <div class="text_add_info">
        <textarea class="area_info">${addId.announcementText}</textarea>
    </div>
    <div class="contacts_info">
        <p align="right">${addId.contactName}</p>
        <p align="right">${addId.contactPhone}</p>
    </div>
</div>
<c:if test="${addId.photo1!=null}">
    <div class="photo_info">
        <div class="ratio_image_info ratio_image_1x1_info">
            <img src="${addId.photo1}" alt="">
        </div>
    </div>
</c:if>
<c:if test="${addId.photo2!=null}">
    <div class="photo_info">
        <div class="ratio_image_info ratio_image_1x1_info">
            <img src="${addId.photo2}" alt="">
        </div>
    </div>
</c:if>
<c:if test="${addId.photo3!=null}">
    <div class="photo_info">
        <div class="ratio_image_info ratio_image_1x1_info">
            <img src="${addId.photo3}" alt="">
        </div>
    </div>
</c:if>
<c:if test="${addId.photo4!=null}">
    <div class="photo_info">
        <div class="ratio_image_info ratio_image_1x1_info">
            <img src="${addId.photo4}" alt="">
        </div>
    </div>
</c:if>
<c:if test="${addId.photo5!=null}">
    <div class="photo_info">
        <div class="ratio_image_info ratio_image_1x1_info">
            <img src="${addId.photo5}" alt="">
        </div>
    </div>
</c:if>
<c:if test="${addId.photo6!=null}">
    <div class="photo_info">
        <div class="ratio_image_info ratio_image_1x1_info">
            <img src="${addId.photo6}" alt="">
        </div>
    </div>
</c:if>
<c:if test="${addId.photo7!=null}">
    <div class="photo_info">
        <div class="ratio_image_info ratio_image_1x1_info">
            <img src="${addId.photo7}" alt="">
        </div>
    </div>
</c:if>

<div class="fot"></div>
<div class="bot">
    <p>Copyright Realty House, Inc. 2018-2019.</p>
</div>
</body>
</html>
