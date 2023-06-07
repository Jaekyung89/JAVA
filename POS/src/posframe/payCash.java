package posframe;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.AbstractButton;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.Timer;

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
	private JTextField InPos;
	private AbstractButton JLtx;
	private AbstractButton imgLabel;
	private Main main;
	private JPanel center;
	private JLabel inPos;
	private JLabel user;
	private JLabel outPos;
	

	public payCash(int price) {
		setSize(300, 480);
		setResizable(false);
		setLocationRelativeTo(null);
		setLayout(new BorderLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		head();
		body(price);
		setVisible(true);
	}


	private void head() {
		JPanel north = new JPanel();
		add(north, BorderLayout.NORTH);
		north.setLayout(new FlowLayout());

		

	}

	private void body(int price) {

		center = new JPanel();
		add(center, BorderLayout.CENTER);
		center.setLayout(new FlowLayout(FlowLayout.LEFT, 19, 9));

		inPos = new JLabel("금액");
		inPos.setFont(new Font("고딕", Font.BOLD, 25));
		InPos = new JTextField(price+"", 10);//////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		InPos.setFont(new Font("고딕", Font.BOLD, 20));
		
		center.add(inPos);
		center.add(InPos);
		
		user = new JLabel("입금");
		user.setFont(new Font("고딕", Font.BOLD, 25));
		User = new JTextField("", 10);
		User.setFont(new Font("고딕", Font.BOLD, 20));
		
		center.add(user);
		center.add(User);
		
		outPos = new JLabel("잔돈");
		outPos.setFont(new Font("고딕", Font.BOLD, 25));
		OutPos = new JTextField("", 10);
		OutPos.setFont(new Font("고딕", Font.BOLD, 20));
		
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

			button[i].setPreferredSize(new Dimension(70, 55));
		}
		
		
		
		Ok = new JButton("닫기");
		Ok.setFont(new Font("고딕", Font.BOLD, 25));
		
		Ok.setBorderPainted(false);
		Ok.setBackground(Color.WHITE);
		center.add(Ok);
		Ok.addActionListener(this);
		
		Ok.setPreferredSize(new Dimension(250, 30));
		

	}
	
	public static void main(String[] args) {
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
			String in = InPos.getText();
			String cen = User.getText();
			int Input = Integer.parseInt(in);
			int CenData = Integer.parseInt(cen);
			int Output = CenData - Input;
			String output = Integer.toString(Output);
			OutPos.setText(output);
			
			if(Output >= 0) {
			
				
				
				
				
				payLoading();
			      
			}
			
			///////////////////////////////////////////// reT = money - val1/
			
			char ch[];
			String temp;
		}
		
		else if(btn.equals(Ok)) {
			dispose();
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


	private void payLoading() {
		// TODO Auto-generated method stub
		  Container c = getContentPane();
	      c.setLayout(new FlowLayout());
	      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	      setSize(500, 400);
	      setLocationRelativeTo(null);
	      
	      JLabel JLtx = new JLabel("결제중입니다.");
	      JLtx.setFont(new Font("고딕", Font.BOLD, 28));
		  
	      ImageIcon imageIcon = new ImageIcon("javaImage/pay/loading.gif");
	      JLabel imgLabel = new JLabel(imageIcon);
	      
	      for (int i = 0; i < btnGhp.length; i++) {
				center.remove(button[i]);
			}
	      
	      center.remove(Ok);
	      center.remove(inPos);
	      center.remove(InPos);
	      center.remove(user);
	      center.remove(User);
	      
	      c.add(JLtx);
	      c.add(imgLabel);
	      
	      setVisible(true);
	      
	     
	      Timer timer = new Timer(2000, e -> {
	    	  JLtx.setText("결제가 완료되었습니다."); // 새로운 라벨로 변경
	    	  ImageIcon imageIcon2 = new ImageIcon("javaImage/pay/checkPay.png");
	    	  imgLabel.setIcon(imageIcon2);
	    	  imgLabel.setBounds(750, 300, 450, 45);
	          repaint(); // 프레임 다시 그리기

	          
	          Timer exitTimer = new Timer(1000, exitEvent -> {
	              dispose(); // 프레임 종료
	              setVisible(false);
	        	  main = new Main();
	        	  main.getMainPanel().setVisible(true);
	          });
	          exitTimer.setRepeats(false); // 반복 실행하지 않도록 설정
	          exitTimer.start(); // 타이머 시작
	      });
	      timer.setRepeats(false); // 반복 실행하지 않도록 설정
	      timer.start(); // 타이머 시작
	      
	      
	}

} 

