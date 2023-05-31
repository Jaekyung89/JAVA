package swing.component;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class RadioButtonEx extends JFrame  {
	

	public RadioButtonEx(String title) {
		setTitle(title);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(250, 150);
		setLocationRelativeTo(null);
		setLayout(new FlowLayout());
		
		Container c = getContentPane();
		
		ButtonGroup g = new ButtonGroup();
		
		JRadioButton apple = new JRadioButton("���");	
		JRadioButton pear = new JRadioButton("��", true);
		JRadioButton cherry = new JRadioButton("ü��");
		
		g.add(apple);
		g.add(pear);
		g.add(cherry);
		
		c.add(apple);
		c.add(pear);
		c.add(cherry);
		
		setVisible(true);		
	}

	public static void main(String[] args) {
		new RadioButtonEx("������ư ����� ����");

	}

}