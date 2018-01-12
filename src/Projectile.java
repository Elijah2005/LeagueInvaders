import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

public class Projectile {
	int speed;
public Projectile(int x, int y, int width, int height) {
	 speed = 10;
}
void update() {
	
}
void draw(Graphics g) {
g.setColor(Color.RED);	
g.drawRect(250, 250,10 , 10);

}
}
