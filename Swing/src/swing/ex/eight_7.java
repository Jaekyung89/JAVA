package swing.ex;

import javax.swing.*;
import java.awt.*;

public class eight_7 extends JFrame {
	
	public eight_7() {
		
		//JFrame �����ڸ� ȣ���� Ÿ��Ʋ ����
		super("3���� �г��� ���� ���α׷�");
		//������ ����
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//����Ʈ�� ����
		Container container=getContentPane();
		//�� �߾� ���ʿ� �г� ��ġ�ϱ� ���� BorderLayout ��ġ ������ ����
		container.setLayout(new BorderLayout());
		
		
		//ù��° �г� ���� : p1 : ���
		JPanel p1=new JPanel();
		//p1 ���� : Yellow
		p1.setBackground(Color.YELLOW);
		//FlowLayout�� FLowLayout.CENTER�� Default�� �߾� ���� ���ʷ� ���� ���� 
		p1.setLayout(new FlowLayout());
		p1.add(new JButton("���� ��ġ")); //p1 �� ù��° ��ư
		p1.add(new JButton("����"));//p1 �� �ι�° ��ư
		//p1 ���� �� �ϰ� ����Ʈ�� ���ʿ� ����
		container.add(p1,BorderLayout.NORTH);

		//�ι�° �г� ���� : p2 : �߾�
		JPanel p2=new JPanel();
		
		/*p2�� ��� JLabel�� ��ġ�� ���� ���� �� ���� 
		p2�� panel�� default�� �����Ǵ� ��ġ������ ����
		�̰� ������ ����� �߾ӿ� ������ ���ʷ� ****** ��µ�*/
		p2.setLayout(null);
		
		// * 10�� ���� ��ġ ����
		for(int i=0;i<10;i++) {
			JLabel label=new JLabel("*"); //* ����
			/* label.setLayout(null) : �ʿ����
			 ��ġ�����ڰ� default�� �����Ǵ� ���� �����̳�/�г� ���� ��� �͵�,,,,
			 */
			int x=(int)(Math.random()*200)+50;//50~250 ���� x��ǥ
			int y=(int)(Math.random()*150)+50;//50~200 ���� y��ǥ
			label.setForeground(Color.MAGENTA);
			label.setOpaque(true);
			label.setLocation(x, y);
			label.setSize(20,20);
			/*������Ʈ ���� ��ġ ���ϱ� : setBounds(��ġ ����, ��ġ ����, ��, ����)
			  label.setBounds(x, y, 20, 20);�� 
			 	setLocation(x,y)�� setSize(20,20)�� �� ���� ǥ�� */
			p2.add(label); // �гο� * label�÷�
		}
		//p2�� ����Ʈ�� �߾����� ��ġ/�߰�
		container.add(p2,BorderLayout.CENTER); 
	
		//�ι�° �г� ���� : p3 : �߾�
		JPanel p3=new JPanel();
		p3.setLayout(new FlowLayout()); //�߾��� �������� ���ʷ� ��ư ��ġ
		
		p3.add(new JButton("�� ���� ����")); //��ư �߰�
		/*p3.add(new JButton("�� ���� ����").FlowLayout.Left) 
		 	: ���ʿ� ��ġ�Ѵٴ� �Ҹ��� �ƴ�..
		 p3.setLayout(new FlowLayout(FlowLayout.LEFT,30,40))
		 	: ���ı���, hGap, VGap ���ڷ� �޾Ƽ� ��ġ ����
		 */
		p3.setBackground(Color.LIGHT_GRAY); //�г� ���� ����

		p3.add(new JTextField(15));//�ؽ�Ʈ �Է�ĭ �߰�
		
		//��ư�̶� �ؽ�Ʈ�Է�ĭ �߰��� �гθ� ����Ʈ �ҿ� ���ʿ� ��ġ/�߰�
		container.add(p3,BorderLayout.SOUTH); 
		
		//������ ������
		setSize(300,300);
		//������ ���̱�
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
		new eight_7();
	}

}