package exercise_16;

import java.util.concurrent.TimeUnit;

public class CountUpThread {
	
	for (int i = 0; i < 11; i++) {
		try {
			TimeUnit.SECONDS.sleep(1);
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}
		System.out.print(i + "");
	}

}
