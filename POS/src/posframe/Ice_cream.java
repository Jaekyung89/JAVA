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

public class Ice_cream implements ActionListener {

	private JFrame ice_creamframe;
	private JPanel mp1;
	private JButton ice_cream1;
	private JButton ice_cream2;
	private JButton ice_cream3;
	private JButton ice_cream4;
	private JButton ice_cream5;
	private JButton ice_cream6;
	private JButton ice_cream7;
	private JButton ice_cream8;
	private JButton ice_cream9;
	private JButton ice_cream10;
	private JPanel Ice_creamPanel;
	private Main PosMain;
	private JButton GoHome;
	
	
	public Ice_cream(Main PosMain) {
		ice_creamframe = new JFrame();
		ice_creamframe.setBounds(0, 0, 1200, 950);
		ice_creamframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ice_creamframe.getContentPane().setLayout(null);
		ice_creamframe.setLocationRelativeTo(null);
		ice_creamframe.setResizable(false);
		
		this.PosMain = PosMain;
		
		Ice_creamPanel();
        
		PosMain.getMainPanel().repaint();
		PosMain.getMainPanel().revalidate();
		
        ice_creamframe.setVisible(false);
	}
	

	private void Ice_creamPanel() {
		Ice_creamPanel = new JPanel();
		Ice_creamPanel.setLayout(null);
		Ice_creamPanel.setBounds(0, 0, 1200, 950);
        PosMain.getMainPanel().add(Ice_creamPanel);
        
        mp1();
		
    }

	private void mp1() {
        mp1 = new JPanel();
        mp1.setLayout(null);
        mp1.setBounds(0, 0, 1200, 950);
        Ice_creamPanel.add(mp1);
        
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
        
        ice_cream1 = createButton("javaImage/ice_cream/ice1.png");
        ice_cream2 = createButton("javaImage/ice_cream/ice2.png");
        ice_cream3 = createButton("javaImage/ice_cream/ice3.png");
        ice_cream4 = createButton("javaImage/ice_cream/ice4.png");
        ice_cream5 = createButton("javaImage/ice_cream/ice5.png");
        ice_cream6 = createButton("javaImage/ice_cream/ice6.png");
        ice_cream7 = createButton("javaImage/ice_cream/ice7.png");
        ice_cream8 = createButton("javaImage/ice_cream/ice8.png");
        ice_cream9 = createButton("javaImage/ice_cream/ice9.png");
        ice_cream10 = createButton("javaImage/ice_cream/ice10.png");
        
        btnpan.add(ice_cream1);
        btnpan.add(ice_cream2);
        btnpan.add(ice_cream3);
        btnpan.add(ice_cream4);
        btnpan.add(ice_cream5);
        btnpan.add(ice_cream6);
        btnpan.add(ice_cream7);
        btnpan.add(ice_cream8);
        btnpan.add(ice_cream9);
        btnpan.add(ice_cream10);
        
        
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
			Ice_creamPanel.setVisible(false);
			PosMain.getMp1().setVisible(true);
			
		}
	}
}
