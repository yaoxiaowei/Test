import java.text.NumberFormat;
import java.util.Locale;

/** 
 * @Desription: TODO
 * @Company: CSN
 * @ClassName: LocalTest.java
 * @Author: YaoXiaowei
 * @CreateDate: 2014-5-5
 * @UpdateUser: YaoXiaowei
 * @Version: 0.1
 */
public class ResourceBundleTest {
	public static void main(String[] args) {
//		Locale locale = new Locale("zh", "CN");
//		ResourceBundle res = ResourceBundle.getBundle("test", locale);
//		System.out.println(res.getString("name"));
		
		displayPercent(new Double(0.1334), new Locale("zh", "CN"));
		displayPercent(0.12, new Locale("en", "US"));
	}
	
	public static void displayPercent(Double amount, Locale currentLocale) {
		NumberFormat format = NumberFormat.getPercentInstance(currentLocale);
		System.out.println(format.format(amount) + "  " + currentLocale.toString());
	}
	
}

	