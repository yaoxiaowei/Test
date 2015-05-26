import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.regex.Pattern;

/** 
 * @Company: CSN
 * @ClassName: Test2.java
 * @Author: YaoXiaowei
 * @CreateDate: 2014-4-21
 * @UpdateUser: YaoXiaowei
 * @Version: 0.1
 */
public class Test2 {
	public static int count = 0;
	private static String regex = "(?:')|(?:--)|(/\\*(?:.|[\\n\\r])*?\\*/)|(\\b(select|update|and|or|delete|insert|trancate|char|into|substr|ascii|declare|exec|count|master|into|drop|execute)\\b)";
	private static Pattern sqlPattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);

	public static void main(String[] args) {
		String arch = System.getProperty("sun.arch.data.model");
		System.out.println(arch);
	}

	/**
	 * 
	 * @Description: 计算两个日期之间相差的天数
	 * @Author: YaoXiaowei
	 * @date 2014-11-10
	 * @param date1
	 * @param date2
	 * @return
	 */
	public static int getDiffDays(Date date1, Date date2) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(date1);
		long time1 = cal.getTimeInMillis();
		cal.setTime(date2);
		long time2 = cal.getTimeInMillis();
		long diffDays = (time1 - time2) / (1000 * 3600 * 24);

		return Integer.parseInt(String.valueOf(diffDays));
	}

	public static boolean trimEmptyAttrToNull(Object obj) throws IllegalArgumentException, IllegalAccessException {
		Field[] fields = obj.getClass().getDeclaredFields();
		int nullCount = 0; // 空属性个数
		for (Field field : fields) {
			field.setAccessible(true);
			String type = field.getGenericType().toString();
			Object value = field.get(obj);
			if (value == null) {
				nullCount++;
			} else {
				if (type.indexOf("org.iata.iata._2007._00") != -1 || type.indexOf("aero.sita.bag.wtr._2009._01") != -1) {
					if (trimEmptyAttrToNull(value)) {
						field.set(obj, null);
						nullCount++;
					}
				}
			}
		}

		return nullCount == fields.length;
	}

	public static void trimToEmpty(Object obj) {
		Field[] fields = obj.getClass().getDeclaredFields();

		for (Field field : fields) {
			try {
				if (!"serialVersionUID".equals(field.getName()) && field.getType().equals(String.class)) {
					field.setAccessible(true);
					String value = (String) field.get(obj);
					System.out.println(field.getName() + " = " + value);
					field.set(obj, value == null ? "" : value.trim());
				}
			} catch (IllegalArgumentException e) {
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			}
		}

	}

	public static int sum(int... args) {
		int sum = 0;
		for (int arg : args) {
			sum += arg;
		}
		return sum;
	}

	public static <T extends Comparable<T>> T max(List<T> list) {
		T max = null;
		if (list != null && !list.isEmpty()) {
			max = list.get(0);
			for (int i = 1; i < list.size(); i++) {
				if (max.compareTo(list.get(i)) < 0) {
					max = list.get(i);
				}
			}
		}

		return max;
	}

	public static <E> int numElementsInCommon(Set<E> s1, Set<E> s2) {
		int result = 0;
		for (Object o1 : s1) {
			if (s2.contains(o1)) {
				result++;
			}
		}
		return result;
	}

	public static <K, V> HashMap<K, V> newInstance() {
		return new HashMap<K, V>();
	}

	public static double sub(double v1, double v2) {
		BigDecimal b1 = new BigDecimal(Double.toString(v1));
		BigDecimal b2 = new BigDecimal(Double.toString(v2));
		return b1.subtract(b2).setScale(2, BigDecimal.ROUND_HALF_EVEN).doubleValue();
	}

	public static boolean test1() {
		System.out.println("test1()");
		return true;
	}

	public static boolean test2() {
		System.out.println("test2()");
		return true;
	}

	public static boolean test3() {
		System.out.println("test3()");
		return false;
	}

	public static void test4(String valueStr) throws NullPointerException {
		if (sqlPattern.matcher(valueStr).find()) {
			System.out.println("非法字符：" + valueStr);
		}
	}

	/**
	 * 实现对象深拷贝
	 * @throws IOException 
	 * @throws ClassNotFoundException 
	 */
	public Object deepClone() throws IOException, ClassNotFoundException {
		ByteArrayOutputStream bo = new ByteArrayOutputStream();
		ObjectOutputStream oo = new ObjectOutputStream(bo);
		oo.writeObject(this);
		ByteArrayInputStream bi = new ByteArrayInputStream(bo.toByteArray());
		ObjectInputStream oi = new ObjectInputStream(bi);
		return (oi.readObject());
	}

	/**
	 * 实现对象浅拷贝
	 * @throws CloneNotSupportedException
	 */
	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
