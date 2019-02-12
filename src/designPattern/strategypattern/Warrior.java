package designPattern.strategypattern;

public class Warrior {

	Weapon weapon;
	
	public Warrior() {
		
	}
	
	public Warrior(Weapon weapon) {
		this.weapon = weapon;
	}
	
	public void setWeapon(Weapon weapon) {
		this.weapon = weapon;
	} 	

	public void attack() {
		if(weapon== null) {
			System.out.println("맨몸공격");
		}
		else {
		weapon.attack();
		}
	}
	
}
