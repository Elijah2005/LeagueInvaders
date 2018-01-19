import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

public class Projectile extends GameObject {
	int speed;

	public Projectile(int x, int y, int width, int height) {
		super(x, y, width, height);
		speed = 10;
	}

	void update() {
		
		y -= speed;
		if (y <= 0)
			;

	}

	void draw(Graphics g) {
		g.setColor(Color.RED);
		g.drawRect(x, y, width, height);

	}
}
