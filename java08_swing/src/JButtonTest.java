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
	ImageIcon ii1 = new ImageIcon("img/k1.jpg"); /////�̹��� �ֱ�
	ImageIcon ii2 = new ImageIcon("img/k2.jpg");
	ImageIcon ii3 = new ImageIcon("img/k3.jpg");
	ImageIcon ii4 = new ImageIcon("img/k4.jpg");
	ImageIcon ii5 = new ImageIcon("img/k5.jpg");
	public JButtonTest() {
		super("JButton");
		setLayout(new GridLayout(0,3,10,10));
		
		JButton btn1 = new JButton("ù��° ��ư"); //���常 �ֱ�
		add(btn1); //Grid�� �߰��Ǵ� ������� ����.
		
		//��ư ��Ȱ��ȭ���
		btn1.setEnabled(true); //true�� Ȱ��ȭ false�� ��Ȱ��ȭ
		
		
		
		JButton btn2 = new JButton(ii1);  //��ư�� �̹��� �ֱ�
		add(btn2);
		
		JButton btn3 = new JButton("����°", ii2); //����� �̹����� �Բ��ִ� ��ư //�̹����� ū�Ŷ� �ؽ�Ʈ�� ������ �Ⱥ���..âũ�� Ű��� �����ʿ� ���δ�.
		add(btn3);
		
		btn3.setRolloverIcon(ii3); //���콺�� �ö󰡸� �� ������.. �̹����� �ٲٴ� �۾��� �ҰŴ�.
								   //���콺 ������ icon����
		
		btn3.setPressedIcon(ii4);  //��ư�� ���������϶� icon�� �ٲ��.
		
		
		
		
		//RadioButton //üũ�ڽ�(�簢���� üũ�ϴ°�)�� �޸� ���׶� ����� �ڽ�. üũ�ڽ��� �޸� �ϳ��� �����ϸ� �������� ������ �� ���Եȴ�.
					  //�ϳ��� �����ϸ� �������� �����Ǵ°�. Ex)������ ��ġ�� �������� ����������� ��� ��ġ�Ұų� �����ϴ� â�� ���鶧 ���Ǵ°�
		
		JPanel pane = new JPanel(new GridLayout(3,1));
		JRadioButton rb1 = new JRadioButton("ONE");
		JRadioButton rb2 = new JRadioButton("TWO");
		JRadioButton rb3 = new JRadioButton("THREE");
		//�켱 �� ��ư 3���� �ϳ��� ��������Ѵ�. �׷��� �ϳ��� �����ϸ� �������� �����ȴ�.
		//�̶� ����ϴ� Ŭ���� ButtonGroup
		ButtonGroup bg = new ButtonGroup(); //������ư �����ϱ� ���ؼ� �׷��� �����ؾ��Ѵ�.
		bg.add(rb1); bg.add(rb2); bg.add(rb3);
		//3���� �� ��Ʈ�� �Ǿ���.
		//�̰��� �гο� ��ƾ��Ѵ�.
		pane.add(rb1); pane.add(rb2); pane.add(rb3);
		
		//�г��� �����ӿ� �߰�
		add(pane);
		
		
		//ToggleButton  //�� ��ư�� Ŭ���ϸ� ���ִ�. �ٽ� ������ ���´�.
		JToggleButton tBtn = new JToggleButton(ii5);
		add(tBtn);
		tBtn.setSelectedIcon(ii1); // ��ư�� ���û����϶� ������... ��ư�� �������� ii1���������� �ϰڴ�
		
		//JLabel
		JLabel lbl1 = new JLabel("��", JLabel.CENTER);  //���� ��ư�� �޸� Ŭ���� �ȵǴ°Ŵ�.
		JLabel lbl2 = new JLabel("��", ii2, JLabel.RIGHT);  //LEFT, RIGHT, CENTER
		add(lbl1);
		add(lbl2);
		
		
/*
		//����
		lbl1.setBackground(Color.YELLOW);
		pane.setBackground(Color.GREEN); //�̹����� ������ �Ⱥ������� ����ȰŴ�. //�ֳĸ� ���� ����� �������� ����Ǿ��ִ�.
		btn1.setBackground(Color.ORANGE); //��ư�� ����� ������ �ƴϴ�.
*/
		
		//���� ó�� ����
		lbl1.setOpaque(true);
		pane.setOpaque(true);  //Ȯ���ʿ�
		
		//����
		lbl1.setBackground(Color.YELLOW); // ���� �Ǿ����� ������ư�� ������ ������ ���� �׷��� �Ʒ��� rb1(������ư1)�� �� ����
		pane.setBackground(Color.GREEN); //
		btn1.setBackground(Color.ORANGE); //
		
		rb1.setBackground(Color.RED); //������ư1�� ������ �־���. ���� �������� �Ⱥ��̴°ʹ��
		
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
