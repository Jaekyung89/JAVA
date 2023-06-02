package posframe;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.GridLayout;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JLabel;

public class Main {

	private JFrame frame;

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
		frame.setResizable(false);
		
		sp1();
        sp2();
        sp3();
        sp4();
        
        frame.setVisible(true);
    }

    private void sp1() {
        JPanel p1 = new JPanel();
        p1.setBackground(Color.black);
        p1.setBounds(0, 0, 1200, 50);
        frame.getContentPane().add(p1);
        p1.setLayout(null);
        
        JLabel lblNewLabel = new JLabel("편의점 셀프 포스기");
        lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel.setFont(new Font("굴림", Font.PLAIN, 50));
        lblNewLabel.setBounds(0, 0, 1200, 50);
        lblNewLabel.setForeground(Color.WHITE);
        p1.add(lblNewLabel);
    }
    
    private void sp2() {
        JPanel p2 = new JPanel();
        p2.setBackground(Color.WHITE);
        p2.setBounds(0, 50, 1200, 550);
        frame.getContentPane().add(p2);
        p2.setLayout(new BorderLayout());
        
        JPanel btnpan = new JPanel();
        btnpan.setLayout(new GridLayout(2, 5, 20, 10));
        
        JButton btn1 = new JButton();
        btn1.setBorder(BorderFactory.createLineBorder(new Color(217, 217, 217)));
        btn1.setBackground(new Color(217, 217, 217));
        btn1.setBorderPainted(false);
        btn1.setIcon(new ImageIcon("icon/beverage.png"));
        btn1.setOpaque(false);
        btnpan.add(btn1);
        
        JButton btn2 = new JButton();
        btn2.setBorder(BorderFactory.createLineBorder(new Color(217, 217, 217)));
        btn2.setBackground(new Color(217, 217, 217));
        btn2.setBorderPainted(false);
        btn2.setIcon(new ImageIcon("icon/snack.png"));
        btn2.setOpaque(false);
        btnpan.add(btn2);
        
        JButton btn3 = new JButton();
        btn3.setBorder(BorderFactory.createLineBorder(new Color(217, 217, 217)));
        btn3.setBackground(new Color(217, 217, 217));
        btn3.setBorderPainted(false);
        btn3.setIcon(new ImageIcon("icon/bread.png"));
        btn3.setOpaque(false);
        btnpan.add(btn3);
        
        JButton btn4 = new JButton();
        btn4.setBorder(BorderFactory.createLineBorder(new Color(217, 217, 217)));
        btn4.setBackground(new Color(217, 217, 217));
        btn4.setBorderPainted(false);
        btn4.setIcon(new ImageIcon("icon/milk.png"));
        btn4.setOpaque(false);
        btnpan.add(btn4);
        
        JButton btn5 = new JButton();
        btn5.setBorder(BorderFactory.createLineBorder(new Color(217, 217, 217)));
        btn5.setBackground(new Color(217, 217, 217));
        btn5.setBorderPainted(false);
        btn5.setIcon(new ImageIcon("icon/ice_cream.png"));
        btn5.setOpaque(false);
        btnpan.add(btn5);
        
        JButton btn6 = new JButton();
        btn6.setBorder(BorderFactory.createLineBorder(new Color(217, 217, 217)));
        btn6.setBackground(new Color(217, 217, 217));
        btn6.setBorderPainted(false);
        btn6.setIcon(new ImageIcon("icon/meal.png"));
        btn6.setOpaque(false);
        btnpan.add(btn6);
        
        JButton btn7 = new JButton();
        btn7.setBorder(BorderFactory.createLineBorder(new Color(217, 217, 217)));
        btn7.setBackground(new Color(217, 217, 217));
        btn7.setBorderPainted(false);
        btn7.setIcon(new ImageIcon("icon/noodle.png"));
        btn7.setOpaque(false);
        btnpan.add(btn7);
        
        JButton btn8 = new JButton();
        btn8.setBorder(BorderFactory.createLineBorder(new Color(217, 217, 217)));
        btn8.setBackground(new Color(217, 217, 217));
        btn8.setBorderPainted(false);
        btn8.setIcon(new ImageIcon("icon/quasi_drugs.png"));
        btn8.setOpaque(false);
        btnpan.add(btn8);
        
        JButton btn9 = new JButton();
        btn9.setBorder(BorderFactory.createLineBorder(new Color(217, 217, 217)));
        btn9.setBackground(new Color(217, 217, 217));
        btn9.setBorderPainted(false);
        btn9.setIcon(new ImageIcon("icon/drink.png"));
        btn9.setOpaque(false);
        btnpan.add(btn9);
        
        JButton btn10 = new JButton();
        btn10.setBorder(BorderFactory.createLineBorder(new Color(217, 217, 217)));
        btn10.setBackground(new Color(217, 217, 217));
        btn10.setBorderPainted(false);
        btn10.setIcon(new ImageIcon("icon/ciga.png"));
        btn10.setOpaque(false);
        btnpan.add(btn10);
        
        p2.add(btnpan, BorderLayout.CENTER);
        
        JPanel emppane = new JPanel();
        emppane.setBackground(Color.WHITE);
        p2.add(emppane, BorderLayout.EAST);
    }

    private void sp3() {
        JPanel p3 = new JPanel();
        p3.setBackground(Color.WHITE);
        p3.setBounds(0, 600, 1200, 200);
        frame.getContentPane().add(p3);
    }

    private void sp4() {
        JPanel p4 = new JPanel();
        p4.setBackground(Color.WHITE);
        p4.setBounds(0, 800, 1200, 200);
        frame.getContentPane().add(p4);
    }
}
