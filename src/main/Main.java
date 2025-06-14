package main;
import emotion.*;
//import view.selectE1;
import weapon.Weapon;
import situation.*;
import java.util.*;


public class Main {	
	
	//플레이어 벡터 Main 클래스의 전역변수로 선언. default라 다른 패키지에서 못쓰니까 get, set 메소드 만듦
	public static Vector<Vector<Emotion>> player_list = new Vector<>();
	static {
	    for (int i = 0; i < 1; i++) {
	        player_list.add(new Vector<>()); // 2개의 빈 벡터 추가
	    }
	}
	 //플레이어 벡터 각각 만들면 코드 너무 겹쳐서 그냥 2차원 벡터로함.
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		
		//테스트용 임시 감정 고르기 
		for(int i=0; i<3; i++) {
			System.out.println("감정고르기(3개)");
			int n = sc.nextInt();
			setPlayers(n, 1);
		}
		
		//상황 랜덤으로 주어지게 하기
		Situation s = new Situation();
		int situation_random = (int)Math.random()*100%2; //상황추가되면 여기 나누는거 바꾸기
		
		switch(situation_random) {
		case 0:
			s = new Monday();
			break;
		case 1:
			s = new Win();
			break;
		case 2: //시험 보는 날
			
		case 3: //전학 간 날
		}
		
		//상황 관련 상태 안내문 (나중에 텍스트창에 띄워도 나쁘지 않을듯)
		s.showSituation();
		s.give_buff();
		s.give_debuff();
		
		
		
		
	}
	
	//getPlayers: 플레이어 1/2를 인수로 받아서, 플레이어 벡터 리턴
	public static Vector<Emotion> getPlayers(int n) {
		if (n ==0 ) {
			return player_list.get(0);
		}
		else {
			return player_list.get(1);
		}
	}
	
	//setPlayers: 플레이어 배열에 선택한 감정들 추가해주기 (버튼 클릭 -> 해당 번호 인자로 전달 -> switch문)
	public static void setPlayers(int n, int player) {
		player--;
		switch(n) {
		case 1:
			player_list.get(player).add(new 기쁨이());
			return;
		case 2:
			player_list.get(player).add(new 슬픔이());
			return;
		case 3:
			player_list.get(player).add(new 버럭이());
		case 4:
			player_list.get(player).add(new 까칠이());
		case 5:
			player_list.get(player).add(new 소심이());
		}
		
	}

}