import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.Random;
/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    public Random random = new Random();
    public boolean win = false;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        int userInp = user();
        int comInp = computer();
        winner(userInp, comInp);
        GameOver gameOver = new GameOver();
        Greenfoot.setWorld(gameOver);
    }
    /**
     * Getter for win variable
     */
    public boolean getWinStatus() {
        return win;
    }
    /**
     * Gets the users decision
     */
    private int user() {
        if(Greenfoot.isKeyDown("1")) {
            return 1;
        }
        else if(Greenfoot.isKeyDown("2")) {
            return 2;
        }
        else {
            return 3;
        }
    }
    /**
     * Generates the computer's decision
     */
    private int computer() {
        return random.nextInt(3)+1;
    }
    /**
     * Determines the winner
     */
    private void winner(int userInp, int comInp) {
        if(userInp==1&&comInp==2) {
            win = false;
        }
        else if (userInp==2&&comInp==3) {
            win = false;
        }
        else if (userInp==3&&comInp==1) {
            win = false;
        }
        else {
            win = true;
        }
    }
}
