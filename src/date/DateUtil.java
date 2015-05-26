/** 
 * @Desription: 日期处理工具类
 * @Company: CZ
 * @ClassName: DateUtil.java
 * @Author: SamLee
 * @CreateDate: 2014-3-11
 * @UpdateUser: SamLee
 * @Version: 0.1
 */
package date;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;


/**
 * 
* @ClassName: DateUtil 
* @Description: 日期处理工具类 
* @author: SamLee
* @date: 2014-3-11
* @company CZ
 */
public abstract class DateUtil {

	/**
	 * We use the <code>Calendar</code> from JDK to achieve the target.
	 */
	private static Calendar cal = Calendar.getInstance();

	private static String dateFormat = "yyyyMMdd";

	public static final String APPLICATION_DATE_FORMAT = "yyyy-MM-dd HH:mm:ss";

	public static final String DATABASE_DATE_FORMAT = "yyyy-MM-dd HH:mm:ss";

	public static final String DATABASE_SIMPLE_DATE_FORMAT = "yyyy-MM-dd";
	
	public static final String FILENAME_DATE_FORMAT = "yyyy-MM-dd-HHmmss";

	private static final SimpleDateFormat df = new SimpleDateFormat(APPLICATION_DATE_FORMAT);

	private static final SimpleDateFormat sdbFormat = new SimpleDateFormat(DATABASE_SIMPLE_DATE_FORMAT);

	private static final SimpleDateFormat today = new SimpleDateFormat(dateFormat);
	private static final int YEAR = 1;
	private static final int MONTH = 2;
	private static final int DATE = 3;
	private static final int HOUR = 4;
	private static final int MINUTE = 5;
	private static final int SECOND = 6;
	private static final int WEEK = 7;

	private static Integer timeType = 0;

	/**
	 * @return the timeType
	 */
	private static Integer getTimeType() {
		return timeType;
	}

	/**
	 * @param timeType
	 *            the timeType to set
	 */
	private static void setTimeType(Integer timeType) {
		DateUtil.timeType = timeType;
	}

	/**
	 * Get the next day by the given date.
	 * 
	 * @param date
	 * @return
	 */
	public static Date getTomorrow(Date date) {
		setTimeType(DATE);
		return getFutureDate(date, 1);
	}

	/**
	 * Get the day by the given date after years
	 * 
	 * @param date
	 * @param years
	 * @return
	 */
	public static Date getDateAfterYear(Date date, int years) {
		setTimeType(YEAR);
		return getFutureDate(date, years);
	}

	/**
	 * Get the day by the given date after months
	 * 
	 * @param date
	 * @param months
	 * @return
	 */
	public static Date getDateAfterMonth(Date date, int months) {
		setTimeType(MONTH);
		return getFutureDate(date, months);
	}

	/**
	 * Get the future date by the date that given by.
	 * 
	 * @param date
	 * @param dates
	 * @return
	 */
	public static Date getDateAfterDate(Date date, int dates) {
		setTimeType(DATE);
		return getFutureDate(date, dates);
	}

	/**
	 * Get the future time by the hours that given by.
	 * 
	 * @param date
	 * @param hours
	 * @return
	 */
	public static Date getDateAfterHour(Date date, int hours) {
		setTimeType(HOUR);
		return getFutureDate(date, hours);
	}

	/**
	 * Get the future time by the minute that given by.
	 * 
	 * @param date
	 * @param minutes
	 * @return
	 */
	public static Date getDateAfterMinute(Date date, int minutes) {
		setTimeType(MINUTE);
		return getFutureDate(date, minutes);
	}

	/**
	 * Get the future time by the weeks that given by.
	 * 
	 * @param date
	 * @param weeks
	 * @return
	 */
	public static Date getDateAfterWeek(Date date, int weeks) {
		setTimeType(WEEK);
		return getFutureDate(date, weeks);
	}

	/**
	 * Get the future time by the second that given by.
	 * 
	 * @param date
	 * @param seconds
	 * @return
	 */
	public static Date getDateAfterSecond(Date date, int seconds) {
		setTimeType(SECOND);
		return getFutureDate(date, seconds);
	}

	/**
	 * Get the previous day by the given date.
	 * 
	 * @param date
	 * @return
	 */
	public static Date getYesterday(Date date) {
		setTimeType(DATE);
		return getHistoryDate(date, 1);
	}

	/**
	 * Get the day by the given date before years
	 * 
	 * @param date
	 * @param years
	 * @return
	 */
	public static Date getDateBeforeYear(Date date, int years) {
		setTimeType(YEAR);
		return getHistoryDate(date, years);
	}

