package emotion;

import weapon.Weapon;

public class 까칠이 extends Emotion {

	public 까칠이() {
		this.name = "까칠이";
		this.max_hp = 80;
		this.curr_hp = max_hp;
		this.attack_power = 20;
		this.heal_power = 7;
		this.weapon = new Weapon("눈빛레이저", 15);		
		this.image1 = "/images/까칠이.png"; 
		this.image2 = "/images/까칠이 사망.png"; 
	}
	
	public void attack(Emotion target) {
		super.attack(target);
		System.out.println("까칠이가 예민 감정 구슬을 던집니다! :(");
	}

	public void weaponAttack(Emotion target){
		super.weaponAttack(target);
		t.updateText(">까칠이가 눈빛레이저를 발사했습니다! 위이이잉");
    }

}
