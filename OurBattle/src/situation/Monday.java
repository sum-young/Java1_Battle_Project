package situation;

import emotion.*;
import main.*; 

public class Monday extends Situation {
	
	public Monday() {
		this.situation_context = "오늘은 월요일입니다.";
		this.buff_target.add(new 까칠이());
		this.buff_target.add(new 버럭이());
		this.debuff_target.add(new 기쁨이());
	}
	
}
