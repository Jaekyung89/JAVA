package chat;

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
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ChatServerFrame extends JFrame implements ActionListener {

	
	private JTextField tf;
	private JTextArea ta;
	private JButton sbtn;
	private ServerSocket listener = null;
	private Socket socket = null;
	private BufferedReader in = null;
	private BufferedWriter out = null;

	public ChatServerFrame(String title) {
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
		ChatServerFrame csf = new ChatServerFrame("ChatServer");
		csf.setServer();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(!tf.getText().equals("")) {
			
            String outMsg = tf.getText();
            try {
				out.write(outMsg + "\n");
	            out.flush(); 
			} catch (IOException e1) {
				e1.printStackTrace();
			}
			ta.append("[서버] : " + tf.getText() + "\n");
            
		}
		tf.setText("");
		tf.requestFocus();
	}

	public void setServer() {
		
	      try {
	         listener = new ServerSocket(9000);
	         ta.append("연결을 기다립니다.....\n");
	         socket = listener.accept();
	         ta.append("연결 되었습니다.\n");
	         
	         in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
	         out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
	         
	         while(true) {
	            String inMsg = in.readLine();
	            ta.append("[클라이언트]" + inMsg + "\n");
	            
	         }
	         
	      } catch (IOException e) {
	         e.printStackTrace();
	      } finally {
	         try {
	            out.close();
	            in.close();
	            socket.close();
	            
	            listener.close();
	         } catch (IOException e) {
	            e.printStackTrace();
	         }
	      }
	}
	
}