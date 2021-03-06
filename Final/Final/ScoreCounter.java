import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
 * 
 * allows for score counter to be drawn and allows for a constant updated score to be displayed
 * Sidney Robinson
 * Final Version
 */

public class ScoreCounter extends Actor
{
    //instance variables
    public int score;
    public int speed;
    
    /**
     * Act - do whatever the ScoreCounter wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        int score =((MyWorld) getWorld()).score1;//gets and stores updated score variable from world class
        setImage(new GreenfootImage("Score : " + score, 24, Color.BLACK, Color.WHITE));//creates and updates image displayed
       
        
    }  //end of act
 
}//end of class
