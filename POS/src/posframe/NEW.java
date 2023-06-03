package posframe;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class NEW extends JFrame{

	public NEW(String title, Main name) {
		setTitle(title);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setSize(1200, 1000);
		JPanel fdsaf = name.getPanel();
		JButton btn = new JButton("모르겠다 나는");
		fdsaf.add(btn);
		setVisible(true);
		
		
	}

}
