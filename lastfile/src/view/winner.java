package view;

import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import emotion.Emotion;
import main.Main;

import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;

public class winner extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtWinner;
	private JLabel e1;
	private JLabel e2;
	private JLabel e3;
	public CharUI[] charUI = new CharUI[3];

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					winner frame = new winner();
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
	public winner() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 810, 504);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtWinner = new JTextField();
		txtWinner.setBounds(302, 26, 120, 72);
		txtWinner.setFont(new Font("굴림", Font.BOLD, 30));
		txtWinner.setText("Winner!");
		contentPane.add(txtWinner);
		txtWinner.setColumns(10);
		
		e1 = new JLabel("");
		e1.setBounds(35, 186, 195, 215);
		contentPane.add(e1);
		
		e2 = new JLabel("");
		e2.setBounds(302, 186, 195, 215);
		contentPane.add(e2);
		
		e3 = new JLabel("");
		e3.setBounds(566, 186, 195, 215);
		contentPane.add(e3);
		
		
	}
	
	// 이긴 플레이어의 이미지만 추가
	public winner(Emotion e1, Emotion e2, Emotion e3) {
		this.e1.setIcon(new ImageIcon(winner.class.getResource(e1.getImage1())));
		this.e2.setIcon(new ImageIcon(winner.class.getResource(e2.getImage1())));
		this.e3.setIcon(new ImageIcon(winner.class.getResource(e3.getImage1())));
	}
	
}
