/** 
 * @Desription: TODO
 * @Company: CSN
 * @ClassName: MyThread.java
 * @Author: YaoXiaowei
 * @CreateDate: 2014-4-25
 * @UpdateUser: YaoXiaowei
 * @Version: 0.1
 */
package thread;

import java.util.concurrent.CountDownLatch;

public class MyThread extends Thread {
	private CountDownLatch countDownLatch;
	private String threadName;

	public MyThread(CountDownLatch countDownLatch, String threadName) {
		this.countDownLatch = countDownLatch;
		this.threadName = threadName;
	}

	@Override
	public void run() {
		System.out.println(threadName + " RUN!!");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(threadName + " Stopped!!");
		countDownLatch.countDown(); // 执行完减1
	}

}
