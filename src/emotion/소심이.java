package emotion;
public class 소심이 extends Emotion {

	public 소심이() {

	}

	public void attack(Emotion target){
		int power = super.getPower() + super.getWeapon().getPower();
		target.setHp(target.getHp()-power);
		System.out.println(">소심이가 걱정 폭탄을 투하했습니다! 콰과ㅘ앙카ㅏㅏㅇ");
    }

}