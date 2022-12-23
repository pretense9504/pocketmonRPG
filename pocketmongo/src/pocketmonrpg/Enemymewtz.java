package pocketmonrpg;

public class Enemymewtz extends Enemy {
	
	public Enemymewtz() {
		super("뮤츠", 214, 300, 182, new Item[5]);
		items[0] = new Item("파워렌즈", 1, 1, 0, 0, 0);
		items[1] = new Item("파워벨트", 2, 2, 0, 1, 1);
		items[2] = new Item("파워밴드", 3, 3, 2, 2, 2);
		items[3] = new Item("파워웨이트", 3, 3, 3, 3, 3);
		items[4] = new Item("파워앵클릿", 5, 5, 5, 5, 5);
		
	}
	
	
}
