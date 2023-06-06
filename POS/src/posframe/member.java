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

public class member extends JFrame implements ActionListener {

	
	private JTextField tf;
	private Object obj;
	private String btnGhp[] = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "-",  "0",  "←"}; // 문자 배열
	private JButton button[] = new JButton[btnGhp.length]; // 버튼 배열
	
	String val1 = null, val2 = null, sign = null;
	Double result = 0.0;
	private JButton Ok;
	private dataBase2 db2 = null;
	

	public member(String title) {
		setTitle(title);
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

		
		JLabel JLtx = new JLabel("번호를 입력해주세요");
	    JLtx.setFont(new Font("고딕", Font.BOLD, 25));
		
		north.add(JLtx);

	}

	private void body() {

		JPanel center = new JPanel();
		add(center, BorderLayout.CENTER);
		center.setLayout(new FlowLayout(FlowLayout.LEFT, 19, 9));

		tf = new JTextField();
		tf.setPreferredSize(new Dimension(250, 45));
		tf.setHorizontalAlignment(JTextField.CENTER); //  입력 시작
		Font font = new Font("Arial", Font.PLAIN, 28);  // 원하는 폰트 및 크기 설정
		tf.setFont(font);
		center.add(tf);
		
		
		
		for (int i = 0; i < btnGhp.length; i++) {
			button[i] = new JButton(btnGhp[i]);
			button[i].setBorderPainted(false);
			button[i].setBackground(Color.WHITE);
			center.add(button[i]);
			button[i].addActionListener(this);

			button[i].setPreferredSize(new Dimension(70, 60));
		}
		
		
		
		Ok = new JButton("적립");
		Ok.setFont(new Font("고딕", Font.BOLD, 25));
		
		Ok.setBorderPainted(false);
		Ok.setBackground(Color.WHITE);
		center.add(Ok);
		Ok.addActionListener(this);
		
		Ok.setPreferredSize(new Dimension(250, 45));
		

	}
	
	public static void main(String[] args) {
		new member("member");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		obj = e.getSource();
		JButton btn = (JButton)obj;
		String data = e.getActionCommand();
		
		
		if(data.equals("1") || data.equals("2") || data.equals("3") || 
				data.equals("4") || data.equals("5") || data.equals("6") || 
				data.equals("7") || data.equals("8") || data.equals("9") || 
				data.equals("0") || data.equals("-")) {
			val1 = tf.getText() + data;
			tf.setText(val1);
		}
		
		
		
		else if(btn.equals(button[11])) { // <-
			val1 = tf.getText();
			char ch[];
			String temp;
			
			ch = val1.toCharArray();
			ch[ch.length - 1] = '\n';
			String str = new String(ch);
			temp = str.substring(0, ch.length-1);
			val1 = temp;
			tf.setText(temp);
		}
		
		if(data.equals("적립")) {
			//db 삽입
			
			/*
			 int point = money*0.01
			 
			 */
			int point=0;
			String money = Integer.toString(point);
			String originalText = tf.getText();  // 텍스트 필드에서 문자열 읽기
	        String id = originalText.replace("-", "");  // "-" 제거
	        
	        db2 = new dataBase2(id, money);
			
			
			
			dispose();
		}
		
	}

} 

