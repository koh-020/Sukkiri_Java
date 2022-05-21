package practice.practice16;
import java.util.ArrayList;

public class Hero {
	private String name;
	public Hero(String name) { this.name = name; }
	public String getName() { return this.name;}
	
	public static void heroes() {
		ArrayList<String> heroes = new ArrayList<String>();
		Hero sato = new Hero("Sato");
		Hero suzuki = new Hero("Suzuki");
		heroes.add(suzuki.getName());
		heroes.add(sato.getName());
		
		for (String name : heroes) {
			System.out.println(name);
		}
	
	}
}
