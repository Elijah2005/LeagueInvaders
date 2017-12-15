import java.awt.Dimension;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

public class LeagueInvaders{
	GamePanel game;
	JFrame display = new JFrame();
	static final int width = 500;
	static final int height = 800;

	public static void main(String[] args) {
		LeagueInvaders league = new LeagueInvaders();

	}

	LeagueInvaders() {
		display.setSize(width, height);
		display.setVisible(true);
		display.setDefaultCloseOperation(display.EXIT_ON_CLOSE);
		 game = new GamePanel();
		display.getContentPane().setPreferredSize(new Dimension(width, height));
		display.pack();
		display.addKeyListener(game);
		setup();
	}

	void setup() {
		display.add(game);
		game.startGame();
	}


}
