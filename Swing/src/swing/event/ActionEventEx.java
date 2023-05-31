package swing.event;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ActionEventEx extends JFrame {

	public ActionEventEx(String title) {
		setTitle(title);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 300);
		setLocationRelativeTo(null);
		//레이아웃 설정
		setLayout(new FlowLayout());
		
		JButton btn =new JButton("Button");
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
					JButton btn = (JButton)e.getSource(); //Down Cast
					if(btn.getText().equals("Button")) {
						btn.setText("Test");
					}
					else {
						btn.setText("Button");
					}
				}
				
		});
		add(btn);
		

		setVisible(true);
	}
	
	public static void main(String[] args) {
		
		new ActionEventEx("ActionEventEx");
		
	}

}