import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Class Help is where the user is given the "help" they need regarding controls and the game
 * 
 * @author Jerry Xing 
 * @version 1
 */
public class Help extends World
{

    /**
     * Constructor for objects of class Help.
     * 
     */
    public Help()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        // Create Labels for the help menu
        Label helper = new Label("When given the prompt,", 50);
        Label helper1 = new Label("please click on your choice", 45);
        Label returnToTitle = new Label("Press b to return to titlescreen", 45);
        addObject(helper, 300, 100);
        addObject(helper1, 300, 150);
        addObject(returnToTitle, 300, 300);
    }
    /**
     * Tracks whenever a key is pressed to do the appropriate action
     */
    public void act() {
        if(Greenfoot.isKeyDown("b")) {
            Titlescreen titlescreen = new Titlescreen();
            Greenfoot.setWorld(titlescreen);
        }
    }
}
