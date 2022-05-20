package practice.practice15;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class Practice15_4 {
	public static void main(String[] args) {
		Date now = new Date();
		Calendar c = Calendar.getInstance();
		c.setTime(now);
		int day = c.get(Calendar.DAY_OF_MONTH);
		c.set(Calendar.DAY_OF_MONTH, day+100);
		Date d = c.getTime();
		SimpleDateFormat f = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		String s = f.format(d);
		String t = f.format(now);
		System.out.println(t);
		System.out.println(s);
	
	
		LocalDateTime z1 = LocalDateTime.now();
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy/MM/dd");
		LocalDateTime z2 = z1.plusDays(100);
		System.out.println(z1.format(fmt));
		System.out.println(z2.format(fmt));
		System.out.println(z2);
	
	
	
	}
	

}
