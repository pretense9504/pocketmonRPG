package pocketmonrpg;

public class Leesanghaessi extends Pocketmon {

	public Leesanghaessi() {
		super("이상해씨", "플", 128, 20, 118, 138, 111);
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
		System.out.println(name + "이(가) 덩굴채찍 발동! " + en.name + "에게 " + damage  + "만큼 피해를 줬다! 효과는 굉장했다!");
		mp -= 10;
		status();	
	}
}