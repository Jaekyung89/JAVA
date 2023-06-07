package posframe;

import java.awt.EventQueue;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;


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
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

public class Main implements ActionListener, MouseListener {

	private JFrame Mainframe;
	private JPanel mp1;
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
	private JPanel MainPanel;
	private JLabel banner;
	private JLabel banner2;
	private JButton purchase;
	private JButton cancel;
	ArrayList<cart> cartlist;
	cart myCart;
	private JPanel cartInner;
	private JPanel p6;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
					window.Mainframe.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public Main() {
		cartlist = new ArrayList<cart>();
		myCart = new cart();
		Mainframe = new JFrame();
		Mainframe.setBounds(0, 0, 1200, 950);
		Mainframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Mainframe.getContentPane().setLayout(null);
		Mainframe.setLocationRelativeTo(null);
//		Mainframe.setResizable(false);
		
		MainPanel();
        
		Mainframe.setVisible(true);
	}

	

	private void MainPanel() {
		MainPanel = new JPanel();
		MainPanel.setLayout(null);
		MainPanel.setBounds(0, 0, 1200, 950);
		Mainframe.getContentPane().add(MainPanel);
        
        mp1();
		
    }

	private void mp1() {
        mp1 = new JPanel();
        mp1.setLayout(null);
        mp1.setBounds(0, 0, 1200, 950);
        MainPanel.add(mp1);
        
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
        lblNewLabel.setBounds(50, 0, 1100, 50);
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
        p4.setBounds(0, 80, 1200, 425);
        mp1.add(p4);
        p4.setLayout(new BorderLayout());
        
        JPanel btnpan = new JPanel();
        btnpan.setBackground(Color.WHITE);
        btnpan.setLayout(new GridLayout(2, 5, 30, 10));
        
        btn1 = createButton("icon/beverage.png");
        btn2 = createButton("icon/snack.png");
        btn3 = createButton("icon/bread.png");
        btn4 = createButton("icon/milk.png");
        btn5 = createButton("icon/ice_cream.png");
        btn6 = createButton("icon/meal.png");
        btn7 = createButton("icon/noodle.png");
        btn8 = createButton("icon/quasi_drugs.png");
        btn9 = createButton("icon/drink.png");
        btn10 = createButton("icon/ciga.png");
        
        btnpan.add(btn1);
        btnpan.add(btn2);
        btnpan.add(btn3);
        btnpan.add(btn4);
        btnpan.add(btn5);
        btnpan.add(btn6);
        btnpan.add(btn7);
        btnpan.add(btn8);
        btnpan.add(btn9);
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
        p5.setBounds(0, 505, 1200, 145);
        mp1.add(p5);
        p5.setLayout(null);
        
        banner = new JLabel();
        banner.setBounds(0, 10, 1200, 145);
        ImageIcon imageIcon2 = new ImageIcon("javaImage/banner/banner1.png");
        Image image2 = imageIcon2.getImage();

        // JLabel의 크기에 맞게 이미지 크기 조정
        Image scaledImage2 = image2.getScaledInstance(banner.getWidth(), banner.getHeight(), Image.SCALE_SMOOTH);

        // 조정된 이미지로 ImageIcon 생성
        ImageIcon scaledIcon2 = new ImageIcon(scaledImage2);

        // JLabel에 이미지 설정
        banner.setIcon(scaledIcon2);
        banner.addMouseListener(this);

        
        
        
        
        banner2 = new JLabel();
        banner2.setBounds(0, 10, 1200, 145);
        ImageIcon imageIcon3 = new ImageIcon("javaImage/banner/banner2.png");
        Image image3 = imageIcon3.getImage();

        // JLabel의 크기에 맞게 이미지 크기 조정
        Image scaledImage3 = image3.getScaledInstance(banner2.getWidth(), banner2.getHeight(), Image.SCALE_SMOOTH);

        // 조정된 이미지로 ImageIcon 생성
        ImageIcon scaledIcon3= new ImageIcon(scaledImage3);

        // JLabel에 이미지 설정
        banner2.setIcon(scaledIcon3);
        banner2.addMouseListener(this);

        
        p5.add(banner);
        p5.add(banner2);


        
        p5.add(banner);
        p5.add(banner2);
        
    }

    private void sp6() {
        p6 = new JPanel();
        p6.setBackground(Color.WHITE);
        p6.setBounds(0, 650, 1200, 300);
        mp1.add(p6);
        p6.setLayout(null);
        
        JPanel cart = new JPanel();
        cart.setLayout(new BorderLayout());
        
        cartInner = new JPanel();
        cartInner.setLayout(new FlowLayout(FlowLayout.LEFT));
        
        
        cartInner.setBackground(Color.WHITE);
        
        JScrollPane sp = new JScrollPane(cartInner, JScrollPane.VERTICAL_SCROLLBAR_NEVER, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        sp.setBorder(BorderFactory.createEmptyBorder());
        
        cart.setBounds(0, 0, 1000, 263);
        cart.add(sp, BorderLayout.CENTER);
        
        
        
        p6.add(cart);
        
        JPanel pc = new JPanel();
        pc.setBounds(1000, 0, 200, 230);
        pc.setLayout(null);
        pc.setBackground(Color.WHITE);
        
        purchase = createButton("icon/purchase.png");
        purchase.setPreferredSize(new Dimension(190, 120));
        purchase.setBounds(0, 0, 190, 120);
        pc.add(purchase);
        
        cancel = createButton("icon/cancel.png");
        cancel.setPreferredSize(new Dimension(190, 120));
        cancel.setBounds(0, 130, 190, 120);
        pc.add(cancel);
        
        p6.add(pc); 
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
		if (obj == btn1) {
			mp1.setVisible(false);
			new Beverage(this);
		}
		else if (obj == btn2) {
			mp1.setVisible(false);
			new Snack(this);
		}
		else if (obj == btn3) {
			mp1.setVisible(false);
			new Bread(this);
		}
		else if (obj == btn4) {
			mp1.setVisible(false);
			new Milk(this);
		}
		else if (obj == btn5) {
			mp1.setVisible(false);
			new Ice_cream(this);
		}
		else if (obj == btn6) {
			mp1.setVisible(false);
			new Meal(this);
		}
	}

	@Override
	public void mouseClicked(MouseEvent e) {
	}

	@Override
	public void mousePressed(MouseEvent e) {
	}

	@Override
	public void mouseReleased(MouseEvent e) {
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		banner.setVisible(false);
	    banner2.setVisible(true);

	}

	@Override
	public void mouseExited(MouseEvent e) {
	    banner2.setVisible(false);
	    banner.setVisible(true);

	}
	
	public JPanel getMainPanel() {
		return MainPanel;
	}

	public void setMainPanel(JPanel mainPanel) {
		MainPanel = mainPanel;
	}

	public JPanel getMp1() {
		return mp1;
	}

	public void setMp1(JPanel mp1) {
		this.mp1 = mp1;
	}
	
	public ArrayList<cart> getCartlist() {
		return cartlist;
	}

	public void setCartlist(ArrayList<cart> cartlist) {
		this.cartlist = cartlist;
	}

	public void setList(ArrayList<cart> list) {
		this.cartlist = list;
	}

    public JPanel getCartInner() {
		return cartInner;
	}

	public void setCartInner(JPanel cartInner) {
		this.cartInner = cartInner;
	}
	
	public JPanel getP6() {
		return p6;
	}

	public void setP6(JPanel p6) {
		this.p6 = p6;
	}


}