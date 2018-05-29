import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * 
 * GameRunning Class that displays if the game is running currently or not
 * Sidney Robinson
 * Final Version
 */
public class GameRunningText extends Actor
{
    /**
     * Act - do whatever the GameRunningTracker wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
      boolean isRunning = ((MyWorld) getWorld()).Running; //An alternate getter to get
      //information from the world class to the actor class, i would've otherwise exteneded
      //it and make a getter to use. Greenfoot is odd
         
       
      setImage(new GreenfootImage("Game is running : "  + isRunning, 24, Color.GREEN,Color.BLACK));//creates the text and visual seen, while updating it
    }//end of act
    
}//end of class