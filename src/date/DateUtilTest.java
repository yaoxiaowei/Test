/** 
 * @Desription: TODO
 * @Company: CSN
 * @ClassName: DateUtilTest.java
 * @Author: YaoXiaowei
 * @CreateDate: 2014-5-28
 * @UpdateUser: YaoXiaowei
 * @Version: 0.1
 */
package date;


import java.util.Date;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DateUtilTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testGetYesterday() {
		Date date = new Date();
		Assert.assertEquals(DateUtil.getYesterday(date), DateUtil.getYesterday(date));
	}

	@Test
	public void testFormatDateDate() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Assert.assertEquals("2014-05-28", DateUtil.formatDate(new Date()));
	}

}

	