<%--
  Created by IntelliJ IDEA.
  User: USER
  Date: 20/06/2019
  Time: 23:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Página inicial</title>
  </head>
  <body>

  <script>window.alert('Obrigado pela sua opinião!');</script>

  <h2>Conheça esse Smartphone!</h2>

  <%
    Cookie[] cookies = request.getCookies();
    String smp = null;

    for (Cookie c : cookies) {
      if (c.getName().compareTo("Smp") == 0)
        smp = c.getValue();
    }

  %>

  <img src="img/smp <%=smp%>.jpg">

  </body>
</html>
