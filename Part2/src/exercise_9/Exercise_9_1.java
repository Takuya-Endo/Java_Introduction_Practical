package exercise_9;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Exercise_9_1 {
	
	public static void main(String[] args) {
		
		try {
		
			Class.forName("org.h2.Driver");
			Connection connection = null;
			connection = DriverManager.getConnection("jdbc:h2:~/exercise_9_1");
			
			if (connection != null) {
				
			}
			
			connection.close();
		
		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		
	}
	
}
