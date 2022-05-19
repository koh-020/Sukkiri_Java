package example;

public final class Main {
	public static void main(String[] args) {
		Hero h1 = new Hero("ミナト");
		System.out.println(h1.name + h1.getHp());
		
		Hero h2 = new Hero();
//		h2.name = "アサカ";
		
		SuperHero sh = new SuperHero();
		sh.run();
		
		Wizard w = new Wizard();
		Wand w1 = new Wand();
		w1.setName("木製の杖");
		w1.setPower(8.5);
		w.setName("スガワラ");
		w.setWand(w1);
		w.heal(h1);
		w.heal(h2);
		w.heal(h2);
		System.out.println(h1.name + h1.getHp());
//		
//		Thief t = new Thief("アサカ");
//		System.out.println("シーフの" + t.name + "が仲間になった！");
//		System.out.println("HP:" + t.hp + "　MP：" + t.mp);
//		
//		Matango m1 = new Matango('A');
//		
//		Matango m2 = new Matango('B');
//		
//		PoisonMatango pm = new PoisonMatango('A');
//		System.out.println("毒キノコ" + pm.suffix + "が現れた！");
//		
//		System.out.println("勇者" + h1.name + "を生み出しました！");
//		
//		h1.slip();
//		m1.run();
//		m2.run();
//		h1.run();
	}

}
