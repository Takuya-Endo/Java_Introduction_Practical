package exercise_4;

public class Exercise_4 {
	
	public static void main(String[] args) {
		
		Launcher.launcher(MemoryEater.class, StartingMethod.E);
		
		boolean isError = false;
		
		if (isError == true) {
			
			System.out.println("エラー発生");
			System.exit(1);
		
		}
		
		System.out.println("正常終了（コード：0）");
		System.exit(0);
	}

}
