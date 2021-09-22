package exercise_9;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Exercise_9_1 {
	
	public static void main(String[] args) {
		
		try {
			Class.forName("org.h2.Driver");
		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
		}
		Connection connection = null;
		try {
			connection = DriverManager.getConnection("jdbc:h2:~/exercise_9_1");
			
			
			PreparedStatement reparedStatement = connection.PreparedStatement();
			
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} finally {
			if (connection == null) {
				System.out.println("ERROR");
			} else {
				try {
					connection.close();
					System.out.println("OK");
				} catch (SQLException e) {
					System.out.println(e.getMessage());
				}
			}
		}
		
		
		
	}
	
}
