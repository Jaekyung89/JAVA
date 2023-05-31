package swing.frame;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame extends JFrame {

	public MyFrame(String title) {
		setTitle(title);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 300);
		setLocationRelativeTo(null);
		setLayout(new FlowLayout());     // 레이아웃
		
		JButton btn = new JButton("버튼");
		add(btn);
		
		
		setVisible(true);
		
	}

}
