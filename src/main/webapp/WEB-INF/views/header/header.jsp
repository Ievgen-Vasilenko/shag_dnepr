<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<nav class="top-menu">
    <ul class="menu-main">
        <li class="left-item"><a href="home">Начальная страница</a></li>
        <c:choose>
            <c:when test="${user!=null}">
                <li class="left-item"><a href="add">Добавить объявление</a></li>
                <li class="right-item"><a href="exit">Выход</a>
                <li class="right-item"><a href="cabinet">${user.login}</a></li>
            </c:when>
            <c:otherwise>
                <li class="right-item"><a href="autorisation">Вход</a></li>
                <li class="right-item"><a href="registration">Регистрация</a></li>
            </c:otherwise>
        </c:choose>
    </ul>
</nav>








