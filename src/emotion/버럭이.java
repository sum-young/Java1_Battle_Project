package emotion;
public class 버럭이 extends Emotion {

	public 버럭이() {
	}

	public void attack(Emotion target){
		int power = super.getPower() + super.getWeapon().getPower();
		target.setHp(target.getHp()-power);
		System.out.println(">버럭이가 망치를 휘두룹니다! 쾅쾅!!");
    }
}

