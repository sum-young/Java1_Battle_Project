// 시험보는 날

package situation;

import emotion.*;

public class Exam extends Situation {

    public Exam() {
        this.situation_context = "오늘은 시험보는 날입니다.";
        this.debuff_target.add(new 기쁨이());
        this.buff_target.add(new 까칠이());
        this.buff_target.add(new 슬픔이());
    }
}
