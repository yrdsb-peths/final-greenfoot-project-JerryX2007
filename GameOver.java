import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GameOver here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameOver extends World
{

    /**
     * Constructor for objects of class GameOver.
     * 
     */
    public GameOver()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        MyWorld myWorld = new MyWorld();
        if(myWorld.getWinStatus()) {
            Label gameWinLabel = new Label("Game Win", 100);
            addObject(gameWinLabel, 300, 300);
        }
        else {
            Label gameOverLabel = new Label("Game Over", 100);
            addObject(gameOverLabel, 300, 300);
        }
        Label playAgain = new Label("Play Again?", 50);
        addObject(playAgain, 300, 500);
    }
}
