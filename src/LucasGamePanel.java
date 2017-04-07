import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class LucasGamePanel extends JPanel implements ActionListener{

	Timer timer;

	LucasGamePanel() {
		timer = new Timer(1000 / 60, this);
	}
	void startGame(){
		timer.start();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Lucas");
		System.out.println("is");
		System.out.println("awesome");
		System.out.println("!");
	}
}
