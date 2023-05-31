package swing.component;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ChatClientFrame extends JFrame implements ActionListener {

	
	private JTextField tf;
	private JTextArea ta;
	private JButton sbtn;

	public ChatClientFrame(String title) {
		setTitle(title);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 350);
		setLocationRelativeTo(null);
		setLayout(new BorderLayout());
		
		setPanelCenter();
		
		setPanelBottom();
		
		
		setResizable(false);
		tf.setFocusable(true);
		setVisible(true);
		tf.requestFocus();
	}

	private void setPanelCenter() {
		JPanel Cpan = new JPanel();
		Cpan.setLayout(new BorderLayout());
		Cpan.setBackground(Color.RED);
		
		ta = new JTextArea();
		ta.setLineWrap(true);
		ta.setEditable(false);
		JScrollPane sp = new JScrollPane(ta, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
				JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		Cpan.add(sp);
		
		add(Cpan, BorderLayout.CENTER);
		
		
	}

	private void setPanelBottom() {
		JPanel Bpan = new JPanel();
		
		tf = new JTextField(17);
		tf.addActionListener(this);
		Bpan.add(tf);
		
		sbtn = new JButton("보내기");
		sbtn.setPreferredSize(new Dimension(80,30));
		sbtn.addActionListener(this);
		Bpan.add(sbtn);
		
		add(Bpan, BorderLayout.SOUTH);
	}

	public static void main(String[] args) {
		ChatClientFrame ccf = new ChatClientFrame("ChatClient");
		ccf.setSocket();
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(!tf.getText().equals("")) {
			ta.append("[김재경] : " + tf.getText() + "\n");
		}
		tf.setText("");
		tf.requestFocus();
	}

	public void setSocket() {
		Socket socket = null;
	      BufferedReader in = null;
	      BufferedWriter out = null;
	      Scanner scan = new Scanner(System.in);
	      try {
	         
	         socket = new Socket("localhost",9000);
	      
	         in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
	         out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
	         
	         while(true) {
	            
	            System.out.print("보내기 >>> ");
	            String outMsg = scan.nextLine();
	            
	            out.write(outMsg + "\n");
	            out.flush();
	            
	            String inMsg = in.readLine();
	            System.out.println(inMsg);
	         }
	         
	      } catch (IOException e) {
	         e.printStackTrace();
	      } finally {
	         try {
	            out.close();
	            in.close();
	            scan.close();
	            socket.close();
	            
	            
	         } catch (IOException e) {
	            e.printStackTrace();
	         }
	      }
	}
	
}