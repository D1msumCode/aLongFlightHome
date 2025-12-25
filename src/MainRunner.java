import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MainRunner implements Runnable, KeyListener {

    boolean upPressed;
    boolean downPressed;

    Bird player;
    JPanel jPanel;

    public MainRunner(Bird player, JPanel jPanel){
        this.player = player;
        this.jPanel = jPanel;
    }

    @Override
    public void run() {
        while (true) {
            if (upPressed) {
                player.fly();
            }
            if (downPressed) {
            }

            player.update();

            jPanel.repaint();

            try {
                Thread.sleep(16);
            } catch (InterruptedException e) {

            }
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();

        if (key == KeyEvent.VK_W || key == KeyEvent.VK_UP){
            upPressed = true;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        int key = e.getKeyCode();

        if (key == KeyEvent.VK_W || key == KeyEvent.VK_UP){
            upPressed = false;
        }
    }
}
