package posframe;

import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.Timer;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.Image;

import javax.swing.JLabel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class pay extends JFrame implements ActionListener  {

   private JFrame frame;
   private JPanel mp1;
   private JButton btn1;
   private JButton btn2;
   private JButton btn3;
   private JButton card;
   private JButton cash;
   private JButton point;
   private JButton samsung;
   private JButton apple;
   private JButton cancel;
   private JPanel panel;
   private Main PosMain;
   private member mb;
   private payCash pC;
   private JLabel sum;
   private JLabel count;
   private JPanel p6;
   private JPanel cart;
   private JPanel cartInner;

   public pay(Main PosMain) {
	  frame = new JFrame();
	  frame.setBounds(0, 0, 1200, 950);
	  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	  frame.getContentPane().setLayout(null);
	  frame.setLocationRelativeTo(null);
	  frame.setResizable(false);

	  this.PosMain = PosMain;
	  
	  panel();
	  
	  PosMain.getMainPanel().repaint();
	  PosMain.getMainPanel().revalidate();
	      
	  frame.setVisible(false);
   }
   
   private void panel() {
      panel = new JPanel();
      panel.setLayout(null);
      panel.setBounds(0, 0, 1200, 950);
      PosMain.getMainPanel().add(panel);
        
        mp1();
      
    }

   private void mp1() {
        mp1 = new JPanel();
        mp1.setLayout(null);
        mp1.setBounds(0, 0, 1200, 950);
        panel.add(mp1);
        
        sp1();
        sp2();
        sp3();
        sp4();
        sp5();
        sp6(); // 결제방식
        sp7();
        sp8();
        sp9();
        sp10();
    }
   
   private void sp1() {
        JPanel p1 = new JPanel();
        p1.setBackground(Color.WHITE);
        p1.setBounds(0, 0, 1200, 15);
        mp1.add(p1);
    }
   private void sp2() {
      JPanel p2 = new JPanel();
        p2.setBackground(Color.WHITE);
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
   
   private void sp10() {
	   JPanel p10 = new JPanel();
	   p10.setBounds(0, 65, 1200, 300);
	   p10.setBackground(Color.WHITE);
	   mp1.add(p10);
	   p10.setLayout(null);
       
       cart = new JPanel();
       cart.setLayout(new BorderLayout());
       
       cartInner = new JPanel();
       cartInner.setLayout(new FlowLayout(FlowLayout.LEFT));
       
       cartInner.setBackground(Color.WHITE);
       
       JScrollPane sp = new JScrollPane(cartInner, JScrollPane.VERTICAL_SCROLLBAR_NEVER, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
       sp.setBorder(BorderFactory.createEmptyBorder());
       
       cart.setBounds(0, 0, 1200, 263);
       cart.add(sp, BorderLayout.CENTER);
       
       p6.add(cart);
       
   }
   

private void sp3() {
      JPanel p3 = new JPanel();
      p3.setBackground(Color.WHITE);
      p3.setBounds(0, 460, 330, 400);
        p3.setLayout(new GridLayout(3, 1, 10, 5));
      mp1.add(p3);
      
      
      btn1 = new JButton(); // 친환경 100원
      btn1.setBorder(BorderFactory.createLineBorder(new Color(217, 217, 217)));
      btn1.setBackground(new Color(217, 217, 217));
        btn1.setBorderPainted(false);
        btn1.setIcon(new ImageIcon("javaImage/pay/b100w.png"));
        btn1.setOpaque(false);
        btn1.addActionListener(this);
        p3.add(btn1);
        
        btn2 = new JButton(); // 종량제 10
      btn2.setBorder(BorderFactory.createLineBorder(new Color(217, 217, 217)));
      btn2.setBackground(new Color(217, 217, 217));
        btn2.setBorderPainted(false);
        btn2.setIcon(new ImageIcon("javaImage/pay/b390w.png"));
        btn2.setOpaque(false);
        btn2.addActionListener(this);
        p3.add(btn2);
        
        btn3 = new JButton(); // 종량제 20
      btn3.setBorder(BorderFactory.createLineBorder(new Color(217, 217, 217)));
      btn3.setBackground(new Color(217, 217, 217));
        btn3.setBorderPainted(false);
        btn3.setIcon(new ImageIcon("javaImage/pay/b750w.png"));
        btn3.setOpaque(false);
        btn3.addActionListener(this);
        p3.add(btn3);
        
        
   }
   
   private void sp4() {

	   int price = PosMain.getTotalPrice();
	   int amount = PosMain.getTotal();
	   
      JPanel p4 = new JPanel();
      p4.setBackground(Color.white);
      p4.setBounds(330, 498, 420, 370);
      p4.setLayout(new GridLayout(1, 1, 20, 20));
      mp1.add(p4);

      ImageIcon imageIcon = new ImageIcon("javaImage/pay/count.png");
      
      JLabel imageLabel = new JLabel(imageIcon);
      imageLabel.setBounds(0, 50, imageIcon.getIconWidth(), imageIcon.getIconHeight());

      count = new JLabel(amount + "개");
      count.setBounds(200, 0, 350, 90);
      count.setFont(new Font("고딕", Font.BOLD, 24));

      imageLabel.add(count);
      p4.add(imageLabel);
      
      

      ImageIcon imageIcon2 = new ImageIcon("javaImage/pay/pay.png");
      
      JLabel imageLabel2 = new JLabel(imageIcon2);
      imageLabel2.setBounds(0, 200, imageIcon2.getIconWidth(), imageIcon2.getIconHeight());

      sum = new JLabel(price + "원");
      sum.setBounds(200, 0, 350, 90);
      sum.setFont(new Font("고딕", Font.BOLD, 24));

      imageLabel2.add(sum);
      p4.add(imageLabel2);
      
      p4.setLayout(null);
      p4.setVisible(true);
      
   }
   
   private void sp5() {
      JPanel p5 = new JPanel();
      p5.setBackground(Color.white);
      p5.setBounds(0, 380, 1200, 80);
        //p5.setLayout(new GridLayout(2, 5, 30, 10));
      mp1.add(p5);
      
      JLabel payment = new JLabel();
      payment.setBounds(50, 20, 1100, 50);

      ImageIcon imageIcon = new ImageIcon("javaImage/pay/payment.png");
      Image image = imageIcon.getImage();

      // JLabel의 크기에 맞게 이미지 크기 조정
      Image scaledImage = image.getScaledInstance(payment.getWidth(), payment.getHeight(), Image.SCALE_SMOOTH);

      // 조정된 이미지로 ImageIcon 생성
      ImageIcon scaledIcon = new ImageIcon(scaledImage);

      // JLabel에 이미지 설정
      payment.setIcon(scaledIcon);

      p5.add(payment);
      
   
      
      //걸제방식 이미지 삽입
   }
   
   private void sp6() {
	      p6 = new JPanel();
	      p6.setBackground(Color.white);
	      p6.setBounds(750, 460, 440, 400);
	      p6.setLayout(new GridLayout(3, 3, 10, 10));
	      mp1.add(p6);
	      
	      card = new JButton(); // card
	      card.setBorder(BorderFactory.createLineBorder(new Color(217, 217, 217)));
	      card.setBackground(new Color(217, 217, 217));
	      card.setBorderPainted(false);
	      card.setIcon(new ImageIcon("javaImage/pay/card.png"));
	      card.setOpaque(false);
	      card.addActionListener(this);
	      p6.add(card);
	      
	      
	      samsung = new JButton(); // samsung
	      samsung.setBorder(BorderFactory.createLineBorder(new Color(217, 217, 217)));
	      samsung.setBackground(new Color(217, 217, 217));
	      samsung.setBorderPainted(false);
	      samsung.setIcon(new ImageIcon("javaImage/pay/samsung.png"));
	      samsung.setOpaque(false);
	      samsung.addActionListener(this);
	      p6.add(samsung);
	      
	      cash = new JButton(); // cash
	      cash.setBorder(BorderFactory.createLineBorder(new Color(217, 217, 217)));
	      cash.setBackground(new Color(217, 217, 217));
	      cash.setBorderPainted(false);
	      cash.setIcon(new ImageIcon("javaImage/pay/cash.png"));
	      cash.setOpaque(false);
	      cash.addActionListener(this);
	      p6.add(cash);
	      
	      apple = new JButton(); // apple
	      apple.setBorder(BorderFactory.createLineBorder(new Color(217, 217, 217)));
	      apple.setBackground(new Color(217, 217, 217));
	      apple.setBorderPainted(false);
	      apple.setIcon(new ImageIcon("javaImage/pay/apple.png"));
	      apple.setOpaque(false);
	      apple.addActionListener(this);
	      p6.add(apple);
	      
	      point = new JButton(); // point
	      point.setBorder(BorderFactory.createLineBorder(new Color(217, 217, 217)));
	      point.setBackground(new Color(217, 217, 217));
	      point.setBorderPainted(false);
	      point.setIcon(new ImageIcon("javaImage/pay/point.png"));
	      point.setOpaque(false);
	      point.addActionListener(this);
	      p6.add(point);
	      
	      cancel = new JButton(); // cancel
	      cancel.setBorder(BorderFactory.createLineBorder(new Color(217, 217, 217)));
	      cancel.setBackground(new Color(217, 217, 217));
	      cancel.setBorderPainted(false);
	      cancel.setIcon(new ImageIcon("javaImage/pay/cancel.png"));
	      cancel.setOpaque(false);
	      cancel.addActionListener(this);
	      p6.add(cancel);
	      
	   }
   
   private void sp7() {
      JPanel p7 = new JPanel();
      p7.setBackground(Color.white);
      p7.setBounds(0, 300, 750, 200);
      mp1.add(p7);
   }
   
   private void sp8() {
      JPanel p8 = new JPanel();
      p8.setBackground(Color.white);
      p8.setBounds(0, 850, 1200, 100);
      mp1.add(p8);
   }
   
   private void sp9() {
      JPanel p9 = new JPanel();
      p9.setBackground(Color.white);
      p9.setBounds(750, 300, 450, 95);
      mp1.add(p9);
   }
   

    
   public void actionPerformed(ActionEvent e) {
	   int price = PosMain.getTotalPrice();
	   int amount = PosMain.getTotal();
	   
      Object obj = e.getSource();
      if (obj == btn1) {
         price = price + 100;
         amount++;
         count.setText(amount+"개");
         sum.setText(price + "원");
         
      }
      if (obj == btn2) {
         price = price + 390;
         amount++;
         count.setText(amount+"개");
         sum.setText(price + "원");
         
      }
      if (obj == btn3) {
         price = price + 750;
         amount++;
         count.setText(amount+"개");
         sum.setText(price + "원");
         
      }
      
      
      
      if(obj == card) {
         payLoading();
      }
      if(obj == cash) {
    	 pC = new payCash(price);
      }
      if(obj == samsung) {
         payLoading();
      }
      if(obj == apple) {
         payLoading();
      }
      
      if (obj == point) {
         //적립 창 켜기
    	  mb = new member(price);
    	  point.setVisible(false);
      }
      
      if(obj == cancel) {
         //초기 화면 되돌아가기
    	  //System.exit(0);
    	  panel.setVisible(false);
    	  PosMain.getMp1().setVisible(true);
      }
   }


   private void payLoading() {
      Container c = getContentPane();
      c.setLayout(new FlowLayout());
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setSize(500, 350);
      setLocationRelativeTo(null);
      
      JLabel JLtx = new JLabel("결제중입니다.");
      JLtx.setFont(new Font("고딕", Font.BOLD, 28));
	  
      ImageIcon imageIcon = new ImageIcon("javaImage/pay/loading.gif");
      JLabel imgLabel = new JLabel(imageIcon);
      
      
      c.add(JLtx);
      c.add(imgLabel);
      
      setVisible(true);
      
     
      Timer timer = new Timer(2000, e -> {
    	  JLtx.setText("결제가 완료되었습니다."); // 새로운 라벨로 변경
    	  ImageIcon imageIcon2 = new ImageIcon("javaImage/pay/checkPay.png");
    	  imgLabel.setIcon(imageIcon2);
    	  imgLabel.setBounds(750, 300, 450, 45);
          repaint(); // 프레임 다시 그리기

          
          Timer exitTimer = new Timer(1000, exitEvent -> {
              dispose(); // 프레임 종료
              panel.setVisible(false);
  			  PosMain.getMp1().setVisible(true);
          });
          exitTimer.setRepeats(false); // 반복 실행하지 않도록 설정
          exitTimer.start(); // 타이머 시작
      });
      timer.setRepeats(false); // 반복 실행하지 않도록 설정
      timer.start(); // 타이머 시작
      
   }

   public JPanel getCartInner() {
	return cartInner;
}

public void setCartInner(JPanel cartInner) {
	this.cartInner = cartInner;
}

}
