package main;
public class Game {
    private GameWindow gameWindow;
    GamePanel gamePanel;

    public Game(){
        gamePanel = new GamePanel();
        
        gameWindow = new GameWindow(gamePanel);
        gamePanel.requestFocus();
        

    }
}
