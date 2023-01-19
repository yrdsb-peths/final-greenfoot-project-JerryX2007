import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.Random;
/**
 * Class MyWorld is the world that contains the main game. The game is Rock, Paper, Scissors.
 * First, you create 3 labels and objects that are the rock, paper, and scissors.
 * Next, you wait for the user to click on one of the objects, then tell them if they lose
 * Or win. After doing so, you set a stopwatch and after it reaches 500 milliseconds
 * It takes them to the play again screen.
 * 
 * @author Jerry Xing
 * @version 1
 */
public class MyWorld extends World
{
    GreenfootSound winSound = new GreenfootSound("Win.mp3");
    GreenfootSound loseSound = new GreenfootSound("Lose.mp3");
    GreenfootSound tieSound = new GreenfootSound("Tie.mp3");
    public Random random = new Random();
    public int win;
    Label gameWinLabel = new Label("Game Win", 45);
    Rock rock = new Rock();
    Paper paper = new Paper();
    Scissors scissors = new Scissors();
    int compChoice = random.nextInt(3)+1;
    SimpleTimer timer = new SimpleTimer();
    boolean clicked = false;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        prepare();
        timer.mark();
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
        String out = "";
        if(comInp==1) out = "Rock";
        else if(comInp==2) out = "Paper";
        else if(comInp==3) out = "Scissors";
        if(userInp==comInp) {
            win = -1;
        }
        else if(userInp==1&&comInp==2) {
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
            gameWinLabel.setValue("Tie, computer picked " + out);
            addObject(gameWinLabel, 300, 100);
            tieSound.play();
        }
        else if (getWinStatus()==1) {
            gameWinLabel.setValue("You Win, computer picked " + out);
            addObject(gameWinLabel, 300, 100);
            winSound.play();
        }
        else {
            gameWinLabel.setValue("You Lose, computer picked " + out);
            addObject(gameWinLabel, 300, 100);
            loseSound.play();
        }
    }
    /**
     * Input reading
     */
    public void act(){
        if(Greenfoot.mouseClicked(rock)){
            result(1, compChoice);
            clicked=true;
        }
        else if (Greenfoot.mouseClicked(paper)) {
            result(2, compChoice);
            clicked=true;
        }
        else if (Greenfoot.mouseClicked(scissors)){
            result(3, compChoice);
            clicked=true;
        }
        goToPlayAgain(clicked);
        
    }
    /**
     * A function to go to play again screen when game finished
     */
    public void goToPlayAgain(boolean clicked) {
        if(timer.millisElapsed()>5000&&clicked) {
            timer.mark();
            PlayAgain playAgain = new PlayAgain();
            Greenfoot.setWorld(playAgain);
        }
    }
    /**
     * Prepares the world
     */
    public void prepare() {
        Label r = new Label("Rock", 40);
        Label p = new Label("Paper", 40);
        Label s = new Label("Scissors", 40);
        addObject(r, 150, 200);
        addObject(p, 300, 200);
        addObject(s, 450, 200);
        addObject(rock, 150, 300);
        addObject(paper, 300, 300);
        addObject(scissors, 450, 300);
    }
}
