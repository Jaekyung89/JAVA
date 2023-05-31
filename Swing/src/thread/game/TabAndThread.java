package thread.game;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

public class TabAndThread extends JFrame implements KeyListener {

	private MyLabel bar;

	public TabAndThread(String title) {
		
		setTitle(title);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(330,200);
		setLocationRelativeTo(null);
		setLayout(null);
		
		bar = new MyLabel(100);
		bar.setBackground(Color.ORANGE);
		bar.setOpaque(true);
		bar.setBounds(20, 50, 270, 20);
		add(bar);
		
		addKeyListener(this);
		
		ConsumerThread ct = new ConsumerThread(bar);
		ct.start();
		
		setVisible(true);
	}

	public static void main(String[] args) {

		new TabAndThread("아무키나 빨리 누르세요");
	}

	@Override
	public void keyTyped(KeyEvent e) {
	}

	@Override
	public void keyPressed(KeyEvent e) {
		bar.fill();
	}

	@Override
	public void keyReleased(KeyEvent e) {
	}

}
