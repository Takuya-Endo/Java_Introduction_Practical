package exercise_15;

import java.io.FileWriter;
import java.io.IOException;

public class MyLogger {
	
	FileWriter fileWriter;
	
	public MyLogger() {
		
		try {
			fileWriter = new FileWriter("C:\\Users\\home\\Desktop\\DMMWEBCAMP\\Java\\Java_Introduction_Practical\\Part4\\src\\exercise_15\\dummylog.txt", true);
		} catch (IOException e) {
			System.out.println(e.getMessage());
			try { fileWriter.close(); } catch (IOException ex) { System.out.println(ex.getMessage()); }
		}
		
	}
	
	public void log(String string) {
		
		try {
			fileWriter.write(string);
			fileWriter.flush();
			fileWriter.close();
			System.out.println(string + "と記述しました");
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		
	}

}
