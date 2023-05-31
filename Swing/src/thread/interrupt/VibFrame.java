package thread.interrupt;

import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class VibFrame extends JFrame implements Runnable{

	private Thread th;

	public VibFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 300);
		setLocationRelativeTo(null);
//		setLayout(new FlowLayout());
		
		JLabel lbltimer = new JLabel("0", JLabel.CENTER);
		lbltimer.setFont(new Font("Gothic", Font.ITALIC, 120));
		add(lbltimer);
		
		addMouseListener(new MouseAdapter() {

			@Override
			public void mousePressed(MouseEvent e) {
				if(th.isAlive()) {
					th.interrupt();
				}
				else {
					return;
				}
			}
			
		});
		
		setVisible(true);

		th = new Thread(this);
		th.start();
		
	}
	
	public static void main(String[] args) {
		VibFrame vf = new VibFrame();
	}

	@Override
	public void run() {
		Random rnd = new Random();
		while(true) {
			int x = this.getX() + rnd.nextInt() % 5;
			int y = this.getY() + rnd.nextInt() % 5;
			setLocation(x, y);
			
			try {
				Thread.sleep(20);
			} catch (InterruptedException e) {
				return;
			}
		}
		
	}

}
