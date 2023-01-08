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

    boolean running = false;

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
        newApple();
        running = true;
        timer = new Timer(DELAY, this);
        timer.start();
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        draw(g);
    }

    public void draw(Graphics g) {

        for (int i = 0; i < SCREEN_HEIGHT/UNIT_SIZE; i++) {
            g.drawLine(i*UNIT_SIZE, 0, i*UNIT_SIZE, SCREEN_HEIGHT);
            g.drawLine(0, i*UNIT_SIZE, SCREEN_WIDTH, i*UNIT_SIZE);
        }

        g.setColor(Color.red);
        g.fillOval(appleX, appleY, UNIT_SIZE, UNIT_SIZE);

    }

    public void newApple() {
        appleX = random.nextInt((int)(SCREEN_WIDTH/UNIT_SIZE))*UNIT_SIZE;
        appleY = random.nextInt((int)(SCREEN_HEIGHT/UNIT_SIZE))*UNIT_SIZE;
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




// import java.awt.*;
// import java.awt.event.*;
// import javax.swing.*;
// import java.util.Random;

// public class GamePanel extends JPanel implements ActionListener{

// 	static final int SCREEN_WIDTH = 1300;
// 	static final int SCREEN_HEIGHT = 750;
// 	static final int UNIT_SIZE = 50;
// 	static final int GAME_UNITS = (SCREEN_WIDTH*SCREEN_HEIGHT)/(UNIT_SIZE*UNIT_SIZE);
// 	static final int DELAY = 175;
// 	final int x[] = new int[GAME_UNITS];
// 	final int y[] = new int[GAME_UNITS];
// 	int bodyParts = 6;
// 	int applesEaten;
// 	int appleX;
// 	int appleY;
// 	char direction = 'R';
// 	boolean running = false;
// 	Timer timer;
// 	Random random;
	
// 	GamePanel(){
// 		random = new Random();
// 		this.setPreferredSize(new Dimension(SCREEN_WIDTH,SCREEN_HEIGHT));
// 		this.setBackground(Color.black);
// 		this.setFocusable(true);
// 		this.addKeyListener(new MyKeyAdapter());
// 		startGame();
// 	}
// 	public void startGame() {
// 		newApple();
// 		running = true;
// 		timer = new Timer(DELAY,this);
// 		timer.start();
// 	}
// 	public void paintComponent(Graphics g) {
// 		super.paintComponent(g);
// 		draw(g);
// 	}
// 	public void draw(Graphics g) {
		
// 		if(running) {
			
// 			for(int i=0;i<SCREEN_HEIGHT/UNIT_SIZE;i++) {
// 				g.drawLine(i*UNIT_SIZE, 0, i*UNIT_SIZE, SCREEN_HEIGHT);
// 				g.drawLine(0, i*UNIT_SIZE, SCREEN_WIDTH, i*UNIT_SIZE);
// 			}
			
// 			g.setColor(Color.red);
// 			g.fillOval(appleX, appleY, UNIT_SIZE, UNIT_SIZE);
		
// 		}
// 		else {
// 			gameOver(g);
// 		}
		
// 	}
// 	public void newApple(){
// 		appleX = random.nextInt((int)(SCREEN_WIDTH/UNIT_SIZE))*UNIT_SIZE;
// 		appleY = random.nextInt((int)(SCREEN_HEIGHT/UNIT_SIZE))*UNIT_SIZE;
// 	}

// 	public void move(){
		
// 	}
// 	public void checkApple() {
		
// 	}
// 	public void checkCollisions() {
		
// 	}
// 	public void gameOver(Graphics g) {
		
// 	}
// 	@Override
// 	public void actionPerformed(ActionEvent e) {
		
// 		if(running) {
// 			move();
// 			checkApple();
// 			checkCollisions();
// 		}
// 		repaint();
// 	}
	
// 	public class MyKeyAdapter extends KeyAdapter{
// 		@Override
// 		public void keyPressed(KeyEvent e) {

// 		}
// 	}
// }