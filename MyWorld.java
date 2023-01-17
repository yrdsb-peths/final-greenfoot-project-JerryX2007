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
        Rock rock = new Rock();
        Paper paper = new Paper();
        Scissors scissors = new Scissors();
        addObject(rock, 50, 300);
        addObject(paper, 300, 300);
        addObject(scissors, 450, 300);
        // Gets the users choice
        int userInp = 1;
        if(Greenfoot.mouseClicked(rock)){
            userInp = 1;
        }
        else if (Greenfoot.mouseClicked(paper)) {
            userInp = 2;
        }
        else if (Greenfoot.mouseClicked(scissors)){
            userInp = 3;
        }
        int comInp = computer();
        winner(userInp, comInp);
        if(getWinStatus()) {
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
    /**
     * Getter for win variable
     */
    public boolean getWinStatus() {
        return win;
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
