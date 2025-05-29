package situation;

import emotion.*;
import main.*;
import main.Main;

import java.util.*;

public class Situation {
	
	public String situation_context;
	//이거 버프/디버프 타겟을 배열/벡터로 정의하면 같은 코드 적는거 좀 줄일 수 있을 거 같아서 이렇게 바꿈...
	protected Vector<Emotion> buff_target = new Vector<>();
	protected Vector<Emotion> debuff_target = new Vector<>();
	
	public void give_buff() {
		if(this.buff_target.isEmpty()) {
			return;
		}
		for (Emotion target : this.buff_target) { 
			for(int i=0; i<Main.player_list.size(); i++) { 
				for(Emotion p : Main.getPlayers(i)) { 
					if(p.getClass() == target.getClass()) { 
						p.buff();
					}
				}
			}
		}
	}
	
	public void give_debuff() {
		if(this.debuff_target.isEmpty()) {
			return;
		}
		for (Emotion target : this.debuff_target) { 
			for(int i=0; i<Main.player_list.size(); i++) { 
				for(Emotion p : Main.getPlayers(i)) { 
					if(p.getClass() == target.getClass()) { 
						p.debuff();
					}
				}
			}
		}
		
	}
	
	public void showSituation() {
		System.out.println(this.situation_context);
	}

}
