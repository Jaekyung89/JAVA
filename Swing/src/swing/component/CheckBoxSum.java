package swing.component;

import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class CheckBoxSum extends JFrame implements ItemListener {
	
	private JLabel lblResult;
	private JCheckBox cb1;
	private JCheckBox cb2;
	private JCheckBox cb3;
	private int sum = 0;
	
	public CheckBoxSum(String title) {
		setTitle(title);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(250, 250);
		setLocationRelativeTo(null);
		setLayout(new FlowLayout());
		
		JLabel lbl = new JLabel("사과 100원, 배 500원, 체리 20000원");
		add(lbl);

		cb1 = new JCheckBox("사과");
		cb1.setBorderPainted(true);
		cb1.addItemListener(this);
		add(cb1);

		cb2 = new JCheckBox("배");
		cb2.setBorderPainted(true);
		cb2.addItemListener(this);
		add(cb2);
		
		cb3 = new JCheckBox("체리");
		cb3.setBorderPainted(true);
		cb3.addItemListener(this);
		add(cb3);

		lblResult = new JLabel("현재 0원입니다.");
		add(lblResult);
		
		setResizable(false);
		setVisible(true);		
	}

	public static void main(String[] args) {
		new CheckBoxSum("CheckBoxSum");

	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		int i = e.getStateChange();
		int n = -1;
		if (i == ItemEvent.SELECTED) {
			n=1;
		}
		Object obj = e.getItem();
		
		if(obj == cb1) {
			sum += 100 * n;
		} else if (obj == cb2) {
			sum += 500 * n;
		} else if (obj == cb3) {
			sum += 20000 * n;
		}
		
		lblResult.setText("현재 " + sum + "원입니다.");
	}

}