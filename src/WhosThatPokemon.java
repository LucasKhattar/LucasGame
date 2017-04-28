import java.net.MalformedURLException;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class WhosThatPokemon {
	WhosThatPokemon() {
		frame = new JFrame();
		panel = new LucasGamePanel();
		setup();
	}

	JFrame frame;
	LucasGamePanel panel;
	final int WIDTH = 850;
	final int HEIGHT = 500;

	public static void main(String[] args) {
		WhosThatPokemon pokemon = new WhosThatPokemon();
	}

	void setup() {
		frame.setVisible(true);
		frame.setSize(WIDTH, HEIGHT);
		frame.add(panel);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		frame.addKeyListener(panel);
		panel.startGame();
	}
}

// Pokemon images
// https://img.pokemondb.net/artwork/__________.jpg
