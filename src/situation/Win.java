//하키시합 이긴 클래스
package situation;

import emotion.*;

public class Win extends Situation{

	public Win() {
		this.situation_context = "오늘은 월요일입니다.";
		this.buff_target.add(new 기쁨이());
	}
}