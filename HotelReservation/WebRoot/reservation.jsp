<%@ page language="java" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>

<html>
	<head>
		<title>JSP for ReservationForm form</title>
	</head>
	<body>
		<form action="./reservation.do?method=add" id="reservationForm" method="post">
			double_room :
			<input type="text" name="double_room" />
			<br />
			single_room :
			<input type="text" name="single_room" />
			<br />
			custom_tel :
			<input type="text" name="custom_tel" />
			<br />
			custom_name :
			<input type="text" name="custom_name" />
			<br />
			custom_email :
			<input type="text" name="custom_email" />
			<br />
			reservation_type :
			<input type="text" name="reservation_type" />
			<br />
			left_time :
			<input type="text" name="left_time" />
			<br />
			come_time :
			<input type="text" name="come_time" />
			<br />
			hotel_id :
			<input type="hidden" name="hotel_id" value="1" />
			<br />
			<input type="submit" value="submit" />
			<input type="reset" value="reset" />
		</form>
	</body>
</html>

