package swing.frame;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ContentPaneFrame extends JFrame {

	public ContentPaneFrame(String title) {
		setTitle(title);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 300);
		setLocationRelativeTo(null);
		setLayout(new FlowLayout());     // ·¹ÀÌ¾Æ¿ô
		
		JButton btn1 = new JButton("OK");
		btn1.setBackground(Color.RED);
		add(btn1);
		JButton btn2 = new JButton("Cancel");
		btn2.setBackground(Color.YELLOW);
		add(btn2);
		JButton btn3 = new JButton("Ignore");
		btn3.setBackground(Color.GREEN);
		add(btn3);
		
		Container contentPane = this.getContentPane();
		contentPane.setBackground(Color.ORANGE);
		
		setVisible(true);
		
	}

}
