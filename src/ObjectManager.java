import java.awt.Graphics;
import java.util.ArrayList;

public class ObjectManager {
	Rocketship rocketship;
	ArrayList <Projectile> projectile = new ArrayList <Projectile>();
public ObjectManager(Rocketship r) {
	this.rocketship=r;
	
}
void addProjectile(Projectile p) {
	projectile.add(p);
}
void update() {
	rocketship .update();
	for(int i = 0; i < projectile.size(); i++){
		Projectile j = projectile.get(i);
		j.update();
	}

}
void draw(Graphics g) {
	rocketship.draw(g);
	for(int i = 0; i < projectile.size(); i++){
		Projectile j = projectile.get(i);
		j.draw(g);
		
	}
}
}
