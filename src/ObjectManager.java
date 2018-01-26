import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Random;

public class ObjectManager {
	Rocketship rocketship;
	ArrayList <Projectile> projectile = new ArrayList <Projectile>();
	ArrayList <Alien> alien = new ArrayList <Alien>();
	long enemyTimer = 0;
	int enemySpawnTime = 500;
public ObjectManager(Rocketship r) {
	this.rocketship=r;
	
}
void addProjectile(Projectile p) {
	projectile.add(p);
}
void addAlien(Alien a) {
	alien.add(a);
}
void manageEnemies() {
	
        if(System.currentTimeMillis() - enemyTimer >= enemySpawnTime){
                addAlien(new Alien(new Random().nextInt(LeagueInvaders.width), 0, 50, 50));

enemyTimer = System.currentTimeMillis();
        }
}
void purgeObjects() {
	for(int i = 0; i < projectile.size(); i++){
		Projectile j = projectile.get(i);
		if(j.isAlive == false) {
			projectile.remove(j);
		}
	}
	for(int i = 0; i < alien.size(); i++){
		Alien a = alien.get(i);
		if(a.isAlive == false) {
			alien.remove(a);
		}
	}
}
void update() {
	rocketship .update();
	for(int i = 0; i < projectile.size(); i++){
		Projectile j = projectile.get(i);
		j.update();
	}
	for(int i = 0; i < alien.size(); i++){
		Alien a = alien.get(i);
		a.update();
	}
}
void draw(Graphics g) {
	rocketship.draw(g);
	for(int i = 0; i < projectile.size(); i++){
		Projectile j = projectile.get(i);
		j.draw(g);
		
	}
	for(int i = 0; i < alien.size(); i++){
		Alien a = alien.get(i);
		a.draw(g);
		
	}
}
}
