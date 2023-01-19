import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class EndScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
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
        sound.play();
        Label end = new Label("Thank you for playing my game!", 40);
        Label returning = new Label("If you wish to play again, press <p>.", 40);
        addObject(end, 300, 150);
        addObject(returning, 300, 200);
    }
}
