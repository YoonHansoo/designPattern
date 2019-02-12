package designPattern.strategypattern;

public class StrategyMain {
	public static void main(String[] args) {
		Warrior warrior = new Warrior();
		warrior.attack();
		Sword sword = new Sword();
		warrior.setWeapon(sword);
		warrior.attack();
		Bow bow =new Bow();
		warrior.setWeapon(bow);
		warrior.attack();
	}
}
