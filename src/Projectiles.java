import java.awt.*;
import java.util.Random;

public abstract class Projectiles {

    double y = 0;
    double x = 300;

    public Projectiles(){
        this.y = (int)(Math.random() * 10) + 1;
    }

    public void update(){

    }

    public void draw(Graphics g) {

    }


}
