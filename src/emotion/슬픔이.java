package emotion;
public class 슬픔이 extends Emotion {

	public 슬픔이(String name, int hp, int power, String img1, String img2) {
		super(name, hp, power, img1, img2);
		// TODO Auto-generated constructor stub
	}

	public void attack(Emotion target){
		int power = super.getPower() + super.getWeapon().getPower();
		target.setHp(target.getHp()-power);
		System.out.println(">슬픔이가 눈물을 흘립니다ㅠㅠㅠ 너무 슬펴져서 힘이 깎입니다:(");
    }

}
