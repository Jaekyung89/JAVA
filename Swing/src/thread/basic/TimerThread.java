package thread.basic;

public class TimerThread extends Thread {

	int n = 0;
	
	@Override
	public void run() {
		while(true) {
			System.out.println(n);
			n++;
			if(n == 10) {
				break;
			}
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	
}
