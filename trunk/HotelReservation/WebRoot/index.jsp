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
		<title>订房网</title>
		<meta http-equiv="pragma" content="no-cache">
		<meta http-equiv="cache-control" content="no-cache">
		<meta http-equiv="expires" content="0">
		<meta http-equiv="keywords" content="酒店,旅行,订房,预定">
		<meta http-equiv="description" content="订房网">
		<script type="text/javascript"
			src="http://ajax.googleapis.com/ajax/libs/jquery/1.4.2/jquery.min.js"></script>
		<script type="text/javascript" src="./index.js"></script>
		<link type="text/css" rel="stylesheet" href="./themes/css/common.css" />

	</head>

	<body>
		<div id="wrapper" class="star">
			<div id="layout01">
				<div id="layout02">
					<!-- header begin -->

					<div id="heard">
						<h1>
							<a href="http://www.hrs.cn"><img alt="回到HRS首页"
									src="http://www.hrs.cn/themes/hrs/images/logo_hrs.gif" /> </a>
						</h1>
						<p class="hotlineInfo">
							<img src="http://www.hrs.cn/themes/hrs/images/hotlineInfo.gif"
								alt="HRS免费预定热线（中国）：800 720 1388 ／ 400 720 1388" />
						</p>
						<ul class="topNav">

							<li>
								<a href="http://www.hrs.cn/customer-service">客户服务</a>
								<ul>

									<li>
										<a href="http://www.hrs.cn/contact">联系HRS</a>
									</li>
									<li>
										<a href="http://www.hrs.cn/tutorial">使用指南</a>
									</li>
									<li>
										<a href="http://www.hrs.cn/faq">常见问题解答</a>
									</li>
								</ul>
							</li>
							<li class="no_sub">
								<a href="http://www.hrs.cn/subscription">订阅HRS</a>
							</li>
							<li>
								<a>合作伙伴</a>

								<ul>
									<li>
										<a target="_blank" href="http://www.hrs.cn/contracting">酒店合作</a>
									</li>

									<li>
										<a target="_blank" href="http://www.hrs.cn/corporate-services">商旅管家</a>
									</li>
									<li>
										<a target="_blank" href="http://www.hrs.cn/affiliate">合作代理</a>
									</li>
								</ul>
							</li>

							<li class="language sub">
								<a><i class="zh_CN">简体中文</i> </a>

							</li>
						</ul>

						<ul class="nice-menu nice-menu-down" id="nice-menu-1">
							<li id="menu-672" class="menu-path-front active">
								<a href="/" title="首页" class="active">首页</a>
							</li>
							<li id="menu-255" class="menuparent menu-path-node-1">
								<a href="/hotel-reservation">酒店预订</a>
								<ul>
									<li id="menu-292" class="menu-path-node-1395">
										<a href="/theme-hotels" target="_blank">主题酒店</a>
									</li>

									<li id="menu-289" class="menu-path-node-1392">
										<a href="/cancel-booking" target="_blank">修改/取消预订</a>
									</li>
									<li id="menu-291" class="menu-path-node-1394">
										<a href="/group-booking" target="_blank">团体旅行</a>
									</li>
									<li id="menu-290" class="menu-path-node-1393">
										<a href="/meeting-booking" target="_blank">会议</a>
									</li>
								</ul>
							</li>
							<li id="menu-256" class="menuparent menu-path-node">
								<a href="/article">航空订票</a>
								<ul>
									<li id="menu-2654" class="menu-path-taxonomy-term-761">
										<a href="/article/destination-guides">机票查询</a>
									</li>
									<li id="menu-2655" class="menu-path-taxonomy-term-759">
										<a href="/article/food-shopping">修改/取消预订</a>
									</li>
								</ul>
							</li>
							<li id="menu-258" class="menu-path-node-1458">
								<a href="/international" target="_blank">欢迎使用</a>
							</li>
						</ul>

					</div>
					<!-- header end -->

					<div id="content">
						<!-- 查询DIV -->
						<div class="index_banner_block index_focus">
							<div class="index_focus_left">
								<div id="search" class="index_search"
									style="background-color: blue;">
									<span>搜索~~~~~~~~~~~~</span>
									<br />
									<br />
									<br />
									<br />
									<br />
									<span>~~~~~~~~~~~~搜索</span>
								</div>
							</div>

							<div class="index_focus_right" style="background-color: green;">
								<div class="clear-block">
									<div id="block-block-50" class="block">
										<div class="block_cantent">

											<span>广告~~~~~~~~~~~~</span>
											<br />
											<br />
											<br />
											<br />
											<br />
											<span>~~~~~~~~~~~~广告</span>

										</div>
									</div>
								</div>
							</div>
						</div>
						<!-- 查询DIV结束 -->
					</div>
					<div id="footer">
						<div id="corner01"></div>
						<div id="corner02"></div>
					</div>
				</div>
			</div>
		</div>
	</body>
</html>
