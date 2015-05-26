/** 
 * @Desription: TODO
 * @Company: CZ
 * @ClassName: NioTest.java
 * @Author: YaoXiaowei
 * @CreateDate: 2015-5-20
 * @UpdateUser: YaoXiaowei
 * @Version: 0.1
 */
package nio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;

public class NioTest {
	public static void main(String[] args) {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		try {
			fis = new FileInputStream("G:\\Test\\Test.txt");
			fos = new FileOutputStream("G:\\Test\\Test1.txt");
			FileChannel inputChannel = fis.getChannel();
			FileChannel outputChannel = fos.getChannel();
			ByteBuffer buffer = ByteBuffer.allocate(1024);
			
			while (true) {
				buffer.clear(); // clear()方法重设缓冲区，使缓冲区可以接受读入的数据
				int len = inputChannel.read(buffer);
				if (len == -1) {
					break;
				}
				buffer.flip(); // flip()法让缓冲区可以将新读入的数据写入另一个通道
				outputChannel.write(buffer);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (fis != null) {
				try {
					fis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if (fos != null) {
				try {
					fos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
