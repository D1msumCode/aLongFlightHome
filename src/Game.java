import javax.swing.*;
import java.awt.*;

public class Game extends JPanel {

    private final Bird player;

    public Game() {
        setBackground(new Color(0x82C8E5));

        setFocusable(true);
        requestFocusInWindow();

        player = new Bird(75, 300, 10);

        MainRunner mainRunner = new MainRunner(player, this);
        addKeyListener(mainRunner);

        new Thread(mainRunner).start();
        repaint();
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
}