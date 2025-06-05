package view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JProgressBar;
import main.Main;
import emotion.Emotion;

public class CharUI {
	
	public int id;
	public JProgressBar hp_bar = new JProgressBar();
	public JButton attackButton = new JButton("공격하기");
	public JButton healButton = new JButton("힐하기");
	public JButton wAttackButton = new JButton("무기로 공격하기");
	public JLabel Img = new JLabel();
	public Emotion emotion;
	public int player;
	
	public CharUI() {
		
	}
	
	public CharUI(Emotion e, int id, int player) {
		this.id = id;
		this.emotion = e; //e에다가 벡터에서 감정 객체 가져옴
		this.player = player;
		
		this.setButton();
		this.setProgressBar();
	}
	
	public void setProgressBar() {
		this.hp_bar.setBackground(Color.LIGHT_GRAY);
		this.hp_bar.setForeground(Color.RED);
		this.hp_bar.setMaximum(emotion.getMax_hp());
		this.hp_bar.setValue(emotion.getMax_hp());
		this.hp_bar.setBounds(20+(this.id*250), 28, 219, 26);
		this.hp_bar.setStringPainted(true);
		
	}
	
	public void setButton() {
		
		this.attackButton.setBounds(57+(this.id*250), 290, 165, 37);
		this.attackButton.setVisible(true);
		this.healButton.setBounds(57+(this.id*250), 340, 165, 37);
		this.wAttackButton.setBounds(57+(this.id*250), 390, 165, 37);
		
		
		
		this.attackButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main.select_action(player,1,emotion);
			}
		});
		this.healButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				emotion.heal();
				setHp();
			}
		});
		this.wAttackButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main.select_action(player,2,emotion);
			}
		});
	}
	
	public void setImg(String imageFile) {
		int x = 65;
		this.Img.setIcon(new ImageIcon(Battleview1.class.getResource(this.emotion.getImage1())));
		this.Img.setBounds(x+(this.id)*250, 77, 165, 193);
		this.Img.setVisible(true);
	}
	
	public void setHp() {
		System.out.println("이것도 실행됨");
		this.hp_bar.setValue(this.emotion.getCurr_hp());
		this.hp_bar.repaint();
	}

}
