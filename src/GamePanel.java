import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;
import javax.swing.Timer;

public class GamePanel extends JPanel implements ActionListener, KeyListener {
	Timer clock;
	final int MENU_STATE = 0;
	final int GAME_STATE = 1;
	final int END_STATE = 2;
	int CURRENT_STATE = MENU_STATE;
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
		CURRENT_STATE +=1;
		if(CURRENT_STATE > END_STATE){

            CURRENT_STATE = MENU_STATE;

		}
	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	void updateMenuState() {
		
	}
	void updateGameState() {
		
	}
	void updateEndState() {
		
	}
	
	void drawMenuState(Graphics g) {
		g.setColor(Color.BLUE);

		g.fillRect(0, 0, LeagueInvaders.width, LeagueInvaders.height);    


	}
	void drawGameState(Graphics g) {
		g.setColor(Color.BLACK);

		g.fillRect(0, 0, LeagueInvaders.width, LeagueInvaders.height);    

	}
	void drawEndState(Graphics g) {
		g.setColor(Color.RED);

		g.fillRect(0, 0, LeagueInvaders.width, LeagueInvaders.height);    

	}
}
