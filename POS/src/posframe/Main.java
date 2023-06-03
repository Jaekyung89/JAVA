package posframe;

import java.awt.EventQueue;

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

public class Main implements ActionListener {

	private JFrame frame;
	private JPanel mp1;
	private JPanel mp2;
	private JButton btn1;
	private JButton btn2;
	private JButton btn3;
	private JButton btn4;
	private JButton btn5;
	private JButton btn6;
	private JButton btn7;
	private JButton btn8;
	private JButton btn9;
	private JButton btn10;
	private JPanel panel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Main() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(0, 0, 1200, 1000);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		
		
		panel();
		
        
        frame.setVisible(true);
    }
	
	private void panel() {
		panel = new JPanel();
		panel.setLayout(null);
		panel.setBounds(0, 0, 1200, 1000);
        frame.getContentPane().add(panel);
        
        mp1();
		mp2();
		
    }

	private void mp1() {
        mp1 = new JPanel();
        mp1.setLayout(null);
        mp1.setBounds(0, 0, 1200, 1000);
        panel.add(mp1);
        
		sp1();
        sp2();
        sp3();
        sp4();
        sp5();
        sp6();
    }
	
	

	private void mp2() {
        mp2 = new JPanel();
        mp2.setLayout(null);
        mp2.setBounds(0, 0, 1200, 1000);
        panel.add(mp2);
        
    }
	
	private void sp1() {
        JPanel p1 = new JPanel();
        p1.setBackground(Color.WHITE);
        p1.setBounds(0, 0, 1200, 25);
        mp1.add(p1);
    }

    private void sp2() {
        JPanel p2 = new JPanel();
        p2.setBackground(Color.white);
        p2.setBounds(0, 25, 1200, 50);
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
        p3.setBounds(0, 75, 1200, 25);
        mp1.add(p3);
    }
    
    private void sp4() {
        JPanel p4 = new JPanel();
        p4.setBackground(Color.WHITE);
        p4.setBounds(0, 100, 1200, 425);
        mp1.add(p4);
        p4.setLayout(new BorderLayout());
        
        JPanel btnpan = new JPanel();
        btnpan.setBackground(Color.WHITE);
        btnpan.setLayout(new GridLayout(2, 5, 30, 10));
        
        btn1 = new JButton();
        btn1.setBorder(BorderFactory.createLineBorder(new Color(217, 217, 217)));
        btn1.setBackground(new Color(217, 217, 217));
        btn1.setBorderPainted(false);
        btn1.setIcon(new ImageIcon("icon/beverage.png"));
        btn1.setOpaque(false);
        btn1.addActionListener(this);
        btnpan.add(btn1);
        
        btn2 = new JButton();
        btn2.setBorder(BorderFactory.createLineBorder(new Color(217, 217, 217)));
        btn2.setBackground(new Color(217, 217, 217));
        btn2.setBorderPainted(false);
        btn2.setIcon(new ImageIcon("icon/snack.png"));
        btn2.setOpaque(false);
        btn2.addActionListener(this);
        btnpan.add(btn2);
        
        btn3 = new JButton();
        btn3.setBorder(BorderFactory.createLineBorder(new Color(217, 217, 217)));
        btn3.setBackground(new Color(217, 217, 217));
        btn3.setBorderPainted(false);
        btn3.setIcon(new ImageIcon("icon/bread.png"));
        btn3.setOpaque(false);
        btn3.addActionListener(this);
        btnpan.add(btn3);
        
        btn4 = new JButton();
        btn4.setBorder(BorderFactory.createLineBorder(new Color(217, 217, 217)));
        btn4.setBackground(new Color(217, 217, 217));
        btn4.setBorderPainted(false);
        btn4.setIcon(new ImageIcon("icon/milk.png"));
        btn4.setOpaque(false);
        btn4.addActionListener(this);
        btnpan.add(btn4);
        
        btn5 = new JButton();
        btn5.setBorder(BorderFactory.createLineBorder(new Color(217, 217, 217)));
        btn5.setBackground(new Color(217, 217, 217));
        btn5.setBorderPainted(false);
        btn5.setIcon(new ImageIcon("icon/ice_cream.png"));
        btn5.setOpaque(false);
        btn5.addActionListener(this);
        btnpan.add(btn5);
        
        btn6 = new JButton();
        btn6.setBorder(BorderFactory.createLineBorder(new Color(217, 217, 217)));
        btn6.setBackground(new Color(217, 217, 217));
        btn6.setBorderPainted(false);
        btn6.setIcon(new ImageIcon("icon/meal.png"));
        btn6.setOpaque(false);
        btn6.addActionListener(this);
        btnpan.add(btn6);
        
        btn7 = new JButton();
        btn7.setBorder(BorderFactory.createLineBorder(new Color(217, 217, 217)));
        btn7.setBackground(new Color(217, 217, 217));
        btn7.setBorderPainted(false);
        btn7.setIcon(new ImageIcon("icon/noodle.png"));
        btn7.setOpaque(false);
        btn7.addActionListener(this);
        btnpan.add(btn7);
        
        btn8 = new JButton();
        btn8.setBorder(BorderFactory.createLineBorder(new Color(217, 217, 217)));
        btn8.setBackground(new Color(217, 217, 217));
        btn8.setBorderPainted(false);
        btn8.setIcon(new ImageIcon("icon/quasi_drugs.png"));
        btn8.setOpaque(false);
        btn8.addActionListener(this);
        btnpan.add(btn8);
        
        btn9 = new JButton();
        btn9.setBorder(BorderFactory.createLineBorder(new Color(217, 217, 217)));
        btn9.setBackground(new Color(217, 217, 217));
        btn9.setBorderPainted(false);
        btn9.setIcon(new ImageIcon("icon/drink.png"));
        btn9.setOpaque(false);
        btn9.addActionListener(this);
        btnpan.add(btn9);
        
        btn10 = new JButton();
        btn10.setBorder(BorderFactory.createLineBorder(new Color(217, 217, 217)));
        btn10.setBackground(new Color(217, 217, 217));
        btn10.setBorderPainted(false);
        btn10.setIcon(new ImageIcon("icon/ciga.png"));
        btn10.setOpaque(false);
        btn10.addActionListener(this);
        btnpan.add(btn10);
        
        p4.add(btnpan, BorderLayout.CENTER);
        
        JPanel emppanw = new JPanel();
        emppanw.setPreferredSize(new Dimension(5, 100));
        emppanw.setBackground(Color.WHITE);
        p4.add(emppanw, BorderLayout.WEST);
        
        JPanel emppane = new JPanel();
        emppane.setPreferredSize(new Dimension(20, 100));
        emppane.setBackground(Color.WHITE);
        p4.add(emppane, BorderLayout.EAST);
    }

    private void sp5() {
        JPanel p5 = new JPanel();
        p5.setBackground(Color.WHITE);
        p5.setBounds(0, 525, 1200, 225);
        mp1.add(p5);
        p5.setLayout(null);
    }

    private void sp6() {
        JPanel p6 = new JPanel();
        p6.setBackground(Color.WHITE);
        p6.setBounds(0, 750, 1200, 250);
        mp1.add(p6);
        p6.setLayout(null);
        
        JLabel lblNewLabel_1 = new JLabel();
        lblNewLabel_1.setBounds(0, 0, 1200, 5);
        lblNewLabel_1.setOpaque(true);
        lblNewLabel_1.setBackground(new Color(0, 0, 0));
        
        p6.add(lblNewLabel_1);
    }
    
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		if (obj == btn1) {
			mp1.setVisible(false);
			new NEW("힘들다", this);
		}
	}
	
	public JPanel getPanel() {
		return panel;
	}

	public void setPanel(JPanel panel) {
		this.panel = panel;
	}
}
