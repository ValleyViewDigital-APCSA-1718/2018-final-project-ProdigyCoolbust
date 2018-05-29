import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * 
 * Interface Class that ensures all enemies have a movement, and are deleted upon reaching the edge of the map
 * Sidney Robinson
 * Final Version
 */
public interface Enemy  
{
    public void Movement();//movement
    public void checkForEdge();//edge detection 
}//end of interface
