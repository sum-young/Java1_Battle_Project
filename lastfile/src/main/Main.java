package main;

import emotion.*;
import java.util.*;
//import view.selectE1;
import weapon.Weapon;
import situation.*;
import view.Battleview1;
import view.Battleview2;
import view.choosePlayer1;
import view.text;
import view.winner;
import java.time.LocalDateTime;

public class Main {
	// 플레이어 벡터 Main 클래스의 전역변수로 선언. default라 다른 패키지에서 못쓰니까 get, set 메소드 만듦
	public static Vector<Vector<Emotion>> player_list = new Vector<>();
	public static Vector<Vector<Emotion>> player_list2 = new Vector<>();

	// 살아있는 팀별 수
	static public int alive_p1 = 3;
	static public int alive_p2 = 3;
	
	public static Situation s = new Situation();
	static {
		for (int i = 0; i < 2; i++) {
			player_list.add(new Vector<>()); // 2개의 빈 벡터 추가
			player_list2.add(new Vector<>());
		}
	}
	// 플레이어 벡터 각각 만들면 코드 너무 겹쳐서 그냥 2차원 벡터로함.
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		LocalDateTime now = LocalDateTime.now();
//		// 테스트용 임시 감정 고르기
//		for(int i=0;i<3;i++) {
//			System.out.println("감정 3개 고르기");
//			int n = sc.nextInt();
//			setPlayers(n, 1);
//		}

		// 선택 창 띄우기
		new choosePlayer1().setVisible(true);

		// 상황 랜덤으로 주어지게 하기
		
		int situation_random = (((int) Math.random()) * 100)+now.getSecond() % 4;

		switch (situation_random) {
		case 0:
			s = new Monday();
			break;
		case 1:
			s = new Win();
			break;
		case 2: // 시험 보는 날
			s = new Exam();
			break;
		case 3: // 전학 간 날
			s = new TransferSchool();
			break;
		}

		s.give_buff();
		s.give_debuff();

	}

	// getPlayers: 플레이어 1/2를 인수로 받아서, 플레이어 벡터 리턴
	public static Vector<Emotion> getPlayers(int n) {
		if (n == 0) {
			return player_list.get(0);
		} else {
			return player_list.get(1);
		}
	}

	// setPlayers: 플레이어 배열에 선택한 감정들 추가해주기 (버튼 클릭 -> 해당 번호 인자로 전달 -> switch문)
	public static void setPlayers(int n, int player) {

		player--;
		switch (n) {
		case 1:
			player_list.get(player).add(new 기쁨이());
			player_list2.get(player).add(new 기쁨이());
			return;
		case 2:
			player_list.get(player).add(new 슬픔이());
			player_list2.get(player).add(new 슬픔이());
			return;
		case 3:
			player_list.get(player).add(new 버럭이());
			player_list2.get(player).add(new 버럭이());
			return;
		case 4:
			player_list.get(player).add(new 까칠이());
			player_list2.get(player).add(new 까칠이());
			return;
		case 5:
			player_list.get(player).add(new 소심이());
			player_list2.get(player).add(new 소심이());
			return;
		}

	}

	// 공격하기/힐하기/무기로 공격하기 버튼 누르면 여기서 어떤게 실행되는지 결정됨
	// 인자: 플레이어1/2인지, 눌려진 버튼의 종류(공격/힐/무기), 공격자(공격하는 감정)
	public static void select_action(int player, int select, Emotion emotion) {

		Battleview1 b1 = Battleview1.getInstance();
		Battleview2 b2 = Battleview2.getInstance();
		text t = text.getInstance();

		alive_p1 = checkalive(0);
		alive_p2 = checkalive(1);

		// 랜덤하게 상대 타겟 결정
		int target_player;
		int rand = (int) (Math.random() * 100) + 1;

		if (alive_p1 != 0 && alive_p2 != 0) {
			if (player == 0) {
				target_player = 1;
				rand %= alive_p2;
			} else {
				target_player = 0;
				rand %= alive_p1;
			}

			// 공격 / 무기 공격 선택지에 따라 다르게 실행되게
			switch (select) {
			case 1:
				emotion.attack(player_list.get(target_player).get(rand));
				break;
			case 2:
				emotion.weaponAttack(player_list.get(target_player).get(rand));

			}
		}

		for (int i = 0; i < 3; i++) {
			b1.charUI[i].setHp();
			b2.charUI[i].setHp();
		}

		alive_p1 = checkalive(0);
		alive_p2 = checkalive(1);
		
		if (alive_p1 <= 0) {

			winner win = winner.getInstance();
			Emotion e1 = player_list2.get(1).get(0);
			Emotion e2 = player_list2.get(1).get(1);
			Emotion e3 = player_list2.get(1).get(2);

			win.setVisible(true);
			win.setwinner(e1, e2, e3);
			b1.dispose();
			b2.dispose();
			t.dispose();
		} else if (alive_p2 <= 0) {
			winner win = winner.getInstance();
			Emotion e1 = player_list2.get(0).get(0);
			Emotion e2 = player_list2.get(0).get(1);
			Emotion e3 = player_list2.get(0).get(2);

			System.out.println("실행됨");
			win.setVisible(true);
			win.setwinner(e1, e2, e3);
			b1.dispose();
			b2.dispose();
			t.dispose();
		}

	}

	public static int checkalive(int n) {
		int cnt = 0;
		Vector<Emotion> team = player_list.get(n);
		for (int i = team.size() - 1; i >= 0; i--) {
			if (team.get(i).state) {
				cnt++;
			} else {
				team.remove(i);
			}
		}
		return cnt;
	} 

}
