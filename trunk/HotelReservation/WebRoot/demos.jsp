<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<base href="<%=basePath%>">

		<title>搜索主页面</title>

	</head>

	<body>
		<h2>
			这是一个简单的搜索酒店页面
		</h2>
		<form action="loactionSearch.do" method="post" id=loactionSearchForm>
			<table>
				<tr>
					<td>
						目的地
					</td>
					<td>
						<input type="text" name="destiny" value="wuhan" />
					</td>
				</tr>
				<tr>
					<td>
						入住日期
					</td>
					<td>
						<input type="text" name="comeTime" value="暂时可以不填" />
					</td>
				</tr>
				<tr>
					<td>
						离开日期
					</td>
					<td>
						<input type="text" name="leftTime" value="暂时可以不填" />
					</td>
				</tr>
				<tr>
					<td>
						单人间数量
					</td>
					<td>
						<input type="text" name="singleRooms" value="1" />
					</td>
				</tr>
				<tr>
					<td>
						双人间数量
					</td>
					<td>
						<input type="text" name="doubleRooms" value="0" />
					</td>
				</tr>
				<tr>
					<td>
						成人数量
					</td>
					<td>
						<input type="text" name="adults" value="1" />
					</td>
				</tr>
				<tr>
					<td>
						儿童数量
					</td>
					<td>
						<input type="text" name="children" value="0" />
					</td>
				</tr>
				<tr>
					<td>
						酒店名称
					</td>
					<td>
						<input type="text" name="hotelName" />
					</td>
				</tr>
			</table>
			<input type="submit" value="搜索" />
		</form>
	</body>
</html>
