import java.awt.Color;
import java.awt.Graphics;

public class Alien extends GameObject {
public Alien(int x, int y, int width, int height){
	super(x, y, width, height);
}

void update() {
y+=1;
}
void draw(Graphics g) {
	g.fillRect(x, y, width, height);
	g.setColor(Color.YELLOW);
	
}
}