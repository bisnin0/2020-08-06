import java.awt.Button;
import java.awt.Frame;
import java.awt.Image;
import java.awt.Toolkit;

public class FrameTest2 {
	Frame frm = new Frame("â����");// �������� Ÿ��Ʋ�� "â����"�� ���� Frame ��ü ����
	Button btn = new Button("OK"); //OK�� ��� ��ư ��ü
	
	
	
	public FrameTest2() {
//		frm.setSize(500,500);
//		frm.setVisible(true); //â Ÿ��Ʋ�� "â����"�� â�̶��.
		
		// �߰��� â������ �����Ҽ� �ִ�.
//		frm.setTitle("������ â����");
//		frm.add(btn);//��ư ��ü
//		frm.setSize(500,500);
//		frm.setVisible(true); //â Ÿ��Ʋ�� "������ â����"�̰� ���뿡 OK��ư�� �ִ� â�̶��.
		
		
		frm.setTitle("������ â����2");
		frm.add(btn);//��ư ��ü
		
		//�����̳� ������ ���� //������Ʈ���� ��Ŭ�� new�� ���������. ���� = Ŭ���� ��������(������ src�̱⶧��)�� ���� ��ġ�� ���Բ� ����
		//������� �������� �� ���� ������ ���� �ȿ� �巡���ؼ� �ٿ��־���Ѵ�. (���⼱ img������ �巡��)
		Toolkit tk = Toolkit.getDefaultToolkit();
		Image icon = tk.getImage("img/K2.jpg");
		frm.setIconImage(icon); // â Ÿ��Ʋ ���� ���� �̹����� ����.
		
		frm.setSize(500,500);
		frm.setVisible(true); //
				
		
		

		
	}
	public static void main(String[] args) {
		new FrameTest2();
	}

}
