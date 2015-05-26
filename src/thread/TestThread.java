/** 
 * @Desription: TODO
 * @Company: CSN
 * @ClassName: TestThread.java
 * @Author: YaoXiaowei
 * @CreateDate: 2014-4-25
 * @UpdateUser: YaoXiaowei
 * @Version: 0.1
 */
package thread;

import java.util.concurrent.CountDownLatch;

public class TestThread {
	public static void main(String[] args) {
		CountDownLatch countDownLatch = new CountDownLatch(3);
		new MyThread(countDownLatch, "thread1").start();
		new MyThread(countDownLatch, "thread2").start();
		new MyThread(countDownLatch, "thread3").start();

		try {
			// 等待所有进程执行完
			countDownLatch.await();
			System.out.println("All thread stopped");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
