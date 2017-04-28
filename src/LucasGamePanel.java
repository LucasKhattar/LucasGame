import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;

public class LucasGamePanel extends JPanel implements ActionListener, KeyListener{

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
	void updateMenuState() {

	}

	void updateGameState() {
			
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
		g.drawString("Press S For Settings", 200, 400);
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
	    		Image pokemon1 = loadImageFromTheInternet("http://img.pokemondb.net/artwork/"+pokemonName1+".jpg");
	    		Image pokemon2 = loadImageFromTheInternet("http://img.pokemondb.net/artwork/"+pokemonName2+".jpg");
	    		Image pokemon3 = loadImageFromTheInternet("http://img.pokemondb.net/artwork/"+pokemonName3+".jpg");
	    		Image pokemon4 = loadImageFromTheInternet("http://img.pokemondb.net/artwork/"+pokemonName4+".jpg");
	    		g.drawImage(pokemon1, 10, 250, 100, 100, this);
				g.drawImage(pokemon2, 220, 250, 100, 100, this);
				g.drawImage(pokemon3, 430, 250, 100, 100, this);
				g.drawImage(pokemon4, 640, 250, 100, 100, this);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}

	void drawEndState(Graphics g) {
		
	}
	LucasGamePanel() {
		timer = new Timer(1000 / 60, this);
		
	}
	void startGame(){
		timer.start();
	}
	
	
	
	public Image loadImageFromTheInternet(String imageURL) throws Exception {
		final URL url = new URL(imageURL);
		final HttpURLConnection connection = (HttpURLConnection) url
		        .openConnection();
		connection.setRequestProperty(
		    "User-Agent",
		    "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_7_5) AppleWebKit/537.31 (KHTML, like Gecko) Chrome/26.0.1410.65 Safari/537.31");
		return ImageIO.read(connection.getInputStream());
		
//		Icon icon = new ImageIcon(image);
//		return new JLabel(icon)/*;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		repaint();
		if(currentState == MENU_STATE){
			updateMenuState();
		}else if(currentState == GAME_STATE){
			updateGameState();
		}else if(currentState == END_STATE){
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
		if (e.getKeyCode() == KeyEvent.VK_SPACE) {
			currentState = GAME_STATE;
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
}
