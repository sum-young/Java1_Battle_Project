package emotion;

import weapon.Weapon;

public class 소심이 extends Emotion {

	public 소심이() {
		this.name = "소심이";
		this.max_hp = 85;
		this.curr_hp = max_hp;
		this.attack_power = 10;
		this.heal_power = 15;
		this.weapon = new Weapon("걱정폭탄", 15);		
		this.image1 = "/images/소심이.png"; 
		this.image2 = "/images/소심이 사망.png"; 
	}

//	public void attack(Emotion target){
//		int power = super.getPower() + super.getWeapon().getPower();
//		target.setHp(target.getHp()-power);
//		System.out.println(">소심이가 걱정 폭탄을 투하했습니다! 콰과ㅘ앙카ㅏㅏㅇ");
//    }

}
