package posframe;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class payment extends JFrame{

   public payment(String title) {
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setSize(500, 350);
      setLocationRelativeTo(null);
      
      
      Container c = getContentPane();
      c.setLayout(new FlowLayout());
      
       JLabel JLtx = new JLabel("결제중입니다.");
       JLtx.setFont(new Font("고딕", Font.BOLD, 28));
       ImageIcon imageIcon = new ImageIcon("javaImage/pay/loading.gif");
       JLabel imgLabel = new JLabel(imageIcon);
       
       
        c.add(JLtx);
        c.add(imgLabel);
        setVisible(true);
        
        try {
         Thread.sleep(2000);
      } catch (InterruptedException e1) {
         // TODO Auto-generated catch block
         e1.printStackTrace();
      }
        dispose();
   }
   
   public static void main(String[] args) {
      new payment("");
   }

}