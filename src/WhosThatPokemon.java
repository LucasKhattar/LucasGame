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
	final int width = 800;
	final int height = 500;

	public static void main(String[] args) {
		WhosThatPokemon pokemon = new WhosThatPokemon();
	}

	void setup() {
		frame.setVisible(true);
		frame.setSize(width, height);
		frame.add(panel);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		panel.startGame();
	}
}

// Pokemon images
// http://pokemon.wikia.com/wiki/Category:Generation_I_Pok%C3%A9mon
