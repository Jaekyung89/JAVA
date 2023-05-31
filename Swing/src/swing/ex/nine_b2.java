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
			number = new JLabel("����");
			result = new JLabel("���");

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
			btn[11]=new JButton("���");
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
			else if(btnButton.getText().equals("���")) {
				String str = TextfieldNumber.getText();
				for(int i = TextfieldNumber.getText().length()-1; i >= 0; i--) {
					char c = str.charAt(i);
					// ù ��° �ؽ�Ʈ �ʵ忡 ����Ǿ� �ִ� ���ڸ� �ڿ��� ���� �ϳ��� �о����(�� ��° �ǿ����ڸ� ã�� ����)
					
					if(c == '+' | c == '-' | c == '*' | c == '/') { 
						operator = c;
						break;
					}
					// �����ڸ� �������� ������ �ؽ�Ʈ�� �ǿ������̱� ������ �����ڸ� ã���� �� �̻� ������ �� �ʿ䰡 ����
					
					else {
						changeOperand[index] = Integer.parseInt(Character.toString(c));
						seconfOperator += changeOperand[index]*(Math.pow(10, index)); //10�� index ����
						// ���� �Լ��� ����ؼ� �� ��° �ǿ����� ó��
						
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
			// �ؽ�Ʈ �ʵ忡 �����ڰ� �ԷµǸ� ������ �ԷµǾ��� �ؽ�Ʈ���� ù ��° �ǿ����ڷ� firstOperand ������ ����

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
		super("������ ����");
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