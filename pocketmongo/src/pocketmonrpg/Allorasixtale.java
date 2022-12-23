package pocketmonrpg;

public class Allorasixtale extends Pocketmon {
	
	public Allorasixtale() {
		super("알로라식스테일", "얼음", 116, 20, 96, 116, 109);
	}

	@Override
	public void ultimateAttack(Enemy en) {
		if(check_mp(10) == false) {
			System.out.println("마나 부족...");
			status();
			return;
		}
		System.out.println(name + " 필살기 발동!!!");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		int damage = ultimate_attack - en.shield;
		damage = damage <= 0 ? 1 : damage;
		en.hp = en.hp < damage ? en.hp - en.hp : en.hp - damage;
		System.out.println(name + "이(가) 눈보라 발동! " + en.name + "에게 " + damage  + "만큼 피해를 줬다! 효과는 굉장했다!");
		mp -= 10;
		status();	
	}
}
