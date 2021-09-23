package exercise_9;

import java.sql.Connection;
import java.sql.DriverManager;
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
			
//			//テーブル作成（初回の実行時のみで良い）			
//			PreparedStatement preparedStatement = connection.prepareStatement("CREATE TABLE ITEMS (NAME TEXT, PRICE INT, WEIGHT INT)");
//			preparedStatement.executeUpdate();
//			
//			//データ追加
//			preparedStatement = connection.prepareStatement("INSERT INTO ITEMS (NAME, PRICE, WEIGHT) VALUES (?, ?, ?)");
//			
//			preparedStatement.setString(1, "やくそう");
//			preparedStatement.setInt(2, 5);
//			preparedStatement.setInt(3, 2);
//			preparedStatement.executeUpdate();
//			
//			preparedStatement.setString(1, "どくけしそう");
//			preparedStatement.setInt(2, 7);
//			preparedStatement.setInt(3, 2);
//			preparedStatement.executeUpdate();
//			
//			//データ削除
//			preparedStatement = connection.prepareStatement("DELETE FROM ITEMS WHERE NAME = ?");
//			
//			preparedStatement.setString(1, "やくそう");
//			preparedStatement.executeUpdate();
//			
//			preparedStatement.setString(1, "どくけしそう");
//			preparedStatement.executeUpdate();
			
			System.out.println("ITEMSテーブル準備完了");
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
		
		
		
	}
	
}
