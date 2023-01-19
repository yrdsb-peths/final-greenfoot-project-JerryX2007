import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Class EndScreen is where the user will see that the game has been completed
 * They will also be given a chance to play again by pressing <p>
 * 
 * @author Jerry Xing
 * @version 1
 */
public class EndScreen extends World
{
    GreenfootSound sound = new GreenfootSound("End.mp3");
    /**
     * Constructor for objects of class EndScreen.
     * 
     */
    public EndScreen()
    {    
        super(600, 400, 1);
        Label end = new Label("Thank you for playing my game!", 40);
        Label returning = new Label("If you wish to play again, press <p>.", 40);
        addObject(end, 300, 150);
        addObject(returning, 300, 200);
        sound.play();
    }
}
