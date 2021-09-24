package exercise_16;

public class Main {
	
	public static void main(String[] args) {
		
		CountUpThread countUpThread1 = new CountUpThread();
		countUpThread1.start();
		CountUpThread countUpThread2 = new CountUpThread();
		countUpThread2.start();
		CountUpThread countUpThread3 = new CountUpThread();
		countUpThread3.start();
		
	}

}
