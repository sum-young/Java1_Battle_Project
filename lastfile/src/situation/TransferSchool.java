// 전학 간 날 클래스

package situation;

import emotion.*;

public class TransferSchool extends Situation {
    public TransferSchool() {
        this.situation_context = "오늘은 전학간 날입니다. \n 버프 대상: 까칠이 \\n 디버프대상: 기쁨이";
        this.buff_target.add(new 까칠이());
        this.debuff_target.add(new 기쁨이());

    }
}