	/**
	 * Get the day by the given date before months
	 * 
	 * @param date
	 * @param months
	 * @return
	 */
	public static Date getDateBeforeMonth(Date date, int months) {
		setTimeType(MONTH);
		return getHistoryDate(date, months);
	}

	/**
	 * Get the previous date by the date given
	 * 
	 * @param date
	 * @param dates
	 * @return
	 */
	public static Date getDateBeforeDate(Date date, int dates) {
		setTimeType(DATE);
		return getHistoryDate(date, dates);
	}

	/**
	 * Get the history time by the hours that given
	 * 
	 * @param date
	 * @param hours
	 * @return
	 */
	public static Date getDateBeforeHour(Date date, int hours) {
		setTimeType(HOUR);
		return getHistoryDate(date, hours);
	}

	/**
	 * Get the history time by the minute that given
	 * 
	 * @param date
	 * @param minutes
	 * @return
	 */
	public static Date getDateBeforeMinute(Date date, int minutes) {
		setTimeType(MINUTE);
		return getHistoryDate(date, minutes);
	}

	/**
	 * Get the history time by the second that given
	 * 
	 * @param date
	 * @param seconds
	 * @return
	 */
	public static Date getDateBeforeSecond(Date date, int seconds) {
		setTimeType(SECOND);
		return getHistoryDate(date, seconds);
	}

	/**
	 * Get the future time by the weeks that given by.
	 * 
	 * @param date
	 * @param weeks
	 * @return
	 */
	public static Date getDateBeforeWeek(Date date, int weeks) {
		setTimeType(WEEK);
		return getHistoryDate(date, weeks);
	}

	/**
	 * Get the future date by the days you given.
	 * 
	 * @param date
	 * @param times
	 * @return
	 */
	private static Date getFutureDate(Date date, int times) {
		// get time first
		cal.setTime(date);

		int timeType = getTimeType();
		switch (timeType) {
		case 1:
			cal.set(Calendar.YEAR, cal.get(Calendar.YEAR) + times);
			break;
		case 2:
			cal.set(Calendar.MONTH, cal.get(Calendar.MONTH) + times);
			break;
		case 3:
			cal.set(Calendar.DATE, cal.get(Calendar.DATE) + times);
			break;
		case 4:
			cal.set(Calendar.HOUR, cal.get(Calendar.HOUR) + times);
			break;
		case 5:
			cal.set(Calendar.MINUTE, cal.get(Calendar.MINUTE) + times);
			break;
		case 6:
			cal.set(Calendar.SECOND, cal.get(Calendar.SECOND) + times);
			break;
		case 7:
			cal.set(Calendar.DATE, cal.get(Calendar.DATE) + times * 7);
			break;
		default:
			break;
		}
		return cal.getTime();
	}

	/**
	 * Get the history date by the days you given.
	 * 
	 * @param date
	 * @param times
	 * @return
	 */
	private static Date getHistoryDate(Date date, int times) {
		// get time first
		cal.setTime(date);

		int timeType = getTimeType();
		switch (timeType) {
		case 1:
			cal.set(Calendar.YEAR, cal.get(Calendar.YEAR) - times);
			break;
		case 2:
			cal.set(Calendar.MONTH, cal.get(Calendar.MONTH) - times);
			break;
		case 3:
			cal.set(Calendar.DATE, cal.get(Calendar.DATE) - times);
			break;
		case 4:
			cal.set(Calendar.HOUR, cal.get(Calendar.HOUR) - times);
			break;
		case 5:
			cal.set(Calendar.MINUTE, cal.get(Calendar.MINUTE) - times);
			break;
		case 6:
			cal.set(Calendar.SECOND, cal.get(Calendar.SECOND) - times);
			break;
		case 7:
			cal.set(Calendar.DATE, cal.get(Calendar.DATE) - times * 7);
		default:
			break;
		}
		return cal.getTime();
	}
	
	/**
	 * converts a Date to a String with format yyyy-MM-dd
	 * 
	 * @param date
	 * @return yyyy-MM-dd
	 */
	public static String formatDate(Date date) {
		return sdbFormat.format(date);
	}
	
	/**
	 * converts a Date to a String with specific format
	 * 
	 * @param date
	 * @return format, e.g. yyyy-MM-dd
	 */
	public static String formatDate(Date date, String format) {
		return new SimpleDateFormat(format).format(date);
	}

