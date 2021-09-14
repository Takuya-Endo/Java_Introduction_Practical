package exercise_9;

public class Exercise_9_1 {
	
	public static void main(String[] args) {
		
		try {
		
			Class.forName("org.h2.Driver");
		
		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
		}
	}
	
}
