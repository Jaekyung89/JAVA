package swing.ex;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class nine_5 extends JFrame {
	private int x, y;
	public nine_5() {
		this.setTitle("Java");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
				
		Container c = getContentPane();
		
		c.setLayout(null);
		
		JLabel label = new JLabel("C");
		label.setBounds(50, 50, 40, 40);
		
		label.addMouseListener(new MouseListener() {
			public void mouseClicked(MouseEvent e) {
				x = (int)(Math.random()*(getContentPane().getWidth() - label.getWidth()));
				y = (int)(Math.random()*(getContentPane().getHeight() - label.getHeight()));
				label.setLocation(x, y);
			}
			public void mousePressed(MouseEvent e) {}
			public void mouseReleased(MouseEvent e) {}
			public void mouseEntered(MouseEvent e) {}
			public void mouseExited(MouseEvent e) {}
		});
		
		c.add(label);
		
		this.setSize(300, 300);
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		new nine_5();
	}
}
