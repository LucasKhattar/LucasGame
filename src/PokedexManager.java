import java.util.HashMap;
import java.util.Random;

public class PokedexManager {
	private HashMap<Integer, Pokemon> pokedex = new HashMap<Integer, Pokemon>();

	// public HashMap<Integer, Pokemon> getPokedex() {
	// return pokedex;
	// }
	//
	// public void setPokedex(HashMap<Integer, Pokemon> pokedex) {
	// this.pokedex = pokedex;
	// }

	Pokemon getPokemon() {
		int pokemonNumber = random.nextInt(pokedex.size()) + 1;
		return pokedex.get(pokemonNumber);
	}

	Random random = new Random();

	public void addPokemons() {
		Pokemon pokemon = new Pokemon("Bulbasaur", 1);
		pokedex.put(pokemon.getNumber(), pokemon);
		pokemon = new Pokemon("Ivysaur", 2);
		pokedex.put(pokemon.getNumber(), pokemon);
		pokemon = new Pokemon("Venusaur", 3);
		pokedex.put(pokemon.getNumber(), pokemon);
		pokemon = new Pokemon("Charmander", 4);
		pokedex.put(pokemon.getNumber(), pokemon);
		pokemon = new Pokemon("Charmeleon", 5);
		pokedex.put(pokemon.getNumber(), pokemon);
		pokemon = new Pokemon("Charizard", 6);
		pokedex.put(pokemon.getNumber(), pokemon);
		pokemon = new Pokemon("Squirtle", 7);
		pokedex.put(pokemon.getNumber(), pokemon);
		pokemon = new Pokemon("Wartortle", 8);
		pokedex.put(pokemon.getNumber(), pokemon);
		pokemon = new Pokemon("Blastoise", 9);
		pokedex.put(pokemon.getNumber(), pokemon);
		pokemon = new Pokemon("Caterpie", 10);
		pokedex.put(pokemon.getNumber(), pokemon);
		pokemon = new Pokemon("Metapod", 11);
		pokedex.put(pokemon.getNumber(), pokemon);
		pokemon = new Pokemon("Butterfree", 12);
		pokedex.put(pokemon.getNumber(), pokemon);
		pokemon = new Pokemon("Weedle", 13);
		pokedex.put(pokemon.getNumber(), pokemon);
		pokemon = new Pokemon("Kakuna", 14);
		pokedex.put(pokemon.getNumber(), pokemon);
		pokemon = new Pokemon("Beedrill", 15);
		pokedex.put(pokemon.getNumber(), pokemon);
		pokemon = new Pokemon("Pidgey", 16);
		pokedex.put(pokemon.getNumber(), pokemon);
		pokemon = new Pokemon("Pidgeotto", 17);
		pokedex.put(pokemon.getNumber(), pokemon);
		pokemon = new Pokemon("Pidgeot", 18);
		pokedex.put(pokemon.getNumber(), pokemon);
		pokemon = new Pokemon("Rattata", 19);
		pokedex.put(pokemon.getNumber(), pokemon);
		pokemon = new Pokemon("Raticate", 20);
		pokedex.put(pokemon.getNumber(), pokemon);
		pokemon = new Pokemon("Spearow", 21);
		pokedex.put(pokemon.getNumber(), pokemon);
		pokemon = new Pokemon("Fearow", 22);
		pokedex.put(pokemon.getNumber(), pokemon);
		pokemon = new Pokemon("Ekans", 23);
		pokedex.put(pokemon.getNumber(), pokemon);
		pokemon = new Pokemon("Arbok", 24);
		pokedex.put(pokemon.getNumber(), pokemon);
		pokemon = new Pokemon("Pikachu", 25);
		pokedex.put(pokemon.getNumber(), pokemon);
		pokemon = new Pokemon("Raichu", 26);
		pokedex.put(pokemon.getNumber(), pokemon);
		pokemon = new Pokemon("Sandshrew", 27);
		pokedex.put(pokemon.getNumber(), pokemon);
		pokemon = new Pokemon("Sandslash", 28);
		pokedex.put(pokemon.getNumber(), pokemon);
		pokemon = new Pokemon("Nidoran-F", 29);
		pokedex.put(pokemon.getNumber(), pokemon);
		pokemon = new Pokemon("Nidorina", 30);
		pokedex.put(pokemon.getNumber(), pokemon);
		pokemon = new Pokemon("Nidoqueen", 31);
		pokedex.put(pokemon.getNumber(), pokemon);
		pokemon = new Pokemon("Nidoran-M", 32);
		pokedex.put(pokemon.getNumber(), pokemon);
		pokemon = new Pokemon("Nidorino", 33);
		pokedex.put(pokemon.getNumber(), pokemon);
		pokemon = new Pokemon("Nidoking", 34);
		pokedex.put(pokemon.getNumber(), pokemon);
		pokemon = new Pokemon("Clefairy", 35);
		pokedex.put(pokemon.getNumber(), pokemon);
		pokemon = new Pokemon("Clefable", 36);
		pokedex.put(pokemon.getNumber(), pokemon);
		pokemon = new Pokemon("Vulpix", 37);
		pokedex.put(pokemon.getNumber(), pokemon);
		pokemon = new Pokemon("Ninetales", 38);
		pokedex.put(pokemon.getNumber(), pokemon);
		pokemon = new Pokemon("Jigglypuff", 39);
		pokedex.put(pokemon.getNumber(), pokemon);
		pokemon = new Pokemon("Wigglytuff", 40);
		pokedex.put(pokemon.getNumber(), pokemon);
		pokemon = new Pokemon("Zubat", 41);
		pokedex.put(pokemon.getNumber(), pokemon);
		pokemon = new Pokemon("Golbat", 42);
		pokedex.put(pokemon.getNumber(), pokemon);
		pokemon = new Pokemon("Oddish", 43);
		pokedex.put(pokemon.getNumber(), pokemon);
		pokemon = new Pokemon("Gloom", 44);
		pokedex.put(pokemon.getNumber(), pokemon);
		pokemon = new Pokemon("Vileplume", 45);
		pokedex.put(pokemon.getNumber(), pokemon);
		pokemon = new Pokemon("Paras", 46);
		pokedex.put(pokemon.getNumber(), pokemon);
		pokemon = new Pokemon("Parasect", 47);
		pokedex.put(pokemon.getNumber(), pokemon);
		pokemon = new Pokemon("Venonat", 48);
		pokedex.put(pokemon.getNumber(), pokemon);
		pokemon = new Pokemon("Venomoth", 49);
		pokedex.put(pokemon.getNumber(), pokemon);
		pokemon = new Pokemon("Diglett", 50);
		pokedex.put(pokemon.getNumber(), pokemon);
		pokemon = new Pokemon("Dugtrio", 51);
		pokedex.put(pokemon.getNumber(), pokemon);
		pokemon = new Pokemon("Meowth", 52);
		pokedex.put(pokemon.getNumber(), pokemon);
		pokemon = new Pokemon("Persian", 53);
		pokedex.put(pokemon.getNumber(), pokemon);
		pokemon = new Pokemon("Persian", 54);
		pokedex.put(pokemon.getNumber(), pokemon);
		pokemon = new Pokemon("Golduck", 55);
		pokedex.put(pokemon.getNumber(), pokemon);
		pokemon = new Pokemon("Mankey", 56);
		pokedex.put(pokemon.getNumber(), pokemon);
		pokemon = new Pokemon("Primeape", 57);
		pokedex.put(pokemon.getNumber(), pokemon);
		pokemon = new Pokemon("Growlithe", 58);
		pokedex.put(pokemon.getNumber(), pokemon);
	}
}