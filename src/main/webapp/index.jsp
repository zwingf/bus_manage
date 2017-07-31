<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>demo演示页面</title>
</head>


<br>
<h2>Hello World!</h2>

请输入查询ID：<input type="text" name="id" id="id">
<a href="<%=request.getContextPath()%>/demo/selectById.do?id='document'"> 查询</a>
${entity}
</body>
</html>
