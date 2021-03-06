package exercise_7;

import static java.lang.System.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
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
			
			FileOutputStream outFilePlace = new FileOutputStream("C:\\Users\\home\\Desktop\\DMMWEBCAMP\\Java\\Java_Introduction_Practical\\Part1\\src\\exercise_7\\company\\company.dat", false);
			FileInputStream inFilePlace = new FileInputStream("C:\\Users\\home\\Desktop\\DMMWEBCAMP\\Java\\Java_Introduction_Practical\\Part1\\src\\exercise_7\\company\\company.dat");
			
			try (ObjectOutputStream outCompanydata = new ObjectOutputStream(outFilePlace); ObjectInputStream inCompanydata = new ObjectInputStream(inFilePlace);) {
				
				outCompanydata.writeObject(generalAffairs);
				
				out.println("\n以下を上書き保存");
				out.println("-----");
				out.println("社員名：" + tanakaTaro.name);
				out.println("社員年齢：" + tanakaTaro.age);
				out.println("部署名：" + generalAffairs.name);
				out.println("部署リーダー：" + generalAffairs.leader.name);
				out.println("-----");
				
				
				generalAffairs = (Department) inCompanydata.readObject();
				
			}
			
		} catch (FileNotFoundException e) {
			out.println(e.getMessage());
			e.printStackTrace();
		} catch (IOException e) {
			out.println(e.getMessage());
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			out.println(e.getMessage());
			e.printStackTrace();
		}
		
		out.println("\n保存されている内容を以下に出力");
		out.println("-----");
		out.println("社員名：" + tanakaTaro.name);
		out.println("社員年齢：" + tanakaTaro.age);
		out.println("部署名：" + generalAffairs.name);
		out.println("部署リーダー：" + generalAffairs.leader.name);
		out.println("-----");
		out.println("\n" + generalAffairs.name + "のリーダーは" + generalAffairs.leader.name + "（" + generalAffairs.leader.age + "歳）です");
		
		
	}

}
