package swing.event;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class KeyCharEx extends JFrame implements KeyListener{
	private JLabel la = new JLabel("<Enter>Ű�� ������ �ٲ�ϴ�.");
	public KeyCharEx() {
		super("KeyListener�� ����Ű �Է� ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.add(la);
		c.addKeyListener(this);
		setSize(250, 150);
		setVisible(true);
		
		c.setFocusable(true);
		c.requestFocus();
	}
	
	public static void main(String[] args) {
		new KeyCharEx();
	}

	@Override
	public void keyTyped(KeyEvent e) {
	}

	@Override
	public void keyPressed(KeyEvent e) {
		int r = (int) (Math.random() * 256); 
		int g = (int) (Math.random() * 256); 
		int b = (int) (Math.random() * 256); 
		
		switch(e.getKeyChar()) {
		case '\n':
			la.setText("r=" + r + ", g=" + g + ", b=" + b);
			getContentPane().setBackground(new Color(r, g, b));
			break;
		case 'q': System.exit(0);
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
	}
}