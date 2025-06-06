package situation;

import emotion.*;
import main.*; 

public class Monday extends Situation {
	
	public Monday() {
		this.situation_context = "오늘은 월요일입니다. \n 버프 대상: 까칠이, 버럭이 \\n 디버프대상: 기쁨이";
		this.buff_target.add(new 까칠이());
		this.buff_target.add(new 버럭이());
		this.debuff_target.add(new 기쁨이());
	}
	
}
