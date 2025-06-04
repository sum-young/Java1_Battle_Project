package view;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import emotion.Emotion;
import main.Main;

import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JProgressBar;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.Color;

public class Battle1 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JProgressBar p1_e1_hpbar;
	private JButton attackBut1;
	private JButton healBut1;
	private JButton wAttackBut1;
	private JProgressBar p1_e2_hpbar;
	private JLabel Img2;
	private JButton attackBut2;
	private JButton healBut2;
	private JButton wAttackBut2;
	private JProgressBar p1_e3_hpbar;
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
					Battle1 frame = new Battle1();
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

	public void setHp(int n){
		System.out.println("setHp 실행됐다");
		hp_bar[n].setValue(Main.player_list.get(1).get(n).getCurr_hp());
	}
		
	public Battle1() {
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 822, 519);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel Img1 = new JLabel("");
		Img1.setBounds(65, 77, 157, 193);
		contentPane.add(Img1);
		Img1.setIcon(new ImageIcon(Battle1.class.getResource(Main.player_list.get(0).get(0).getImage1())));
		
		Img2 = new JLabel("");
		Img2.setBounds(308, 77, 165, 193);
		contentPane.add(Img2);
		Img2.setIcon(new ImageIcon(Battle1.class.getResource(Main.player_list.get(0).get(1).getImage1())));
		
		Img3 = new JLabel("");
		Img3.setBounds(598, 77, 165, 193);
		contentPane.add(Img3);
		Img3.setIcon(new ImageIcon(Battle1.class.getResource(Main.player_list.get(0).get(2).getImage1())));

		
		p1_e1_hpbar = new JProgressBar();
		p1_e1_hpbar.setBackground(Color.LIGHT_GRAY);
		p1_e1_hpbar.setForeground(Color.RED);
		p1_e1_hpbar.setBounds(20, 28, 219, 26);
		contentPane.add(p1_e1_hpbar);
		p1_e1_hpbar.setMaximum(Main.player_list.get(0).get(0).getMax_hp());
		
		p1_e2_hpbar = new JProgressBar();
		p1_e2_hpbar.setBackground(Color.LIGHT_GRAY);
		p1_e2_hpbar.setForeground(Color.RED);
		p1_e2_hpbar.setBounds(283, 28, 219, 26);
		contentPane.add(p1_e2_hpbar);
		p1_e2_hpbar.setMaximum(Main.player_list.get(0).get(1).getMax_hp());
		
		p1_e3_hpbar = new JProgressBar();
		p1_e3_hpbar.setBackground(Color.LIGHT_GRAY);
		p1_e3_hpbar.setForeground(Color.RED);
		p1_e3_hpbar.setBounds(552, 28, 219, 26);
		contentPane.add(p1_e3_hpbar);
		p1_e3_hpbar.setMaximum(Main.player_list.get(0).get(2).getMax_hp());
		
		attackBut1 = new JButton("공격하기");
		attackBut1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main.select_action(1,1,0);
			}
		});
		attackBut1.setBounds(57, 292, 165, 37);
		contentPane.add(attackBut1);
		
		healBut1 = new JButton("힐하기");
		healBut1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main.select_action(1,2,0);
			}
		});
		healBut1.setBounds(57, 351, 165, 37);
		contentPane.add(healBut1);
		
		wAttackBut1 = new JButton("무기로 공격하기");
		wAttackBut1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main.select_action(1,3,0);
			}
		});
		wAttackBut1.setBounds(57, 412, 165, 37);
		contentPane.add(wAttackBut1);
		
		attackBut2 = new JButton("공격하기");
		attackBut2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main.select_action(1,1,1);
			}
		});
		attackBut2.setBounds(308, 292, 165, 37);
		contentPane.add(attackBut2);
		
		healBut2 = new JButton("힐하기");
		healBut2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main.select_action(1,2,1);
			}
		});
		healBut2.setBounds(308, 351, 165, 37);
		contentPane.add(healBut2);
		
		wAttackBut2 = new JButton("무기로 공격하기");
		wAttackBut2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main.select_action(1,3,1);
			}
		});
		wAttackBut2.setBounds(308, 412, 165, 37);
		contentPane.add(wAttackBut2);
		
		attackBut3 = new JButton("공격하기");
		attackBut3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main.select_action(1,1,2);
			}
		});
		attackBut3.setBounds(583, 292, 165, 37);
		contentPane.add(attackBut3);
		
		healBut3 = new JButton("힐하기");
		healBut3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main.select_action(1,2,2);
			}
		});
		healBut3.setBounds(583, 351, 165, 37);
		contentPane.add(healBut3);
		
		wAttackBut3 = new JButton("무기로 공격하기");
		wAttackBut3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main.select_action(1,3,2);
			}
		});
		wAttackBut3.setBounds(583, 412, 165, 37);
		contentPane.add(wAttackBut3);
		
		hp_bar[0] = p1_e1_hpbar;
		hp_bar[1] = p1_e2_hpbar;
		hp_bar[2] = p1_e3_hpbar;
		
	}
	
}
