package practice.practice17;

public class Practice17_3 {
	public static void main(String[] args) {
		try {
			int i = Integer.parseInt("三");
		} catch (NumberFormatException e) {
			e.getMessage();
		}
		
		
	}
}
