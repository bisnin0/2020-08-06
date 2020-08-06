import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JToggleButton;

public class JButtonTest extends JFrame {
	ImageIcon ii1 = new ImageIcon("img/k1.jpg"); /////이미지 넣기
	ImageIcon ii2 = new ImageIcon("img/k2.jpg");
	ImageIcon ii3 = new ImageIcon("img/k3.jpg");
	ImageIcon ii4 = new ImageIcon("img/k4.jpg");
	ImageIcon ii5 = new ImageIcon("img/k5.jpg");
	public JButtonTest() {
		super("JButton");
		setLayout(new GridLayout(0,3,10,10));
		
		JButton btn1 = new JButton("첫번째 버튼"); //문장만 넣기
		add(btn1); //Grid는 추가되는 순서대로 들어간다.
		
		//버튼 비활성화방법
		btn1.setEnabled(true); //true면 활성화 false면 비활성화
		
		
		
		JButton btn2 = new JButton(ii1);  //버튼에 이미지 넣기
		add(btn2);
		
		JButton btn3 = new JButton("세번째", ii2); //문장과 이미지가 함께있는 버튼 //이미지가 큰거라 텍스트가 가려서 안보임..창크기 키우면 오른쪽에 보인다.
		add(btn3);
		
		btn3.setRolloverIcon(ii3); //마우스가 올라가면 롤 오버다.. 이미지를 바꾸는 작업을 할거다.
								   //마우스 오버시 icon변경
		
		btn3.setPressedIcon(ii4);  //버튼을 누른상태일때 icon이 바뀐다.
		
		
		
		
		//RadioButton //체크박스(사각형에 체크하는것)과 달리 동그란 모양의 박스. 체크박스와 달리 하나를 선택하면 나머지를 선택할 수 없게된다.
					  //하나를 선택하면 나머지가 해제되는것. Ex)윈도우 설치시 여러개의 윈도우버전중 어떤걸 설치할거냐 선택하는 창을 만들때 사용되는것
		
		JPanel pane = new JPanel(new GridLayout(3,1));
		JRadioButton rb1 = new JRadioButton("ONE");
		JRadioButton rb2 = new JRadioButton("TWO");
		JRadioButton rb3 = new JRadioButton("THREE");
		//우선 이 버튼 3개를 하나로 묶어줘야한다. 그래야 하나를 선택하면 나머지가 해제된다.
		//이때 사용하는 클래스 ButtonGroup
		ButtonGroup bg = new ButtonGroup(); //라디오버튼 동작하기 위해서 그룹을 생성해야한다.
		bg.add(rb1); bg.add(rb2); bg.add(rb3);
		//3개가 한 셋트가 되었다.
		//이것을 패널에 담아야한다.
		pane.add(rb1); pane.add(rb2); pane.add(rb3);
		
		//패널을 프레임에 추가
		add(pane);
		
		
		//ToggleButton  //이 버튼은 클릭하면 들어가있다. 다시 누르면 나온다.
		JToggleButton tBtn = new JToggleButton(ii5);
		add(tBtn);
		tBtn.setSelectedIcon(ii1); // 버튼이 선택상태일때 아이콘... 버튼이 눌렸을때 ii1아이콘으로 하겠다
		
		//JLabel
		JLabel lbl1 = new JLabel("라벨", JLabel.CENTER);  //라벨은 버튼과 달리 클릭이 안되는거다.
		JLabel lbl2 = new JLabel("라벨", ii2, JLabel.RIGHT);  //LEFT, RIGHT, CENTER
		add(lbl1);
		add(lbl2);
		
		
/*
		//배경색
		lbl1.setBackground(Color.YELLOW);
		pane.setBackground(Color.GREEN); //이미지에 가려서 안보이지만 적용된거다. //왜냐면 라벨은 배경이 투명으로 적용되어있다.
		btn1.setBackground(Color.ORANGE); //버튼은 배경이 투명이 아니다.
*/
		
		//투명 처리 해제
		lbl1.setOpaque(true);
		pane.setOpaque(true);  //확인필요
		
		//배경색
		lbl1.setBackground(Color.YELLOW); // 적용 되었지만 라디오버튼에 가려서 보이지 않음 그래서 아래에 rb1(라디오버튼1)에 색 넣음
		pane.setBackground(Color.GREEN); //
		btn1.setBackground(Color.ORANGE); //
		
		rb1.setBackground(Color.RED); //라디오버튼1에 배경색을 넣었다. 위에 가려져서 안보이는것대신
		
		JPanel pane2 = new JPanel();
		add(pane2);
		pane2.setOpaque(true);
		pane2.setBackground(Color.cyan);
		
		
		
		setSize(500,500);
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
	}

	public static void main(String[] args) {
		new JButtonTest();
	}

}
