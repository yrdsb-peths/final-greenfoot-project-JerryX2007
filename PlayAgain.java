import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Class Play Again is where the user will be given the choice to continue playing the game
 * Or to quit
 * 
 * @author Jerry Xing 
 * @version 1
 */
public class PlayAgain extends World
{
    MyWorld world = new MyWorld();
    /**
     * Constructor for objects of class PlayAgain.
     * 
     */
    public PlayAgain()
    {    
        super(600, 400, 1);
        Label play = new Label("Play Again?", 50);
        Label label = new Label("Enter <y> to play again", 50);
        Label label2 = new Label("or <n> to exit", 50);
        addObject(play, 300, 100);
        addObject(label, 300, 200);
        addObject(label2, 300, 250);
        
    }
    public void act() {
        if(Greenfoot.isKeyDown("y")) {
            Greenfoot.setWorld(world);
        }
        else if (Greenfoot.isKeyDown("n")) {
            EndScreen endScreen = new EndScreen();
            Greenfoot.setWorld(endScreen);
        }
    }
        
}
