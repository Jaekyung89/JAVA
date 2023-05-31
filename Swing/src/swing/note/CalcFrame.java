package swing.note;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class CalcFrame extends JFrame implements ActionListener {
   
   private JButton btn; // 첫 번째 버튼 선언
   private JButton btn2; // 두 번째 버튼 선언
   private TestFrame tf; // TestFrame 객체 선언
   private JTextField textField; // 텍스트 필드 선언

   public CalcFrame(String title) {
      setTitle(title); // 제목 설정
//    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 주석 처리된 종료 코드
      setSize(300, 300); // 창 크기 설정
      setLocationRelativeTo(null); // 창 위치 중앙에 설정
      setLayout(new FlowLayout()); // 레이아웃 설정(FlowLayout)
      
      textField = new JTextField(10); // 텍스트 필드 초기화
      add(textField); // 텍스트 필드를 창에 추가
      
      btn = new JButton("열기"); // 첫 번째 버튼 초기화
      btn.addActionListener(this); // 첫 번째 버튼 이벤트 리스너 등록
      add(btn); // 첫 번째 버튼을 창에 추가
      
      btn2 = new JButton("변경"); // 두 번째 버튼 초기화
      btn2.addActionListener(this); // 두 번째 버튼 이벤트 리스너 등록
      add(btn2); // 두 번째 버튼을 창에 추가
      
      setVisible(true); // 창을 보이게 설정
   }

   public static void main(String[] args) {
      new CalcFrame("CalcFrame"); // CalcFrame 객체 생성
   }

   @Override
   public void actionPerformed(ActionEvent e) {
      Object obj = e.getSource(); // 이벤트 발생한 객체 가져오기
      
      if(obj == btn) { // 발생한 객체가 첫 번째 버튼일 경우
         tf = new TestFrame("TestFrame", 1000, 300, this); // TestFrame 객체 생성 및 초기화
      } else if(obj == btn2) { // 발생한 객체가 두 번째 버튼일 경우
         if(tf != null) { // TestFrame 객체가 존재할 경우
            tf.setTitle(textField.getText()); // TestFrame 제목 변경
         } else {
            // TestFrame 객체가 존재하지 않을 경우 경고 메시지 출력
            JOptionPane.showMessageDialog(this, "열기 버튼을 먼저 누르세요");
         }
      }
      
   }

   public JTextField getTextField() {
      return textField; // 텍스트 필드 getter
   }

   public void setTextField(JTextField textField) {
      this.textField = textField; // 텍스트 필드 setter
   }

}