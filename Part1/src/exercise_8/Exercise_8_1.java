package exercise_8;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

public class Exercise_8_1 {
	
	public static void main(String[] args) {
		
		try {
			
			URL url = new URL("https://dokojava.jp/favicon.ico");
			InputStream inputStream = url.openStream();
			inputStream.read();
			
		} catch (MalformedURLException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		
	}

}
