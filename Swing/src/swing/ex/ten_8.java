package swing.ex;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class ten_8 extends JFrame{
	private JLabel [] label = new JLabel[10];
	private int index = 0;

	public ten_8() {
		this.setTitle("Ten 레이블 클릭");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(getOwner());
	
		Container c = getContentPane();
		
		c.setLayout(null);
		
		for(int i = 0; i < label.length; i++) {
			int x = (int)(Math.random()*250);
			int y = (int)(Math.random()*250);
			label[i] = new JLabel(Integer.toString(i));
			label[i].setBounds(x, y, 20, 20);
			label[i].setForeground(Color.MAGENTA);
			c.add(label[i]);
			label[i].addMouseListener(new MouseAdapter() {
				public void mouseClicked(MouseEvent e) {
					JLabel la = (JLabel)e.getSource();
					if(label[index] == la) {
						la.setVisible(false);
						index++;
						if(index == 10) {
							new ten_8();
							dispose();
						}
					}
				}
			});
		}
		
		this.setSize(300, 300);
		this.setVisible(true);
	}
	
	
	public static void main(String[] args) {
		new ten_8();
	}
}