package swing.ex;

import java.awt.*;
import javax.swing.*;

public class eight_4 extends JFrame {
	public eight_4() {
		this.setTitle("Ten Color Buttons Frame");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		
		c.setLayout(new GridLayout(1, 10));
		
		Color [] color = { Color.RED, Color.ORANGE, Color.YELLOW, Color.GREEN, Color.CYAN,
				Color.BLUE, Color.MAGENTA, Color.GRAY, Color.PINK, Color.LIGHT_GRAY };
		
		JButton [] btn = new JButton[10];
		for(int i = 0; i < 10; i++) {
			btn[i] = new JButton(Integer.toString(i));
			btn[i].setOpaque(true);
			btn[i].setBackground(color[i]);
			c.add(btn[i]);
		}
				
		this.setSize(500, 250);
		this.setVisible(true);
	}
	public static void main(String[] args) {
		new eight_4();
	}
}