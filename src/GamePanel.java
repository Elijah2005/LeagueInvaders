import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;
import javax.swing.Timer;

public class GamePanel extends JPanel implements ActionListener, KeyListener{
	Timer clock;
	final int MENU_STATE = 0;
	final int GAME_STATE = 1;
	final int END_STATE = 2;
	Font titleFont;
	Font subtitleFont;
	int CURRENT_STATE = MENU_STATE;
	Rocketship ship = new Rocketship(225, 700, 50, 50);
	  @Override
	  public void paintComponent(Graphics g){
		  if(CURRENT_STATE == MENU_STATE){

	             drawMenuState(g);

	     }else if(CURRENT_STATE == GAME_STATE){

	             drawGameState(g);

	     }else if(CURRENT_STATE == END_STATE){

	             drawEndState(g);

	     }
		  
}
	GamePanel() {
		clock = new Timer(1000 / 60, this);
		titleFont = new Font("Arial", Font.PLAIN, 48 );
		subtitleFont = new Font("Arial", Font.PLAIN, 30);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		repaint();
		 if(CURRENT_STATE == MENU_STATE){

             updateMenuState();

     }else if(CURRENT_STATE == GAME_STATE){

             updateGameState();

     }else if(CURRENT_STATE == END_STATE){

             updateEndState();

     }
		 
}

	

	void startGame() {
		clock.start();
	}
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
	
	}
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		if(e.getKeyCode()== e.VK_ENTER) {
		CURRENT_STATE +=1;
		}
		if(CURRENT_STATE > END_STATE){

            CURRENT_STATE = MENU_STATE;
		}
if(e.getKeyCode()==e.VK_UP) {
	ship.up=true;
}
if(e.getKeyCode()==e.VK_DOWN) {
	ship.down=true;
}
	if(e.getKeyCode()==e.VK_LEFT) {
		ship.left=true;
	}
	if(e.getKeyCode()==e.VK_RIGHT) {
		ship.right=true;
	}

	
	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		if(e.getKeyCode()==e.VK_UP) {
			ship.up=false;
		}
		if(e.getKeyCode()==e.VK_DOWN) {
			ship.down=false;
		}
			if(e.getKeyCode()==e.VK_LEFT) {
				ship.left=false;
			}
			if(e.getKeyCode()==e.VK_RIGHT) {
				ship.right=false;
			}
	}
	void updateMenuState() {
		
	}
	void updateGameState() {
		ship.update();
	}
	void updateEndState() {
		
	}
	
	void drawMenuState(Graphics g) {
		g.setColor(Color.BLUE);

		g.fillRect(0, 0, LeagueInvaders.width, LeagueInvaders.height);    
		g.setFont(titleFont);
		  g.drawString("text", 100, 100);
g.setColor(Color.YELLOW);
g.setFont(titleFont);
g.drawString("LEAGUE INVADERS", 20, 190);
g.setColor(Color.YELLOW);
g.setFont(subtitleFont);
g.drawString("Press ENTER to start", 90, 350);
g.setColor(Color.YELLOW);
g.setFont(subtitleFont);
g.drawString("Press SPACE for instructions", 40, 510);
	}
	void drawGameState(Graphics g) {
		g.setColor(Color.BLACK);

		g.fillRect(0, 0, LeagueInvaders.width, LeagueInvaders.height);    
ship.draw(g);
	}
	void drawEndState(Graphics g) {
		g.setColor(Color.RED);
		g.fillRect(0, 0, LeagueInvaders.width, LeagueInvaders.height);    
        g.setColor(Color.BLACK);
        g.setFont(titleFont);
        g.drawString("Game Over", 110, 190);
        g.setFont(subtitleFont);
        g.drawString("You killed 0 enemies", 100, 350);
        g.setFont(subtitleFont);
        g.drawString("Press ENTER to restart", 80, 510);
	}
}
