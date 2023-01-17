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
    public int win;
    Label gameWinLabel = new Label("Game Win", 100);;
    Rock rock = new Rock();
    Paper paper = new Paper();
    Scissors scissors = new Scissors();
    int compChoice = random.nextInt(3)+1;
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
        //Label playAgain = new Label("Play Again?", 50);
        //addObject(playAgain, 300, 500);
    }
    /**
     * Getter for win variable
     */
    public int getWinStatus() {
        return win;
    }
    /**
     * Determines the winner
     */
    private void result(int userInp, int comInp) {
        if(userInp==comInp) {
            win = -1;
        }
        if(userInp==1&&comInp==2) {
            win = 0;
        }
        else if (userInp==2&&comInp==3) {
            win = 0;
        }
        else if (userInp==3&&comInp==1) {
            win = 0;
        }
        else {
            win = 1;
        }
        if(getWinStatus()==-1) {
            gameWinLabel.setValue("Tie");
            addObject(gameWinLabel, 300, 300);
        }
        else if (getWinStatus()==0) {
            gameWinLabel.setValue("Win");
            addObject(gameWinLabel, 300, 300);
        }
        else {
            gameWinLabel.setValue("Lose");
            addObject(gameWinLabel, 300, 300);
        }
    }
    
    
    
    public void act(){
        if(Greenfoot.mouseClicked(rock)){
            result(1, compChoice);
        }
        else if (Greenfoot.mouseClicked(paper)) {
            result(2, compChoice);
        }
        else if (Greenfoot.mouseClicked(scissors)){
            result(3, compChoice);
        }
        
        
    }
}
