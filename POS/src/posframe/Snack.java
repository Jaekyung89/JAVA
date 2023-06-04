package posframe;

import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.Image;

import javax.swing.JLabel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Snack implements ActionListener {

	private JFrame snackframe;
	private JPanel mp1;
	private JButton snack1;
	private JButton snack2;
	private JButton snack3;
	private JButton snack4;
	private JButton snack5;
	private JButton snack6;
	private JButton snack7;
	private JButton snack8;
	private JButton snack9;
	private JButton snack10;
	private JPanel SnackPanel;
	private Main PosMain;
	private JButton GoHome;
	
	
	public Snack(Main PosMain) {
		snackframe = new JFrame();
		snackframe.setBounds(0, 0, 1200, 950);
		snackframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		snackframe.getContentPane().setLayout(null);
		snackframe.setLocationRelativeTo(null);
		snackframe.setResizable(false);
		
		this.PosMain = PosMain;
		
		SnackPanel();
        
		PosMain.getMainPanel().repaint();
		PosMain.getMainPanel().revalidate();
		
        snackframe.setVisible(false);
	}
	

	private void SnackPanel() {
		SnackPanel = new JPanel();
		SnackPanel.setLayout(null);
		SnackPanel.setBounds(0, 0, 1200, 950);
        PosMain.getMainPanel().add(SnackPanel);
        
        mp1();
		
    }

	private void mp1() {
        mp1 = new JPanel();
        mp1.setLayout(null);
        mp1.setBounds(0, 0, 1200, 950);
        SnackPanel.add(mp1);
        
		sp1();
        sp2();
        sp3();
        sp4();
        sp5();
        sp6();
    }
	
	private void sp1() {
        JPanel p1 = new JPanel();
        p1.setBackground(Color.WHITE);
        p1.setBounds(0, 0, 1200, 15);
        mp1.add(p1);
    }

    private void sp2() {
        JPanel p2 = new JPanel();
        p2.setBackground(Color.white);
        p2.setBounds(0, 15, 1200, 50);
        mp1.add(p2);
        p2.setLayout(null);
        
        JLabel lblNewLabel = new JLabel();
        lblNewLabel.setBounds(0, 0, 1200, 50);
        ImageIcon imageIcon = new ImageIcon("icon/title.png");
        Image image = imageIcon.getImage();

        // JLabel의 크기에 맞게 이미지 크기 조정
        Image scaledImage = image.getScaledInstance(lblNewLabel.getWidth(), lblNewLabel.getHeight(), Image.SCALE_SMOOTH);

        // 조정된 이미지로 ImageIcon 생성
        ImageIcon scaledIcon = new ImageIcon(scaledImage);

        // JLabel에 이미지 설정
        lblNewLabel.setIcon(scaledIcon);

        p2.add(lblNewLabel);
    }
    
    private void sp3() {
        JPanel p3 = new JPanel();
        p3.setBackground(Color.WHITE);
        p3.setBounds(0, 65, 1200, 15);
        mp1.add(p3);
    }
    
    private void sp4() {
        JPanel p4 = new JPanel();
        p4.setBackground(Color.WHITE);
        p4.setBounds(0, 80, 1200, 100);
        mp1.add(p4);
        
        GoHome = new JButton("Home");
        GoHome.addActionListener(this);
        p4.add(GoHome);
        
    }

    private void sp5() {
    	
    	JPanel p5 = new JPanel();
        p5.setBackground(Color.WHITE);
        p5.setBounds(0, 180, 1200, 470);
        mp1.add(p5);
        p5.setLayout(new BorderLayout());
        
        JPanel btnpan = new JPanel();
        btnpan.setBackground(Color.WHITE);
        btnpan.setLayout(new GridLayout(2, 5, 30, 10));
        
        snack1 = createButton("javaImage/snack/snack1.png");
        snack2 = createButton("javaImage/snack/snack2.png");
        snack3 = createButton("javaImage/snack/snack3.png");
        snack4 = createButton("javaImage/snack/snack4.png");
        snack5 = createButton("javaImage/snack/snack5.png");
        snack6 = createButton("javaImage/snack/snack6.png");
        snack7 = createButton("javaImage/snack/snack7.png");
        snack8 = createButton("javaImage/snack/snack8.png");
        snack9 = createButton("javaImage/snack/snack9.png");
        snack10 = createButton("javaImage/snack/snack10.png");
        
        btnpan.add(snack1);
        btnpan.add(snack2);
        btnpan.add(snack3);
        btnpan.add(snack4);
        btnpan.add(snack5);
        btnpan.add(snack6);
        btnpan.add(snack7);
        btnpan.add(snack8);
        btnpan.add(snack9);
        btnpan.add(snack10);
        
        
        p5.add(btnpan, BorderLayout.CENTER);
        
        JPanel emppanw = new JPanel();
        emppanw.setPreferredSize(new Dimension(5, 100));
        emppanw.setBackground(Color.WHITE);
        p5.add(emppanw, BorderLayout.WEST);
        
        JPanel emppane = new JPanel();
        emppane.setPreferredSize(new Dimension(20, 100));
        emppane.setBackground(Color.WHITE);
        p5.add(emppane, BorderLayout.EAST);
    	
    }

    private void sp6() {
        JPanel p6 = new JPanel();
        p6.setBackground(Color.WHITE);
        p6.setBounds(0, 650, 1200, 300);
        mp1.add(p6);
        p6.setLayout(null);
        
        JLabel lblNewLabel_1 = new JLabel();
        lblNewLabel_1.setBounds(0, 0, 1200, 5);
        lblNewLabel_1.setOpaque(true);
        lblNewLabel_1.setBackground(new Color(0, 0, 0));
        
        p6.add(lblNewLabel_1);
    }
    
    private JButton createButton(String imagePath) {
        JButton button = new JButton();
        button.setBorder(BorderFactory.createLineBorder(new Color(217, 217, 217)));
        button.setBackground(new Color(217, 217, 217));
        button.setBorderPainted(false);
        button.setIcon(new ImageIcon(imagePath));
        button.setOpaque(false);
        button.addActionListener(this);
        return button;
    }
    
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		if (obj == GoHome) {
			SnackPanel.setVisible(false);
			PosMain.getMp1().setVisible(true);
			
		}
	}
}
