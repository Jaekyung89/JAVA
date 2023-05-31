package thread.basic;


public class Main {

	public static void main(String[] args) {
		TimerThread tt = new TimerThread();
		tt.start();
		
		
		System.out.println("ABC");
	}

}
