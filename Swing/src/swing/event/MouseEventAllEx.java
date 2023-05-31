package swing.event;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MouseEventAllEx extends JFrame implements MouseListener, MouseMotionListener{
	private JLabel la = new JLabel("   Move Me"); 
	
	public MouseEventAllEx(String title) {
		setTitle(title);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(320, 200);
		Container c = getContentPane();
		c.setLayout(null); 
		
		c.addMouseListener(this); 
		c.addMouseMotionListener(this); 
		
		la.setSize(80, 20);
		la.setLocation(100, 80);
		c.add(la); 
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new MouseEventAllEx("MouseLisetener¿Í MouseMotionListener ¿¹Á¦");
	}

	@Override
	public void mouseClicked(MouseEvent e) {
	}

	@Override
	public void mousePressed(MouseEvent e) {
		la.setLocation(e.getX(), e.getY()); 
		setTitle("mousePressed(" + e.getX()+ "," + e.getY()+")"); 	
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		la.setLocation(e.getX(), e.getY());
		setTitle("mouseReleased(" + e.getX()+ "," + e.getY()+")");
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		Component comp = (Component)e.getSource();
		comp.setBackground(Color.CYAN); 
	}

	@Override
	public void mouseExited(MouseEvent e) {
		Component comp = (Component)e.getSource();
		comp.setBackground(Color.YELLOW); 
		setTitle("mouseExited (" + e.getX()+  "," + e.getY() + ")"); 
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		la.setLocation(e.getX(), e.getY());
		setTitle("mouseDragged(" + e.getX()+  "," + e.getY() + ")"); 
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		la.setLocation(e.getX(), e.getY());
		setTitle("mouseMoved(" + e.getX()+  "," + e.getY() + ")"); 
	}

}

//