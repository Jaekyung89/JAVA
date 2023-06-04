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

public class Bread implements ActionListener {

	private JFrame breadframe;
	private JPanel Breadmp1;
	private JButton bread1;
	private JButton bread2;
	private JButton bread3;
	private JButton bread4;
	private JButton bread5;
	private JButton bread6;
	private JButton bread7;
	private JButton bread8;
	private JButton bread9;
	private JButton bread10;
	private JPanel BreadPanel;
	private Main PosMain;
	private JButton GoHome;
	
	
	public Bread(Main PosMain) {
		breadframe = new JFrame();
		breadframe.setBounds(0, 0, 1200, 950);
		breadframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		breadframe.getContentPane().setLayout(null);
		breadframe.setLocationRelativeTo(null);
		breadframe.setResizable(false);
		
		this.PosMain = PosMain;
		
		BreadPanel();
        
		PosMain.getMainPanel().repaint();
		PosMain.getMainPanel().revalidate();
		
        breadframe.setVisible(false);
	}
	

	private void BreadPanel() {
		BreadPanel = new JPanel();
		BreadPanel.setLayout(null);
		BreadPanel.setBounds(0, 0, 1200, 950);
        PosMain.getMainPanel().add(BreadPanel);
        
        Breadmp1();
		
    }

	private void Breadmp1() {
		Breadmp1 = new JPanel();
		Breadmp1.setLayout(null);
		Breadmp1.setBounds(0, 0, 1200, 950);
        BreadPanel.add(Breadmp1);
        
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
        Breadmp1.add(p1);
    }

    private void sp2() {
        JPanel p2 = new JPanel();
        p2.setBackground(Color.white);
        p2.setBounds(0, 15, 1200, 50);
        Breadmp1.add(p2);
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
        Breadmp1.add(p3);
    }
    
    private void sp4() {
        JPanel p4 = new JPanel();
        p4.setBackground(Color.WHITE);
        p4.setBounds(0, 80, 1200, 100);
        Breadmp1.add(p4);
        
        GoHome = new JButton("Home");
        GoHome.addActionListener(this);
        p4.add(GoHome);
        
    }

    private void sp5() {
    	
    	JPanel p5 = new JPanel();
        p5.setBackground(Color.WHITE);
        p5.setBounds(0, 180, 1200, 470);
        Breadmp1.add(p5);
        p5.setLayout(new BorderLayout());
        
        JPanel btnpan = new JPanel();
        btnpan.setBackground(Color.WHITE);
        btnpan.setLayout(new GridLayout(2, 5, 30, 10));
        
        bread1 = createButton("javaImage/bread/bread1.png");
        bread2 = createButton("javaImage/bread/bread2.png");
        bread3 = createButton("javaImage/bread/bread3.png");
        bread4 = createButton("javaImage/bread/bread4.png");
        bread5 = createButton("javaImage/bread/bread5.png");
        bread6 = createButton("javaImage/bread/bread6.png");
        bread7 = createButton("javaImage/bread/bread7.png");
        bread8 = createButton("javaImage/bread/bread8.png");
        bread9 = createButton("javaImage/bread/bread9.png");
        bread10 = createButton("javaImage/bread/bread10.png");
        
        btnpan.add(bread1);
        btnpan.add(bread2);
        btnpan.add(bread3);
        btnpan.add(bread4);
        btnpan.add(bread5);
        btnpan.add(bread6);
        btnpan.add(bread7);
        btnpan.add(bread8);
        btnpan.add(bread9);
        btnpan.add(bread10);
        
        
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
        Breadmp1.add(p6);
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
			BreadPanel.setVisible(false);
			PosMain.getMp1().setVisible(true);
			
		}
	}
}
