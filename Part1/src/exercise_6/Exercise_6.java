package exercise_6;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Exercise_6 {
	
	public static void main(String[] args) {
		
		File text1File = new File("C:\\Users\\home\\Desktop\\DMMWEBCAMP\\Java\\Java_Introduction_Practical\\Part1\\src\\exercise_6\\text\\text1.txt");
		Path text1Path = Paths.get("C:\\Users\\home\\Desktop\\DMMWEBCAMP\\Java\\Java_Introduction_Practical\\Part1\\src\\exercise_6\\text\\text1.txt");
		Path text2Path = Paths.get("C:\\Users\\home\\Desktop\\DMMWEBCAMP\\Java\\Java_Introduction_Practical\\Part1\\src\\exercise_6\\text\\text2.txt");
		
		try {
			
			Files.copy(text1Path, text2Path);
			System.out.println("「text1.txt」ファイルをコピーし、「text2.txt」として保存しました。");
			
		} catch (IOException e1) {
			
			File textDirectory = new File("C:\\Users\\home\\Desktop\\DMMWEBCAMP\\Java\\Java_Introduction_Practical\\Part1\\src\\exercise_6\\text");
			File[] files = textDirectory.listFiles();
			int filesCount = files.length;
			
			Path textExtraPath = Paths.get("C:\\Users\\home\\Desktop\\DMMWEBCAMP\\Java\\Java_Introduction_Practical\\Part1\\src\\exercise_6\\text\\text" + (filesCount + 1) + ".txt");
			
			try {
				
				Files.copy(text1Path, textExtraPath);
				System.out.println("「text1.txt」ファイルをコピーし、「text" + (filesCount + 1) + ".txt」として保存しました。");
				
			} catch (IOException e2) {
				
				System.out.println("エラー発生");
				System.out.println(e2.getStackTrace());
				
			}	
		}
		
		try (FileInputStream file1 = new FileInputStream(text1File);) {
			
			System.out.println(file1.read());
			
		} catch (FileNotFoundException e3) {
			
			System.out.println(e3.getMessage());
			
		} catch (IOException e4) {
			
			System.out.println(e4.getMessage());
			
		}
		
		
	}

}
