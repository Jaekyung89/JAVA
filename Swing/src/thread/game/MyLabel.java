package thread.game;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JLabel;

public class MyLabel extends JLabel {

   private int barSize;    //현재 크기
   private int maxBarSize;   //최대 크기
   
   public MyLabel(int maxBarSize) {
      this.barSize = 0;
      this.maxBarSize = maxBarSize;
   }

   @Override
   public void paintComponent(Graphics g) { //Graphics g -> 그래픽 객체
      super.paintComponent(g);
      
      g.setColor(Color.MAGENTA);
      int width = (int)((double)getWidth() / maxBarSize * barSize);
      if(width == 0) {
         return;
      }
      g.fillRect(0, 0, width, getHeight());
            
   }
   
   public synchronized void fill() {
      if(barSize == maxBarSize) {
         try {
            wait();
         } catch (InterruptedException e) {
            return;
         }
      }
      barSize++;
      repaint();
      notify();
   }
   
   public synchronized void consume() {
      if(barSize == 0) {
         try {
            wait();
         } catch (InterruptedException e) {
            return;
         }
      }
      barSize--;
      repaint();
      notify();
   }
   
   
}