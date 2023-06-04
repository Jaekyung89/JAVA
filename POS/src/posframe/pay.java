package posframe;

import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.AbstractBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

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

public class pay implements ActionListener {

   private JFrame frame;
   private JPanel mp1;
   private JPanel mp2;
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
   private int price=0;

   /**
    * Launch the application.
    */
   public static void main(String[] args) {
      EventQueue.invokeLater(new Runnable() {
         public void run() {
            try {
               pay window = new pay();
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
   public pay() {
      initialize();
   }

   /*
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
        sp6(); // 결제방식
        sp7();
        sp8();
        sp9();
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
        p2.setBounds(0, 25, 1200, 275);
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
      p3.setBackground(Color.white);
      p3.setBounds(0, 400, 300, 350);
        p3.setLayout(new GridLayout(3, 1, 5, 5));
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
      JPanel p4 = new JPanel();
      p4.setBackground(Color.white);
      p4.setBounds(300, 400, 450, 350);
      p4.setLayout(new GridLayout(2, 1, 5, 10));
      mp1.add(p4);
      
      JLabel count = new JLabel();
      count.setBounds(0, 0, 350, 90);
        ImageIcon imageIcon = new ImageIcon("javaImage/pay/count.png");
        Image image = imageIcon.getImage();
     // JLabel의 크기에 맞게 이미지 크기 조정
        Image scaledImage = image.getScaledInstance(count.getWidth(), count.getHeight(), Image.SCALE_SMOOTH);

        // 조정된 이미지로 ImageIcon 생성
        ImageIcon scaledIcon = new ImageIcon(scaledImage);

        // JLabel에 이미지 설정
        count.setIcon(scaledIcon);

        p4.add(count);
        
        JLabel sum_money = new JLabel();
        sum_money.setBounds(0, 0, 350, 90);
        ImageIcon imageIcon2 = new ImageIcon("javaImage/pay/pay.png");
        Image image2 = imageIcon2.getImage();
     // JLabel의 크기에 맞게 이미지 크기 조정
        Image scaledImage2 = image2.getScaledInstance(sum_money.getWidth(), sum_money.getHeight(), Image.SCALE_SMOOTH);

        // 조정된 이미지로 ImageIcon 생성
        ImageIcon scaledIcon2 = new ImageIcon(scaledImage2);

        // JLabel에 이미지 설정
        sum_money.setIcon(scaledIcon2);

        p4.add(sum_money);
      
      //AbstractBorder border = new LineBorder(Color.BLACK, 2);
      
      /*
       * label1 = new JLabel("총 n개", JLabel.CENTER); label1.setFont(new Font("굴림",
       * Font.PLAIN, 28)); label1.setBorder(border); p4.add(label1);
       * 
       * 
       * label2 = new JLabel("결제 금액 : ", JLabel.CENTER); label2.setFont(new Font("굴림",
       * Font.PLAIN, 28)); label2.setBorder(border); p4.add(label2);
       */
   }
   
   private void sp5() {
      JPanel p5 = new JPanel();
      p5.setBackground(Color.white);
      p5.setBounds(750, 345, 450, 55);
        //p5.setLayout(new GridLayout(2, 5, 30, 10));
      mp1.add(p5);
      
      JLabel payment = new JLabel();
      payment.setBounds(0, 0, 400, 55);
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
      JPanel p6 = new JPanel();
      p6.setBackground(Color.white);
      p6.setBounds(750, 400, 450, 350);
        p6.setLayout(new GridLayout(3, 2, 0, 0));
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
      p7.setBounds(0, 300, 300, 100);
      mp1.add(p7);
   }
   
   private void sp8() {
      JPanel p8 = new JPanel();
      p8.setBackground(Color.white);
      p8.setBounds(0, 300, 750, 100);
      mp1.add(p8);
   }
   
   private void sp9() {
      JPanel p9 = new JPanel();
      p9.setBackground(Color.white);
      p9.setBounds(750, 300, 450, 45);
      mp1.add(p9);
   }

    
   public void actionPerformed(ActionEvent e) {
      Object obj = e.getSource();
      if (obj == btn1) {
         price = price + 100;
      }
      if (obj == btn1) {
         price = price + 390;
      }
      if (obj == btn1) {
         price = price + 790;
      }
      
      
      
      if(obj == card) {
         
      }
      if(obj == cash) {
         
      }
      if(obj == samsung) {
         
      }
      if(obj == apple) {
         
      }
      
      
      
      if (obj == point) {
         //적립 창 켜기
      }
      
      if(obj == cancel) {
         //초기 화면 되돌아가기
      }
   }
}
