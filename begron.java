import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class begron here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class begron extends World
{

    /**
     * Constructor for objects of class begron.
     * 
     */ 
    Snake blueSnake = new Snake(0,0,225);
    Snake greenSnake = new Snake(0,255, 0);
    
    public begron()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        addObject(blueSnake, 450,300);
        addObject(greenSnake, 150,300);
    }
}
