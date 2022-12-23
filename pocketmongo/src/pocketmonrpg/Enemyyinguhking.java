package pocketmonrpg;

public class Enemyyinguhking extends Enemy {
	
	public Enemyyinguhking() {
		super("잉어킹", 45, 50, 80, new Item[3]);
		items[0] = new Item("파워렌즈", 1, 1, 0, 0, 0);
		items[1] = new Item("파워벨트", 2, 2, 0, 1, 1);
		items[2] = new Item("파워밴드", 3, 3, 2, 2, 2);
	}
}
