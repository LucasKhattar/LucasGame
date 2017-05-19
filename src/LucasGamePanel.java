import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Random;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;

public class LucasGamePanel extends JPanel implements ActionListener, KeyListener, MouseListener {

	Timer timer;
	Font titleFont = new Font("Arial", Font.PLAIN, 48);
	Font titleFont2 = new Font("Arial", Font.PLAIN, 48);;
	final int MENU_STATE = 0;
	final int GAME_STATE = 1;
	final int END_STATE = 2;
	int currentState = MENU_STATE;
	String pokemonName = "Charmander";
	String pokemonName1 = "charmander";
	String pokemonName2 = "charmander";
	String pokemonName3 = "charmander";
	String pokemonName4 = "charmander";
	int pokemonA;
	PokedexManager pokedex = new PokedexManager();

	void updateMenuState() {

	}

	void updateGameState() {
		// drawGameState(g);

		pokemonName1 = pokedex.getPokemon().getName().toLowerCase();
		pokemonName2 = pokedex.getPokemon().getName().toLowerCase();
		pokemonName3 = pokedex.getPokemon().getName().toLowerCase();
		pokemonName4 = pokedex.getPokemon().getName().toLowerCase();
		int rand = new Random().nextInt(4);
		if (rand == 0) {
			pokemonName = pokemonName1;
		}
		if (rand == 1) {
			pokemonName = pokemonName2;
		}
		if (rand == 2) {
			pokemonName = pokemonName3;
		}
		if (rand == 3) {
			pokemonName = pokemonName4;
		}
		pokemonName = pokemonName.toUpperCase();

		if (pokemonName.equals(pokemonName1.toUpperCase())) {
			pokemonA = 1;
		}

		else if (pokemonName.equals(pokemonName2.toUpperCase())) {
			pokemonA = 2;
		}

		else if (pokemonName.equals(pokemonName3.toUpperCase())) {
			pokemonA = 3;
		}

		else if (pokemonName.equals(pokemonName4.toUpperCase())) {
			pokemonA = 4;
		}
	}

	void updateEndState() {

	}

	void drawMenuState(Graphics g) {
		g.setColor(Color.BLUE);
		g.fillRect(0, 0, 850, 500);
		g.setColor(Color.BLACK);
		g.setFont(titleFont);
		g.drawString("Pokemon Quiz", 250, 150);
		g.drawString("Press SPACE To Play", 175, 300);
	}

	void drawGameState(Graphics g) {

		super.paintComponent(g);
		try {
			g.setColor(Color.WHITE);
			g.fillRect(0, 0, 850, 500);
			g.setColor(Color.BLACK);
			g.setFont(titleFont);
			g.drawString("Who's That Pokemon?", 200, 100);
			g.drawString(pokemonName, 300, 200);
			Image pokemon1 = loadImageFromTheInternet("http://img.pokemondb.net/artwork/" + pokemonName1 + ".jpg");
			Image pokemon2 = loadImageFromTheInternet("http://img.pokemondb.net/artwork/" + pokemonName2 + ".jpg");
			Image pokemon3 = loadImageFromTheInternet("http://img.pokemondb.net/artwork/" + pokemonName3 + ".jpg");
			Image pokemon4 = loadImageFromTheInternet("http://img.pokemondb.net/artwork/" + pokemonName4 + ".jpg");
			g.drawImage(pokemon1, 10, 250, 150, 150, this);
			g.drawImage(pokemon2, 220, 250, 150, 150, this);
			g.drawImage(pokemon3, 430, 250, 150, 150, this);
			g.drawImage(pokemon4, 640, 250, 150, 150, this);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	void drawEndState(Graphics g) {
		g.setColor(Color.RED);
		g.fillRect(0, 0, 850, 500);
		g.setColor(Color.BLACK);
		g.setFont(titleFont);
		g.drawString("Game Over", 300, 200);
		g.drawString("Press SPACE To Restart", 150, 300);
	}

	LucasGamePanel() {
		timer = new Timer(1000 / 60, this);

	}

	void startGame() {
		// timer.start();
		pokedex.addPokemons();
	}

	public Image loadImageFromTheInternet(String imageURL) throws Exception {
		final URL url = new URL(imageURL);
		final HttpURLConnection connection = (HttpURLConnection) url.openConnection();
		connection.setRequestProperty("User-Agent",
				"Mozilla/5.0 (Macintosh; Intel Mac OS X 10_7_5) AppleWebKit/537.31 (KHTML, like Gecko) Chrome/26.0.1410.65 Safari/537.31");
		return ImageIO.read(connection.getInputStream());

		// Icon icon = new ImageIcon(image);
		// return new JLabel(icon)/*;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		repaint();
		if (currentState == MENU_STATE) {
			updateMenuState();
		} else if (currentState == GAME_STATE) {
			updateGameState();
		} else if (currentState == END_STATE) {
			updateEndState();
		}
	}

	public void paintComponent(Graphics g) {
		if (currentState == MENU_STATE) {
			drawMenuState(g);
		} else if (currentState == GAME_STATE) {
			drawGameState(g);
		} else if (currentState == END_STATE) {
			drawEndState(g);
		}
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		if (e.getKeyCode() == KeyEvent.VK_SPACE&&currentState != GAME_STATE) {
			currentState = GAME_STATE;
			updateGameState();
			repaint();
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println(pokemonA);
		if (e.getX() >= 10 && e.getX() <= 160 && e.getY() >= 250 && e.getY() <= 400) {
			if (pokemonA == 1) {
				JOptionPane.showMessageDialog(null, "Correct!");
				updateGameState();
				repaint();
			} else {
				JOptionPane.showMessageDialog(null, "Incorrect!");
			}
		}

		if (e.getX() >= 220 && e.getX() <= 470 && e.getY() >= 250 && e.getY() <= 400) {
			if (pokemonA == 2) {
				JOptionPane.showMessageDialog(null, "Correct!");
				updateGameState();
				repaint();
			} else {
				JOptionPane.showMessageDialog(null, "Incorrect!");
				currentState = END_STATE;
				repaint();
			}
		}

		if (e.getX() >= 430 && e.getX() <= 680 && e.getY() >= 250 && e.getY() <= 400) {
			if (pokemonA == 3) {
				JOptionPane.showMessageDialog(null, "Correct!");
				updateGameState();
				repaint();
			} else {
				JOptionPane.showMessageDialog(null, "Incorrect!");
				currentState = END_STATE;
				repaint();
			}
		}

		if (e.getX() >= 640 && e.getX() <= 890 && e.getY() >= 250 && e.getY() <= 400) {
			if (pokemonA == 4) {
				JOptionPane.showMessageDialog(null, "Correct!");
				updateGameState();
				repaint();
			} else {
				JOptionPane.showMessageDialog(null, "Incorrect!");
				currentState = END_STATE;
				repaint();
			}
		}
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}
}
