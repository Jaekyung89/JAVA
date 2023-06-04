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

public class Noodle implements ActionListener {

	private JFrame noodleframe;
	private JPanel Noodlemp1;
	private JButton noodle1;
	private JButton noodle2;
	private JButton noodle3;
	private JButton noodle4;
	private JButton noodle5;
	private JButton noodle6;
	private JButton noodle7;
	private JButton noodle8;
	private JButton noodle9;
	private JButton noodle10;
	private JPanel NoodlePanel;
	private Main PosMain;
	private JButton GoHome;
	
	
	public Noodle(Main PosMain) {
		noodleframe = new JFrame();
		noodleframe.setBounds(0, 0, 1200, 950);
		noodleframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		noodleframe.getContentPane().setLayout(null);
		noodleframe.setLocationRelativeTo(null);
		noodleframe.setResizable(false);
		
		this.PosMain = PosMain;
		
		noodlepanel();
        
		PosMain.getMainPanel().repaint();
		PosMain.getMainPanel().revalidate();
		
        noodleframe.setVisible(false);
	}
	

	private void noodlepanel() {
		NoodlePanel = new JPanel();
		NoodlePanel.setLayout(null);
		NoodlePanel.setBounds(0, 0, 1200, 950);
        PosMain.getMainPanel().add(NoodlePanel);
        
        Noodlemp1();
		
    }

	private void Noodlemp1() {
		Noodlemp1 = new JPanel();
		Noodlemp1.setLayout(null);
		Noodlemp1.setBounds(0, 0, 1200, 950);
        NoodlePanel.add(Noodlemp1);
        
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
        Noodlemp1.add(p1);
    }

    private void sp2() {
        JPanel p2 = new JPanel();
        p2.setBackground(Color.white);
        p2.setBounds(0, 15, 1200, 50);
        Noodlemp1.add(p2);
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
        Noodlemp1.add(p3);
    }
    
    private void sp4() {
        JPanel p4 = new JPanel();
        p4.setBackground(Color.WHITE);
        p4.setBounds(0, 80, 1200, 100);
        Noodlemp1.add(p4);
        
        GoHome = new JButton("Home");
        GoHome.addActionListener(this);
        p4.add(GoHome);
        
    }

    private void sp5() {
    	
    	JPanel p5 = new JPanel();
        p5.setBackground(Color.WHITE);
        p5.setBounds(0, 180, 1200, 470);
        Noodlemp1.add(p5);
        p5.setLayout(new BorderLayout());
        
        JPanel btnpan = new JPanel();
        btnpan.setBackground(Color.WHITE);
        btnpan.setLayout(new GridLayout(2, 5, 30, 10));
        
        noodle1 = createButton("javaImage/noodle/noodle1.png");
        noodle2 = createButton("javaImage/noodle/noodle2.png");
        noodle3 = createButton("javaImage/noodle/noodle3.png");
        noodle4 = createButton("javaImage/noodle/noodle4.png");
        noodle5 = createButton("javaImage/noodle/noodle5.png");
        noodle6 = createButton("javaImage/noodle/noodle6.png");
        noodle7 = createButton("javaImage/noodle/noodle7.png");
        noodle8 = createButton("javaImage/noodle/noodle8.png");
        noodle9 = createButton("javaImage/noodle/noodle9.png");
        noodle10 = createButton("javaImage/noodle/noodle10.png");
        
        btnpan.add(noodle1);
        btnpan.add(noodle2);
        btnpan.add(noodle3);
        btnpan.add(noodle4);
        btnpan.add(noodle5);
        btnpan.add(noodle6);
        btnpan.add(noodle7);
        btnpan.add(noodle8);
        btnpan.add(noodle9);
        btnpan.add(noodle10);
        
        
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
        Noodlemp1.add(p6);
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
			NoodlePanel.setVisible(false);
			PosMain.getMp1().setVisible(true);
			
		}
	}
}
