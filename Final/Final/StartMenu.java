import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.Scanner.*;
/**
 * 
 * StartMenu first displayed also explains rules
 * Sidney Robinson
 * Final Version
 */
public class StartMenu extends World
{
    
    
    /**
     * Constructor for objects of class StartMenu.
     * 
     */
    public StartMenu()
    {    
        // Create a new world with 800x400 cells with a cell size of 1x1 pixels.
        super(800, 400, 1); 
        Greenfoot.setSpeed(50);//resets game speed to 50 allowing for multiple plays with reset button
        
    }//end constructor
    public void act()
    {
      
       
        if (Greenfoot.mouseClicked(this))
        {
            Greenfoot.setWorld(new MyWorld());
        }//allows for game world to be created on click
        
    }//end of act
     
   
}//end public class
