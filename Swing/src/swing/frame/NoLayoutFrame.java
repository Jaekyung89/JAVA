package swing.frame;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class NoLayoutFrame extends JFrame implements ActionListener {

	private JButton btn;
	private Container contentPane;

	public NoLayoutFrame(String title) {
		setTitle(title);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 200);
		setLocationRelativeTo(null);
		//?젅?씠?븘?썐 ?꽕?젙
//		setLayout(new FlowLayout()); //Flow /Border /Grid 
		setLayout(null); //Flow /Border /Grid 
		contentPane = getContentPane();
		
		//JLabel, JTextField
		
		JLabel lbl1 = new JLabel("이   름");
		lbl1.setBounds(50, 30, 50, 20);
		add(lbl1);
		JTextField field1 = new JTextField("");
		field1.setBounds(150, 30, 100, 20);
		add(field1);
		JLabel lbl2 = new JLabel("학   번");
		lbl2.setBounds(50, 70, 50, 20);
		add(lbl2);
		JTextField field2 = new JTextField("");
		field2.setBounds(150, 70, 100, 20);
		add(field2);
		btn = new JButton("입   력");
		btn.setBounds(110, 120, 70, 20);
		btn.addActionListener(this);
		add(btn);
		
//		JButton btn = new JButton("1");
//		btn.setSize(100, 25);
//		btn.setLocation(100, 100);
//		add(btn);
//		
//		JButton btn2 = new JButton("2");
//		btn2.setBounds(100, 30, 50, 35);
//		add(btn2);
		
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
	
		new NoLayoutFrame("NoLayoutFrame");

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Object obj = e.getSource();
		
		if(obj == btn) {
			contentPane.setBackground(Color.GRAY);
		}
	}

}
