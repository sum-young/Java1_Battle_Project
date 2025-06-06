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
	
	//요소 버튼 3개 + 이미지 + hp_bar 묶어놓음
	//각각 이름 확인하고 사용하면 될 듯
	//사용방법은 각 배틀뷰1/2에 있는 필드인 CharUI[] 이 배열로
	//charUI[인덱스].해서  CharUI안에 있는 메소드 쓰게
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
	
	//화면에 띄우는 용도 (기본설정이니까 안건드는거 추천..ㅎㅎ)
	public void setProgressBar() {
		this.hp_bar.setBackground(Color.LIGHT_GRAY);
		this.hp_bar.setForeground(Color.RED);
		this.hp_bar.setMaximum(emotion.getMax_hp());
		this.hp_bar.setValue(emotion.getMax_hp());
		this.hp_bar.setBounds(20+(this.id*250), 28, 219, 26);
		this.hp_bar.setStringPainted(true);
		
	}
	//"버튼" 화면에 띄우기 + 클릭 이벤트 연결 (기본설정이니까 안건드는거 추천..ㅎㅎ)
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
	
	//"이미지" 화면에 띄우는 용도 (기본설정이니까 안건드는거 추천..ㅎㅎ)
	public void setImg(String imageFile) {
		int x = 65;
		this.Img.setIcon(new ImageIcon(Battleview1.class.getResource(this.emotion.getImage1())));
		this.Img.setBounds(x+(this.id)*250, 77, 165, 193);
		this.Img.setVisible(true);
	}
	
	//setHP 그 hp_bar 업데이트되는 메소드 여기에 둠
	public void setHp() {
		text t = text.getInstance();
		if(this.emotion.getCurr_hp() <=0) {
			this.kill();//죽이기 메소드
			return;
		}
		
		if ( (double)this.emotion.getCurr_hp()/(double)this.emotion.getMax_hp() <= 0.3) {
			this.wAttackButton.setEnabled(true);
			t.updateText(this.emotion.name+"의 무기 공격 버튼이 활성화 되었습니다. ");
		}
		
		this.hp_bar.setValue(this.emotion.getCurr_hp());
		this.hp_bar.repaint();
		
		
	}
	
	//죽였을 때, 버튼 disable + 그림 바뀌기 해놓음
	public void kill() {
		this.attackButton.setEnabled(false);
		this.healButton.setEnabled((false));
		this.wAttackButton.setEnabled(false);
		hp_bar.setValue(0);
		hp_bar.setEnabled(false);   
		this.Img.setIcon(new ImageIcon(Battleview1.class.getResource(this.emotion.getImage2())));
	}
	
	//후에 턴 바뀌는거 disable했다 enable했다 막 이러면
	//이렇게 쓰일 거 같아서 일단 만들어 놓음
	public void disable() {
		this.attackButton.setEnabled(false);
		this.healButton.setEnabled((false));
		this.wAttackButton.setEnabled(false);
	}
	
	public void enable() {
		this.attackButton.setEnabled(true);
		this.healButton.setEnabled((true));
		this.wAttackButton.setEnabled(true);
	}

}
