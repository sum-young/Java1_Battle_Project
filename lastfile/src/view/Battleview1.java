package view;

import java.awt.EventQueue;
import emotion.Emotion;
import main.Main;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;

public class Battleview1 extends JFrame {
	private static Battleview1 instance;

	public static Battleview1 getInstance() {
		if (instance == null) {
			instance = new Battleview1();
		}
		return instance;
	}

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	public CharUI[] charUI = new CharUI[3];
	private Emotion[] emotions = new Emotion[3];
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(() -> {
			try {
				Battleview1.getInstance().setVisible(true);
			} catch (Exception e) {
				e.printStackTrace();
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Battleview1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 700);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		textField = new JTextField();
		textField.setBounds(60, 500, 700, 115);
		contentPane.add(textField);
		textField.setColumns(10);

		for (int i = 0; i < 3; i++) {
			emotions[i] = Main.player_list.get(0).get(i);
			// charUI 생성자: public CharUI(int hp, int id(몇 번째 애인지), int player)
			charUI[i] = new CharUI(emotions[i], i, 0);

			CharUI tmp = charUI[i];
			tmp.setImg(emotions[i].getImage1());

			// 화면에 보이게 contentPane에 추가하는 부분
			contentPane.add(tmp.hp_bar);
			contentPane.add(tmp.attackButton);
			contentPane.add(tmp.healButton);
			contentPane.add(tmp.wAttackButton);
			contentPane.add(tmp.Img);

		}

	}
	
	//이걸로 텍스트박스 업데이트 가능하니까 공격/힐/무기공격할 때 String s ="전달할 메시지 적고";
	//battle1.updateText(s); <- 이거 쓰려면 Battleview1 battle1 = Battleview1.getInstance();이거 앞에 쓰고쓰기
	//2도 같은 방식으로
	//근데 이거하려면 플레이어1이 하는건지 2가하는건지 인자로 받아야할듯 하하핳
	public void updateText(String s) {
		this.textField.setText(s);
	}
}
