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
			int damage = (h.hp / 5);
			h.hp -= damage;
			System.out.println( damage + "ポイントのダメージ！");
			this.limit --;
		}
	}
}
