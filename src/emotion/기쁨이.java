package emotion;
public class 기쁨이 extends Emotion {

    public 기쁨이(String name, int hp, int power, String img1, String img2) {
		super(name, hp, power, img1, img2);
		// TODO Auto-generated constructor stub
	}

	public void attack(Emotion target){
		int power = super.getPower() + super.getWeapon().getPower();
		target.setHp(target.getHp()-power);
		System.out.println(">기쁨이가 비눗방울을 날립니다! 보글보글보글...");
    }

}
