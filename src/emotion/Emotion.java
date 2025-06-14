package emotion;
import myInterface.Attackable;
import weapon.Weapon;

public abstract class Emotion implements Attackable {
    private Weapon weapon;
    private int hp;
    private int attack_power;
    public String name;
    private String imgFile1;
    private String imgFile2;
    
    public void debuff() {
    	System.out.println(this.name+"이 디버프를 받습니다.");
    }
    
    public void buff() {
    	System.out.println(this.name+"이 버프를 받습니다.");
    	
    }

    public void show_view(){
    	System.out.println("====================================");
    	System.out.printf("%8s %5d %5d %8s\n", name, hp, attack_power, weapon.name);
    	System.out.println("====================================");
    }
    public abstract void attack(Emotion target); 
   
    //Getter,Setter
    public Weapon getWeapon(){
        return weapon;
    }
    public void setWeapon(Weapon weapon){
    	this.weapon = weapon;
    }
    public int getPower(){
        return attack_power;
    }
    public void setPower(int power){
    	this.attack_power = power;
    }
    public int getHp(){
        return hp;
    }
    public void setHp(int hp){
    	this.hp=hp;
    }
	public String getImgFile1() {
		return imgFile1;
	}
	public void setImgFile1(String imgFile1) {
		this.imgFile1 = imgFile1;
	}

	public String getImgFile2() {
		return imgFile2;
	}
	public void setImgFile2(String imgFile2) {
		this.imgFile2 = imgFile2;
	}

}
