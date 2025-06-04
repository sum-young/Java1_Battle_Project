package situation;

import emotion.기쁨이;
import emotion.까칠이;
import emotion.버럭이;

public class Win extends Situation{

	public Win() {
		this.situation_context = "오늘은 월요일입니다.";
		this.buff_target.add(new 기쁨이());
	}
}