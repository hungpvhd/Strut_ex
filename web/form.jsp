<%--
  Created by IntelliJ IDEA.
  User: a
  Date: 2019-08-26
  Time: 23:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
  <head>
    <title>Title</title>
    <style>
      .errorMessage{
        color: red;
      }
    </style>
  </head>
  <body>

  <s:form method="POST" action="store">

    <s:textfield type="date" label="When?" name="event.date"  title="YYYY-MM-DD like 2019-01-21"/>

    <s:textfield type="time" label="Time" name="event.time"/>

    <s:textfield label=" What are you planning?" name="event.plan"/>

    <s:textfield name="event.place" label="Where? :"/>

    <s:textfield label="More info?" name="event.description"/>

    <s:submit value="Create Event" action="store"/>

  </s:form>
  </body>
</html>
