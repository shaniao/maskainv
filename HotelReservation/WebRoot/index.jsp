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
									src="http://www.hrs.cn/themes/hrs/images/logo_hrs.gif" />
							</a>
						</h1>
						<p class="hotlineInfo">
							<img src="http://www.hrs.cn/themes/hrs/images/hotlineInfo.gif"
								alt="HRS免费预定热线（中国）：800 720 1388 ／ 400 720 1388" />
						</p>
						<ul class="topNav">
							<!-- block.tpl.php begin -->

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
								<a><i class="zh_CN">简体中文</i>
								</a>

							</li>
							<!-- block.tpl.php end -->
						</ul>
						<!-- block.tpl.php begin -->

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
								<a href="/article">旅行博客</a>
								<ul>
									<li id="menu-2654" class="menu-path-taxonomy-term-761">
										<a href="/article/destination-guides">目的地指南</a>
									</li>
									<li id="menu-2655" class="menu-path-taxonomy-term-759">
										<a href="/article/food-shopping">美食购物</a>
									</li>
									<li id="menu-2656" class="menu-path-taxonomy-term-760">
										<a href="/article/transportation-accommodation">交通住宿</a>
									</li>
									<li id="menu-2657" class="menu-path-taxonomy-term-756">
										<a href="/article/travel-strategies">游记攻略</a>
									</li>

									<li id="menu-2658" class="menu-path-taxonomy-term-772">
										<a href="/article/special">特色专题</a>
									</li>
									<li id="menu-2659" class="menu-path-taxonomy-term-763">
										<a href="/article/promotion">官方活动</a>
									</li>
								</ul>
							</li>
							<li id="menu-630" class="menu-path-node-1345">
								<a href="/corporate-services">商旅管家</a>
							</li>
							<li id="menu-633" class="menu-path-node-9">
								<a href="/mobile">手机订房</a>
							</li>
							<li id="menu-643" class="menu-path-node-4766">
								<a href="/campaign/best-price-guarantee">酒店低价保障</a>
							</li>
							<li id="menu-3696" class="menuparent menu-path-node-10029">
								<a href="/campaign/201008ccc">全球酒店房价猜猜猜</a>
								<ul>
									<li id="menu-3672" class="menu-path-node-9882">
										<a href="/campaign/2010movie#week-4">游遍世界 电影随行</a>
									</li>
									<li id="menu-3619" class="menu-path-node-9735">
										<a href="/campaign/2010wine">专题:葡萄酒寻魅</a>
									</li>

								</ul>
							</li>
							<li id="menu-258" class="menu-path-node-1458">
								<a href="/international" target="_blank">HRS Global Site</a>
							</li>
						</ul>

					</div>
					<!-- header end -->

					<div id="content"></div>
					<div id="footer">
						<div id="corner01"></div>
						<div id="corner02"></div>
					</div>
				</div>
			</div>
		</div>
	</body>
</html>
