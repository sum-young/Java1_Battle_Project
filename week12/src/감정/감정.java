package 감정;

import 무기.*;
import skill.*;

public class 감정 implements Attackable, Healable {
	
	protected String name;
	protected int hp;
	protected int power;
	protected int heal;
	protected Weapon weapon;
	
	//일반 공격
	public void 공격하기(감정 target) {
		target.setHp(target.getHp()-this.power);
	}
	
	public void 힐하기() {
		int random_num = (int)(Math.random()*100%2); //2의 배수면 힐 성공, 아니면 실패
		if(random_num == 0) {
			this.hp += heal;
		}
		else {
			return;
		}
	}
	
	public void 디버프() {
		
	}
	
	public void 버프() {
		
	}

	
	
	//getter, setter 메소드
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}

	public int getHeal() {
		return heal;
	}

	public void setHeal(int heal) {
		this.heal = heal;
	}

	public Weapon getWeapon() {
		return weapon;
	}

	public void setWeapon(Weapon weapon) {
		this.weapon = weapon;
	}
	

}
