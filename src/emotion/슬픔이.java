package emotion;
public class 슬픔이 extends Emotion {

	public 슬픔이() {

	}

	public void attack(Emotion target){
		int power = super.getPower() + super.getWeapon().getPower();
		target.setHp(target.getHp()-power);
		System.out.println(">슬픔이가 눈물을 흘립니다ㅠㅠㅠ 너무 슬펴져서 힘이 깎입니다:(");
    }

}