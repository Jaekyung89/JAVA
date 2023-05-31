package swing.ex;

import java.util.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class ten_9_10 extends JFrame{
	private HashMap<String, String> h = new HashMap<String, String>();
	private JTextField tf1;
	private JTextField tf2;
	private JButton [] btn = new JButton[4];
	private String [] btn_text = { "저장", "찾기", "삭제", "모두 보기" };
	private Color [] btn_color = { Color.YELLOW, Color.GREEN, Color.MAGENTA, Color.CYAN };
	private JLabel label;
	private JTextArea ta;

	public ten_9_10() {
		this.setTitle("단어 사전 만들기");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(getOwner());
	
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
				
		tf1 = new JTextField(8);
		tf2 = new JTextField(8);
		ta = new JTextArea(7, 20);
		label = new JLabel(Integer.toString(h.size()));
		
		c.add(new JLabel("영어"));
		c.add(tf1);
		c.add(new JLabel("한글"));
		c.add(tf2);
		
		for(int i = 0; i < btn.length; i++) {
			btn[i] = new JButton(btn_text[i]);
			btn[i].setBackground(btn_color[i]);
			c.add(btn[i]);
			btn[i].addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					JButton b = (JButton)e.getSource();
					if(b == btn[0] && !tf1.getText().equals("")) {
						if(h.containsKey(tf1.getText())) {
							h.put(tf1.getText(), tf2.getText());
							ta.setText(ta.getText() + "변경 " + "(" + tf1.getText() + ", " + tf2.getText() + ")\n");
						}
						else {
							h.put(tf1.getText(), tf2.getText());
							ta.setText(ta.getText() + "삽입 " + "(" + tf1.getText() + ", " + tf2.getText() + ")\n");
							label.setText(Integer.toString(h.size()));
						}
						tf1.setText("");
						tf2.setText("");
					}
					else if(b == btn[1] && h.size() != 0){
						Set<String> keys = h.keySet();
						Iterator<String> it = keys.iterator();
						while(it.hasNext()) {
							String key = it.next();
							String value = h.get(key);
							if(tf1.getText().equals(key)) {
								tf2.setText(value);
							}
						}
					}
					else if(b == btn[2] && h.size() != 0) {
						if(h.containsKey(tf1.getText())) {
							ta.setText(ta.getText() + "삭제 " + "(" + tf1.getText() + ", " + h.get(tf1.getText()) + ")\n");
							h.remove(tf1.getText());
						}
						label.setText(Integer.toString(h.size()));
					}
					else {
						ta.setText("");
						Set<String> keys = h.keySet();
						Iterator<String> it = keys.iterator();
						while(it.hasNext()) {
							String key = it.next();
							String value = h.get(key);
							ta.setText(ta.getText() + "단어 " + "(" + key + ", " + value + ")\n");
						}
						label.setText(Integer.toString(h.size()));
					}
				}
			});
		}
		
		c.add(label);
		c.add(new JScrollPane(ta));
		
		this.setSize(310, 250);
		this.setVisible(true);
	}
	
	
	public static void main(String[] args) {
		new ten_9_10();
	}
}