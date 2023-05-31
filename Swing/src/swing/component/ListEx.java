package swing.component;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.ScrollPane;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Vector;

import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class ListEx extends JFrame implements MouseListener{
   
   private JList list;
   private DefaultListModel <String> model;

   public ListEx(String title) {
      setTitle(title);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setSize(300, 300);
      setLocationRelativeTo(null);
      setLayout(new GridLayout(1, 3));
      
      model = new DefaultListModel<>();
//      String[] sArr = {"AAA", "BBB", "CCC", "DDD", "AAA", "BBB", "CCC", "DDD", "AAA", "BBB", "CCC", "DDD","AAA", "BBB", "CCC", "DDD","AAA", "BBB", "CCC", "DDD"};
      Vector<String> sVec = new Vector<>();
      model.addElement("AAAA");
      model.addElement("AAAA");
      model.addElement("BBBB");
      model.addElement("CCCC");
      model.addElement("DDDD");
      model.addElement("AAAA");
      model.addElement("BBBB");
      model.addElement("CCCC");
      model.addElement("DDDD");
      model.addElement("AAAA");
      model.addElement("BBBB");
      model.addElement("CCCC");
      model.addElement("DDDD");
      model.addElement("AAAA");
      model.addElement("BBBB");
      model.addElement("CCCC");
      model.addElement("DDDD");
      list = new JList<>(model);
      list.addMouseListener(this);
      JScrollPane scrollPane = new JScrollPane(list);
      add(scrollPane);
      
      JPanel panC = new JPanel();
      
      JButton btnLR = new JButton("->");
      panC.add(btnLR);
      JButton btnRL = new JButton("<-");
      panC.add(btnRL);
      
      panC.add(btnLR);
      panC.add(btnRL);
      add(panC);

      DefaultComboBoxModel<String> cModel = new DefaultComboBoxModel<>();
      cModel.addElement("1111");
      cModel.addElement("2222");
      cModel.addElement("3333");
      cModel.addElement("4444");
      cModel.addElement("5555");
      cModel.addElement("6666");
      cModel.addElement("7777");
      JComboBox<String> cb = new JComboBox<>(cModel);
      add(cb);
      
      setVisible(true);
   }

   public static void main(String[] args) {
      new ListEx("ListEx");
      
   }

   @Override
   public void mouseClicked(MouseEvent e) {
      
      if(e.getClickCount() == 2) {
         int index = list.getSelectedIndex();
         String value = (String) list.getSelectedValue();
         System.out.println(index + ":" + value);
         model.remove(index);
      }
   }

   @Override
   public void mousePressed(MouseEvent e) {
      
   }

   @Override
   public void mouseReleased(MouseEvent e) {
      
   }

   @Override
   public void mouseEntered(MouseEvent e) {
      
   }

   @Override
   public void mouseExited(MouseEvent e) {
      
   }

}