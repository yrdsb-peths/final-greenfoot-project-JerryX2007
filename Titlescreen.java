import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Class Titlescreen is the interface the the user first view
 * It contains the options to go to the help menu by pressing <h>
 * As well as going to play the game by pressing <space>
 * 
 * @author Jerry Xing
 * @version 1
 */
public class Titlescreen extends World
{
    Label title;
    /**
     * Constructor for objects of class Titlescreen.
     * 
     */
    public Titlescreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        //Make a label to hold the title for the game
        Label Title = new Label("Rock, Paper, Scissors", 50);
        addObject(Title, 300, 100);
        prepare();
    }
    /**
     * Tracks whenever a key is pressed to do the appropriate action
     */
    public void act() {
        if(Greenfoot.isKeyDown("space")) {
            MyWorld world = new MyWorld();
            Greenfoot.setWorld(world);
        }
        if(Greenfoot.isKeyDown("h")) {
            Help helpMenu = new Help();
            Greenfoot.setWorld(helpMenu);
        }
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Label label = new Label("Press <h> for help", 30);
        addObject(label,125,200);
        Label label2 = new Label("Press <space> to play", 30);
        addObject(label2,465,200);
    }
}
