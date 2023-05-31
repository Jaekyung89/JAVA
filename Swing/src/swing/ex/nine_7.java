package swing.ex;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class nine_7 extends JFrame {
	private JLabel label;
	public nine_7() {
		this.setTitle("Java");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		
		Container c = getContentPane();
		
		c.setLayout(new BorderLayout());
		
		c.add(new FirstPanel(), BorderLayout.NORTH);
		c.add(new SecondPanel(), BorderLayout.SOUTH);
		
		this.setSize(300, 200);
		this.setVisible(true);
	}
	
	private class FirstPanel extends JPanel {
		public FirstPanel() {
			setLayout(new FlowLayout());
			
			label = new JLabel(Integer.toString((int)(Math.random()*59)+1));
			label.setFont(new Font("Arial", Font.PLAIN, 30));
			add(label);
		}
	}
	
	private class SecondPanel extends JPanel {
		public SecondPanel() {
			setLayout(new FlowLayout());
			
			JButton [] btn = new JButton[3];
			btn[0] = new JButton("+2");
			btn[1] = new JButton("-1");
			btn[2] = new JButton("%4");
			
			for(int i = 0; i < 3; i++) {
				btn[i].addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						JButton b = (JButton)e.getSource();
						if(b == btn[0]) {
							label.setText(Integer.toString(Integer.parseInt(label.getText()) + 2));
							btn[0].setEnabled(false);
							if(btn[1].isEnabled() == false && btn[2].isEnabled() == false) {
								setTitle("실패");
							}
						}
						else if(b == btn[1]) {
							label.setText(Integer.toString(Integer.parseInt(label.getText()) - 1));
							btn[1].setEnabled(false);
							if(label.getText().equals("0")) {
								new nine_7();
								dispose();
							}
							else if(btn[0].isEnabled() == false && btn[2].isEnabled() == false) {
								setTitle("실패");
							}
						}
						else if(b == btn[2]) {
							label.setText(Integer.toString(Integer.parseInt(label.getText()) % 4));
							btn[2].setEnabled(false);
							if(label.getText().equals("0")) {
								new nine_7();
								dispose();
							}
							else if(btn[0].isEnabled() == false && btn[1].isEnabled() == false) {
								setTitle("실패");
							}
						}
					}
				});

				add(btn[i]);
			}
		}
	}
	
	public static void main(String[] args) {
		new nine_7();
	}
}