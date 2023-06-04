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

public class Meal implements ActionListener {

	private JFrame mealframe;
	private JPanel Mealmp1;
	private JButton meal1;
	private JButton meal2;
	private JButton meal3;
	private JButton meal4;
	private JButton meal5;
	private JButton meal6;
	private JButton meal7;
	private JButton meal8;
	private JButton meal9;
	private JButton meal10;
	private JPanel MealPanel;
	private Main PosMain;
	private JButton GoHome;
	
	
	public Meal(Main PosMain) {
		mealframe = new JFrame();
		mealframe.setBounds(0, 0, 1200, 950);
		mealframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mealframe.getContentPane().setLayout(null);
		mealframe.setLocationRelativeTo(null);
		mealframe.setResizable(false);
		
		this.PosMain = PosMain;
		
		MealPanel();
        
		PosMain.getMainPanel().repaint();
		PosMain.getMainPanel().revalidate();
		
        mealframe.setVisible(false);
	}
	

	private void MealPanel() {
		MealPanel = new JPanel();
		MealPanel.setLayout(null);
		MealPanel.setBounds(0, 0, 1200, 950);
        PosMain.getMainPanel().add(MealPanel);
        
        Mealmp1();
		
    }

	private void Mealmp1() {
		Mealmp1 = new JPanel();
		Mealmp1.setLayout(null);
		Mealmp1.setBounds(0, 0, 1200, 950);
        MealPanel.add(Mealmp1);
        
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
        Mealmp1.add(p1);
    }

    private void sp2() {
        JPanel p2 = new JPanel();
        p2.setBackground(Color.white);
        p2.setBounds(0, 15, 1200, 50);
        Mealmp1.add(p2);
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
        Mealmp1.add(p3);
    }
    
    private void sp4() {
        JPanel p4 = new JPanel();
        p4.setBackground(Color.WHITE);
        p4.setBounds(0, 80, 1200, 100);
        Mealmp1.add(p4);
        
        GoHome = new JButton("Home");
        GoHome.addActionListener(this);
        p4.add(GoHome);
        
    }

    private void sp5() {
    	
    	JPanel p5 = new JPanel();
        p5.setBackground(Color.WHITE);
        p5.setBounds(0, 180, 1200, 470);
        Mealmp1.add(p5);
        p5.setLayout(new BorderLayout());
        
        JPanel btnpan = new JPanel();
        btnpan.setBackground(Color.WHITE);
        btnpan.setLayout(new GridLayout(2, 5, 30, 10));
        
        meal1 = createButton("javaImage/meal/meal1.png");
        meal2 = createButton("javaImage/meal/meal2.png");
        meal3 = createButton("javaImage/meal/meal3.png");
        meal4 = createButton("javaImage/meal/meal4.png");
        meal5 = createButton("javaImage/meal/meal5.png");
        meal6 = createButton("javaImage/meal/meal6.png");
        meal7 = createButton("javaImage/meal/meal7.png");
        meal8 = createButton("javaImage/meal/meal8.png");
        meal9 = createButton("javaImage/meal/meal9.png");
        meal10 = createButton("javaImage/meal/meal10.png");
        
        btnpan.add(meal1);
        btnpan.add(meal2);
        btnpan.add(meal3);
        btnpan.add(meal4);
        btnpan.add(meal5);
        btnpan.add(meal6);
        btnpan.add(meal7);
        btnpan.add(meal8);
        btnpan.add(meal9);
        btnpan.add(meal10);
        
        
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
        Mealmp1.add(p6);
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
			MealPanel.setVisible(false);
			PosMain.getMp1().setVisible(true);
			
		}
	}
}
