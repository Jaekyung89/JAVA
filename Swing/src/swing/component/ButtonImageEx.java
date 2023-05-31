package swing.component;

import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class ButtonImageEx extends JFrame  {
	

	public ButtonImageEx(String title) {
		setTitle(title);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(250, 150);
		setLocationRelativeTo(null);
		setLayout(new FlowLayout());
		
		Container c = getContentPane();
		
		ImageIcon normalIcon = new ImageIcon("images/normalIcon.gif");
		ImageIcon rolloverIcon = new ImageIcon("images/rolloverIcon.gif");
		ImageIcon pressedIcon = new ImageIcon("images/pressedIcon.gif");
		
		JButton btn = new JButton("call~~", normalIcon);
		btn.setPressedIcon(pressedIcon);
		btn.setRolloverIcon(rolloverIcon);
		c.add(btn);		
		
		setVisible(true);		
	}

	public static void main(String[] args) {
		new ButtonImageEx("이미지 버튼 예제");

	}

}