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

public class Quasi_drugs implements ActionListener {

	private JFrame quasi_drugframe;
	private JPanel mp1;
	private JButton quasi_drug1;
	private JButton quasi_drug2;
	private JButton quasi_drug3;
	private JButton quasi_drug4;
	private JButton quasi_drug5;
	private JButton quasi_drug6;
	private JButton quasi_drug7;
	private JButton quasi_drug8;
	private JButton quasi_drug9;
	private JButton quasi_drug10;
	private JPanel Quasi_drugPanel;
	private Main PosMain;
	private JButton GoHome;
	
	
	public Quasi_drugs(Main PosMain) {
		
		quasi_drugframe = new JFrame();
		quasi_drugframe.setBounds(0, 0, 1200, 950);
		quasi_drugframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		quasi_drugframe.getContentPane().setLayout(null);
		quasi_drugframe.setLocationRelativeTo(null);
		quasi_drugframe.setResizable(false);
		
		this.PosMain = PosMain;
		
		Quasi_drugPanel();
        
		PosMain.getMainPanel().repaint();
		PosMain.getMainPanel().revalidate();
		
        quasi_drugframe.setVisible(false);
	}
	

	private void Quasi_drugPanel() {
		Quasi_drugPanel = new JPanel();
		Quasi_drugPanel.setLayout(null);
		Quasi_drugPanel.setBounds(0, 0, 1200, 950);
        PosMain.getMainPanel().add(Quasi_drugPanel);
        
        mp1();
		
    }

	private void mp1() {
        mp1 = new JPanel();
        mp1.setLayout(null);
        mp1.setBounds(0, 0, 1200, 950);
        Quasi_drugPanel.add(mp1);
        
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
        
        quasi_drug1 = createButton("javaImage/quasi_drug/quasi_drug1.png");
        quasi_drug2 = createButton("javaImage/quasi_drug/quasi_drug2.png");
        quasi_drug3 = createButton("javaImage/quasi_drug/quasi_drug3.png");
        quasi_drug4 = createButton("javaImage/quasi_drug/quasi_drug4.png");
        quasi_drug5 = createButton("javaImage/quasi_drug/quasi_drug5.png");
        quasi_drug6 = createButton("javaImage/quasi_drug/quasi_drug6.png");
        quasi_drug7 = createButton("javaImage/quasi_drug/quasi_drug7.png");
        quasi_drug8 = createButton("javaImage/quasi_drug/quasi_drug8.png");
        quasi_drug9 = createButton("javaImage/quasi_drug/quasi_drug9.png");
        quasi_drug10 = createButton("javaImage/quasi_drug/quasi_drug10.png");
        
        btnpan.add(quasi_drug1);
        btnpan.add(quasi_drug2);
        btnpan.add(quasi_drug3);
        btnpan.add(quasi_drug4);
        btnpan.add(quasi_drug5);
        btnpan.add(quasi_drug6);
        btnpan.add(quasi_drug7);
        btnpan.add(quasi_drug8);
        btnpan.add(quasi_drug9);
        btnpan.add(quasi_drug10);
        
        
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
			Quasi_drugPanel.setVisible(false);
			PosMain.getMp1().setVisible(true);
			
		}
	}
}
