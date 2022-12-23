package pocketmonrpg;

public class Enemyeevee extends Enemy {
	public Enemyeevee() {
		super("이브이", 110, 104, 121, new Item[4]);
		items[0] = new Item("파워렌즈", 1, 1, 0, 0, 0);
		items[1] = new Item("파워벨트", 2, 2, 0, 1, 1);
		items[2] = new Item("파워밴드", 3, 3, 2, 2, 2);
		items[3] = new Item("파워웨이트", 3, 3, 3, 3, 3);
	}
}
