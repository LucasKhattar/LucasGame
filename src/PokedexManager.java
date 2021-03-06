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
		int pokemonNumber = random.nextInt(pokedex.size())+1;
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
		pokemon = new Pokemon("Arcanine", 59);
		pokedex.put(pokemon.getNumber(), pokemon);
		pokemon = new Pokemon("Poliwag", 60);
		pokedex.put(pokemon.getNumber(), pokemon);
		pokemon = new Pokemon("Poliwhirl", 61);
		pokedex.put(pokemon.getNumber(), pokemon);
		pokemon = new Pokemon("Poliwrath", 62);
		pokedex.put(pokemon.getNumber(), pokemon);
		pokemon = new Pokemon("Abra", 63);
		pokedex.put(pokemon.getNumber(), pokemon);
		pokemon = new Pokemon("Kadabra", 64);
		pokedex.put(pokemon.getNumber(), pokemon);
		pokemon = new Pokemon("Alakazam", 65);
		pokedex.put(pokemon.getNumber(), pokemon);
		pokemon = new Pokemon("Machop", 66);
		pokedex.put(pokemon.getNumber(), pokemon);
		pokemon = new Pokemon("Machoke", 67);
		pokedex.put(pokemon.getNumber(), pokemon);
		pokemon = new Pokemon("Machamp", 68);
		pokedex.put(pokemon.getNumber(), pokemon);
		pokemon = new Pokemon("Bellsprout", 69);
		pokedex.put(pokemon.getNumber(), pokemon);
		pokemon = new Pokemon("Weepinbell", 70);
		pokedex.put(pokemon.getNumber(), pokemon);
		pokemon = new Pokemon("Victreebel", 71);
		pokedex.put(pokemon.getNumber(), pokemon);
		pokemon = new Pokemon("Tentacool", 72);
		pokedex.put(pokemon.getNumber(), pokemon);
		pokemon = new Pokemon("Tentacruel", 73);
		pokedex.put(pokemon.getNumber(), pokemon);
		pokemon = new Pokemon("Geodude", 74);
		pokedex.put(pokemon.getNumber(), pokemon);
		pokemon = new Pokemon("Graveler", 75);
		pokedex.put(pokemon.getNumber(), pokemon);
		pokemon = new Pokemon("Golem", 76);
		pokedex.put(pokemon.getNumber(), pokemon);
		pokemon = new Pokemon("Ponyta", 77);
		pokedex.put(pokemon.getNumber(), pokemon);
		pokemon = new Pokemon("Rapidash", 78);
		pokedex.put(pokemon.getNumber(), pokemon);
		pokemon = new Pokemon("Slowpoke", 79);
		pokedex.put(pokemon.getNumber(), pokemon);
		pokemon = new Pokemon("Slowbro", 80);
		pokedex.put(pokemon.getNumber(), pokemon);
		pokemon = new Pokemon("Magnemite", 81);
		pokedex.put(pokemon.getNumber(), pokemon);
		pokemon = new Pokemon("Magneton", 82);
		pokedex.put(pokemon.getNumber(), pokemon);
		pokemon = new Pokemon("Farfetchd", 83);
		pokedex.put(pokemon.getNumber(), pokemon);
		pokemon = new Pokemon("Doduo", 84);
		pokedex.put(pokemon.getNumber(), pokemon);
		pokemon = new Pokemon("Dodrio", 85);
		pokedex.put(pokemon.getNumber(), pokemon);
		pokemon = new Pokemon("Seel", 86);
		pokedex.put(pokemon.getNumber(), pokemon);
		pokemon = new Pokemon("Dewgong", 87);
		pokedex.put(pokemon.getNumber(), pokemon);
		pokemon = new Pokemon("Grimer", 88);
		pokedex.put(pokemon.getNumber(), pokemon);
		pokemon = new Pokemon("Muk", 89);
		pokedex.put(pokemon.getNumber(), pokemon);
		pokemon = new Pokemon("Shellder", 90);
		pokedex.put(pokemon.getNumber(), pokemon);
		pokemon = new Pokemon("Cloyster", 91);
		pokedex.put(pokemon.getNumber(), pokemon);
		pokemon = new Pokemon("Gastly", 92);
		pokedex.put(pokemon.getNumber(), pokemon);
		pokemon = new Pokemon("Haunter", 93);
		pokedex.put(pokemon.getNumber(), pokemon);
		pokemon = new Pokemon("Gengar", 94);
		pokedex.put(pokemon.getNumber(), pokemon);
		pokemon = new Pokemon("Onix", 95);
		pokedex.put(pokemon.getNumber(), pokemon);
		pokemon = new Pokemon("Drowzee", 96);
		pokedex.put(pokemon.getNumber(), pokemon);
		pokemon = new Pokemon("Hypno", 97);
		pokedex.put(pokemon.getNumber(), pokemon);
		pokemon = new Pokemon("Krabby", 98);
		pokedex.put(pokemon.getNumber(), pokemon);
		pokemon = new Pokemon("Kingler", 99);
		pokedex.put(pokemon.getNumber(), pokemon);
		pokemon = new Pokemon("Voltorb", 100);
		pokedex.put(pokemon.getNumber(), pokemon);
		pokemon = new Pokemon("Electrode", 101);
		pokedex.put(pokemon.getNumber(), pokemon);
		pokemon = new Pokemon("Exeggcute", 102);
		pokedex.put(pokemon.getNumber(), pokemon);
		pokemon = new Pokemon("Exeggutor", 103);
		pokedex.put(pokemon.getNumber(), pokemon);
		pokemon = new Pokemon("Cubone", 104);
		pokedex.put(pokemon.getNumber(), pokemon);
		pokemon = new Pokemon("Marowak", 105);
		pokedex.put(pokemon.getNumber(), pokemon);
		pokemon = new Pokemon("Hitmonlee", 106);
		pokedex.put(pokemon.getNumber(), pokemon);
		pokemon = new Pokemon("Hitmonchan", 107);
		pokedex.put(pokemon.getNumber(), pokemon);
		pokemon = new Pokemon("Lickitung", 108);
		pokedex.put(pokemon.getNumber(), pokemon);
		pokemon = new Pokemon("Koffing", 109);
		pokedex.put(pokemon.getNumber(), pokemon);
		pokemon = new Pokemon("Weezing", 110);
		pokedex.put(pokemon.getNumber(), pokemon);
		pokemon = new Pokemon("Rhyhorn", 111);
		pokedex.put(pokemon.getNumber(), pokemon);
		pokemon = new Pokemon("Rhydon", 112);
		pokedex.put(pokemon.getNumber(), pokemon);
		pokemon = new Pokemon("Chansey", 113);
		pokedex.put(pokemon.getNumber(), pokemon);
		pokemon = new Pokemon("Tangela", 114);
		pokedex.put(pokemon.getNumber(), pokemon);
		pokemon = new Pokemon("Kangaskhan", 115);
		pokedex.put(pokemon.getNumber(), pokemon);
		pokemon = new Pokemon("Horsea", 116);
		pokedex.put(pokemon.getNumber(), pokemon);
		pokemon = new Pokemon("Seadra", 117);
		pokedex.put(pokemon.getNumber(), pokemon);
		pokemon = new Pokemon("Goldeen", 118);
		pokedex.put(pokemon.getNumber(), pokemon);
		pokemon = new Pokemon("Seaking", 119);
		pokedex.put(pokemon.getNumber(), pokemon);
		pokemon = new Pokemon("Staryu", 120);
		pokedex.put(pokemon.getNumber(), pokemon);
		pokemon = new Pokemon("Starmie", 121);
		pokedex.put(pokemon.getNumber(), pokemon);
		pokemon = new Pokemon("Mr-Mime", 122);
		pokedex.put(pokemon.getNumber(), pokemon);
		pokemon = new Pokemon("Scyther", 123);
		pokedex.put(pokemon.getNumber(), pokemon);
		pokemon = new Pokemon("Jynx", 124);
		pokedex.put(pokemon.getNumber(), pokemon);
		pokemon = new Pokemon("Electabuzz", 125);
		pokedex.put(pokemon.getNumber(), pokemon);
		pokemon = new Pokemon("Magmar", 126);
		pokedex.put(pokemon.getNumber(), pokemon);
		pokemon = new Pokemon("Pinsir", 127);
		pokedex.put(pokemon.getNumber(), pokemon);
		pokemon = new Pokemon("Tauros", 128);
		pokedex.put(pokemon.getNumber(), pokemon);
		pokemon = new Pokemon("Magikarp", 129);
		pokedex.put(pokemon.getNumber(), pokemon);
		pokemon = new Pokemon("Gyarados", 130);
		pokedex.put(pokemon.getNumber(), pokemon);
		pokemon = new Pokemon("Lapras", 131);
		pokedex.put(pokemon.getNumber(), pokemon);
		pokemon = new Pokemon("Ditto", 132);
		pokedex.put(pokemon.getNumber(), pokemon);
		pokemon = new Pokemon("Eevee", 133);
		pokedex.put(pokemon.getNumber(), pokemon);
		pokemon = new Pokemon("Vaporeon", 134);
		pokedex.put(pokemon.getNumber(), pokemon);
		pokemon = new Pokemon("Jolteon", 135);
		pokedex.put(pokemon.getNumber(), pokemon);
		pokemon = new Pokemon("Flareon", 136);
		pokedex.put(pokemon.getNumber(), pokemon);
		pokemon = new Pokemon("Porygon", 137);
		pokedex.put(pokemon.getNumber(), pokemon);
		pokemon = new Pokemon("Omanyte", 138);
		pokedex.put(pokemon.getNumber(), pokemon);
		pokemon = new Pokemon("Omastar", 139);
		pokedex.put(pokemon.getNumber(), pokemon);
		pokemon = new Pokemon("Kabuto", 140);
		pokedex.put(pokemon.getNumber(), pokemon);
		pokemon = new Pokemon("Kabutops", 141);
		pokedex.put(pokemon.getNumber(), pokemon);
		pokemon = new Pokemon("Aerodactyl", 142);
		pokedex.put(pokemon.getNumber(), pokemon);
		pokemon = new Pokemon("Snorlax", 143);
		pokedex.put(pokemon.getNumber(), pokemon);
		pokemon = new Pokemon("Articuno", 144);
		pokedex.put(pokemon.getNumber(), pokemon);
		pokemon = new Pokemon("Zapdos", 145);
		pokedex.put(pokemon.getNumber(), pokemon);
		pokemon = new Pokemon("Moltres", 146);
		pokedex.put(pokemon.getNumber(), pokemon);
		pokemon = new Pokemon("Dratini", 147);
		pokedex.put(pokemon.getNumber(), pokemon);
		pokemon = new Pokemon("Dragonair", 148);
		pokedex.put(pokemon.getNumber(), pokemon);
		pokemon = new Pokemon("Dragonite", 149);
		pokedex.put(pokemon.getNumber(), pokemon);
		pokemon = new Pokemon("Mewtwo", 150);
		pokedex.put(pokemon.getNumber(), pokemon);
		pokemon = new Pokemon("Mew", 151);
	}
}