package garrettPlay;

import java.util.ArrayList;

public class CatalogMaker {
	
	ArrayList<Pokemon> pokedex;

	public CatalogMaker() {
		pokedex = new ArrayList<Pokemon>();
		pokedex.add(new Pokemon("Charizard", 36.0, 1));
		pokedex.add(new Pokemon("Squirtle", 7.0, 1));
		pokedex.add(new Pokemon("Ivysaur", 18.0, 1));
	}

	public static void main(String[] args) {
		CatalogMaker maker = new CatalogMaker();
		System.out.println(maker.getCSVContent());
	}
	
	public String getCSVContent() {
		String data = "";
		for(Pokemon p: pokedex) {
			data += p + "\n";
		}
		return data;
	}

}
