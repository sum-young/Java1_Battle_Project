package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import emotion.Emotion;
import emotion.기쁨이;
import emotion.까칠이;
import emotion.버럭이;
import emotion.소심이;
import emotion.슬픔이;
import weapon.Weapon;

import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class selectE2 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel joyImg;
	private JButton joySelectButton;
	private JLabel sadnessImg;
	private JButton sadnessSelectButton;
	private JLabel angerImg;
	private JButton angerSelectButton;
	private JLabel disgustImg;
	private JButton disgustSelectButton;
	private JLabel fearImg;
	private JButton fearSelectButton;
	
	public Emotion e1, e2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					selectE2 frame = new selectE2();
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
	
	
	// 선택버튼이 클릭되었을 때 처리할 공통 메소드
		public void handleSelect(JButton button) {
			
			String name = button.getText();
			System.out.println("[Player2] : " + name + " 선택");
			
			switch (name) {
			case "기쁨이":
				e2 = new 기쁨이("기쁨이", 500, 30, "/images/기쁨이2.png", "/images/기쁨이 사망.png");
        		Weapon w1 = new Weapon("비눗방울", 50);
        		e2.setWeapon(w1);
        		break;
        	case "슬픔이":
        		e2 = new 슬픔이("슬픔이", 500, 30, "/images/슬픔이2.png", "/images/슬픔이 사망.png");
        		Weapon w2 = new Weapon("눈물", 50);
        		e2.setWeapon(w2);
        		break;
        	case "버럭이":
        		e2 = new 버럭이("버럭이", 450, 30, "/images/버럭이2.png", "/images/버럭이 사망.png");
        		Weapon w3 = new Weapon("망치", 40);
        		e2.setWeapon(w3);
        		break;
        	case "까칠이":
        		e2 = new 까칠이("까칠이", 400, 30, "/images/까칠이2.png", "/images/까칠이 사망.png");
        		Weapon w4 = new Weapon("눈빛레이저", 30);
        		e2.setWeapon(w4);
        		break;
        	case "소심이":
        		e2 = new 소심이("소심이", 450, 30, "/images/소심이2.png", "/images/소심이 사망.png");
        		Weapon w5 = new Weapon("걱정폭탄", 30);
        		e2.setWeapon(w5);
        		break;
			}
			
			new battleView(e1, e2).setVisible(true);
			dispose();
		}
	
	
	
	public selectE2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 828, 602);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		joyImg = new JLabel("");
		joyImg.setIcon(new ImageIcon(selectE2.class.getResource("/images/기쁨이2.png")));
		joyImg.setBounds(89, 28, 163, 171);
		contentPane.add(joyImg);
		
		joySelectButton = new JButton("기쁨이");
		joySelectButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				handleSelect(joySelectButton);
			}
		});
		joySelectButton.setBounds(104, 209, 112, 31);
		contentPane.add(joySelectButton);
		
		sadnessImg = new JLabel("");
		sadnessImg.setIcon(new ImageIcon(selectE2.class.getResource("/images/슬픔이2.png")));
		sadnessImg.setBounds(312, 28, 163, 171);
		contentPane.add(sadnessImg);
		
		sadnessSelectButton = new JButton("슬픔이");
		sadnessSelectButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				handleSelect(sadnessSelectButton);
			}
		});
		sadnessSelectButton.setBounds(328, 209, 112, 31);
		contentPane.add(sadnessSelectButton);
		
		angerImg = new JLabel("");
		angerImg.setIcon(new ImageIcon(selectE2.class.getResource("/images/버럭이2.png")));
		angerImg.setBounds(556, 28, 163, 171);
		contentPane.add(angerImg);
		
		angerSelectButton = new JButton("버럭이");
		angerSelectButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				handleSelect(angerSelectButton);
			}
		});
		angerSelectButton.setBounds(582, 209, 112, 31);
		contentPane.add(angerSelectButton);
		
		fearImg = new JLabel("");
		fearImg.setIcon(new ImageIcon(selectE2.class.getResource("/images/소심이2.png")));
		fearImg.setBounds(458, 312, 163, 171);
		contentPane.add(fearImg);
		
		fearSelectButton = new JButton("소심이");
		fearSelectButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				handleSelect(fearSelectButton);
			}
		});
		fearSelectButton.setBounds(470, 493, 112, 31);
		contentPane.add(fearSelectButton);
		
		disgustImg = new JLabel("");
		disgustImg.setIcon(new ImageIcon(selectE2.class.getResource("/images/까칠이2.png")));
		disgustImg.setBounds(194, 312, 163, 171);
		contentPane.add(disgustImg);
		
		disgustSelectButton = new JButton("까칠이");
		disgustSelectButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				handleSelect(disgustSelectButton);
			}
		});
		disgustSelectButton.setBounds(212, 493, 112, 31);
		contentPane.add(disgustSelectButton);
	}
	
	public selectE2(Emotion e1) {
		this();
		this.e1 = e1;
	}
	
}
