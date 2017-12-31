package url;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

public class TestPost {
	public static void testPost() throws IOException {

		String netCode = "76608031";
		URL url = new URL("http://10.180.8.102:8080/uc/sap/asmp/netCode/" + netCode);
		URLConnection connection = url.openConnection();
		InputStream is = connection.getInputStream();
		StringBuffer out = new StringBuffer();
		byte[] b = new byte[4096];
		for (int n; (n = is.read(b)) != -1;) {
			out.append(new String(b, 0, n));
		}
		String value = out.toString();
		System.out.println(value);
		String amount = "0";
		if(!"NaN".equals(value)){
			amount = value;
		}
		System.out.println(amount);
	}

	public static void main(String[] args) throws IOException {
		testPost();
	}
}