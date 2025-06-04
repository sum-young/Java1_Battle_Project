package emotion;

import weapon.Weapon;

public class 버럭이 extends Emotion {

	public 버럭이() {
		this.name = "버럭이";
		this.max_hp = 110;
		this.curr_hp = max_hp;
		this.attack_power = 17;
		this.heal_power = 7;
		this.weapon = new Weapon("망치", 20);		
		this.image1 = "/images/버럭이.png"; 
		this.image2 = "/images/버럭이 사망.png"; 
	}

	public void attack(Emotion target){
		super.attack(target);
		System.out.println(">버럭이가 망치를 휘두룹니다! 쾅쾅!!");
    }

}
