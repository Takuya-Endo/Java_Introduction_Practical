package exercise_6;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Exercise_6 {
	
	public static void main(String[] args) {
		
		Path text1Path = Paths.get("C:\\Users\\home\\Desktop\\DMMWEBCAMP\\Java\\Java_Introduction_Practical\\Part1\\src\\exercise_6\\text\\text1.txt");
		Path text2Path = Paths.get("C:\\Users\\home\\Desktop\\DMMWEBCAMP\\Java\\Java_Introduction_Practical\\Part1\\src\\exercise_6\\text\\text2.txt");
		
		try {
			
			Files.copy(text1Path, text2Path);
			
		} catch (IOException e) {
			
			File textDirectory = new File("C:\\Users\\home\\Desktop\\DMMWEBCAMP\\Java\\Java_Introduction_Practical\\Part1\\src\\exercise_6\\text");
			File[] files = textDirectory.listFiles();
			int filesCount = files.length;
			System.out.println(filesCount);
			
			
		}
		
		
	}

}
