/** 
 * @Desription: TODO
 * @Company: CSN
 * @ClassName: PinYinTest.java
 * @Author: YaoXiaowei
 * @CreateDate: 2014-7-29
 * @UpdateUser: YaoXiaowei
 * @Version: 0.1
 */
package pinyin;

import java.util.Arrays;

import net.sourceforge.pinyin4j.PinyinHelper;

public class PinYinTest {
	public static void main(String[] args) {
		char ch = '姚';
		String[] pinYin = PinyinHelper.toHanyuPinyinStringArray(ch);
		System.out.println(Arrays.toString(pinYin) + "    " + pinYin[0].charAt(0) + "=" + Character.toUpperCase(pinYin[0].charAt(0)));
		
		System.out.println(Character.toUpperCase('g'));
	}
}
