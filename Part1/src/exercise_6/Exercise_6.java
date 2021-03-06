package exercise_6;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.zip.GZIPOutputStream;

public class Exercise_6 {
	
	public static void main(String[] args) {
		
		File text0File = new File("C:\\Users\\home\\Desktop\\DMMWEBCAMP\\Java\\Java_Introduction_Practical\\Part1\\src\\exercise_6\\text\\TEXT.txt");
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
			
			Path textExtraPath = Paths.get("C:\\Users\\home\\Desktop\\DMMWEBCAMP\\Java\\Java_Introduction_Practical\\Part1\\src\\exercise_6\\text\\text" + filesCount + ".txt");
			
			try {
				
				Files.copy(text1Path, textExtraPath);
				System.out.println("「text1.txt」ファイルをコピーし、「text" + filesCount + ".txt」として保存しました。");
				
			} catch (IOException e2) {
				
				System.out.println("エラー発生");
				System.out.println(e2.getStackTrace());
				
			}
		}
		
		try (FileInputStream inputFile1 = new FileInputStream(text1File);) {
			
			BufferedInputStream bufferedInputFile1 = new BufferedInputStream(inputFile1);//[read]
			int file1Int = bufferedInputFile1.read();//[read]
			FileOutputStream outputFile1 = new FileOutputStream(text0File, true);//[write]
			BufferedOutputStream bufferedOutputFile1 = new BufferedOutputStream(outputFile1);//[write]
			GZIPOutputStream zip = new GZIPOutputStream(bufferedOutputFile1);//[write zip]
			
			StringBuilder file1String = new StringBuilder();//[read]
			
			while (file1Int != -1) {
				file1String.append((char) file1Int);//[read]
				bufferedOutputFile1.write(file1Int);//[write]
				zip.write(file1Int);//[write zip]
				file1Int = bufferedInputFile1.read();
			}
			bufferedOutputFile1.flush();//[write]
			zip.flush();//[write zip]
			outputFile1.close();//[write]
			System.out.println("「TEXT.txt」ファイルに、「" + file1String + "」を追記しました。");
			
			
			//バッファリングなし
//			FileOutputStream outputFile1 = new FileOutputStream(text0File, true);//[write]
//			StringBuilder file1String = new StringBuilder();//[read]
//			int file1Int = inputFile1.read();//[read]
//			while (file1Int != -1) {
//				file1String.append((char) file1Int);//[read]
//				outputFile1.write(file1Int);//[write]
//				file1Int = inputFile1.read();
//			}
//			outputFile1.flush();//[write]
//			outputFile1.close();//[write]
//			System.out.println("「TEXT.txt」ファイルに、「" + file1String + "」を追記しました。");
			
		} catch (FileNotFoundException e3) {
			
			System.out.println(e3.getMessage());
			
		} catch (IOException e4) {
			
			System.out.println(e4.getMessage());
			
		}
		
	}

}
