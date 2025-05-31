//월요일 클래스
package situation;
// import main.*;는 여기서 필요없어서 삭제
import emotion.*;

public class Monday extends Situation {

	public Monday() {
		this.situation_context = "오늘은 월요일입니다.";
		this.buff_target.add(new 까칠이());
		this.buff_target.add(new 버럭이());
		this.debuff_target.add(new 기쁨이());
	}

}