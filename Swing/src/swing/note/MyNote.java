package swing.note;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.ScrollPane;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JToolBar;
import javax.swing.filechooser.FileNameExtensionFilter;

public class MyNote extends JFrame implements ActionListener{
   
   private JMenuItem itemExit;
   private JMenuItem itemInfo;
   private JMenuItem itemOpen;
   private JMenuItem itemNew;
   private JMenuItem itemSave;
   //private JTextArea textArea;
   private BufferedWriter bw;
   private String out;
   private JMenuItem itemCalc;
   private JTextArea textArea;
   
   private ImageIcon[] imgs = {
         new ImageIcon("images2/new.png"),
         new ImageIcon("images2/open.png"),
         new ImageIcon("images2/save.png"),
         new ImageIcon("images2/exit.png")
   };
   private JButton btnNew;
   private JButton btnOpen;
   private JButton btnSave;
   private JButton btnExit;
   

   public MyNote(String title) {
      setTitle(title);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setSize(500, 400);
      setLocation(1000,  200);
      setLayout(new BorderLayout());

      setMenuBar(); // MenuBar
      
      setToolBar();

      setPanCenter(); // 가운데 내용
      
      setVisible(true);
      
   }

      private void setToolBar() {
         JToolBar toolBar = new JToolBar("My ToolBar");
         
         btnNew = new JButton(imgs[0]);
         btnNew.addActionListener(this);
         toolBar.add(btnNew);
         
         btnOpen = new JButton(imgs[1]);
         btnOpen.addActionListener(this);
         toolBar.add(btnOpen);
         
         btnSave = new JButton(imgs[2]);
         btnSave.addActionListener(this);
         toolBar.add(btnSave);
         
         toolBar.addSeparator();
         
         btnExit = new JButton(imgs[3]);
         btnExit.addActionListener(this);
         btnExit.setToolTipText("Program exit");
         toolBar.add(btnExit);
         
         add(toolBar, BorderLayout.NORTH);
      
   }

      private void setPanCenter() {
      JPanel panCenter = new JPanel();
      panCenter.setBackground(Color.RED);
      panCenter.setLayout(new BorderLayout());
      
//      textArea = new RSyntaxTextArea();
//      textArea.setSyntaxEditingStyle(SyntaxConstants.SYNTAX_STYLE_JAVA);
//      RTextScrollPane scrollPane = new RTextScrollPane(textArea);
      
      
      textArea = new JTextArea();
      JScrollPane scrollPane = new JScrollPane(textArea, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
            JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
      
      panCenter.add(scrollPane);
      
      add(panCenter);
      
   }

      private void setMenuBar() {
         JMenuBar menuBar = new JMenuBar();
         JMenu menuFile = new JMenu("File");
         
         itemNew = new JMenuItem("New");
         itemNew.addActionListener(this);
         menuFile.add(itemNew);
         
         itemOpen = new JMenuItem("Open");
         itemOpen.addActionListener(this);
         menuFile.add(itemOpen);
         
         itemSave = new JMenuItem("Save");
         itemSave.addActionListener(this);
         menuFile.add(itemSave);
         
         //구분선
         menuFile.addSeparator();
         
         itemExit = new JMenuItem("Exit");
         itemExit.addActionListener(this);
         menuFile.add(itemExit);
         
         
         menuBar.add(menuFile);
         
         JMenu menuOption = new JMenu("Option");
         JMenuItem itemFont = new JMenuItem("Font");
         menuOption.add(itemFont);
         itemCalc = new JMenuItem("Calculator");
         itemCalc.addActionListener(this);
         menuOption.add(itemCalc);

         menuBar.add(menuOption);
         
         JMenu menuInfo= new JMenu("Info");
         itemInfo = new JMenuItem("Program Info.");
         itemInfo.addActionListener(this);
         menuInfo.add(itemInfo);
         
               
         menuBar.add(menuInfo);
         
         setJMenuBar(menuBar);
      
   }

      public static void main(String[] args) {
         new MyNote("MyNote ver 0.1");      
      }

      @Override
      public void actionPerformed(ActionEvent e) {
         Object obj = e.getSource();
         
         
         if(obj == itemExit || obj == btnExit) {
            if(JOptionPane.showConfirmDialog(this, "정말 나갈까요?", "종료 확인",
                  JOptionPane.YES_NO_OPTION, 
                  JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION) {
            System.exit(0);
            }
         }
         else if(obj == itemInfo) {
            JOptionPane.showMessageDialog(this, "Simple note", "Program Information", JOptionPane.INFORMATION_MESSAGE);
         }
         else if(obj == itemOpen || obj == btnOpen) {
            fileOpen();
         }
         else if(obj == itemSave || obj == btnSave) {
            fileSave();
         }
         else if(obj == itemCalc) {
            new CalcFrame("CalcFrame");
         }
         else if(obj == itemNew || obj == btnNew) {
            fileSave();
            textArea.setText("");
         }
      }

      private void fileSave() {
         JFileChooser fileSaveChooser = new JFileChooser();
         fileSaveChooser.showSaveDialog(null);
         
         File selectedFile = fileSaveChooser.getSelectedFile();

         
         File out = fileSaveChooser.getSelectedFile();
         BufferedWriter bw = null;
         try {
            bw = new BufferedWriter(new FileWriter(out));
            String str = textArea.getText();
            System.out.println(str);
            str = str.replace("\n", System.getProperty("line.separator"));
            bw.write(str);
            
         }
         catch(Exception e1) {
            e1.printStackTrace();
         }
         finally {
            try {
               bw.close();
            } catch (IOException e1) {
               // TODO Auto-generated catch block
               e1.printStackTrace();
            }
         }
      }
         

      private void fileOpen() {
         JFileChooser fc = new JFileChooser();
         fc.addChoosableFileFilter(new FileNameExtensionFilter("Text", "txt"));
         fc.addChoosableFileFilter(new FileNameExtensionFilter("Image", "jpg", "png", "gif", "bmp"));
         
         
         fc.showOpenDialog(null);
         
         File selectedFile = fc.getSelectedFile();
         
         BufferedReader reader = null;
         String line = null;
         
         try {
            reader = new BufferedReader(new FileReader(selectedFile));
            while((line = reader.readLine())!= null) {
               textArea.append(line + "\n");
            }
         }
         catch(Exception e1) {
            e1.printStackTrace();
         }
         finally {
            try {
               reader.close();
            } catch (IOException e) {
               // TODO Auto-generated catch block
               e.printStackTrace();
            }
         }
      }

}