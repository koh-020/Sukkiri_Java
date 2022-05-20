package practice.practice15;

public class Practice15_1 {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		for (int i = 1; i <= 100; i++) {
			sb.append(i + ",");
		}
		String s = sb.toString();
		System.out.print(s);
		String[] a = s.split(",");
	}
}