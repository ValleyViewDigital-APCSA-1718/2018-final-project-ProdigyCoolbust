import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * 
 * Cactus Enemy Class, used to kill player and add aesthetic
 * Sidney Robinson
 * Final Version
 */
public class TCactus extends Cactus implements Enemy //extends the main cactus and implements the Enemy interface
{
    /**
     * Act - do whatever the TCactus wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
       Movement();//calls the overwritten movement method from the Cactus Class
       checkForEdge();//calls the overwritten checkForEdge method from the Cactus Class
    }//end of act method    
}//end of class
