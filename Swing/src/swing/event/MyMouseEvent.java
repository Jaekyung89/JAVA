//3/23
package swing.event;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Point;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyMouseEvent extends JFrame implements MouseListener, KeyListener, MouseMotionListener {
	
	private JLabel lbl;
	public final int STEP = 10;

	public MyMouseEvent(String title) {
		setTitle(title);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 300);
		setLocationRelativeTo(null);
		setLayout(null);
		
		
		
		Container contentPane = getContentPane();
		contentPane.setLayout(null);
		contentPane.addMouseListener(this);
		contentPane.addKeyListener(this);
		contentPane.addMouseMotionListener(this);
		
		lbl = new JLabel("홍길동");
		lbl.setSize(60, 25);
		lbl.setLocation(50, 100);
		lbl.addMouseListener(this);
		contentPane.add(lbl);
		
		
		setVisible(true);
		// 포커스 위치 확인
		contentPane.setFocusable(true);
		contentPane.requestFocus();
		
	}

	public static void main(String[] args) {
		new MyMouseEvent("MyMouseEvent");
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		int x = e.getX();
		int y = e.getY();
		System.out.println(x +", "+y);
		lbl.setLocation(x, y);
//		add(lbl);
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		Object obj = e.getSource();
		
//		if(obj == lbl) {
//			System.out.println("AAA");
//		}
	}

	@Override
	public void mouseExited(MouseEvent e) {
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		
	
	}

	@Override
	public void keyPressed(KeyEvent e) {
		char c = e.getKeyChar();
		int i = e.getKeyCode();
		
		if(i == KeyEvent.VK_UP) {
			lbl.setLocation(lbl.getX(), lbl.getY() - STEP);
		} else if(i == KeyEvent.VK_DOWN) {
			lbl.setLocation(lbl.getX(), lbl.getY() + STEP);
		} else if(i == KeyEvent.VK_LEFT) {
			lbl.setLocation(lbl.getX() - STEP, lbl.getY());
		} else if(i == KeyEvent.VK_RIGHT) {
			lbl.setLocation(lbl.getX() + STEP, lbl.getY());
		}
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		Point p = e.getPoint();
		lbl.setLocation(p);
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		
		
	}

}
