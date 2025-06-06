package situation;

import emotion.기쁨이;
import emotion.까칠이;
import emotion.버럭이;

public class Win extends Situation{

	public Win() {
		this.situation_context = "오늘은 하키 시합에서 이긴 날입니다. \n 버프 대상: 기쁨이 \n 디버프대상:  없음";
		this.buff_target.add(new 기쁨이());
	}
}