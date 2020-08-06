import java.awt.Button;
import java.awt.Frame;
import java.awt.Image;
import java.awt.Toolkit;

public class FrameTest2 {
	Frame frm = new Frame("창제목");// 프레임의 타이틀에 "창제목"을 넣은 Frame 객체 생성
	Button btn = new Button("OK"); //OK가 담긴 버튼 객체
	
	
	
	public FrameTest2() {
//		frm.setSize(500,500);
//		frm.setVisible(true); //창 타이틀이 "창제목"인 창이뜬다.
		
		// 중간에 창제목을 수정할수 있다.
//		frm.setTitle("수정된 창제목");
//		frm.add(btn);//버튼 객체
//		frm.setSize(500,500);
//		frm.setVisible(true); //창 타이틀이 "수정된 창제목"이고 내용에 OK버튼이 있는 창이뜬다.
		
		
		frm.setTitle("수정된 창제목2");
		frm.add(btn);//버튼 객체
		
		//컨테이너 아이콘 설정 //프로젝트에서 우클릭 new로 폴더만들기. 이유 = 클래스 상위폴더(지금은 src이기때문)와 같은 위치에 오게끔 생성
		//집어넣을 아이콘은 꼭 새로 생성한 폴더 안에 드래그해서 붙여넣어야한다. (여기선 img폴더에 드래그)
		Toolkit tk = Toolkit.getDefaultToolkit();
		Image icon = tk.getImage("img/K2.jpg");
		frm.setIconImage(icon); // 창 타이틀 왼쪽 위에 이미지가 들어간다.
		
		frm.setSize(500,500);
		frm.setVisible(true); //
				
		
		

		
	}
	public static void main(String[] args) {
		new FrameTest2();
	}

}
