package swing.layout;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class GridLayoutFrame2 extends JFrame {

	public GridLayoutFrame2(String title) {
		setTitle(title);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 180);
		setResizable(false);
		setLocationRelativeTo(null);
		
		setLayout(null);
		
		JLabel lb1 = new JLabel("�̸�");
		lb1.setBounds(50, 20, 80, 25);
		add(lb1);
		
		JTextField tf1 = new JTextField("");
		tf1.setBounds(150, 20, 100, 25);
		add(tf1);
		
		JButton btn1 = new JButton("Ȯ��");
		btn1.setBounds(95, 100, 100, 25);
		add(btn1);
		
		
		/*JLabel lb2 = new JLabel("�й�");
		lb2.setBounds(10, 35, 100, 50);
		add(lb2);
		
		JTextField tf2 = new JTextField("");
		add(tf2);
		
		JLabel lb3 = new JLabel("�а�");
		lb3.setBounds(10, 65, 100, 50);
		add(lb3);
		
		JTextField tf3 = new JTextField("");
		add(tf3);
		
		JLabel lb4 = new JLabel("�й�");
		lb3.setBounds(10, 95, 100, 50);
		add(lb4);
		
		JTextField tf4 = new JTextField("");
		add(tf4); */
		
	
		
	
		setVisible(true);
		
	}

}
