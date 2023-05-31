package swing.ex;

import javax.swing.*;
import java.awt.*;

public class eight_7 extends JFrame {
	
	public eight_7() {
		
		//JFrame 생성자를 호출해 타이틀 설정
		super("3개의 패널을 가진 프로그램");
		//프레임 종료
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//컨텐트팬 생성
		Container container=getContentPane();
		//북 중앙 남쪽에 패널 패치하기 위해 BorderLayout 배치 관리자 생성
		container.setLayout(new BorderLayout());
		
		
		//첫번째 패널 생성 : p1 : 상단
		JPanel p1=new JPanel();
		//p1 배경색 : Yellow
		p1.setBackground(Color.YELLOW);
		//FlowLayout는 FLowLayout.CENTER를 Default로 중앙 기준 차례로 정렬 진행 
		p1.setLayout(new FlowLayout());
		p1.add(new JButton("새로 배치")); //p1 위 첫번째 버튼
		p1.add(new JButton("종료"));//p1 위 두번째 버튼
		//p1 설정 다 하고 컨텐트펜 북쪽에 부착
		container.add(p1,BorderLayout.NORTH);

		//두번째 패널 생성 : p2 : 중앙
		JPanel p2=new JPanel();
		
		/*p2에 담길 JLabel의 위치를 직접 설정 할 것임 
		p2는 panel로 default로 배정되는 배치관리자 삭제
		이거 없으면 상단의 중앙에 나란히 차례로 ****** 출력됨*/
		p2.setLayout(null);
		
		// * 10개 랜덤 위치 생성
		for(int i=0;i<10;i++) {
			JLabel label=new JLabel("*"); //* 생성
			/* label.setLayout(null) : 필요없음
			 배치관리자가 default로 배정되는 것은 컨테이너/패널 같이 담는 것들,,,,
			 */
			int x=(int)(Math.random()*200)+50;//50~250 사이 x좌표
			int y=(int)(Math.random()*150)+50;//50~200 사이 y좌표
			label.setForeground(Color.MAGENTA);
			label.setOpaque(true);
			label.setLocation(x, y);
			label.setSize(20,20);
			/*컴포넌트 절대 위치 정하기 : setBounds(위치 가로, 위치 세로, 폭, 높이)
			  label.setBounds(x, y, 20, 20);로 
			 	setLocation(x,y)와 setSize(20,20)를 한 번에 표현 */
			p2.add(label); // 패널에 * label올려
		}
		//p2를 컨텐트팬 중앙으로 배치/추가
		container.add(p2,BorderLayout.CENTER); 
	
		//두번째 패널 생성 : p3 : 중앙
		JPanel p3=new JPanel();
		p3.setLayout(new FlowLayout()); //중앙을 기준으로 차례로 버튼 배치
		
		p3.add(new JButton("별 갯수 수정")); //버튼 추가
		/*p3.add(new JButton("별 갯수 수정").FlowLayout.Left) 
		 	: 왼쪽에 배치한다는 소리가 아님..
		 p3.setLayout(new FlowLayout(FlowLayout.LEFT,30,40))
		 	: 정렬기준, hGap, VGap 인자로 받아서 배치 관리
		 */
		p3.setBackground(Color.LIGHT_GRAY); //패널 배경색 지정

		p3.add(new JTextField(15));//텍스트 입력칸 추가
		
		//버튼이랑 텍스트입력칸 추가된 패널를 컨텐트 팬에 남쪽에 배치/추가
		container.add(p3,BorderLayout.SOUTH); 
		
		//프레임 사이즈
		setSize(300,300);
		//프레임 보이기
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
		new eight_7();
	}

}