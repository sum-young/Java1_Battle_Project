package weapon;
public class Weapon {
    public String name;
    private int power;
    
    // 생성자
    public Weapon(String name, int power) {
    	this.name = name;
    	this.power = power;
    }
    
    
    // Getter,Setter
    public int getPower(){
        return power;
    }

    public void setPower(int power){
    	this.power=power;
    }

}
