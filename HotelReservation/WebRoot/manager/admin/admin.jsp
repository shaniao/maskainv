<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="bean" uri="/WEB-INF/struts-bean.tld"%>
<%@ taglib prefix="logic" uri="/WEB-INF/struts-logic.tld"%>
<%@ taglib prefix="html" uri="/WEB-INF/struts-html.tld"%>

<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<html>
	<head>
		<title>管理员添加</title>
	</head>
	<body>
		<form action="<%=basePath%>admin.do?method=newAdmin" method="post"
			id="adminForm">
			username :
			<input type="text" name="username" />
			<br />
			password :
			<input type="password" name="password" />
			<br />
			comment :
			<input type="text" name="comment" />
			<br />
			<input type="submit" value="添加">
		</form>
	</body>
</html>

