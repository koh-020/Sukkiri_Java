package practice.practice11;

public class Computer extends TangibleAsset {
	String makerName;
	
//	コンストラクタ
	public Computer(String name, int price, String color, String makerName, double weight) {
		this.name = name;
		this.price = price;
		this.color = color;
		this.makerName = makerName;
		this.weight = weight;
	}
	
//	追加メソッド
	public String getMakerName() {
		return this.makerName;
	}

}
