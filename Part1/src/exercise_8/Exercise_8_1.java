package exercise_8;

import java.net.MalformedURLException;
import java.net.URL;

public class Exercise_8_1 {
	
	public static void main(String[] args) {
		
		try {
			
			URL url = new URL("https://dokojava.jp/favicon.ico");
			
		} catch (MalformedURLException e) {
			
			System.out.println(e.getMessage());
			
		}
		
	}

}
