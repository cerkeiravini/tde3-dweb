<%--
  Created by IntelliJ IDEA.
  User: USER
  Date: 21/06/2019
  Time: 00:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Formulario de Opinião</title>
</head>
<body>

<h2>Formulario de Opinião</h2>

<form action="GravarCookie" method="post" style="width: 40%">
    <fieldset>
        <legend>Deixe a sua opinião</legend>

        <p>Qual Smartphone você mais gosta?</p>

        <input type="radio" name="smp" value="android">Android
        <input type="radio" name="smp" value="iphone">IPhone
        <input type="radio" name="smp" value="windowsphone">Windows Phone
        <input type="radio" name="smp" value="xaomi">Xaomi

        <hr>

        <input type="submit" value="Enviar Opinião">
    </fieldset>
</form>

</body>
</html>
