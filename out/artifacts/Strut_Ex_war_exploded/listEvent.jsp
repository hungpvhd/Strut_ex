<%--
  Created by IntelliJ IDEA.
  User: a
  Date: 2019-08-26
  Time: 23:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<ul>
    <s:iterator value="eventList">
        <li>
            <div>
                <label>Id : </label>
                <s:property value="id"/>
            </div>
            <div>
                <label>When?  : </label>
                <s:property value="date"/>
            </div>
            <div>
                <label>Time  : </label>
                <s:property value="time"/>
            </div>
            <div>
                <label>planning : </label>
                <s:property value="plan"/>
            </div>
            <div>
                <label>place  : </label>
                <s:property value="place"/>
            </div>
            <div>
                <label>description : </label>
                <s:property value="description"/>
            </div>
            <div>
                <s:form action="edit">
                    <s:textfield name="event.description" value="%{description}" type="hidden"/>
                    <s:textfield name="event.place" value="%{place}" type="hidden"/>
                    <s:textfield name="event.plan" value="%{plan}" type="hidden"/>
                    <s:textfield name="event.date" value="%{date}" type="hidden"/>
                    <s:textfield name="event.time" value="%{time}" type="hidden"/>
                    <s:submit action="edit" value="Edit"/>
                </s:form>
            </div>
            <div>
                <s:form action="delete">
                    <s:textfield name="event.id" value="%{id}" type="hidden"/>
                    <s:textfield name="event.description" value="%{description}" type="hidden"/>
                    <s:textfield name="event.place" value="%{place}" type="hidden"/>
                    <s:textfield name="event.plan" value="%{plan}" type="hidden"/>
                    <s:textfield name="event.date" value="%{date}" type="hidden"/>
                    <s:textfield name="event.time" value="%{time}" type="hidden"/>
                    <s:submit action="delete" value="Delete"/>
                </s:form>

            </div>
            <div>
                -----------
            </div>

        </li>
    </s:iterator>
</ul>
</body>
</html>
