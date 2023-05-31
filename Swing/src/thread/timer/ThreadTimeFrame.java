package thread.timer;

import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class ThreadTimeFrame extends JFrame{

	public ThreadTimeFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 300);
		setLocationRelativeTo(null);
//		setLayout(new FlowLayout());
		
		JLabel lbltimer = new JLabel("0", JLabel.CENTER);
		lbltimer.setFont(new Font("Gothic", Font.ITALIC, 120));
		add(lbltimer);
		
		TimerThread tt = new TimerThread(lbltimer);
		
		setVisible(true);
		
		tt.start();
	}
	
	public static void main(String[] args) {
		new ThreadTimeFrame();
	}

}
