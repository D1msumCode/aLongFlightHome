import java.awt.*;

public class Trash extends Projectiles {




    public void draw(Graphics g) {
        g.setColor(Color.white);
        g.fillOval( (int)x, (int)y, 50, 50);
    }

}
