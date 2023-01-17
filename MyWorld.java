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
    Label gameWinLabel = new Label("Game Win", 100);;
    Rock rock = new Rock();
    Paper paper = new Paper();
    Scissors scissors = new Scissors();
    int compChoice = 3;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);

        addObject(rock, 50, 300);
        addObject(paper, 300, 300);
        addObject(scissors, 450, 300);
        
        
        // Gets the users choice
        int userInp = 1;
        
        int comInp = computer();
        
        
        //Label playAgain = new Label("Play Again?", 50);
        //addObject(playAgain, 300, 500);
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
        if(getWinStatus()) {
            addObject(gameWinLabel, 300, 300);
        } else {
            gameWinLabel.setValue("Lose");
            addObject(gameWinLabel, 300, 300);
        }
    }
    
    
    
    public void act(){
        if(Greenfoot.mouseClicked(rock)){
            winner(1, compChoice);
        }
        else if (Greenfoot.mouseClicked(paper)) {
            winner(2, compChoice);
        }
        else if (Greenfoot.mouseClicked(scissors)){
            winner(3, compChoice);
        }
        
        
    }
}
