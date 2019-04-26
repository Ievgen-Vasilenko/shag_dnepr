<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <style>
        <%@include file='/resources/scripts/css.css' %>
    </style>
    <title>Realty House</title>
</head>
<body class="registration">
<jsp:include page="/header"></jsp:include>


<div class="first_reg">
    <h1 class="h1_form">Регистрация</h1>
    <form id="myform" name="myform" action="registration" method="post">
        <label class="label_form">Имя:</label>
        <input class="input_form" type="text" name="name" required/>
        <label class="label_form">Логин:</label>
        <input class="input_form" type="text" name="login" required/>
        <label class="label_form">Пароль:</label>
        <input class="input_form" type="password" name="password" required/>
        <input class="submit" type="submit" value="Зарегистрироваться">
    </form>
</div>


<div class="fot"></div>
<div class="bot">
    <p>Copyright Realty House, Inc. 2018-2019.</p>
</div>
</body>
</html>
