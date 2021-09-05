package exercise_7;

import static java.lang.System.*;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Exercise_7_3 {
	
	public static void main(String[] args) {
		
		Employee tanakaTaro = new Employee();
		tanakaTaro.name = "田中太郎";
		tanakaTaro.age = 41;
		
		Department generalAffairs = new Department();
		generalAffairs.name = "総務部";
		generalAffairs.leader = tanakaTaro;
		
		out.println(generalAffairs.name + "のリーダーは" + generalAffairs.leader.name + "（" + generalAffairs.leader.age + "歳）です");
		
		
		try {
			
			FileOutputStream filePlace = new FileOutputStream("C:\\Users\\home\\Desktop\\DMMWEBCAMP\\Java\\Java_Introduction_Practical\\Part1\\src\\exercise_7\\company\\company.dat", false);
			
			try (ObjectOutputStream companydata = new ObjectOutputStream(filePlace);) {
				
				companydata.writeObject(generalAffairs);
				
				out.println("\n以下を上書き保存");
				out.println("-----");
				out.println("社員名：" + tanakaTaro.name);
				out.println("社員年齢：" + tanakaTaro.age);
				out.println("部署名：" + generalAffairs.name);
				out.println("部署リーダー：" + generalAffairs.leader.name);
				out.println("-----");
				
			}
			
		} catch (FileNotFoundException e) {
			out.println(e.getMessage());
		} catch (IOException e) {
			out.println(e.getMessage());
		}
		
	}

}
