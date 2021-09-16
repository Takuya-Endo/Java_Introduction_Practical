package exercise_9;

import java.sql.Connection;
import java.sql.DriverManager;

public class Exercise_9_1 {
	
	public static void main(String[] args) {
		
		try {
		
			Class.forName("org.h2.Driver");
		
		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
		}
		
		Connection connection = null;
		
		connection = DriverManager.getConnection("jdbc:h2:~/exercise_9");
		
	}
	
}
