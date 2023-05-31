package swing.component;

import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ImageLabel extends JFrame {

	public ImageLabel(String title) {
		setTitle(title);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 500);
		setLocationRelativeTo(null);
		setLayout(new FlowLayout());
		
		JLabel lbl = new JLabel("나는 레벨");
		add(lbl);
		
		ImageIcon image = new ImageIcon("images/gosling.jpg");
		JLabel imglbl = new JLabel(image);
		add(imglbl);
		
		ImageIcon image2 = new ImageIcon("images/icon.gif");
		
		JButton btn = new JButton("전화주세요", image2);
		add(btn);
		
		setVisible(true);		
	}

	public static void main(String[] args) {
		new ImageLabel("MyComponent");

	}

}