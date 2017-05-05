import java.util.HashMap;

public class PokedexManager {
	private HashMap <Integer, Pokemon> pokedex = new HashMap <Integer, Pokemon>();

	public HashMap<Integer, Pokemon> getPokedex() {
		return pokedex;
	}

	public void setPokedex(HashMap<Integer, Pokemon> pokedex) {
		this.pokedex = pokedex;
	}
	Pokemon pokemon = new Pokemon ("Charmander", 1);
	pokedex.put(pokemon.getNumber(), pokemon);
}