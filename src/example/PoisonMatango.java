package example;

public class PoisonMatango extends Matango{
	int limit;
	
	public PoisonMatango(char suffix) {
		super(suffix);
		this.suffix = suffix;
		this.limit = 5;
	}
	
	public void attack(Hero h) {
		super.attack(h);
		if (this.limit > 0) {
			System.out.println("さらに毒の奉仕をばらまいた！");
			int damagePoint = (h.getHp() / 5);
			damage(h, damagePoint);
			System.out.println( damagePoint + "ポイントのダメージ！");
			this.limit --;
		}
	}
	
	public void damage(Hero h, int damage) {
		h.setHp(h.getHp() - damage);
	}
}
