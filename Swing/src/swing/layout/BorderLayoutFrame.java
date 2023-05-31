package swing.layout;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class BorderLayoutFrame extends JFrame {

	public BorderLayoutFrame(String title) {
		setTitle(title);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 300);
		setLocationRelativeTo(null);
		
		setLayout(new BorderLayout(10,20));
		
		JButton btn1 = new JButton("1");
		add(btn1, BorderLayout.NORTH);

		JButton btn2 = new JButton("2");
		add(btn2, BorderLayout.WEST);
		
		JButton btn3 = new JButton("3");
		add(btn3, BorderLayout.EAST);
		
		JButton btn4 = new JButton("4");
		add(btn4, BorderLayout.SOUTH);
		
		JButton btn5 = new JButton("5");
		add(btn5, BorderLayout.CENTER);
		
		JButton btn6 = new JButton("6");
		add(btn6);
		
		setVisible(true);
		
	}

}
