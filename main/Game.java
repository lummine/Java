package main;

public class Game implements Runnable {

    private GamePanel gamePanel;
    private GameWindow gameWindow;
    private Thread gameThread;
    private final int FPS_SET = 144;
    
    public Game() {

        gamePanel = new GamePanel();
        gameWindow = new GameWindow(gamePanel);
        gamePanel.requestFocus();
        startGameLoop();

    }

    private void startGameLoop() {

        gameThread = new Thread(this);
        gameThread.start();

    }

    @Override
    public void run() {

        int frames = 0;

        double timePerFrame = 1000000000.0 / FPS_SET;

        long lastFrame = System.nanoTime();
        long now = System.nanoTime();
        long lastCheck = System.currentTimeMillis();
        
        while (true) {

            now = System.nanoTime();

            if (now - lastFrame >= timePerFrame) {

                gamePanel.repaint();
                lastFrame = now;
                frames++;

            }

            if(System.currentTimeMillis() - lastCheck >= 1000) {
    
                lastCheck = System.currentTimeMillis();
                System.out.println("FPS - " + frames);
                frames = 0;
    
            }

        }
        
    }

}
