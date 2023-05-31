package swing.ex;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class nine_6 extends JFrame {
	private JLabel label[] = new JLabel[12];
	private int r, g, b;
	public nine_6() {
		this.setTitle("Java");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		
		c.setLayout(new GridLayout(4, 3));
		
		for(int i = 0; i < 12; i++) {
			label[i] = new JLabel(Integer.toString(i));
			label[i].setBackground(Color.WHITE);
			
			label[i].addMouseListener(new MouseListener() {
				public void mouseClicked(MouseEvent e) {
					JLabel la = (JLabel)e.getSource();
					
					r = (int)(Math.random()*256);
					g = (int)(Math.random()*256);
					b = (int)(Math.random()*256);
					
					la.setOpaque(true);
					la.setBackground(new Color(r, g, b));
				}
				public void mousePressed(MouseEvent e) {}
				public void mouseReleased(MouseEvent e) {}
				public void mouseEntered(MouseEvent e) {}
				public void mouseExited(MouseEvent e) {}
			});
			
			c.add(label[i]);
		}
				
		this.setSize(300, 300);
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		new nine_6();
	}
}