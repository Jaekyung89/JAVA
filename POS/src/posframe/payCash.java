package posframe;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class payCash extends JFrame implements ActionListener {

	
	private JTextField tf;
	private Object obj;
	private String btnGhp[] = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "계산",  "0",  "←"}; // 문자 배열
	private JButton button[] = new JButton[btnGhp.length]; // 버튼 배열
	
	String val1 = null, val2 = null, sign = null;
	Double result = 0.0;
	private JButton Ok;
	private JTextField User;
	private JTextField OutPos;
	

	public payCash() {
		setSize(300, 480);
		setResizable(false);
		setLocationRelativeTo(null);
		setLayout(new BorderLayout());

		head();
		body();
		setVisible(true);
	}


	private void head() {
		JPanel north = new JPanel();
		add(north, BorderLayout.NORTH);
		north.setLayout(new FlowLayout());

		

	}

	private void body() {

		JPanel center = new JPanel();
		add(center, BorderLayout.CENTER);
		center.setLayout(new FlowLayout(FlowLayout.LEFT, 19, 9));

		JLabel inPos = new JLabel("금액");
		inPos.setFont(new Font("고딕", Font.BOLD, 25));
		JTextField InPos = new JTextField("왐밤빵", 10);//////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		InPos.setFont(new Font("고딕", Font.BOLD, 20));
		
		center.add(inPos);
		center.add(InPos);
		
		JLabel user = new JLabel("입금");
		user.setFont(new Font("고딕", Font.BOLD, 25));
		User = new JTextField(10);
		User.setFont(new Font("고딕", Font.BOLD, 20));
		
		center.add(user);
		center.add(User);
		
		JLabel outPos = new JLabel("잔돈");
		outPos.setFont(new Font("고딕", Font.BOLD, 25));
		OutPos = new JTextField(10);
		User.setFont(new Font("고딕", Font.BOLD, 20));
		
		center.add(outPos);
		center.add(OutPos);
		
		/*
		 * tf = new JTextField(); tf.setPreferredSize(new Dimension(250, 45));
		 * tf.setHorizontalAlignment(JTextField.CENTER); // 입력 시작 Font font = new
		 * Font("Arial", Font.PLAIN, 28); // 원하는 폰트 및 크기 설정 tf.setFont(font);
		 * center.add(tf);
		 */
		
		
		
		for (int i = 0; i < btnGhp.length; i++) {
			button[i] = new JButton(btnGhp[i]);
			button[i].setBorderPainted(false);
			button[i].setBackground(Color.WHITE);
			center.add(button[i]);
			button[i].addActionListener(this);

			button[i].setPreferredSize(new Dimension(70, 60));
		}
		
		
		
		Ok = new JButton("계산");
		Ok.setFont(new Font("고딕", Font.BOLD, 25));
		
		Ok.setBorderPainted(false);
		Ok.setBackground(Color.WHITE);
		center.add(Ok);
		Ok.addActionListener(this);
		
		Ok.setPreferredSize(new Dimension(250, 45));
		

	}
	
	public static void main(String[] args) {
		new payCash();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		obj = e.getSource();
		JButton btn = (JButton)obj;
		String data = e.getActionCommand();
		
		
		if(data.equals("1") || data.equals("2") || data.equals("3") || 
				data.equals("4") || data.equals("5") || data.equals("6") || 
				data.equals("7") || data.equals("8") || data.equals("9") || 
				data.equals("0")) {
			val1 = User.getText() + data;
			User.setText(val1);
		}
		
		else if(btn.equals(button[9])) { // 계산 버튼
			val1 = User.getText();
			int intVal = Integer.parseInt(val1);
			///////////////////////////////////////////// reT = money - val1/
			
			char ch[];
			String temp;
			
			
		}
		
		
		
		else if(btn.equals(button[11])) { // <-
			val1 = User.getText();
			char ch[];
			String temp;
			
			ch = val1.toCharArray();
			ch[ch.length - 1] = '\n';
			String str = new String(ch);
			temp = str.substring(0, ch.length-1);
			val1 = temp;
			User.setText(temp);
		}
		
		
	}

} 

