package ����;

import ����.*;
import skill.*;

public class ���� implements Attackable, Healable {
	
	protected String name;
	protected int hp;
	protected int power;
	protected int heal;
	protected Weapon weapon;
	
	//�Ϲ� ����
	public void �����ϱ�(���� target) {
		target.setHp(target.getHp()-this.power);
	}
	
	public void ���ϱ�() {
		int random_num = (int)(Math.random()*100%2); //2�� ����� �� ����, �ƴϸ� ����
		if(random_num == 0) {
			this.hp += heal;
		}
		else {
			return;
		}
	}
	
	public void �����() {
		
	}
	
	public void ����() {
		
	}

	
	
	//getter, setter �޼ҵ�
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
