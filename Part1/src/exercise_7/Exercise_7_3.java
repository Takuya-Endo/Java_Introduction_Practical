package exercise_7;

public class Exercise_7_3 {
	
	public static void main(String[] args) {
		
		Employee tanakaTaro = new Employee();
		tanakaTaro.name = "田中太郎";
		tanakaTaro.age = 41;
		
		Department generalAffairs = new Department();
		generalAffairs.name = "総務部";
		generalAffairs.leader = tanakaTaro;
		
		System.out.println(generalAffairs.name + "のリーダーは" + generalAffairs.leader.name + "（" + generalAffairs.leader.age + "歳）です");
		
	}

}
