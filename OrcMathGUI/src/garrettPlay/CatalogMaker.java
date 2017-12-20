package garrettPlay;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import guiPlayer.Book;

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
		maker.add();
		System.out.println(maker.getCSVContent());
		maker.save();
	}
	
	public String getCSVContent() {
		String data = "";
		for(Pokemon p: pokedex) {
			data += p + "\n";
		}
		return data;
	}
	
	private void save() {
		try{    
			FileWriter fw=new FileWriter("PokemonCatalog.csv");
			for(Pokemon b: pokedex){
				fw.write(b+"\n");    	
			}

			fw.close();    
			System.out.println("Success! File \"PokemonCatalog.csv\" saved!");
		}catch(IOException e){
			System.out.println("An IOException was thrown. \nCheck to see that the directory where you tried to save the file actually exists.");
		}
	}
	
	public void addPokemon(Pokemon b){
		pokedex.add(b);
	}
	
	public void add() {
		System.out.println("Please enter the name of the Pokemon.");
		String n = in.nextLine();
		System.out.println("Please enter the level of the Pokemon.");
		String l = in.nextLine();
		System.out.println("Please enter how many of that Pokemon you have.");
		String q = in.nextLine();
		addPokemon(new Pokemon(n, Integer.parseInt(l), Integer.parseInt(q)));
	}

}
