package designPattern.strategypattern;

public class Bow implements Weapon {

	@Override
	public void attack() {
		System.out.println("활 공격");
	}

}
