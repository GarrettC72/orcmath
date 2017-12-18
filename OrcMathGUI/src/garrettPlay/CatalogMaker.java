package garrettPlay;

import java.util.ArrayList;
import java.util.Scanner;

public class CatalogMaker {
	
	ArrayList<Pokemon> pokedex;
	Scanner in = new Scanner(System.in);

	public CatalogMaker() {
		pokedex = new ArrayList<Pokemon>();
		pokedex.add(new Pokemon("Charizard", 36, 1));
		pokedex.add(new Pokemon("Squirtle", 7, 1));
		pokedex.add(new Pokemon("Ivysaur", 18, 1));
	}

	public static void main(String[] args) {
		CatalogMaker maker = new CatalogMaker();
		System.out.println(maker.getCSVContent());
		maker.addPokemon();
		System.out.println(maker.getCSVContent());
	}
	
	public String getCSVContent() {
		String data = "";
		for(Pokemon p: pokedex) {
			data += p + "\n";
		}
		return data;
	}
	
	public void addPokemon() {
		System.out.println("Please enter the name of the Pokemon.");
		String n = in.nextLine();
		System.out.println("Please enter the level of the Pokemon.");
		String l = in.nextLine();
		System.out.println("Please enter how many of that Pokemon you have.");
		String q = in.nextLine();
		pokedex.add(new Pokemon(n, Integer.parseInt(l), Integer.parseInt(q)));
	}

}
