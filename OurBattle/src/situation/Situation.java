package situation;

import emotion.*;
import main.*;
// 위에 import main.*쓰고 main.Main도 썼는데, 전자가 모두 import라서 전자만 남김
import java.util.Vector;  // 교수님이 이렇게 필요한 것만 import하는 습관?들라고해서..

public class Situation {

	public String situation_context;
	protected Vector<Emotion> buff_target = new Vector<>();
	protected Vector<Emotion> debuff_target = new Vector<>();

	public void give_buff() {
		applyEffect(buff_target, true);  // true는 buff
	}

	public void give_debuff() {
		applyEffect(debuff_target, false); // false는 debuff
	}


	private void applyEffect(Vector<Emotion> targets, boolean isBuff) {
		// 버프 디버프 로직이 겹쳐서 boolean값에 따라 버프 디버프 실행하는 걸로 모듈화

		if (targets.isEmpty()) return;

		for (Emotion target : targets) {
			for (int i = 0; i < Main.player_list.size(); i++) {
				for (Emotion p : Main.getPlayers(i)) {
					if (p.getClass().equals(target.getClass())) {
						// ==가 아닌 equals()로 변경 ... 어떻게든 배운거 우겨넣기?ㅋㅋㅋㅋ
						if (isBuff) {
							p.buff();
						} else {
							p.debuff();
						}
					}
				}
			}
		}
	}
	public void showSituation() {
		System.out.println(this.situation_context);
	}
}
