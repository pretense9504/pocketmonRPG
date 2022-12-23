package pocketmonrpg;


public class Enemy {
	String name;		// 적 이름
	int max_hp;			// 적 최대체력
	int hp;				// 적 현재체력
	int attack;			// 적 공격력
	int shield;			// 적 방어력
	Item[] items;		// 아이템 랜덤함수
	
	public Enemy(String name, int hp,
			int attack, int shield, Item[] items) {
		super();
		this.name = name;
		this.max_hp = hp;
		this.hp = this.max_hp;
		this.attack = attack;
		this.shield = shield;
		this.items = items;
	}

		// 현재상태를 나타내는 메소드
		public void status() {
			System.out.println("▶▶▶▶▶▶▶▶▶▶현재상태◀◀◀◀◀◀◀◀◀◀");
			System.out.println("적포켓몬이름 : " + name);
			System.out.println("체력 : " + hp + "/" + max_hp);
			System.out.println("공격력 : " + attack);
			System.out.println("방어력 : " + shield);
			System.out.println("▶▶▶▶▶▶▶▶▶▶▶▶▶◀◀◀◀◀◀◀◀◀◀◀◀");
			
			System.out.println();
			System.out.println("▶▶▶▶▶▶▶▶▶▶보유 아이템◀◀◀◀◀◀◀◀◀◀");
			for (int i = 0; i < items.length; i++) {
				if(items[i] != null) {
					System.out.println(items[i]);
				}
			}
			System.out.println("▶▶▶▶▶▶▶▶▶▶▶▶▶◀◀◀◀◀◀◀◀◀◀◀◀");
			
			System.out.println();
		}
		
	// 일반공격 메소드	
	void attack(Pocketmon p) {
		int damage = attack - p.shield;
		damage = damage <= 0 ? 1 : damage;
		p.hp = p.hp < damage ? p.hp - p.hp : p.hp - damage;
		System.out.println(name + "이(가) 공격! " + p.name + "에게" + damage + "만큼 피해를 줬다!");
		System.out.println(p.name + "의 현재 hp :" + p.hp);
		
		System.out.println();
	}
	
	// 죽음알림 메소드
		public void dead() {
			if(hp <= 0) {
				System.out.println(name + "이(가) 그로기 상태에 빠졌습니다.");
				System.out.println(name + "이(가) 패배했습니다.");			
			}
			System.out.println();
		}
			
	// 아이템 떨구는 메소드
	Item itemDrop() {
		return items[(int)(Math.random() * items.length)];
	}	
}
