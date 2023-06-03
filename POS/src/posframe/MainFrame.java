package posframe;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class MainFrame extends JFrame {
    
    public MainFrame(String title) {
        setTitle(title);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1200, 800);
        setLocationRelativeTo(null);
        setResizable(false);
        setLayout(null);
        
        sp1();
        sp2();
        sp3();
        sp4();
        
        setVisible(true);
    }

    private void sp1() {
        JPanel p1 = new JPanel();
        p1.setBackground(Color.black);
        p1.setLayout(new FlowLayout());
        p1.setBounds(0, 0, 1200, 30);
        
        JTextField tf1 = new JTextField("편의점 셀프 포스");
        tf1.setSelectedTextColor(Color.white);
        
        
        p1.add(tf1);
        add(p1);
    }
    
    private void sp2() {
        JPanel p2 = new JPanel();
        p2.setBackground(Color.red);
        p2.setBounds(0, 50, 1200, 350);
        p2.setLayout(new GridLayout());
        add(p2);
    }

    private void sp3() {
        JPanel p3 = new JPanel();
        p3.setBackground(Color.blue);
        p3.setBounds(0, 400, 1200, 200);
        add(p3);
    }

    private void sp4() {
        JPanel p4 = new JPanel();
        p4.setBackground(Color.yellow);
        p4.setBounds(0, 600, 1200, 200);
        add(p4);
    }
    
    public static void main(String[] args) {
        new MainFrame("메인");
    }
}