	/**
	 * converts a String with format yyyy-MM-dd to a Date
	 * 
	 * @param string
	 * @return yyyy-MM-dd
	 */
	public static Date parseToDate(String dateString){
		try {
			return df.parse(dateString);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

	/**
	 * converts a String with format yyyy-MM-dd to a Date
	 * 
	 * @param string
	 * @return yyyy-MM-dd
	 */
	public static Date parseToSimpleDate(String dateString){
		try {
			return sdbFormat.parse(dateString);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

	/**
	 * This function is useful when building queries, it return the date's end time as a
	 * Date with time = 23:59:59
	 * 
	 * @param dateTo
	 * @return yyyy-MM-dd 23:59:59
	 */
	public static Date dateEndTime(String dateTo)
	{
		cal.setTime(parseToDate(dateTo));
		cal.set(Calendar.HOUR, 23);
		cal.set(Calendar.MINUTE, 59);
		cal.set(Calendar.SECOND, 59);
		return cal.getTime();
	}

	/**
	 * This function is useful when building queries, it returns date's begin time as a Date
	 * with time = 00:00:00
	 * 
	 * @param dateFrom
	 * @return yyyy-MM-dd 00:00:00
	 */
	public static Date dateBeginTime(String dateFrom)
	{
		cal.setTime(parseToDate(dateFrom));
		cal.set(Calendar.HOUR, 0);
		cal.set(Calendar.MINUTE, 0);
		cal.set(Calendar.SECOND, 0);
		return cal.getTime();
	}

	/**
	 * This function is useful when building queries, it return the date's end time as a
	 * Date with time = 23:59:59
	 * 
	 * @param dateTo
	 * @return yyyy-MM-dd 23:59:59
	 */
	public static Date dateEndTime(Date dateTo)
	{
		cal.setTime(dateTo);
		cal.set(Calendar.HOUR, 23);
		cal.set(Calendar.MINUTE, 59);
		cal.set(Calendar.SECOND, 59);
		return cal.getTime();
	}

	/**
	 * This function is useful when building queries, it returns date's begin time as a Date
	 * with time = 00:00:00
	 * 
	 * @param dateFrom
	 * @return yyyy-MM-dd 00:00:00
	 */
	public static Date dateBeginTime(Date dateFrom)
	{
		cal.setTime(dateFrom);
		cal.set(Calendar.HOUR, 0);
		cal.set(Calendar.MINUTE, 0);
		cal.set(Calendar.SECOND, 0);
		return cal.getTime();
	}

	/**
	 *  Receive a date argument, set its day to the last day of the month, then return it
	 * 
	 * @param month
	 * @param year
	 * @return
	 * @throws Exception
	 */
	public static Date getLastDayOfMonth(Date date)
	{
		cal.setTime(date);
		cal.set(Calendar.MONTH, cal.get(Calendar.MONTH)+1);
		cal.set(Calendar.DATE, 0);
		/*cal.set(Calendar.HOUR, 23);
		cal.set(Calendar.MINUTE, 59);
		cal.set(Calendar.SECOND, 59);*/
		return cal.getTime();
	}

	/**
	 * Receive a date argument, set its day to the first day of the month, then return it
	 * 
	 * @param date
	 * @return yyyy-MM-01
	 */
	public static Date getFirstDayOfMonth(Date date)
	{
		cal.setTime(date);
		cal.set(Calendar.DAY_OF_MONTH, 1);
		/*cal.set(Calendar.HOUR, 0);
		cal.set(Calendar.MINUTE, 0);
		cal.set(Calendar.SECOND, 0);*/
		return cal.getTime();
	}

	public static Boolean isBeforeOrToday(Date date)
	{
		cal.setTime(date);
		Calendar today = Calendar.getInstance();
		today.setTime(new Date());
		return cal.before(today) || cal.equals(today);
	}

	public static Boolean isBeforeDate(Date date)
	{
		cal.setTime(date);
		Calendar today = Calendar.getInstance();
		today.setTime(new Date());
		return cal.before(today)
				&& !(cal.get(Calendar.YEAR) == today.get(Calendar.YEAR)
						&& cal.get(Calendar.MONTH) == today.get(Calendar.MONTH)
						&& cal.get(Calendar.DATE) == today.get(Calendar.DATE));
	}

	/**
	 * return a diff months between two dates addtional day which is not full
	 * enough days of month(30), will count for 1 month
	 * 
	 * @return
	 */
	public static int getDiffMonths(Date startDate, Date endDate) {
		GregorianCalendar g1 = new GregorianCalendar();
		GregorianCalendar g2 = new GregorianCalendar();

		g1.setTime(startDate);
		g2.setTime(endDate);

		int elapsed = 0;
		// int startDayOfMonth = g1.get(Calendar.DAY_OF_MONTH);
		// int endDayOfMonth = g2.get(Calendar.DAY_OF_MONTH);

		GregorianCalendar gc1, gc2;

		if (g2.after(g1)) {
			gc2 = (GregorianCalendar) g2.clone();
			gc1 = (GregorianCalendar) g1.clone();
		} else {
			gc2 = (GregorianCalendar) g1.clone();
			gc1 = (GregorianCalendar) g2.clone();
		}

		gc1.clear(Calendar.MILLISECOND);
		gc1.clear(Calendar.SECOND);
		gc1.clear(Calendar.MINUTE);
		gc1.clear(Calendar.HOUR_OF_DAY);
		gc1.clear(Calendar.DATE);

		gc2.clear(Calendar.MILLISECOND);
		gc2.clear(Calendar.SECOND);
		gc2.clear(Calendar.MINUTE);
		gc2.clear(Calendar.HOUR_OF_DAY);
		gc2.clear(Calendar.DATE);

		while (gc1.before(gc2)) {
			gc1.add(Calendar.MONTH, 1);
			elapsed++;
		}

		// if(endDayOfMonth>startDayOfMonth)
		// elapsed++;//addtional day which is not full enough days of month(30),
		// will count for 1 month
		return elapsed;
	}

	/**
	 * return a diff days between two dates addtional hours which is not full
	 * enough hours of day(24 hours), will count for 1 day
	 * 
	 * @return
	 */
	public static int getDiffDays(Date startDate, Date endDate) {
		GregorianCalendar g1 = new GregorianCalendar();
		GregorianCalendar g2 = new GregorianCalendar();

		g1.setTime(startDate);
		g2.setTime(endDate);

		int elapsed = 0;

		GregorianCalendar gc1, gc2;

		if (g2.after(g1)) {
			gc2 = (GregorianCalendar) g2.clone();
			gc1 = (GregorianCalendar) g1.clone();
		} else {
			gc2 = (GregorianCalendar) g1.clone();
			gc1 = (GregorianCalendar) g2.clone();
		}

		gc1.clear(Calendar.MILLISECOND);
		gc1.clear(Calendar.SECOND);
		gc1.clear(Calendar.MINUTE);
		gc1.clear(Calendar.HOUR_OF_DAY);

		gc2.clear(Calendar.MILLISECOND);
		gc2.clear(Calendar.SECOND);
		gc2.clear(Calendar.MINUTE);
		gc2.clear(Calendar.HOUR_OF_DAY);

		while (gc1.before(gc2)) {
			gc1.add(Calendar.DATE, 1);
			elapsed++;
		}
		return elapsed;
	}
	public static int getDiffSeconds(Date startDate,Date enDate){
		Long diff = (enDate.getTime()-startDate.getTime())/1000;
		return new Integer(diff.toString());
	}
	/**
	 * given two date, return their time difference and the format looks like 02:23:35.
	 * @param startDate
	 * @param enDate
	 * @return
	 */
	public static String getTimeDiff(Date startDate,Date enDate){
		int diff = getDiffSeconds(startDate,enDate);
		int hour = diff/3600;
		String displayHour = hour == 0?"00":hour<10?"0"+hour:hour+"";
		int min = diff%3600/60;
		String displayMin = min == 0?"00":min<10?"0"+min:min+"";
		int sec = diff%3600%60;
		String displaySec = sec<10?"0"+sec:sec+"";
		return displayHour+":"+displayMin+":"+displaySec;
	}
	final public static Timestamp timestamp() {
		return new Timestamp(System.currentTimeMillis());
	}
	
	final public static Timestamp timestamp(Long time) {
		return new Timestamp(time);
	}
	public static String getToday(Date date)
	{
		return today.format(date);
	}
	
	public static Date addSeconds(Date date,int seconds){
		cal.setTime(date);
		cal.set(Calendar.SECOND,cal.get(Calendar.SECOND) + seconds);
		return cal.getTime();
	}
	public static Date minusSeconds(Date date,int seconds){
		cal.setTime(date);
		cal.set(Calendar.SECOND,cal.get(Calendar.SECOND) - seconds);
		return cal.getTime();
	}
	
	public static void main(String[] args) {
		Date date1 = DateUtil.parseToDate("2014-05-19 13:00:00");
		Date date2 = DateUtil.parseToDate("2014-05-31 00:00:00");
		date1 = DateUtil.parseToSimpleDate(DateUtil.formatDate(date1));
		date2 = DateUtil.parseToSimpleDate(DateUtil.formatDate(date2));
		System.out.println(DateUtil.getDiffDays(date1, date2));
	}
}
