import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/** 
 * @Desription: TODO
 * @Company: CZ
 * @ClassName: TimeTest.java
 * @Author: YaoXiaowei
 * @CreateDate: 2014-12-17
 * @UpdateUser: YaoXiaowei
 * @Version: 0.1
 */
public class TimeTest {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
		System.out.println( cal.getTime());
		
		Calendar cal2 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
		cal2.set(Calendar.DATE, cal2.get(Calendar.DATE) - 1);
		System.out.println(cal2.getTime());
		System.out.println( cal.getTime());
		
		
//		Calendar c = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
//		int hour = c.get(Calendar.HOUR_OF_DAY);
//		int minute = c.get(Calendar.MINUTE);
//		System.out.println(hour + ":" + minute);
//		if ((hour == 7 && minute > 50) || (hour == 8 && minute < 10)) {
//			System.err.println(hour + ":" + minute);
//		}
//		c.set(Calendar.HOUR, c.get(Calendar.HOUR) - 8);
//		System.out.println(c.getTime());

		// format();
//		Date date = new Date();
//		
//		Calendar calendar = Calendar.getInstance();
//		calendar.setTime(date);
//		calendar.set(Calendar.HOUR_OF_DAY, 0);
//		calendar.set(Calendar.MINUTE, 0);
//		calendar.set(Calendar.SECOND, 0);
//		calendar.set(Calendar.MILLISECOND, 0);
//		
//		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
//		
//		System.out.println(sdf.format(calendar.getTime()));
//		calendar.set(Calendar.DATE, calendar.get(Calendar.DATE)+1);
//		System.out.println(sdf.format(calendar.getTime()));
		
	}

	public static void format() {
		// 24NOV
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyddMMM", Locale.ENGLISH);
		try {
			Date date = sdf.parse(Calendar.getInstance().get(Calendar.YEAR) + "24NOV");
			System.out.println(date);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
}
