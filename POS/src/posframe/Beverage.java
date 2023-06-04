package posframe;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.Image;

import javax.swing.JLabel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.SwingConstants;

public class Beverage implements ActionListener {

	private JFrame beverageframe;
	private JPanel Breadmp1;
	private JPanel BeveragePanel;
	private Main PosMain;
	private JButton GoHome;
	private JButton bvgbtn[] = new JButton[10];
	private Font font = new Font("맑은 고딕", Font.BOLD, 15);
	
	public Beverage(Main PosMain) {
		beverageframe = new JFrame();
		beverageframe.setBounds(0, 0, 1200, 950);
		beverageframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		beverageframe.getContentPane().setLayout(null);
		beverageframe.setLocationRelativeTo(null);
		beverageframe.setResizable(false);
		
		this.PosMain = PosMain;
		
		BeveragePanel();
        
		PosMain.getMainPanel().repaint();
		PosMain.getMainPanel().revalidate();
		
        beverageframe.setVisible(false);
	}
	

	private void BeveragePanel() {
		BeveragePanel = new JPanel();
		BeveragePanel.setLayout(null);
		BeveragePanel.setBounds(0, 0, 1200, 950);
        PosMain.getMainPanel().add(BeveragePanel);
        
        Breadmp1();
		
    }

	private void Breadmp1() {
		Breadmp1 = new JPanel();
		Breadmp1.setLayout(null);
		Breadmp1.setBounds(0, 0, 1200, 950);
        BeveragePanel.add(Breadmp1);
        
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
        Breadmp1.add(p3);
    }
    
    private void sp4() {
        JPanel p4 = new JPanel();
        p4.setBackground(Color.WHITE);
        p4.setBounds(0, 80, 1200, 100);
        Breadmp1.add(p4);
        
        GoHome = new JButton(new ImageIcon("icon/Home.png"));
        GoHome.setBounds(12, 25, 155, 50);
        GoHome.addActionListener(this);
        p4.setLayout(null);
        p4.add(GoHome);
        
        JLabel title = new JLabel(new ImageIcon("icon/BT.png"));
        title.setHorizontalAlignment(SwingConstants.CENTER);
        title.setBounds(300, 20, 600, 60);
        p4.add(title);
        
    }

    private void sp5() {
    	
    	dataBase DB = new dataBase();
    	ResultSet rs = DB.db("beverage");
    	JPanel p5 = new JPanel();
    	JPanel btnpan = new JPanel();
    	int i= 0;
    	
    	try {
			while(rs.next()) {
				String NAME = rs.getString("NAME");
				int PRICE = rs.getInt("PRICE");
				int STOCK = rs.getInt("STOCK");
				System.out.println(NAME);
				System.out.println("가격 : " + PRICE);
				System.out.println("재고 : " + STOCK);
				
		        p5.setBackground(Color.WHITE);
		        p5.setBounds(0, 180, 1200, 470);
		        Breadmp1.add(p5);
		        p5.setLayout(new BorderLayout());
		        
		        btnpan.setBackground(Color.WHITE);
		        btnpan.setLayout(new GridLayout(2, 5, 30, 10));
		        
		        JPanel bvg = new JPanel();
		        bvg.setLayout(new BorderLayout());
		        bvg.setBackground(Color.WHITE);
		        bvg.setBorder(new TitledBorder(new RoundedBorder(10,3)));
		        
		        bvgbtn[i] = createButton("javaImage/beverage/beverage" + (i+1) + ".png");
		        
		        JLabel bvgname = new JLabel(NAME);
		        bvgname.setHorizontalAlignment(JLabel.CENTER);
		        bvgname.setFont(font);
		        JLabel bvgprice = new JLabel(PRICE + "원");
		        bvgprice.setHorizontalAlignment(JLabel.CENTER);
		        bvgprice.setFont(font);
		        JLabel bvgcount = new JLabel(STOCK + "개");
		        bvgcount.setHorizontalAlignment(JLabel.CENTER);
		        bvgcount.setFont(font);
		        
		        JPanel bvgpan = new JPanel();
		        bvgpan.setLayout(new BorderLayout());
		        bvgpan.setBackground(Color.WHITE);
		        bvg.add(bvgpan, BorderLayout.SOUTH);
		        
		        bvgpan.add(bvgname, BorderLayout.NORTH);
		        bvgpan.add(bvgprice, BorderLayout.CENTER);
		        bvgpan.add(bvgcount, BorderLayout.SOUTH);
		        
		        bvg.add(bvgbtn[i], BorderLayout.CENTER);
		        
		        btnpan.add(bvg);
		        
		        i++;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
    	        
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
			BeveragePanel.setVisible(false);
			PosMain.getMp1().setVisible(true);
			
		}
	}
}
