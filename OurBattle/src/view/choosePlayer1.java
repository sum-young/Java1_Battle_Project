package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import main.*;



public class choosePlayer1 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel joyImg;
	private JButton joySelectButton;
	private JLabel sadImg;
	private JButton sadSelectButton;
	private JLabel angerImg;
	private JButton angerSelectButton;
	private JLabel disgustImg;
	private JButton disgustSelectButton;
	private JLabel fearImg;
	private JButton fearSelectButton;

	public int cnt=0;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					choosePlayer1 frame = new choosePlayer1();
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
	// 선택버튼 눌렸을 시 공통 처리 메소드
	public void handleSelect(int n) {
		Main.setPlayers(n, 1);
		cnt++;
		
		if(cnt==3) {
			new choosePlayer2().setVisible(true);
			
			for(int i=0; i<Main.player_list.get(0).size(); i++){
				System.out.println(Main.player_list.get(0).get(i).name);
			}
			dispose();
		}
	}
	
	
	public choosePlayer1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 842, 595);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		joyImg = new JLabel("");
		joyImg.setIcon(new ImageIcon(choosePlayer1.class.getResource("/images/기쁨이.png")));
		joyImg.setBounds(66, 23, 144, 193);
		contentPane.add(joyImg);
		
		joySelectButton = new JButton("기쁨이");
		joySelectButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				handleSelect(1);
			}
		});
		joySelectButton.setBounds(46, 226, 183, 39);
		contentPane.add(joySelectButton);
		
		sadImg = new JLabel("");
		sadImg.setIcon(new ImageIcon(choosePlayer1.class.getResource("/images/슬픔이.png")));
		sadImg.setBounds(313, 23, 159, 193);
		contentPane.add(sadImg);
		
		sadSelectButton = new JButton("슬픔이");
		sadSelectButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				handleSelect(2);
			}
		});
		sadSelectButton.setBounds(305, 226, 183, 39);
		contentPane.add(sadSelectButton);
		
		angerImg = new JLabel("");
		angerImg.setIcon(new ImageIcon(choosePlayer1.class.getResource("/images/버럭이.png")));
		angerImg.setBounds(588, 23, 159, 193);
		contentPane.add(angerImg);
		
		angerSelectButton = new JButton("버럭이");
		angerSelectButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				handleSelect(3);
			}
		});
		angerSelectButton.setBounds(575, 226, 183, 39);
		contentPane.add(angerSelectButton);
		
		disgustImg = new JLabel("");
		disgustImg.setIcon(new ImageIcon(choosePlayer1.class.getResource("/images/까칠이.png")));
		disgustImg.setBounds(196, 283, 144, 193);
		contentPane.add(disgustImg);
		
		disgustSelectButton = new JButton("까칠이");
		disgustSelectButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				handleSelect(4);
			}
		});
		disgustSelectButton.setBounds(179, 486, 183, 39);
		contentPane.add(disgustSelectButton);
		
		fearImg = new JLabel("");
		fearImg.setIcon(new ImageIcon(choosePlayer1.class.getResource("/images/소심이.png")));
		fearImg.setBounds(472, 283, 131, 193);
		contentPane.add(fearImg);
		
		fearSelectButton = new JButton("소심이");
		fearSelectButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				handleSelect(5);
			}
		});
		fearSelectButton.setBounds(450, 486, 183, 39);
		contentPane.add(fearSelectButton);
	}
}
