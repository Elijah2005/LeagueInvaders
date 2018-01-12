import java.awt.Graphics;

public class ObjectManager {
	Rocketship rocketship;
	
public ObjectManager(Rocketship r) {
	this.rocketship=r;
}
void update() {
	

}
void draw(Graphics g) {
	rocketship.draw(g);
}
}
