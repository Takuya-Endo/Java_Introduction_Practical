package exercise_3;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Exercise_3 {
	
	public static void main(String[] args) {
		
		Function<Integer, Boolean> func01 = FuncList::isOdd;
		Func1 func1 = FuncList::isOdd;
		
		FuncList funcList = new FuncList();
		BiFunction<Integer, String, String> func02 = funcList::passCheck;
		Func2 func2 = funcList::passCheck;
		
		System.out.println(func01.apply(95));
		System.out.println(func1.process(95));
		System.out.println(func02.apply(95, "佐藤"));
		System.out.println(func2.process(95, "佐藤"));
		
	}

}
