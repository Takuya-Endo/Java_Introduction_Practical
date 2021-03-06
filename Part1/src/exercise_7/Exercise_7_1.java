package exercise_7;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Properties;

public class Exercise_7_1 {
	
	public static void main(String[] args) {
		
		File propertyPlace = new File("C:\\Users\\home\\Desktop\\DMMWEBCAMP\\Java\\Java_Introduction_Practical\\Part1\\src\\exercise_7\\properties\\pref.properties");
		
		try {
			
			Reader propertyFile = new FileReader(propertyPlace);
			
			try {
				
				Properties properties = new Properties();
				properties.load(propertyFile);
				String aichiCapital = properties.getProperty("aichi.capital");
				String aichiFood = properties.getProperty("aichi.food");
				System.out.println(aichiCapital + "：" + aichiFood);
				
			} catch (IOException e) {
				
				System.out.println(e.getMessage());
				
			}
			
		} catch (FileNotFoundException e) {
			
			System.out.println(e.getMessage());
			
		}
		
		//classpath C:\Users\home\Desktop\DMMWEBCAMP\Java\Java_Introduction_Practical\Part1\bin exercise_7.Exercise_7_1
		
//		ResourceBundle resourceBundleProperties = ResourceBundle.getBundle("pref");
//		String aichiCapital = resourceBundleProperties.getString("aichi.capital");
//		String aichiFood = resourceBundleProperties.getString("aichi.food");
//		System.out.println(aichiCapital + "：" + aichiFood);
		
	}

}
