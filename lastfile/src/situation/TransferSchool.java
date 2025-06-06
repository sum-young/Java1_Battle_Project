// 전학 간 날 클래스

package situation;

import emotion.*;

public class TransferSchool extends Situation {
    public TransferSchool() {
        this.situation_context = "오늘은 전학간 날입니다.";
        this.buff_target.add(new 까칠이());
        this.debuff_target.add(new 기쁨이());

    }
}
