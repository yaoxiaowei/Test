package httpClient;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpStatus;
import org.apache.commons.httpclient.methods.GetMethod;

public class TestHttpClient {
	public static void main(String[] args) {
		HttpClient httpclient = new HttpClient();
		GetMethod getMethod = new GetMethod("http://www.baidu.com//");
		try {
			int statusCode = httpclient.executeMethod(getMethod);
			if (statusCode == HttpStatus.SC_OK) {
				System.out.println("HTTP请求成功！");
				// Reader reader = new InputStreamReader(getMethod.getResponseBodyAsStream(), getMethod.getResponseCharSet());
				byte[] responseBody = getMethod.getResponseBody();
				System.out.println(new String(responseBody));
			} else {
				System.err.println("Method failed: " + getMethod.getStatusLine());
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			getMethod.releaseConnection();
		}
		// consume the response entity
	}
}
