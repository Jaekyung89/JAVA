package swing.frame;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class NEW1 extends JFrame implements ActionListener {

	private JButton btn;
	private Container contentPane;

	public NEW1(String title) {
		setTitle(title);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 300);
		setLocationRelativeTo(null);
		//레이아웃 설정
		setLayout(new FlowLayout());
		
		contentPane = getContentPane();
		
		btn =new JButton("1");
		btn.addActionListener(this);
		add(btn);
		
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		
		new NEW1("NEW1");
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		if(obj == btn) {
		contentPane.setBackground(Color.GREEN);
		
		}
	}

}
