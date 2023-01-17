import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Titlescreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
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
        Banner banner = new Banner();
        addObject(banner,280,250);
        Label label = new Label("Press <h> for help", 30);
        addObject(label,125,200);
        Label label2 = new Label("Press <space> to play", 30);
        addObject(label2,465,200);
    }
}
