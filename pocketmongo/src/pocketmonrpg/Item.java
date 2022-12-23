package pocketmonrpg;

public class Item {
	String name;
	int hp;
	int mp;
	int attack;
	int ultimate_attack;
	int shield;
	
	public Item(String name, int hp, int mp, int attack, int ultimate_attack, int shield) {
		super();
		this.name = name;
		this.hp = hp;
		this.mp = mp;
		this.attack = attack;
		this.ultimate_attack = ultimate_attack;
		this.shield = shield;
	}

	@Override
	public String toString() {
		String status = name;
		return status;
	}		
}
