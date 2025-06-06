package situation;

import emotion.*;
import main.*;
import view.text;

// 위에 import main.*쓰고 main.Main도 썼는데, 전자가 모두 import라서 전자만 남김
import java.util.Vector;  // 교수님이 이렇게 필요한 것만 import하는 습관?들라고해서..

public class Situation {

	public String situation_context;
	protected Vector<Emotion> buff_target = new Vector<>();
	protected Vector<Emotion> debuff_target = new Vector<>();
	text t = text.getInstance();

	public void give_buff() {
		System.out.println("실행");
		for(Emotion e : buff_target) {
			e.buff();
		}
	}

	public void give_debuff() {
		System.out.println("실행");
		for(Emotion e : debuff_target) {
			e.debuff();
		}
	}


	private void applyEffect(Vector<Emotion> targets, boolean isBuff) {

		if (targets.isEmpty()) return;

		for (Emotion target : targets) {
			for (int i = 0; i < Main.player_list.size(); i++) {
				for (Emotion p : Main.getPlayers(i)) {
					if (p.getClass().equals(target.getClass())) {
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
		t.updateText(this.situation_context);
	}
}
