import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Snake here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Snake extends Actor
{
    /**
     * Act - do whatever the Snake wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int r,g,b;
    int speed = 3;
    private int length = 1;
    private int delay = 10; 
    private int counter = 0; 
    private int[] xCoords = new int[100]; 
    private int[] yCoords = new int[100]; 
    private int direction = 0;
    public Snake(int r, int g ,int b)
    {
        setRotation(270);
        this.r = r;
        this.g = g;
        this.b = b;
        getImage().setColor(new Color(r,g,b));
        getImage().fillRect(0,0,40,40);
    }
    public void act()
    {
        move(speed);
        if (counter == delay) {
         move(speed);
         counter = 0;
        
         xCoords[2] = getX();
         yCoords[2] = getY();
        
         moveBody();
        
         checkKeyPress();
        
         checkEdgeCollision();
         } else {
         counter++;
         }
    }
    
    public void moveBody()
     {
        for (int i = length - 1; i > 0; i--) {
         xCoords[i] = xCoords[i - 1];
         yCoords[i] = yCoords[i - 1];
         }
    }
    
    public void checkKeyPress()
     {
        if (Greenfoot.isKeyDown("right") && direction != 2) {
         direction = 0;
         }
        if (Greenfoot.isKeyDown("up") && direction != 3) {
        direction = 1;
         }
        if (Greenfoot.isKeyDown("left") && direction != 0) {
        direction = 2;
         }
        if (Greenfoot.isKeyDown("down") && direction != 1) {
        direction = 3;
         }
     }
    public void checkEdgeCollision()
     {
        if (getX() <= 0 || getX() >= getWorld().getWidth() - 1 || getY() <= 0 || getY() >= getWorld().getHeight() - 1) {
         Greenfoot.stop();
         }
    }
}
