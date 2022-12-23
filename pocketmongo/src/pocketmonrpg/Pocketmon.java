package pocketmonrpg;

public class Pocketmon {
	String name;			// 포켓몬 이름
	String type;			// 포켓몬 타입
	int max_hp;				// 포켓몬 최대체력
	int max_mp;				// 포켓몬 최대마나
	int hp;					// 포켓몬 현재체력
	int mp;					// 포켓몬 현재마나
	int attack;				// 포켓몬 일반공격
	int ultimate_attack;	// 포켓몬 궁극공격
	int shield;				// 포켓몬 방어력
	int level;				// 포켓몬 레벨
	int exp;				// 경험치
	Item[] items;			// 아이템
	
	public Pocketmon(String name, String type, int hp, int mp,
			int attack, int ultimate_attack, int shield) {
		super();
		this.name = name;
		this.type = type;
		this.max_hp = hp;
		this.max_mp = mp;
		this.hp = this.max_hp;
		this.mp = this.max_mp;
		this.attack = attack;
		this.ultimate_attack = ultimate_attack;
		this.shield = shield;
		this.level = 1;
		this.exp = 0;
		this.items = new Item[10];
	}
	
	// 현재상태를 나타내는 메소드
	public void status() {
		System.out.println("◆◆◆◆◆◆◆◆◆◆현재상태◆◆◆◆◆◆◆◆◆◆");
		System.out.println("포켓몬 : " + name);
		System.out.println("레벨 : " + level + "[" + exp + "/100]");
		System.out.println("체력 : " + hp + "/" + max_hp);
		System.out.println("마나 : " + mp + "/" + max_mp);
		System.out.println("공격력 : " + attack);
		System.out.println("방어력 : " + shield);
		System.out.println("◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆");
		
		System.out.println();		
		System.out.println("◆◆◆◆◆◆◆◆◆◆보유 아이템◆◆◆◆◆◆◆◆◆◆");
		for (int i = 0; i < items.length; i++) {
			if(items[i] != null) {
				System.out.println(items[i]);
			}
		}
		System.out.println("◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆");
		
		System.out.println();		
	}
	
	// 일반공격 메소드
	public void attack(Enemy en) {
		int damage = attack - en.shield;
		damage = damage <= 0 ? 1 : damage;
		en.hp = en.hp < damage ? en.hp - en.hp : en.hp - damage;
		System.out.println(name + "이(가) 공격! " + en.name + "에게 " + damage + "만큼 피해를 줬다!");
		
		System.out.println();		
	}
	
	// 궁극공격 메소드
	public void ultimateAttack(Enemy en) {
		System.out.println(name + " 필살기 발동!!!");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		int damage = ultimate_attack - en.shield;
		damage = damage <= 0 ? 1 : damage;
		en.hp = en.hp < damage ? en.hp - en.hp : en.hp - damage;
		System.out.println(name + "이(가) 궁극기이름발동! " + en.name + "에게 " + damage  + "만큼 피해를 줬다! 효과는 굉장했다!");
		status();
		
		System.out.println();
	}
	
	// 경험치 획득 메소드
	void getExp(int exp) {
		System.out.println(exp + "만큼 경험치 획득!");
		this.exp += exp;
		while(100 <= this.exp){
			levelUp();
			this.exp -= 100;
		}
		
		System.out.println();
	}
	
	// 경험치 충족 시 레벨업, 능력치 증가 + 아이템을 획득하는 메소드
	void levelUp() {
		level++;
		max_hp += 5;
		max_mp += 3;
		attack += 3;
		ultimate_attack += 5;
		shield += 3;
		hp = max_hp;
		mp = max_mp;
		System.out.println(name + "이(가) 레벨업을 했습니다! 축하합니다!");
		
		System.out.println();
	}
	
	// 아이템 획득 능력치 증가 메소드
	void getItem(Item item) {
		System.out.println(item.name + "를(을) 획득!");
		for (int i = 0; i < items.length; i++) {
			if(items[i] == null) {
				items[i] = item;
				break;
			}
		}
		max_hp += item.hp;
		max_mp += item.mp;
		attack += item.attack;
		ultimate_attack += item.ultimate_attack;
		shield += item.shield;
		
		System.out.println();
	}
	
	// mp 소모가능 여부 메소드
	public boolean check_mp(int need_mp) {
		if(mp < need_mp) {
			System.out.println(name + "이(가) 스킬을 사용하는데 마나가 부족합니다!!");
			return false;
		}
		return true;
	}
	
	// 죽음알림 메소드
	public void dead() {
		if(hp <= 0) {
			System.out.println("체력이 없어서 " + name + "이(가) 몬스터볼로 돌아갑니다...");
			System.out.println("당신의 " + name + "이(가) 패배했습니다.");		
			
			System.out.println();
		}
	}	
}
