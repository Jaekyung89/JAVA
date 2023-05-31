package thread.timer;

import javax.swing.JLabel;

public class TimerThread extends Thread {

	int n = 0;
	private JLabel lbltimer;
	
	public TimerThread(JLabel lbltimer) {
		this.lbltimer = lbltimer;
	}


	@Override
	public void run() {
		while(true) {
			System.out.println(n);
			lbltimer.setText(n + "");
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
