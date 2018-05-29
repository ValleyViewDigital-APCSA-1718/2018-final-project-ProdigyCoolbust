import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * 
 * Dino actor and main playable class with basic contorls
 * Sidney Robinson
 * Final Version
 */ 
public class Dino2 extends Actor
{
    //instance variables
    private int ySpeed;
 
    
    public Dino2() {
       
        setImage(new GreenfootImage("dino.png"));//set the dino with the dinosaur image
        
    }//end constructor
 
    public void act()
    {
        int groundLevel = (getWorld().getHeight())- (getImage().getHeight()/2 + 15);//sets ground level to actor's current position
        boolean onGround = (getY() == groundLevel);//checks for ground level
        if (!onGround) // in middle of jump
        {
           
            ySpeed++; // adds gravity effect
            setLocation(getX(), getY()+ySpeed); // fall (rising slower or falling faster)'
           if("down".equals(Greenfoot.getKey()))
           {
                ySpeed = 5;
           }
            if (getY()>=groundLevel) // has landed (reached ground level)
            {
                setLocation(getX(), groundLevel); // set on ground
                Greenfoot.getKey(); // clears any key pressed during jump
           }
        }
        else // on ground
        {
           
            if ("space".equals(Greenfoot.getKey())) // jump key detected
            {
                ySpeed = -16; // add jump speed, change to vary jump height,(make sure it is negative)
                setLocation(getX(), getY()+ySpeed); // leave ground
            }
             
        }//end jump condition
        
        checkForDeath();//calls CheckForDeath method
      
     
    }//end of act
  
      public void checkForDeath()//checks to see if dino interacts with cactus hitbox
    {
        if (isTouching(Cactus.class))
        {
            
            setImage(new GreenfootImage("deaddino.png"));//sets the image to dead dinosaur
            getWorld().removeObject(this);//removes dinosaur from world
        }
        
    }//end CheckForDeath method
    
    
}//end class

