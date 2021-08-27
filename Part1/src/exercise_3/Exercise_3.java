package exercise_3;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Exercise_3 {
	
	public static void main(String[] args) {
		
		Function<Integer, Boolean> func01 = FuncList::isOdd;
		Func1 func1f = FuncList::isOdd;
//		Func1 func1r = (int x) -> { return x % 2 == 1; };
		Func1 func1r = x -> x % 2 == 1;
		Function<Integer, Boolean> func1b = x -> x % 2 == 1;
		
		FuncList funcList = new FuncList();
		BiFunction<Integer, String, String> func02 = funcList::passCheck;
		Func2 func2f = funcList::passCheck;
//		Func2 func2 = (int point, String name) -> { return name + "さんは" + (point > 65 ? "合格" : "不合格"); };
		Func2 func2r = (point, name) -> name + "さんは" + (point > 65 ? "合格" : "不合格");
		
		System.out.println(func01.apply(95));
		System.out.println(func1f.kisu(95));
		System.out.println(func1r.kisu(95));
		System.out.println(func1b.apply(95));
		System.out.println(func02.apply(95, "佐藤"));
		System.out.println(func2f.gouhi(95, "佐藤"));
		System.out.println(func2r.gouhi(95, "佐藤"));
		
	}

}
