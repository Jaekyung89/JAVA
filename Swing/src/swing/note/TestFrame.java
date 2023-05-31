package swing.note;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class TestFrame extends JFrame implements ActionListener {
   
   private JTextField textField; // 텍스트 필드 선언
   private JButton btn; // 버튼 선언
   private CalcFrame calcFrame; // CalcFrame 객체 선언

   public TestFrame(String title, int x, int y, CalcFrame calcFrame) {
      this.calcFrame = calcFrame; // CalcFrame 객체 초기화
      calcFrame.setTitle("ABCD"); // CalcFrame 제목 설정
      setTitle(title); // 제목 설정
//    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 주석 처리된 종료 코드
      setSize(300, 300); // 창 크기 설정
      setLocation(x, y); // 창 위치 설정
      setLayout(new FlowLayout()); // 레이아웃 설정(FlowLayout)
      
      textField = new JTextField(10); // 텍스트 필드 초기화
      add(textField); // 텍스트 필드를 창에 추가
      
      btn = new JButton("버튼"); // 버튼 초기화
      btn.addActionListener(this); // 버튼 이벤트 리스너 등록
      add(btn); // 버튼을 창에 추가
      
      setVisible(true); // 창을 보이게 설정
   }

   @Override
   public void actionPerformed(ActionEvent e) {
      Object obj = e.getSource(); // 이벤트 발생한 객체 가져오기
      if(obj == btn) { // 발생한 객체가 버튼일 경우
         String str = textField.getText(); // 텍스트 필드에서 문자열 가져오기
         calcFrame.getTextField().setText(str); // CalcFrame의 텍스트 필드에 문자열 설정
      }
   }
}

//   public static void main(String[] args) {
//      new TestFrame("TestFrame");
//   }