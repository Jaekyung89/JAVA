package swing.component;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator extends JFrame implements ActionListener  {
	
	private JTextField tf;
	private double result = 0;
    private String operator = "=";
    private boolean startNumber = true;
    
	public Calculator(String title) {
		setTitle(title);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 300);
		setLocationRelativeTo(null);
		setLayout(new BorderLayout());
		setResizable(false);
		
		setPanelTop();
		setPanelCenter();
		
		setVisible(true);		
	}

	private void setPanelTop() {
	      JPanel Tpan = new JPanel();
	      Tpan.setPreferredSize(new Dimension(300, 50));
	      tf = new JTextField(25);
	      Tpan.setBorder(BorderFactory.createEmptyBorder(7, 0, 0, 0));
	      tf.setPreferredSize(new Dimension(300, 30));
	      tf.setHorizontalAlignment(JTextField.RIGHT);
	      Tpan.add(tf);
	      add(Tpan, BorderLayout.NORTH);
	   }
	

	private void setPanelCenter() {
	    JPanel Cpan = new JPanel(new GridLayout(0, 1, 5, 5));
	    Cpan.setPreferredSize(new Dimension(300, 200));
	    
	    JPanel pan1 = new JPanel(new GridLayout(1, 3, 5, 0));
	    JButton btnBS = new JButton("¡ç");
	    JButton btnCE = new JButton("CE");
	    JButton btnC = new JButton("C");
	    
	    btnCE.setForeground(Color.RED);
	    btnC.setForeground(Color.RED);
	    btnBS.setForeground(Color.BLUE);
	    
	    btnBS.addActionListener(this);
	    btnCE.addActionListener(this);
	    btnC.addActionListener(this);
	    
	    pan1.add(btnBS);
	    pan1.add(btnCE);
	    pan1.add(btnC);

	    JPanel pan2 = new JPanel(new GridLayout(1, 4, 5, 0));
	    JButton btn7 = new JButton("7");
	    JButton btn8 = new JButton("8");
	    JButton btn9 = new JButton("9");
	    JButton btnDiv = new JButton("/");
	    
	    btnDiv.setForeground(Color.BLUE);
	    
	    btn7.addActionListener(this);
	    btn8.addActionListener(this);
	    btn9.addActionListener(this);
	    btnDiv.addActionListener(this);
	    
	    pan2.add(btn7);
	    pan2.add(btn8);
	    pan2.add(btn9);
	    pan2.add(btnDiv);

	    JPanel pan3 = new JPanel(new GridLayout(1, 4, 5, 0));
	    JButton btn4 = new JButton("4");
	    JButton btn5 = new JButton("5");
	    JButton btn6 = new JButton("6");
	    JButton btnMul = new JButton("*");
	    
	    btnMul.setForeground(Color.BLUE);
	    
	    btn4.addActionListener(this);
	    btn5.addActionListener(this);
	    btn6.addActionListener(this);
	    btnMul.addActionListener(this);
	    
	    pan3.add(btn4);
	    pan3.add(btn5);
	    pan3.add(btn6);
	    pan3.add(btnMul);

	    JPanel pan4 = new JPanel(new GridLayout(1, 4, 5, 0));
	    JButton btn1 = new JButton("1");
	    JButton btn2 = new JButton("2");
	    JButton btn3 = new JButton("3");
	    JButton btnSub = new JButton("-");
	    
	    btnSub.setForeground(Color.BLUE);
	    
	    btn1.addActionListener(this);
	    btn2.addActionListener(this);
	    btn3.addActionListener(this);
	    btnSub.addActionListener(this);
	    
	    pan4.add(btn1);
	    pan4.add(btn2);
	    pan4.add(btn3);
	    pan4.add(btnSub);

	    JPanel pan5 = new JPanel(new GridLayout(1, 4, 5, 0));
	    JButton btn0 = new JButton("0");
	    JButton btnEq = new JButton("=");
	    JButton btndot = new JButton(".");
	    JButton btnadd = new JButton("+");
	    
	    btnEq.setForeground(Color.BLUE);
	    btndot.setForeground(Color.BLUE);
	    btnadd.setForeground(Color.BLUE);
	    
	    btn0.addActionListener(this);
	    btnEq.addActionListener(this);
	    btndot.addActionListener(this);
	    btnadd.addActionListener(this);
	    
	    pan5.add(btn0);
	    pan5.add(btnEq);
	    pan5.add(btndot);
	    pan5.add(btnadd);

	    Cpan.add(pan1);
	    Cpan.add(pan2);
	    Cpan.add(pan3);
	    Cpan.add(pan4);
	    Cpan.add(pan5);

	    add(Cpan, BorderLayout.CENTER);
	}
	
	public static void main(String[] args) {
		new Calculator("°è»ê±â");

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String action = e.getActionCommand();
	    
	    if (action.equals("C")) {
	        tf.setText("");
	        result = 0;
	        operator = "=";
	        startNumber = true;
	    } else if (action.equals("CE")) {
	        tf.setText("");
	        startNumber = true;
	    } else if (action.equals("¡ç")) {
	        String text = tf.getText();
	        if (text.length() > 0) {
	            text = text.substring(0, text.length() - 1);
	            tf.setText(text);
	        }
	    } else if (action.matches("[0-9]")) {
	        if (startNumber) {
	            tf.setText(action);
	            startNumber = false;
	        } else {
	            tf.setText(tf.getText() + action);
	        }
	    } else if (action.equals(".")) {
	        if (startNumber) {
	            tf.setText("0.");
	            startNumber = false;
	        } else if (tf.getText().indexOf(".") < 0) {
	            tf.setText(tf.getText() + ".");
	        }
	    } else {
	        if (!startNumber) {
	            double number = Double.parseDouble(tf.getText());
	            if (operator.equals("+")) {
	                result += number;
	            } else if (operator.equals("-")) {
	                result -= number;
	            } else if (operator.equals("*")) {
	                result *= number;
	            } else if (operator.equals("/")) {
	                result /= number;
	            } else {
	                result = number;
	            }
	            tf.setText(Double.toString(result));
	            startNumber = true;
	        }
	        operator = action;
	    }
	}
}