package swing.event;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyEvent extends JFrame implements ActionListener {

	private JButton btn1;
	private JButton btn2;
	private Container contentPane;

	public MyEvent(String title) {
		setTitle(title);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 160);
		setLocationRelativeTo(null);
		//레이아웃 설정
		setLayout(new FlowLayout());
		contentPane = getContentPane();
		
		btn1 = new JButton("Button");
		btn1.addActionListener(this);
		add(btn1);
		btn2 = new JButton("Frame");
		btn2.addActionListener(this);
		add(btn2);
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		
		new MyEvent("MyEvent");
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		
		if(obj == btn1) {
			contentPane.setBackground(Color.RED);
	}
		else if (obj == btn2) {
			contentPane.setBackground(Color.BLUE);
		}

}
}

