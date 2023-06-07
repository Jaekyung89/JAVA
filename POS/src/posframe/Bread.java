package posframe;

import javax.swing.JFrame;
import javax.swing.JPanel;
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
import java.util.ArrayList;

public class Bread implements ActionListener {

	private JFrame breadframe;
	private JPanel breadPanel;
	private Main PosMain;
	private JButton GoHome;
	private JButton bvgbtn[] = new JButton[10];
	private Font font = new Font("맑은 고딕", Font.BOLD, 15);
	private JPanel breadmp1;
	dataBase DB = new dataBase();
	ResultSet rs;
	private ArrayList<cart> list = new ArrayList<>();
	
	public Bread(Main PosMain) {
		breadframe = new JFrame();
		breadframe.setBounds(0, 0, 1200, 950);
		breadframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		breadframe.getContentPane().setLayout(null);
		breadframe.setLocationRelativeTo(null);
		breadframe.setResizable(false);
		
		this.PosMain = PosMain;
		
		breadPanel();
        
		PosMain.getMainPanel().repaint();
		PosMain.getMainPanel().revalidate();
		
        breadframe.setVisible(false);
	}
	

	private void breadPanel() {
		breadPanel = new JPanel();
		breadPanel.setLayout(null);
		breadPanel.setBounds(0, 0, 1200, 950);
        PosMain.getMainPanel().add(breadPanel);
        
        breadmp1();
		
    }

	private void breadmp1() {
		breadmp1 = new JPanel();
		breadmp1.setLayout(null);
		breadmp1.setBounds(0, 0, 1200, 950);
        breadPanel.add(breadmp1);
        
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
        breadmp1.add(p1);
    }

    private void sp2() {
        JPanel p2 = new JPanel();
        p2.setBackground(Color.white);
        p2.setBounds(0, 15, 1200, 50);
        breadmp1.add(p2);
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
        breadmp1.add(p3);
    }
    
    private void sp4() {
        JPanel p4 = new JPanel();
        p4.setBackground(Color.WHITE);
        p4.setBounds(0, 80, 1200, 100);
        breadmp1.add(p4);
        
        GoHome = new JButton(new ImageIcon("icon/Home.png"));
        GoHome.setBounds(12, 25, 155, 50);
        GoHome.addActionListener(this);
        p4.setLayout(null);
        p4.add(GoHome);
        
        JLabel title = new JLabel(new ImageIcon("icon/BT.png"));
        title.setHorizontalAlignment(JLabel.CENTER);
        title.setBounds(300, 20, 600, 60);
        p4.add(title);
        
    }

