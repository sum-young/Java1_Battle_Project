package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import emotion.Emotion;

import javax.swing.JLabel;
import javax.swing.JProgressBar;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class battleView extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel e1Img;
	private JLabel e2Img;
	private JProgressBar e1HpBar;
	private JProgressBar e2HpBar;
	private JButton e1AttackButton;
	private JButton e2AttackButton;
	private JLabel name1;
	private JLabel hp1;
	private JLabel name1Value;
	private JLabel hp1Value;

	public Emotion e1, e2, attacker, target;
	private JLabel name2;
	private JLabel hp2;
	private JLabel name2Value;
	private JLabel hp2Value;
	public int round = 1;
	public int cnt = 0;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					battleView frame = new battleView();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	
	// attacker와 target이 바뀜에 따라 UI적용도 달라지기 때문에 CharacterUI 클래스 정의
	class CharacterUI {
	    Emotion emotion;
	    JLabel hpLabel;
	    JProgressBar hpBar;
	    JLabel imageLabel;
	    JButton attackButton;

	    public CharacterUI(Emotion emotion, JLabel hpLabel, JProgressBar hpBar, JLabel imageLabel, JButton attackButton) {
	        this.emotion = emotion;
	        this.hpLabel = hpLabel;
	        this.hpBar = hpBar;
	        this.imageLabel = imageLabel;
	        this.attackButton = attackButton;
	    }
	}
	
	
	public void attackAction(ActionEvent e) {
		CharacterUI c1 = new CharacterUI(e1, hp1Value, e1HpBar, e1Img, e1AttackButton);
		CharacterUI c2 = new CharacterUI(e2, hp2Value, e2HpBar, e2Img, e2AttackButton);
		CharacterUI attackerUI, targetUI;

		   if (e.getSource() == c1.attackButton) {
			   attackerUI = c1;
		       targetUI = c2;
		   } else {
		       attackerUI = c2;
		       targetUI = c1;
		   }

		   Emotion attacker = attackerUI.emotion;
		   Emotion target = targetUI.emotion;
		   
		   System.out.printf("--------------%d--------------\n", round++);
		   System.out.println(attacker.name + "의 공격버튼이 눌렸음");

		   attacker.attack(target);

		   targetUI.hpLabel.setText(Integer.toString(target.getHp()));
		   targetUI.hpBar.setValue(target.getHp());

		   if (target.getHp() <= 0) {
		       System.out.println(target.name + " 사망");
		       System.out.println("승자 !! " + attacker.name + " !!");
		       targetUI.imageLabel.setIcon(new ImageIcon(battleView.class.getResource(target.getImgFile2())));
		       targetUI.attackButton.setEnabled(false);
		       attackerUI.attackButton.setEnabled(false); // 사망 이후 더이상의 공격 불허
		   }
	}
	
	public battleView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 837, 580);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		e1Img = new JLabel("");
		e1Img.setBounds(43, 10, 294, 315);
		contentPane.add(e1Img);
		
		e2Img = new JLabel("");
		e2Img.setBounds(481, 10, 294, 315);
		contentPane.add(e2Img);
		
		e1HpBar = new JProgressBar();
		e1HpBar.setMaximum(500);
		// 아래 생성자에서 초기화
		e1HpBar.setForeground(Color.RED);
		e1HpBar.setBounds(43, 417, 294, 24);
		contentPane.add(e1HpBar);
		
		e2HpBar = new JProgressBar();
		e2HpBar.setMaximum(500);
		// 아래 생성자에서 초기화
		e2HpBar.setForeground(Color.RED);
		e2HpBar.setBounds(481, 417, 294, 24);
		contentPane.add(e2HpBar);
		
		e1AttackButton = new JButton("공격하기");
		e1AttackButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				attackAction(e);
			}
		});
		e1AttackButton.setBounds(91, 475, 182, 42);
		contentPane.add(e1AttackButton);
		
		e2AttackButton = new JButton("공격하기");
		e2AttackButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				attackAction(e);
			}
		});
		e2AttackButton.setBounds(538, 475, 182, 42);
		contentPane.add(e2AttackButton);
		
		name1 = new JLabel("이름");
		name1.setBounds(43, 341, 46, 24);
		contentPane.add(name1);
		
		hp1 = new JLabel("hp");
		hp1.setBounds(43, 383, 46, 24);
		contentPane.add(hp1);
		
		name1Value = new JLabel("");
		name1Value.setBounds(114, 341, 46, 24);
		contentPane.add(name1Value);
		
		hp1Value = new JLabel("");
		hp1Value.setBounds(114, 383, 46, 24);
		contentPane.add(hp1Value);
		
		name2 = new JLabel("이름");
		name2.setBounds(491, 335, 46, 24);
		contentPane.add(name2);
		
		hp2 = new JLabel("hp");
		hp2.setBounds(491, 377, 46, 24);
		contentPane.add(hp2);
		
		name2Value = new JLabel("");
		name2Value.setBounds(562, 335, 46, 24);
		contentPane.add(name2Value);
		
		hp2Value = new JLabel("");
		hp2Value.setBounds(562, 377, 46, 24);
		contentPane.add(hp2Value);
	}

	public battleView(Emotion e1, Emotion e2) {
		
		this();
		// 이미지 바꾸기, 이름 ,hp, bar의 value min, max 업데이트
		this.e1 = e1;
		this.e2 = e2;
		
		System.out.println("e1정보로 업데이트!");
		name1Value.setText(e1.name);
		hp1Value.setText(Integer.toString(e1.getHp()));
		e1HpBar.setValue(e1.getHp());
		e1HpBar.setMaximum(e1.getHp());
		
		// 이미지 교체
		
		e1Img.setIcon(new ImageIcon(battleView.class.getResource(e1.getImgFile1())));
		
		System.out.println("e2정보로 업데이트!");
		name2Value.setText(e2.name);
		hp2Value.setText(Integer.toString(e2.getHp()));
		e2HpBar.setValue(e2.getHp());
		e2HpBar.setMaximum(e2.getHp());
		e2Img.setIcon(new ImageIcon(battleView.class.getResource(e2.getImgFile1())));
		
		
		
	}

}


