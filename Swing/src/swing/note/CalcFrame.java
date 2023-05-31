package swing.note;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class CalcFrame extends JFrame implements ActionListener {
   
   private JButton btn; // ù ��° ��ư ����
   private JButton btn2; // �� ��° ��ư ����
   private TestFrame tf; // TestFrame ��ü ����
   private JTextField textField; // �ؽ�Ʈ �ʵ� ����

   public CalcFrame(String title) {
      setTitle(title); // ���� ����
//    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // �ּ� ó���� ���� �ڵ�
      setSize(300, 300); // â ũ�� ����
      setLocationRelativeTo(null); // â ��ġ �߾ӿ� ����
      setLayout(new FlowLayout()); // ���̾ƿ� ����(FlowLayout)
      
      textField = new JTextField(10); // �ؽ�Ʈ �ʵ� �ʱ�ȭ
      add(textField); // �ؽ�Ʈ �ʵ带 â�� �߰�
      
      btn = new JButton("����"); // ù ��° ��ư �ʱ�ȭ
      btn.addActionListener(this); // ù ��° ��ư �̺�Ʈ ������ ���
      add(btn); // ù ��° ��ư�� â�� �߰�
      
      btn2 = new JButton("����"); // �� ��° ��ư �ʱ�ȭ
      btn2.addActionListener(this); // �� ��° ��ư �̺�Ʈ ������ ���
      add(btn2); // �� ��° ��ư�� â�� �߰�
      
      setVisible(true); // â�� ���̰� ����
   }

   public static void main(String[] args) {
      new CalcFrame("CalcFrame"); // CalcFrame ��ü ����
   }

   @Override
   public void actionPerformed(ActionEvent e) {
      Object obj = e.getSource(); // �̺�Ʈ �߻��� ��ü ��������
      
      if(obj == btn) { // �߻��� ��ü�� ù ��° ��ư�� ���
         tf = new TestFrame("TestFrame", 1000, 300, this); // TestFrame ��ü ���� �� �ʱ�ȭ
      } else if(obj == btn2) { // �߻��� ��ü�� �� ��° ��ư�� ���
         if(tf != null) { // TestFrame ��ü�� ������ ���
            tf.setTitle(textField.getText()); // TestFrame ���� ����
         } else {
            // TestFrame ��ü�� �������� ���� ��� ��� �޽��� ���
            JOptionPane.showMessageDialog(this, "���� ��ư�� ���� ��������");
         }
      }
      
   }

   public JTextField getTextField() {
      return textField; // �ؽ�Ʈ �ʵ� getter
   }

   public void setTextField(JTextField textField) {
      this.textField = textField; // �ؽ�Ʈ �ʵ� setter
   }

}