package exercise_9;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ItemsDAO {
	
	public static ArrayList<Item> findByMinimumPrice(int minimumPrice) {
		
		ArrayList<Item> items = new ArrayList<Item>();
		
		try {
			Class.forName("org.h2.Driver");
		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
		}
		Connection connection = null;
		try {
			connection = DriverManager.getConnection("jdbc:h2:~/exercise_9_1");
			
			PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM ITEMS WHERE PRICE >= ?");
			preparedStatement.setInt(1, minimumPrice);
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				
				items.add(new Item(resultSet.getString("NAME"), resultSet.getInt("PRICE"), resultSet.getInt("WEIGHT")));
				
			}
			
			preparedStatement.close();
		
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
		
		return items;
	}

}
