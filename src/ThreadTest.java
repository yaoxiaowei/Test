import java.util.concurrent.TimeUnit;


/** 
 * @Desription: TODO
 * @Company: CSN
 * @ClassName: ThreadTest.java
 * @Author: YaoXiaowei
 * @CreateDate: 2014-4-25
 * @UpdateUser: YaoXiaowei
 * @Version: 0.1
 */
public class ThreadTest {
	private static boolean stopRequested = false;

	public static void main(String[] args) throws InterruptedException {
		Thread thread = new Thread(new Runnable() {
			@Override
			public void run() {
				int i = 0;
				while (!isStopRequested()) {
					System.out.print("=" + (i++));
				}
			}
		});
		thread.start();
		
		TimeUnit.SECONDS.sleep(1);
		System.out.println("STOP");
		setStopRequested(true);
	}
	
	public static synchronized boolean isStopRequested() {
		return stopRequested;
	}

	public static synchronized void setStopRequested(boolean stopRequested) {
		ThreadTest.stopRequested = stopRequested;
	}
	
}

	