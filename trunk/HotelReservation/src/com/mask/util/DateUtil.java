package com.mask.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class DateUtil {

	private static Log log = LogFactory.getLog(DateUtil.class);
	private static String defaultDatePattern = null;
	private static String timePattern = "yyyy-MM-dd HH:mm:ss";
	public static final String BUNDLE_KEY = "ApplicationResources";

	// ~ Methods
	// ================================================================

	/**
	 * Return default datePattern (yyyy-MM-dd)
	 * 
	 * @return a string representing the date pattern on the UI
	 */
	public static synchronized String getDatePattern() {
		defaultDatePattern = "yyyy-MM-dd";
		return defaultDatePattern;
	}

	/**
	 * 
	 * @return "yyyy-MM-dd HH:mm:ss";
	 */
	public static String getDateTimePattern() {
		return DateUtil.getDatePattern() + " HH:mm:ss";
	}

	/**
	 * This method attempts to convert an Oracle-formatted date in the form
	 * dd-MMM-yyyy to yyyy-MM-dd.
	 * 
	 * @param aDate
	 *            date from database as a string
	 * @return formatted string for the ui
	 */
	public static final String getDate(Date aDate) {
		SimpleDateFormat df = null;
		String returnValue = "";

		if (aDate != null) {
			df = new SimpleDateFormat(getDatePattern());
			returnValue = df.format(aDate);
		}

		return (returnValue);
	}

	/**
	 * This method generates a string representation of a date/time in the
	 * format you specify on input
	 * 
	 * @param aMask
	 *            the date pattern the string is in
	 * @param strDate
	 *            a string representation of a date
	 * @return a converted Date object
	 * @see java.text.SimpleDateFormat
	 * @throws ParseException
	 */
	public static final Date convertStringToDate(String aMask, String strDate) {
		if (strDate == null || strDate.trim().equals("")) {
			return null;
		}
		if (log.isDebugEnabled()) {
			log.debug("converting '" + strDate + "' to date with mask '"
					+ aMask + "'");
		}

		SimpleDateFormat df = new SimpleDateFormat(aMask);
		Date date = null;
		try {
			date = df.parse(strDate);
		} catch (ParseException ignore) {
			ignore.printStackTrace();
			log.error(ignore, ignore);
		}
		return (date);
	}

	/**
	 * This method returns the current date time in the format: yyyy-MM-dd HH:MM
	 * a 测试�?-正常
	 * 
	 * @param theTime
	 *            the current time
	 * @return the current date/time
	 */
	public static String getTimeNow(Date theTime) {
		return getDateTime(timePattern, theTime);
	}

	/**
	 * This method returns the current date in the format: yyyy-MM-dd
	 * 
	 * @return the current date
	 * @throws ParseException
	 */
	public static Calendar getToday() throws ParseException {
		Date today = new Date();
		SimpleDateFormat df = new SimpleDateFormat(getDatePattern());

		// This seems like quite a hack (date -> string -> date),
		// but it works ;-)
		String todayAsString = df.format(today);
		Calendar cal = new GregorianCalendar();
		cal.setTime(convertStringToDate(todayAsString));

		return cal;
	}

	/**
	 * This method generates a string representation of a date's date/time in
	 * the format you specify on input 测试�?-正常
	 * 
	 * @param aMask
	 *            the date pattern the string is in
	 * @param aDate
	 *            a date object
	 * @return a formatted string representation of the date
	 * 
	 * @see java.text.SimpleDateFormat
	 */
	public static final String getDateTime(String aMask, Date aDate) {
		SimpleDateFormat df = null;
		String returnValue = "";

		if (aDate == null) {
			log.error("aDate is null!");
		} else {
			df = new SimpleDateFormat(aMask);
			returnValue = df.format(aDate);
		}

		return (returnValue);
	}

	/**
	 * This method generates a string representation of a date based on the
	 * System Property 'dateFormat' in the format you specify on input
	 * 
	 * @param aDate
	 *            A date to convert
	 * @return a string representation of the date
	 */
	public static final String convertDateToString(Date aDate) {
		return getDateTime(getDatePattern(), aDate);
	}

	/**
	 * This method generates a string representation of a date based on the
	 * System Property 'dateFormat' in the format you specify on input
	 * 
	 * @param aDate
	 *            A date to convert
	 * @return a string representation of the date
	 */
	public static final String convertDateTimeToString(Date aDate) {
		return getDateTime(getDateTimePattern(), aDate);
	}

	/**
	 * This method converts a String to a date using the datePattern
	 * 使用"yyyy-MM-dd HH:mm:ss"来格式化字符�?
	 * 
	 * @param strDate
	 *            the date to convert (in format yyyy-MM-dd)
	 * @return a date object
	 * 
	 * @throws ParseException
	 */
	public static Date convertStringToDate(String strDate) {
		if (log.isDebugEnabled()) {
			log.debug("converting date with pattern: " + getDatePattern());
		}
		return convertStringToDate(getDatePattern(), strDate);
	}

	/**
	 * 日期字符串格式：yyyy-MM-dd HH:mm:ss
	 * 
	 * @param strDate
	 * @return
	 */
	public static Date convertStringToFullDateTime(String strDate) {
		if (log.isDebugEnabled()) {
			log.debug("converting date with pattern: " + getDatePattern());
		}

		return convertStringToDate(getDateTimePattern(), strDate);
	}

	/**
	 * 日期字符串格式：yyyy-MM-dd
	 * 
	 * @param strDate
	 * @return
	 */
	public static Date convertStringToSimpleDate(String strDate) {
		return convertStringToDate("yyyy-MM-dd", strDate);
	}

	/**
	 * 当前时间是否在开始和结束时间之内 这个方法只能按照日期判断，不能根据具体的时间判断
	 * 
	 * @param sd
	 *            �?始时�?
	 * @param ed
	 *            结束时间
	 * @return
	 */
	public static boolean isActivityDay(Date sd, Date ed) {
		Date date = new Date();
		if (sd != null && sd.after(date))
			return false;
		if (ed != null && ed.before(date))
			return false;
		return true;
	}

	public static Date addDate(Date date, int n) {
		return new Date(date.getTime() + n * 24 * 60 * 60 * 1000);
	}

	/**
	 * 获取�?始到结束的间隔天�? 日期的格式是：yyyy-MM-dd HH:mm:ss
	 * 
	 * @param start
	 * @param end
	 * @return start-end days
	 */
	public final static int diffDayCount(String beginDate, String endDate)
			throws Exception {
		java.util.Date td1 = null;
		td1 = new SimpleDateFormat(timePattern).parse(beginDate);
		long lBeginTime = td1.getTime();
		java.util.Date td2 = null;
		td2 = new SimpleDateFormat(timePattern).parse(endDate);
		long lEndTime = td2.getTime();
		int iDay = (int) ((lEndTime - lBeginTime) / 86400000);
		return iDay;
	}

	/**
	 * 指定时间是否在开始和结束时间之内 这个方法只能按照日期判断，不能根据具体的时间判断
	 * 
	 * @param date
	 *            当前时间
	 * @param sd
	 *            �?始时�?
	 * @param ed
	 *            结束时间
	 * @return
	 */
	public static boolean isActivityDay(Date date, Date sd, Date ed) {
		if (sd != null && sd.after(date))
			return false;
		if (ed != null && ed.before(date))
			return false;
		return true;
	}

	public static void main(String[] args) throws Exception {
		//    	 
		//    	 
		//    	 
		System.out.println(convertStringToFullDateTime("1983-11-13"));
		// DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		// Date date = null;
		// String str = null;
		//
		// // StringתDate
		// str = "2007-1-18";
		// try {
		// date = format.parse(str); // Thu Jan 18 00:00:00 CST 2007
		// } catch (ParseException e) {
		// e.printStackTrace();
		// }
		//		
		// System.out.println(date);
	}
}
