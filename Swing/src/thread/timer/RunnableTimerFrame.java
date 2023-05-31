package thread.timer;

import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class RunnableTimerFrame extends JFrame implements Runnable{

	int n = 0;
	private JLabel lbltimer;
	
	public RunnableTimerFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 300);
		setLocationRelativeTo(null);
//		setLayout(new FlowLayout());
		
		lbltimer = new JLabel("0", JLabel.CENTER);
		lbltimer.setFont(new Font("Gothic", Font.ITALIC, 120));
		add(lbltimer);
		
		
		
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		Thread th = new Thread(new RunnableTimerFrame());
		th.start();
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
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
