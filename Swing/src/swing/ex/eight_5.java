package swing.ex;

import java.awt.*;
import javax.swing.*;

public class eight_5 extends JFrame {
	public eight_5() {
		this.setTitle("4x4 Color Frame");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		
		c.setLayout(new GridLayout(4, 4));
		
		Color [] color = { Color.RED, Color.ORANGE, Color.YELLOW, Color.GREEN, Color.CYAN,
				Color.BLUE, Color.MAGENTA, Color.GRAY, Color.PINK, Color.LIGHT_GRAY, Color.BLACK,
				Color.DARK_GRAY, Color.WHITE };
		
		JLabel [] label = new JLabel[16];
		int randNum = 0;
		for(int i = 0; i < 16; i++) {
			label[i] = new JLabel(Integer.toString(i));
			randNum = (int)(Math.random()*12);
			label[i].setOpaque(true);
			label[i].setBackground(color[randNum]);
			c.add(label[i]);
		}
				
		this.setSize(500, 250);
		this.setVisible(true);
	}
	public static void main(String[] args) {
		new eight_5();
	}
}