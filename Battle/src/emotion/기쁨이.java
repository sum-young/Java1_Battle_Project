package emotion;

import weapon.Weapon;

public class 기쁨이 extends Emotion {

    public 기쁨이() {
    	this.name = "기쁨이";
    	this.max_hp = 120;
    	this.curr_hp = max_hp;
    	this.attack_power = 15;
    	this.heal_power = 12;
    	this.weapon = new Weapon("비눗방울",(25));	
    	this.image1 = "/images/기쁨이.png"; 
    	this.image2 = "/images/기쁨이 사망.png"; 
	}

//	public void attack(Emotion target){
//		int power = super.getAttack_power() + super.getWeapon().getPower();
//		target.setCurr_hp(target.getCurr_hp()-power);
//		System.out.println(">기쁨이가 비눗방울을 날립니다! 보글보글보글...");
//    }

}
