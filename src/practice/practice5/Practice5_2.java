package practice.practice5;

public class Practice5_2 {
	public static void email(String title, String address, String text) {
		System.out.println( address + "に、以下のメールを送信しました。");
		System.out.println("件名：" + title);
		System.out.println("本文：" + text);
	}
	
	public static void email(String address, String text) {
		System.out.println( address + "に、以下のメールを送信しました。");
		System.out.println("本文：無題");
		System.out.println("本文：" + text);
	}
// Practice5_2	
//	public static void main(String[] args) {
//		email("test", "brother", "I'm hugry");
//	}
	
//	Practice5_3
	public static void main(String[] args) {
		email("sister", "i'm full");
	}
	
}
