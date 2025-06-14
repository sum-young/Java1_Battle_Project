package emotion;

import myInterface.*;
import weapon.Weapon;
import view.*;

public abstract class Emotion implements Attackable, Healable, Buffable, Debuffable {
	public String name;
	protected int max_hp;
	protected int curr_hp;
	protected int attack_power;
	protected int heal_power;
	protected String image1;
	protected String image2;
	protected Weapon weapon;
	public boolean state = true;
	protected text t = text.getInstance();

    public void show_view(){
    	System.out.println("====================================");
    	System.out.printf("%8s %5d %5d %8s\n", name, curr_hp, attack_power, weapon.name);
    	System.out.println("====================================");
    }
    
    public void attack(Emotion target) {
    	target.setCurr_hp(target.getCurr_hp() - this.attack_power);
		String s = this.name + "가 " + target.name + "를 공격합니다!"; 
		t.updateText(s);
    }
    
    public void weaponAttack(Emotion target){
    	System.out.println("이거 실행됨");
		target.setCurr_hp(target.getCurr_hp() - this.weapon.getPower());
		String s = this.name + "가 " + this.weapon.name + "으로 " +target.name+"를 공격합니다.";
		t.updateText(s);

    }
    
    public void heal() {
		int random_num = (int)(Math.random() * 100 % 2); //2의 배수면 힐 성공, 아니면 실패
		if(random_num == 0) {
			curr_hp = (this.curr_hp + heal_power) < max_hp ? this.curr_hp+=heal_power : max_hp;
			
			String s = this.name +"가 힐을 성공했습니다.\n"+"hp가 " + heal_power + "만큼 추가되어 " + this.curr_hp + " 됐습니다!";
			if (t != null) t.updateText(s);
		}
		else {
			String s = this.name+"가 힐을 실패했습니다ㅠㅠ";
			t.updateText(s);
			return;
		}
	}
    
    public void debuff() {
    	this.attack_power *= 0.97;
    }
    public void buff() {
    	this.attack_power *= 1.05;
    }

	
    //Getter,Setter
    public int getMax_hp() {
		return max_hp;
	}

	public void setMax_hp(int max_hp) {
		this.max_hp = max_hp;
	}

	public int getCurr_hp() {
		return curr_hp;
	}

	public void setCurr_hp(int curr_hp) {
		this.curr_hp = curr_hp;
	}

	public int getAttack_power() {
		return attack_power;
	}

	public void setAttack_power(int attack_power) {
		this.attack_power = attack_power;
	}

	public int getHeal_power() {
		return heal_power;
	}

	public void setHeal_power(int heal_power) {
		this.heal_power = heal_power;
	}

	public String getImage1() {
		return image1;
	}

	public void setImage1(String image1) {
		this.image1 = image1;
	}

	public String getImage2() {
		return image2;
	}

	public void setImage2(String image2) {
		this.image2 = image2;
	}

	public Weapon getWeapon() {
		return weapon;
	}

	public void setWeapon(Weapon weapon) {
		this.weapon = weapon;
	}

}
