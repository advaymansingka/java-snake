import javax.swing.*;

import java.awt.event.*;
import java.awt.*;

import java.util.Random;


public class GamePanel extends JPanel implements ActionListener {

    static final int SCREEN_WIDTH = 600;
    static final int SCREEN_HEIGHT = 600;
    static final int UNIT_SIZE = 25;
    static final int GAME_UNITS = (SCREEN_WIDTH*SCREEN_HEIGHT)/UNIT_SIZE;
    static final int DELAY = 50;

    final int x[] = new int[GAME_UNITS];
    final int y[] = new int[GAME_UNITS];

    int bodyParts = 6;
    int applesEaten = 0;

    int appleX;
    int appleY;

    public class Randomizer {
        public char getRandom(char[] array) {
            int rnd = new Random().nextInt(array.length);
            return array[rnd];
        }
    }

    Randomizer R = new Randomizer();
    
    char directions[] = new char[]{'U', 'D', 'L', 'R'};
    char direction = R.getRandom(directions);

    Timer timer;
    Random random;

    GamePanel(){
        random = new Random();
        this.setPreferredSize(new Dimension(SCREEN_WIDTH, SCREEN_HEIGHT));
        this.setBackground(Color.black);
        this.setFocusable(true);
        this.addKeyListener(new MyKeyAdapter());
        startGame();
    }

    public void startGame() {

    }

    public void paintComponent(Graphics g) {

    }

    public void draw(Graphics g) {

    }

    public void newApple() {
        
    }

    public void move() {

    }

    public void checkApple() {

    }

    public void checkCollisions() {

    }

    public void gameOver() {

    }


    @Override
    public void actionPerformed(ActionEvent e) {

    }

    public class MyKeyAdapter extends KeyAdapter {
        @Override
        public void keyPressed(KeyEvent e){

        }
    }
    
}
