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
    GreenfootSound winSound = new GreenfootSound("Win.mp3");
    GreenfootSound loseSound = new GreenfootSound("Lose.mp3");
    GreenfootSound tieSound = new GreenfootSound("Tie.mp3");
    public Random random = new Random();
<<<<<<< Updated upstream
    public boolean win = false;
=======
    public int win;
    Label gameWinLabel = new Label("Game Win", 50);
    Rock rock = new Rock();
    Paper paper = new Paper();
    Scissors scissors = new Scissors();
    int compChoice = random.nextInt(3)+1;
>>>>>>> Stashed changes
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
<<<<<<< Updated upstream
        int userInp = user();
        int comInp = computer();
        winner(userInp, comInp);
        GameOver gameOver = new GameOver();
        Greenfoot.setWorld(gameOver);
=======

        addObject(rock, 150, 300);
        addObject(paper, 300, 300);
        addObject(scissors, 450, 300);
        Label selection = new Label("Please click on your choice", 50);
        addObject(selection, 300, 150);
        //Label playAgain = new Label("Play Again?", 50);
        //addObject(playAgain, 300, 500);
>>>>>>> Stashed changes
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
<<<<<<< Updated upstream
    private int user() {
        if(Greenfoot.isKeyDown("1")) {
            return 1;
        }
        else if(Greenfoot.isKeyDown("2")) {
            return 2;
=======
    private void result(int userInp, int comInp) {
        String out = "";
        if(comInp==1) out = "Rock";
        else if (comInp==2) out = "Paper";
        else if (comInp==3) out = "Scissors";
        if(userInp==comInp) {
            win = -1;
>>>>>>> Stashed changes
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
<<<<<<< Updated upstream
            win = false;
        }
        else {
            win = true;
        }
=======
            win = 0;
        }
        else {
            win = 1;
        }
        if(getWinStatus()==-1) {
            gameWinLabel.setValue("Tie, computer picked " + out);
            addObject(gameWinLabel, 300, 300);
            tieSound.play();
        }
        else if (getWinStatus()==0) {
            gameWinLabel.setValue("You Win, computer picked " + out);
            addObject(gameWinLabel, 300, 300);
            winSound.play();
        }
        else {
            gameWinLabel.setValue("You Lose, computer picked " + out);
            addObject(gameWinLabel, 300, 300);
            loseSound.play();
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
        
>>>>>>> Stashed changes
    }
}
