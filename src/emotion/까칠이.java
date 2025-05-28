package emotion;
public class 까칠이 extends Emotion {

	public 까칠이(String name, int hp, int power, String img1, String img2) {
		super(name, hp, power, img1, img2);
		// TODO Auto-generated constructor stub
	}

	public void attack(Emotion target){
		int power = super.getPower() + super.getWeapon().getPower();
		target.setHp(target.getHp()-power);
		System.out.println(">까칠이가 눈빛레이저를 발사했습니다! 위이이잉");
    }

}
