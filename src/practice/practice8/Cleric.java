package practice.practice8;

import java.util.Random;

public class Cleric {
	String name;
	int hp = 50;
	final int MAX_HP = 50;
	int mp = 10;
	final int MAX_MP = 10;

	//	セルフエイド
	public void selfAid() {
		this.mp -= 5;
		this.hp = MAX_HP;
		System.out.println(this.name + "はMP" + 5 + "を消費して体力を全回復した！");
	}

	//	祈る
	public int pray(int sec) {
		int recover = new Random().nextInt(2) + sec;
		int recoverActual = Math.min(this.MAX_MP - this.mp, recover);
		this.mp += recoverActual;
		System.out.println(this.name + "のMPは" + this.mp + "まで回復した！");
		return this.mp;
	}
}
