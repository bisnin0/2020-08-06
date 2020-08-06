import java.awt.Button;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Point;
import java.awt.Rectangle;

public class FrameTest extends Frame{ //extends Frame = ���. import �׷��� Frame�� �ִ� ��� ����� �� Ŭ�������� ��� �����ϴ�.

	Dimension dim = new Dimension(500,600); // ��500, ����600 �������� â�� �����ϰ� �ִ� ��üdim 
	Point p = new Point(300,400);
//	Rectangle rect = new Rectangle(300, 300, 700, 700); xy��ǥ �����ؼ� â ����ϴ� ��ü���� setBounds
	Rectangle rect = new Rectangle(p, dim); // point�� dimension�� ��ü�� �̿��ؼ� ��ǥ ũ�� ���� ��� setBounds	
	
	
	//���� ��ư ���鶧�� �ɹ������� �����.
	Button btn = new Button("Ȯ��");
			
//	����â�� FrameŬ������ �����Ѵ�.
	
	public FrameTest() {
		//��ư API�� ���� Component�� ��ӹް� �ִ°� ���δ�. ����Ŭ������ ����Ŭ������ �ִ°� �����ϱ⶧���� ��ư�� ���� Component(Frame)�� �ִ°� �����ϴ�.
		add(btn); //���� ��ư ��ü
		
		
		
		////////â�� ũ�� ����. (3���� ���)
		//1. setSize()   <--��ӹ޾ұ⶧���� �ٷ� ��� ����
//		setSize(300, 400); //�ȼ����� 

		//â�� ȭ�鿡 ���̰� ����  : setVisible()
//		setVisible(true); //�������ϴϱ� true
		
		//�̷��� �����ϸ� ������ â�� �����µ� X��ư���� �������� �ʴ´�. Frame�� ���� X��ư���� �������� �ʴ´�.
		// �̰� �������� �ֿܼ��� ���� �簢��ư ������ ���־��Ѵ�.
		
		
		//2. ����� Dimension���� ��ü ���� ����ϴ¹��
//		setSize(dim);
//		setVisible(true);            
		
		//3. setBounds �� ��ǥ�� �����ؼ� ����
//		setBounds(300,200, 500, 500); //x,y�� ��ǥ. x�� ���ʿ��� ���������� y�� ������ �Ʒ���. ��ǥ�� ���� ���̸� �����°�
		//x��ǥ 300, y��ǥ 200�� 500 500 ũ���� â�� �����
//		setVisible(true);
		
		setBounds(rect); //��ü�� ���� ����ص��ȴ�. rectangle��

		//��ư �������� �Ʒ� setVisible ������ ��ƾ� �Ѵ�. ���ϰ� �Ϸ��� ��~����.
		
		setVisible(true);
		
		
	
	}

	public static void main(String[] args) {
		new FrameTest();
	}

}
