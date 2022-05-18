package practice.practice11;

public class Book extends TangibleAsset{
	String isbn;
	
//	コンストラクタ
	public Book(String name, int price, String color, String isbn, double weight) {
		this.name = name;
		this.price = price;
		this.color = color;
		this.isbn = isbn;
		this.weight = weight;
	}
	
//	メソッド
	
	public String getIsbn() {
		return this.isbn;
	}

}
