<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="html" uri="/WEB-INF/struts-html.tld"%>
<%@ taglib prefix="bean" uri="/WEB-INF/struts-bean.tld"%>
<%@ taglib prefix="logic" uri="/WEB-INF/struts-logic.tld"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<title>管理员登陆</title>
		<script type="text/javascript" src="<%=basePath%>jquery.1.4.2.min.js"></script>
		<script type="text/javascript">
			$(document).ready(function(){
				$('#submit').click(function(){
					var username = $.trim($('#username').text());
					var password = $.trim($('#password').text());
					$.ajax({
						type: "POST",
						url: "<%=basePath%>admin.do?method=checkLogin",
						data: "username="+username+"&password="+password,
						dataType: "text",
						success: function(data){
							alert(data);
						}
					}); 
				});
			});
		</script>
	</head>
	<body>
		<a href="<%=basePath%>lang.do?method=selectLang&lang=zh">中文</a>&nbsp&nbsp&nbsp
		<a href="<%=basePath%>lang.do?method=selectLang&lang=en">英文</a>
		<div class="errorMsg" style="display: none;">
		</div>
		<form action="<%=basePath%>admin.do?method=login" method="post"
			id="adminForm">
			<bean:message key="login.show.username"/> :
			<input type="text" name="username" id="username" />
			<br />
			<bean:message key="login.show.password"/> :
			<input type="password" name="password" id="password" />
			<br />
			<input type="button" value="登陆" id="submit">
		</form>
	</body>
</html>
