package exercise_2;

public class Exercise_2 {
	
	public static void main(String[] args) {
		
		StrongBox<String> strongBox = new StrongBox<String>(KeyType.PADLOCK);
		strongBox.put("南京錠の金庫");
		System.out.println(strongBox.get());
		
	}

}
