package exercise_4;

import static java.lang.System.*;

import java.lang.reflect.Method;

public class Launcher {
	
	public static void launcher(Class<?> classInfo, StartingMethod startingMethod) {
		
		String fqcn = classInfo.getName();
		out.println(fqcn);
		Runtime runtime = Runtime.getRuntime();
		long memoryUsage = runtime.totalMemory() - runtime.freeMemory();
		out.println(memoryUsage + "byte");
		out.println(memoryUsage / (1024 * 1024) + "Mbyte");
		Method[] methods = classInfo.getDeclaredMethods();
		for (Method method : methods) {	out.println(method); }
		
	}

}
