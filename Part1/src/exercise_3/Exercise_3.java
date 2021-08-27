package exercise_3;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Exercise_3 {
	
	public static void main(String[] args) {
		
		Function<Integer, Boolean> func1 = FuncList::isOdd;
		
		FuncList funcList = new FuncList();
		BiFunction<Integer, String, String> func2 = funcList::passCheck;
		
		System.out.println(func1.apply(95));
		System.out.println(func2.apply(95, "佐藤"));
		
	}

}