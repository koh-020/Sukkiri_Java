package practice.practice16;
import java.util.HashMap;
import java.util.Map;

public class Practice16_3 {
	
	private String hero;
	private int amount;
	
	public static void main(String[] args) {
		Map<String, Integer> killAmount = new HashMap<String, Integer>();
		killAmount.put("斎藤", 3);
		killAmount.put("鈴木", 7);
		for (String key : killAmount.keySet()) {
			int value = killAmount.get(key);
			System.out.println( key + "の討伐数は" + value + "です");
		}
	}

}
