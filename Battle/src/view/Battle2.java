package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import main.Main;

import javax.swing.JProgressBar;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Battle2 extends JFrame {

	private static Battle2 instance;

	public static Battle2 getInstance() {
		if (instance == null) {
			instance = new Battle2();
		}
		return instance;
	}

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JProgressBar p2_e1_hpbar;
	private JLabel Img1;
	private JButton attackBut1;
	private JButton healBut1;
	private JButton wAttackBut1;
	private JProgressBar p2_e2_hpbar;
	private JLabel Img2;
	private JButton attackBut2;
	private JButton healBut2;
	private JButton wAttackBut2;
	private JProgressBar p2_e3_hpbar;
	private JLabel Img3;
	private JButton attackBut3;
	private JButton healBut3;
	private JButton wAttackBut3;
	JProgressBar[] hp_bar = new JProgressBar[3];

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Battle2 frame = new Battle2();
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

	public void setHp(int n) {
		hp_bar[n].setValue(Main.player_list.get(1).get(n).getCurr_hp());
	}

	public Battle2() {
		System.out.println("Battle1 생성자 실행됨!");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 826, 507);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		p2_e1_hpbar = new JProgressBar();
		p2_e1_hpbar.setBackground(Color.LIGHT_GRAY);
		p2_e1_hpbar.setForeground(new Color(255, 0, 0));
		p2_e1_hpbar.setBounds(22, 27, 226, 26);
		contentPane.add(p2_e1_hpbar);
		p2_e1_hpbar.setMaximum(Main.player_list.get(1).get(0).getMax_hp());

		p2_e2_hpbar = new JProgressBar();
		p2_e2_hpbar.setBackground(Color.LIGHT_GRAY);
		p2_e2_hpbar.setForeground(Color.RED);
		p2_e2_hpbar.setBounds(283, 27, 226, 26);
		contentPane.add(p2_e2_hpbar);
		p2_e2_hpbar.setMaximum(Main.player_list.get(1).get(1).getMax_hp());

		p2_e3_hpbar = new JProgressBar();
		p2_e3_hpbar.setBackground(Color.LIGHT_GRAY);
		p2_e3_hpbar.setForeground(Color.RED);
		p2_e3_hpbar.setBounds(550, 27, 226, 26);
		contentPane.add(p2_e3_hpbar);
		p2_e3_hpbar.setMaximum(Main.player_list.get(1).get(2).getMax_hp());

		Img1 = new JLabel("");
		Img1.setBounds(55, 63, 157, 193);
		contentPane.add(Img1);
		Img1.setIcon(new ImageIcon(Battle1.class.getResource(Main.player_list.get(1).get(0).getImage1())));

		attackBut1 = new JButton("공격하기");
		attackBut1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main.select_action(2, 1, 0);
			}
		});
		attackBut1.setBounds(55, 288, 165, 37);
		contentPane.add(attackBut1);

		healBut1 = new JButton("힐하기");
		healBut1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main.select_action(2, 2, 0);
			}
		});
		healBut1.setBounds(55, 347, 165, 37);
		contentPane.add(healBut1);

		wAttackBut1 = new JButton("무기로 공격하기");
		wAttackBut1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main.select_action(2, 3, 0);
			}
		});
		wAttackBut1.setBounds(55, 408, 165, 37);
		contentPane.add(wAttackBut1);

		Img2 = new JLabel("");
		Img2.setBounds(314, 73, 165, 193);
		contentPane.add(Img2);
		Img2.setIcon(new ImageIcon(Battle1.class.getResource(Main.player_list.get(1).get(1).getImage1())));

		attackBut2 = new JButton("공격하기");
		attackBut2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main.select_action(2, 1, 1);
			}
		});
		attackBut2.setBounds(314, 288, 165, 37);
		contentPane.add(attackBut2);

		healBut2 = new JButton("힐하기");
		healBut2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main.select_action(2, 2, 1);
			}
		});
		healBut2.setBounds(314, 347, 165, 37);
		contentPane.add(healBut2);

		wAttackBut2 = new JButton("무기로 공격하기");
		wAttackBut2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main.select_action(2, 3, 1);
			}
		});
		wAttackBut2.setBounds(314, 408, 165, 37);
		contentPane.add(wAttackBut2);

		Img3 = new JLabel("");
		Img3.setBounds(589, 73, 165, 193);
		contentPane.add(Img3);
		Img3.setIcon(new ImageIcon(Battle1.class.getResource(Main.player_list.get(1).get(2).getImage1())));

		attackBut3 = new JButton("공격하기");
		attackBut3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main.select_action(2, 1, 2);
			}
		});
		attackBut3.setBounds(589, 288, 165, 37);
		contentPane.add(attackBut3);

		healBut3 = new JButton("힐하기");
		healBut3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main.select_action(2, 2, 2);
			}
		});
		healBut3.setBounds(589, 347, 165, 37);
		contentPane.add(healBut3);

		wAttackBut3 = new JButton("무기로 공격하기");
		wAttackBut3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main.select_action(2, 3, 2);
			}
		});
		wAttackBut3.setBounds(589, 408, 165, 37);
		contentPane.add(wAttackBut3);
		
		hp_bar[0] = p2_e1_hpbar;
		hp_bar[1] = p2_e2_hpbar;
		hp_bar[2] = p2_e3_hpbar;
	}
}
