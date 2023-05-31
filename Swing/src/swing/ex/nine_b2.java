package swing.ex;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class nine_b2 extends JFrame {
	private JLabel number;
	private JLabel result;
	private JTextField TextfieldNumber;
	private JTextField TextfieldResult;
	private int [] changeOperand = new int[10];
	private int firstOperator=0;
	private int seconfOperator=0;
	private char operator;
	
	private class NorthPanel extends JPanel{
		public NorthPanel() {
			setBackground(Color.LIGHT_GRAY);
			setLayout(new FlowLayout(FlowLayout.LEFT));
			number = new JLabel("수식");
			result = new JLabel("결과");

			TextfieldNumber=new JTextField(9);
			TextfieldResult=new JTextField(7);
			
			add(number);
			add(TextfieldNumber);
			TextfieldNumber.setEditable(false);
			add(result);
			add(TextfieldResult);
			TextfieldResult.setEditable(false);
		}
	}
	private class CenterPanel extends JPanel{
		public CenterPanel() {
			setLayout(new GridLayout(4,4,5,5));
			
			JButton [] btn=new JButton[16];
			btn[0]=new JButton("0");
			btn[1]=new JButton("1");
			btn[2]=new JButton("2");
			btn[3]=new JButton("3");
			btn[4]=new JButton("4");
			btn[5]=new JButton("5");
			btn[6]=new JButton("6");
			btn[7]=new JButton("7");
			btn[8]=new JButton("8");
			btn[9]=new JButton("9");
			btn[10]=new JButton("CE");
			btn[11]=new JButton("계산");
			btn[12]=new JButton("+");
			btn[13]=new JButton("-");
			btn[14]=new JButton("*");
			btn[15]=new JButton("/");
			
			for(int i=12;i<16;i++) {
				btn[i].setBackground(new Color(102,204,204));
			}
			
			for(int i=0;i<16;i++) {
				btn[i].addActionListener(new MyActionListener());
				add(btn[i]);
			}
			
		}
	}
	
	private class MyActionListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			JButton btnButton=(JButton)e.getSource();
			
			int index=0;
			if(btnButton.getText().equals("CE")) {
				TextfieldNumber.setText("");
				TextfieldResult.setText("");
				firstOperator = 0;
				seconfOperator = 0;
			}
			else if(btnButton.getText().equals("계산")) {
				String str = TextfieldNumber.getText();
				for(int i = TextfieldNumber.getText().length()-1; i >= 0; i--) {
					char c = str.charAt(i);
					// 첫 번째 텍스트 필드에 저장되어 있는 문자를 뒤에서 부터 하나씩 읽어들임(두 번째 피연산자를 찾기 위함)
					
					if(c == '+' | c == '-' | c == '*' | c == '/') { 
						operator = c;
						break;
					}
					// 연산자를 기준으로 오른쪽 텍스트가 피연산자이기 때문에 연산자를 찾으면 더 이상 루프를 돌 필요가 없음
					
					else {
						changeOperand[index] = Integer.parseInt(Character.toString(c));
						seconfOperator += changeOperand[index]*(Math.pow(10, index)); //10의 index 제곱
						// 제곱 함수를 사용해서 두 번째 피연산자 처리
						
						index++;
					}
				}
				
				switch(operator) {
				case '+':
					TextfieldResult.setText(Integer.toString(firstOperator + seconfOperator));
					break;
				case '-':
					TextfieldResult.setText(Integer.toString(firstOperator - seconfOperator));
					break;
				case '*':
					TextfieldResult.setText(Integer.toString(firstOperator * seconfOperator));
					break;
				case '/':
					TextfieldResult.setText(Float.toString(firstOperator / seconfOperator));
					break;
				}
			}
			
			else if(btnButton.getText().equals("+") | btnButton.getText().equals("-") | btnButton.getText().equals("*") | btnButton.getText().equals("/")) {
			// 텍스트 필드에 연산자가 입력되면 이전에 입력되었던 텍스트들을 첫 번째 피연산자로 firstOperand 변수에 저장

				firstOperator = Integer.parseInt(TextfieldNumber.getText());
		
				switch(btnButton.getText()) {
				case "+":
					TextfieldNumber.setText(TextfieldNumber.getText() + "+");
					break;
				case "-":
					TextfieldNumber.setText(TextfieldNumber.getText() + "-");
					break;
				case "*":
					TextfieldNumber.setText(TextfieldNumber.getText() + "*");
					break;
				case "/":
					TextfieldNumber.setText(TextfieldNumber.getText() + "/");
					break;
				}
			}
			
			else {
				for(int i = 0; i < 10; i++) {
					if(btnButton.getText().equals(Integer.toString(i))) {
						TextfieldNumber.setText(TextfieldNumber.getText() + Integer.toString(i));
					}
				}
			}
		}
	}
	
	public nine_b2() {
		super("간단한 계산기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c=getContentPane();
		c.setLayout(new BorderLayout());
		
		c.add(new NorthPanel(), BorderLayout.NORTH);
		c.add(new CenterPanel(), BorderLayout.CENTER);
		
		setSize(300,300);
		setVisible(true);
	}
	
	public static void main(String [] args) {
		new nine_b2();
	}
}