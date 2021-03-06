package exercise_8;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

public class Exercise_8_1 {
	
	public static void main(String[] args) {
		
		try (FileOutputStream fileOutputStream = new FileOutputStream("C:\\Users\\home\\Desktop\\DMMWEBCAMP\\Java\\Java_Introduction_Practical\\Part1\\src\\exercise_8\\ico\\dj.ico", false);) {
			
			URL url = new URL("https://dokojava.jp/favicon.ico");
			InputStream inputStream = url.openStream();
			fileOutputStream.write(inputStream.read());
			fileOutputStream.flush();
			System.out.println("「https://dokojava.jp/favicon.ico」を");
			System.out.println("「C:\\\\Users\\\\home\\\\Desktop\\\\DMMWEBCAMP\\\\Java\\\\Java_Introduction_Practical\\\\Part1\\\\src\\\\exercise_8\\\\ico\\\\dj.ico」に保存しました");
			
		} catch (MalformedURLException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		
	}

}
