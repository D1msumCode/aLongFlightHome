import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Game extends JPanel implements Runnable, KeyListener {

    private Bird player;

    boolean upPressed;
    boolean downPressed;

    public Game(){
        setBackground(new Color(0xC6FCFF));

        setFocusable(true);
        requestFocusInWindow();
        addKeyListener(this);

        player = new Bird(400,300, 10);
        new Thread(this).start();
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Custom JPanel");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        frame.add(new Game());
        frame.setVisible(true);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        player.draw(g);
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

            repaint();
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