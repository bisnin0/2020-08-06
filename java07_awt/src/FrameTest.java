import java.awt.Button;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Point;
import java.awt.Rectangle;

public class FrameTest extends Frame{ //extends Frame = 상속. import 그러면 Frame에 있는 모든 기능은 이 클래스에서 사용 가능하다.

	Dimension dim = new Dimension(500,600); // 폭500, 높이600 사이즈의 창을 내포하고 있는 객체dim 
	Point p = new Point(300,400);
//	Rectangle rect = new Rectangle(300, 300, 700, 700); xy좌표 지정해서 창 출력하는 객체생성 setBounds
	Rectangle rect = new Rectangle(p, dim); // point와 dimension의 객체를 이용해서 좌표 크기 지정 출력 setBounds	
	
	
	//보통 버튼 만들때는 맴버변수에 만든다.
	Button btn = new Button("확인");
			
//	메인창은 Frame클래스로 생성한다.
	
	public FrameTest() {
		//버튼 API로 보면 Component를 상속받고 있는게 보인다. 하위클래스를 상위클래스에 넣는게 가능하기때문에 버튼을 만들어서 Component(Frame)에 넣는게 가능하다.
		add(btn); //위의 버튼 객체
		
		
		
		////////창의 크기 설정. (3가지 방법)
		//1. setSize()   <--상속받았기때문에 바로 사용 가능
//		setSize(300, 400); //픽셀단위 

		//창이 화면에 보이게 설정  : setVisible()
//		setVisible(true); //보여야하니까 true
		
		//이렇게 실행하면 윈도우 창이 열리는데 X버튼으로 나기지지 않는다. Frame은 원래 X버튼으로 나가지지 않는다.
		// 이걸 닫으려면 콘솔에서 빨간 사각버튼 눌러서 없애야한다.
		
		
		//2. 사이즈를 Dimension으로 객체 만들어서 사용하는방법
//		setSize(dim);
//		setVisible(true);            
		
		//3. setBounds 로 좌표를 지정해서 생성
//		setBounds(300,200, 500, 500); //x,y는 좌표. x는 왼쪽에서 오른쪽으로 y는 위에서 아래로. 좌표와 폭과 높이를 가지는것
		//x좌표 300, y좌표 200에 500 500 크기의 창을 열어라
//		setVisible(true);
		
		setBounds(rect); //객체를 만들어서 사용해도된다. rectangle로

		//버튼 담을때는 아래 setVisible 위에서 담아야 한다. 편하게 하려면 저~위에.
		
		setVisible(true);
		
		
	
	}

	public static void main(String[] args) {
		new FrameTest();
	}

}
