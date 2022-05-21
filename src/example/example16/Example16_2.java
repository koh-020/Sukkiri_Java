package example.example16;
import java.util.ArrayList;
import java.util.Iterator;


public class Example16_2 {
	public static void main(String[] args) {
		ArrayList <String> names = new ArrayList<>();
		names.add("湊");
		names.add("アサカ");
		names.add("菅原");
		Iterator<String> it = names.iterator();
		while (it.hasNext()) {
			String e = it.next();
			System.out.println(e);
		}
		
	}
}
