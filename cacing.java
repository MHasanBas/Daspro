import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SnakeGame extends JFrame implements ActionListener {

    private JPanel gamePanel;
    private Timer timer;
    private int delay = 100;
    private Image dot;
    private Image apple;
    private int apple_x;
    private int apple_y;
    private final int DOT_SIZE = 10;
    private final int RAND_POS = 29;
    private final int WIDTH = 300;
    private final int HEIGHT = 300;
    private final int[] x = new int[WIDTH / DOT_SIZE];
    private final int[] y = new int[HEIGHT / DOT_SIZE];
    private int dots;
    private boolean leftDirection = false;
    private boolean rightDirection = true;
    private boolean upDirection = false;
    private boolean downDirection = false;
    private boolean inGame = true;

    public SnakeGame() {
        setTitle("Snake");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(WIDTH, HEIGHT);
        setResizable(false);
        setLocationRelativeTo(null);
        gamePanel = new JPanel();
        gamePanel.setBackground(Color.black);
        gamePanel.setFocusable(true);
        gamePanel.addKeyListener(new GameAdapter());
        add(gamePanel);
        loadImages();
        initGame();
    }

    private void loadImages() {
        ImageIcon iid = new ImageIcon(getClass().getResource("dot.png"));
        dot = iid.getImage();
        ImageIcon iia = new ImageIcon(getClass().getResource("apple.png"));
        apple = iia.getImage();
    }

    private void initGame() {
        dots = 3;
        for (int z = 0; z < dots; z++) {
            x[z] = 50 - z * 10;
            y[z] = 50;
        }
        locateApple();
        timer = new Timer(delay, this);
        timer.start();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (inGame) {
            checkApple();
            checkCollision();
            move();
        }
        repaint();
    }

    private void checkApple() {
        if ((x[0] == apple_x) && (y[0] == apple_y)) {
            dots++;
            locateApple();
        }
    }

    private void move() {
        for (int z = dots; z > 0; z--) {
            x[z] = x[(z - 1)];
            y[z] = y[(z - 1)];
        }
        if (leftDirection) {
            x[0] -= DOT_SIZE;
        }
        if (rightDirection) {
            x[0] += DOT_SIZE;
        }
        if (upDirection) {
            y[0] -= DOT_SIZE;
        }
        if (downDirection) {
            y[0] += DOT_SIZE;
        }
    }

    private void checkCollision() {
        for (int z = dots; z > 0; z--) {
            if ((z > 4) && (x[0] == x[z]) && (y[0] == y[z])) {
                inGame = false;
            }
        }
        if (y[0] >= HEIGHT) {
            inGame = false;
        }
        if (y[0] < 0) {
            inGame = false;
        }
        if (x[0] >= WIDTH) {
            inGame = false;
        }
        if (x[0] < 0) {
            inGame = false;
        }
        if (!inGame) {
            timer.stop();
        }
    }

    private void locateApple() {
        int r = (int) (
