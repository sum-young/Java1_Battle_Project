package emotion;

import weapon.Weapon;

public class 슬픔이 extends Emotion {

	public 슬픔이() {
		this.name = "슬픔이";
		this.max_hp = 100;
		this.curr_hp = max_hp;
		this.attack_power = 20;
		this.heal_power = 10;
		this.weapon = new Weapon("눈물", 25);		
		this.image1 = "/images/슬픔이.png"; 
		this.image2 = "/images/슬픔이 사망.png"; 
	}
	
	public void attack(Emotion target) {
		super.attack(target);
		System.out.println("슬픔이가 슬픔 감정 구슬을 던집니다! :(");
	}

	public void weaponAttack(Emotion target){
		super.attack(target);
		System.out.println(">슬픔이가 눈물을 흘립니다ㅠㅠㅠ 너무 슬펴져서 힘이 깎입니다:(");
    }

}
