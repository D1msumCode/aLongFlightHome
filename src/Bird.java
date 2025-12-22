import java.awt.*;

public class Bird {
    double x = 0;
    double y = 0;

    double speed = 0;

    double velocityY = 0;
    double gravity = 0.6;
    double lift = -10;

    String username;

    public Bird(double x, double y, double speed) {
        this.x = x;
        this.y = y;
        this.speed = speed;
    }

    public void update(){
        velocityY += gravity;
        y += velocityY;
    }

    public void fly(){
        velocityY =lift;
    }

    // Fill on a later date (Temporary/Tentative)
    public void moveRight() {}
    public void moveLeft() {}

    public void draw(Graphics g) {
        g.setColor(Color.white);
        g.fillOval( (int)x, (int)y, 50, 50);
    }

    public void checkCollision() {

    }

}
