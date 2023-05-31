package swing.component;

import java.awt.FlowLayout;

import javax.swing.JFrame;

public class BasicForm extends JFrame  {
	

	public BasicForm(String title) {
		setTitle(title);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 300);
		setLocationRelativeTo(null);
		setLayout(new FlowLayout());
		
				
		setVisible(true);		
	}

	public static void main(String[] args) {
		new BasicForm("");

	}

}