package swing.note;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class TestFrame extends JFrame implements ActionListener {
   
   private JTextField textField; // �ؽ�Ʈ �ʵ� ����
   private JButton btn; // ��ư ����
   private CalcFrame calcFrame; // CalcFrame ��ü ����

   public TestFrame(String title, int x, int y, CalcFrame calcFrame) {
      this.calcFrame = calcFrame; // CalcFrame ��ü �ʱ�ȭ
      calcFrame.setTitle("ABCD"); // CalcFrame ���� ����
      setTitle(title); // ���� ����
//    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // �ּ� ó���� ���� �ڵ�
      setSize(300, 300); // â ũ�� ����
      setLocation(x, y); // â ��ġ ����
      setLayout(new FlowLayout()); // ���̾ƿ� ����(FlowLayout)
      
      textField = new JTextField(10); // �ؽ�Ʈ �ʵ� �ʱ�ȭ
      add(textField); // �ؽ�Ʈ �ʵ带 â�� �߰�
      
      btn = new JButton("��ư"); // ��ư �ʱ�ȭ
      btn.addActionListener(this); // ��ư �̺�Ʈ ������ ���
      add(btn); // ��ư�� â�� �߰�
      
      setVisible(true); // â�� ���̰� ����
   }

   @Override
   public void actionPerformed(ActionEvent e) {
      Object obj = e.getSource(); // �̺�Ʈ �߻��� ��ü ��������
      if(obj == btn) { // �߻��� ��ü�� ��ư�� ���
         String str = textField.getText(); // �ؽ�Ʈ �ʵ忡�� ���ڿ� ��������
         calcFrame.getTextField().setText(str); // CalcFrame�� �ؽ�Ʈ �ʵ忡 ���ڿ� ����
      }
   }
}

//   public static void main(String[] args) {
//      new TestFrame("TestFrame");
//   }