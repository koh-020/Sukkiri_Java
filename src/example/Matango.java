package example;

public class Matango {
	int hp = 50;
	char suffix;
	
	public Matango(char suffix) {
		this.suffix = suffix;
	}
	
	public void attack(Hero h) {
		System.out.println("キノコ" + this.suffix + "の攻撃！");
		System.out.println("10のダメージ");
		damage(h, 10);
	}
	
	public void run() {
		System.out.println("お化けキノコ" + this.suffix + "は逃げ出した！");
	}
	
	public void damage(Hero h, int damage) {
		h.setHp(h.getHp() - damage);
	}

}