    private void sp5() {
    	
    	DB = new dataBase();
        rs = DB.db("bread");
    	JPanel p5 = new JPanel();
    	JPanel btnpan = new JPanel();

    	int i= 0;
    	
    	try {
			while(rs.next()) {
				String NAME = rs.getString("NAME");
				int PRICE = rs.getInt("PRICE");
				int STOCK = rs.getInt("STOCK");
				
		        p5.setBackground(Color.WHITE);
		        p5.setBounds(0, 180, 1200, 470);
		        breadmp1.add(p5);
		        p5.setLayout(new BorderLayout());
		        
		        btnpan.setBounds(0, 0, 1200, 450);
		        btnpan.setBackground(Color.WHITE);
		        btnpan.setLayout(new GridLayout(2, 5, 30, 10));
		        btnpan.setBorder(BorderFactory.createEmptyBorder(0, 0, 10, 0));
		        
		        JPanel bvg = new JPanel();
		        bvg.setLayout(new BorderLayout());
		        bvg.setBackground(Color.WHITE);
		        bvg.setBorder(new TitledBorder(new RoundedBorder(10, 3, new Color(4, 199, 246))));
		        
		        bvgbtn[i] = createButton("javaImage/bread/bread" + (i+1) + ".png", NAME);
		        
		        JLabel bvgname = new JLabel(NAME);
		        bvgname.setHorizontalAlignment(JLabel.CENTER);
		        bvgname.setFont(font);
		        JLabel bvgprice = new JLabel(PRICE + "원");
		        bvgprice.setHorizontalAlignment(JLabel.CENTER);
		        bvgprice.setFont(font);
		        JLabel bvgcount = new JLabel("재고: " + STOCK + "개");
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
    	
    	JLabel separator = new JLabel();
    	separator.setBounds(0, 467, 1200, 3);
    	separator.setPreferredSize(new Dimension(1200, 3));
    	separator.setOpaque(true);
    	separator.setBackground(new Color(4, 199, 246));
        
        p5.add(separator, BorderLayout.SOUTH);
    	        
        p5.add(btnpan, BorderLayout.CENTER);
        
        JPanel emppanw = new JPanel();
        emppanw.setPreferredSize(new Dimension(5, 440));
        emppanw.setBackground(Color.WHITE);
        p5.add(emppanw, BorderLayout.WEST);
        
        JPanel emppane = new JPanel();
        emppane.setPreferredSize(new Dimension(20, 440));
        emppane.setBackground(Color.WHITE);
        p5.add(emppane, BorderLayout.EAST);
    	
    }

    private void sp6() {
        JPanel p6 = new JPanel();
        p6.setBackground(Color.WHITE);
        p6.setBounds(0, 650, 1200, 300);
        breadmp1.add(p6);
        p6.setLayout(null);
        
        
    }
    
    private JButton createButton(String imagePath, String name) {
        JButton button = new JButton();
        button.setActionCommand(name);
        button.setBorder(BorderFactory.createLineBorder(new Color(217, 217, 217)));
        button.setBackground(new Color(217, 217, 217));
        button.setBorderPainted(false);
        button.setIcon(new ImageIcon(imagePath));
        button.setOpaque(false);
        button.addActionListener(this);
        return button;
    }
    
    private JPanel createCart(cart item) {
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        panel.setBackground(Color.WHITE);
        panel.setBorder(new TitledBorder(new RoundedBorder(20, 3, new Color(4, 199, 246))));
        panel.setPreferredSize(new Dimension(180, 210));

        JLabel nameLabel = new JLabel(item.getName());  // 아이템 이름 라벨
        JLabel countLabel = new JLabel("개수: " + item.getNum());  // 아이템의 눌린 수 라벨

        panel.add(nameLabel, BorderLayout.CENTER);
        panel.add(countLabel, BorderLayout.SOUTH);

        return panel;
    }
    
    public void addItemToCart(cart item) {
        // 장바구니에 item 추가하는 로직 (구체적인 코드는 프로젝트의 나머지 부분에 따라 다르겠지만, 예를 들어 List<Item> 타입의 장바구니 리스트에 item을 추가하는 코드가 여기에 위치하게 될 것입니다)

        // 새로 추가된 item을 이용하여 패널 생성
        JPanel panel = createCart(item);
        
        // 생성한 패널을 cartInner에 추가
        PosMain.getCartInner().add(panel);
        
        // UI를 갱신하여 새로 추가된 패널이 보이게 함
        PosMain.getCartInner().revalidate();
        PosMain.getCartInner().repaint();
    }
    
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		
		if (obj == GoHome) {
			breadPanel.setVisible(false);
			PosMain.getMp1().setVisible(true);
		}
		for (int i = 0; i < bvgbtn.length; i++) {
		    if (obj == bvgbtn[i]) {
		        String name = ((JButton) obj).getActionCommand();
		        cart item = new cart(name, 1);  // 버튼의 이름 얻기
		        // 이름이 같은 항목이 이미 list에 있는지 검사합니다.
		        int index = item.search(list, item.getName());
		        if (index != -1) {
		            // 이름이 같은 항목이 이미 있으면, 그 항목의 수량을 증가시킵니다.
		            item.add_item(list, index);
		        } else {
		            // 그렇지 않으면, 새 항목을 list에 추가합니다.
		            list.add(item);
		        }

		        // cartInner 패널 초기화
		        PosMain.getCartInner().removeAll();
		        // list의 아이템들을 이용하여 패널을 생성하고, 이를 cartInner에 추가
		        for (cart itemInfo : list) {
		            JPanel panel = createCart(itemInfo); // 각 아이템의 정보를 가진 패널 생성
		            PosMain.getCartInner().add(panel); // 생성한 패널을 cartInner에 추가
		        }
		        PosMain.getCartInner().revalidate(); // UI를 갱신하여 새로 추가된 패널들이 보이게 합니다.
		        PosMain.getCartInner().repaint();
		        break;
		    }
		}

    }
}