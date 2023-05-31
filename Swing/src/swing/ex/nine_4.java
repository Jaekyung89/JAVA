package swing.ex;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class nine_4 extends JFrame {
	private Font f;
	private int size;
	public nine_4() {
		this.setTitle("Java");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
				
		Container c = getContentPane();
		
		c.setLayout(new FlowLayout());
		
		JLabel label = new JLabel("Love Java");
		
		c.addKeyListener(new KeyListener() {
			public void keyPressed(KeyEvent e) {
            	f = label.getFont();
				size = f.getSize();
				if(e.getKeyChar() == '+') {
					label.setFont(new Font("Arial", Font.PLAIN, size + 5));
				}
				else if(e.getKeyChar() == '-' && size > 10) {
					label.setFont(new Font("Arial", Font.PLAIN, size - 5));
				}
			}
			public void keyReleased(KeyEvent e) {}
			public void keyTyped(KeyEvent e) {}
		});
		
		c.add(label);
		
		this.setSize(300, 300);
		this.setVisible(true);
		
		c.setFocusable(true);
		c.requestFocus();
	}
	
	public static void main(String[] args) {
		new nine_4();
	}
}