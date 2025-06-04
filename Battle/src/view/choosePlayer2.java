package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import main.Main;

import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class choosePlayer2 extends JFrame {
	
	

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

	public int cnt2=0;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					choosePlayer2 frame = new choosePlayer2();
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
	
	public void handleSelect(int n) {
		Main.setPlayers(n, 2);
		cnt2++;
		
		if(cnt2==3) {
			Battle1 battle1 = Battle1.getInstance();
			Battle2 battle2 = Battle2.getInstance();
			battle1.setVisible(true);
			battle2.setVisible(true);
			
			for(int i=0; i<Main.player_list.get(0).size(); i++){
				System.out.println(Main.player_list.get(1).get(i).name);
			}
			dispose();
		}
	}
	
	public choosePlayer2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 831, 585);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		joyImg = new JLabel("");
		joyImg.setIcon(new ImageIcon(choosePlayer2.class.getResource("/images/기쁨이.png")));
		joyImg.setBounds(65, 23, 144, 193);
		contentPane.add(joyImg);
		
		joySelectButton = new JButton("기쁨이");
		joySelectButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				handleSelect(1);
			}
		});
		joySelectButton.setBounds(45, 226, 183, 39);
		contentPane.add(joySelectButton);
		
		sadImg = new JLabel("");
		sadImg.setIcon(new ImageIcon(choosePlayer2.class.getResource("/images/슬픔이.png")));
		sadImg.setBounds(312, 23, 159, 193);
		contentPane.add(sadImg);
		
		sadSelectButton = new JButton("슬픔이");
		sadSelectButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				handleSelect(2);
			}
		});
		sadSelectButton.setBounds(304, 226, 183, 39);
		contentPane.add(sadSelectButton);
		
		angerImg = new JLabel("");
		angerImg.setIcon(new ImageIcon(choosePlayer2.class.getResource("/images/버럭이.png")));
		angerImg.setBounds(587, 23, 159, 193);
		contentPane.add(angerImg);
		
		angerSelectButton = new JButton("버럭이");
		angerSelectButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				handleSelect(3);
			}
		});
		angerSelectButton.setBounds(574, 226, 183, 39);
		contentPane.add(angerSelectButton);
		
		fearImg = new JLabel("");
		fearImg.setIcon(new ImageIcon(choosePlayer2.class.getResource("/images/소심이.png")));
		fearImg.setBounds(471, 283, 131, 193);
		contentPane.add(fearImg);
		
		fearSelectButton = new JButton("소심이");
		fearSelectButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				handleSelect(5);
			}
		});
		fearSelectButton.setBounds(449, 486, 183, 39);
		contentPane.add(fearSelectButton);
		
		disgustSelectButton = new JButton("까칠이");
		disgustSelectButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				handleSelect(4);
			}
		});
		disgustSelectButton.setBounds(178, 486, 183, 39);
		contentPane.add(disgustSelectButton);
		
		disgustImg = new JLabel("");
		disgustImg.setIcon(new ImageIcon(choosePlayer2.class.getResource("/images/까칠이.png")));
		disgustImg.setBounds(195, 283, 144, 193);
		contentPane.add(disgustImg);
	}

}
