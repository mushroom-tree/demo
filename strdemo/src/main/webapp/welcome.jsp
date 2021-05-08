<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Struts2-Demo-欢迎页面</title>
</head>
<body>
Welcome:
<br>
<h1>name=<s:property value="name" /></h1>
<h1>password=<s:property value="password" /></h1>
<h1>重新登录</h1>
<s:form action="login" namespace="/" method="post">
    <s:textfield name="name" label="name"></s:textfield>
    <s:password name="password" label="password"></s:password>
    <s:submit value="login"></s:submit>
</s:form>
</body>
</html>