package example.example16;
import java.util.ArrayList;

public class Example16_1 {
	public static void main(String[] args) {
		ArrayList<Integer> points = new ArrayList<Integer>();
		points.add(10);
		points.add(80);
		points.add(75);
		for (int i : points) {
			System.out.println(i);
		}
		Integer i1 = Integer.valueOf(30);
		System.out.println(i1);
		System.out.println(40 + i1);
	}

}
