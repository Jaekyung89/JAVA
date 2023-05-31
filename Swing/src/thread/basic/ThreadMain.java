package thread.basic;

public class ThreadMain {

	public static void main(String[] args) {
		System.out.println(Thread.MAX_PRIORITY);
		System.out.println(Thread.MIN_PRIORITY);
		System.out.println(Thread.NORM_PRIORITY);
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getState());
		
	}

}
