package practice.practice11;

public abstract class TangibleAsset extends Asset implements Thing{
	String name;
	int price;
	String color;
	double weight;

	
//	メソッド
	public String getName() {
		return this.name;
	}
	public int getPrice() {
		return this.price;
	}
	public String getColor() {
		return this.color;
	}
	
	public double getWeight() {
		return this.weight;
	}
}
