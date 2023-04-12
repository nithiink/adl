<%@ page language="java" %>
<html>
  <head>
    <title>Cookie Example</title>
  </head>
  <body>
    <% String value = request.getParameter("value"); if (value != null &&
    !value.equals("")) { Cookie cookie = new Cookie("myCookie", value);
    cookie.setMaxAge(3600); // set the cookie to expire in 1 hour
    response.addCookie(cookie); } %>
    <form method="get">
      <label>Enter a value:</label>
      <input type="text" name="value" />
      <input type="submit" value="Submit" />
    </form>
    <% Cookie[] cookies = request.getCookies(); if (cookies != null) { for
    (Cookie cookie : cookies) { if (cookie.getName().equals("myCookie")) {
    out.println("The value of myCookie is: " + cookie.getValue()); break; } } }
    %>
  </body>
</html>
