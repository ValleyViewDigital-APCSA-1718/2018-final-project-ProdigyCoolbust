import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.Scanner.*;//imports java scanner class
/**
 * 
 * Player Info class that allows for player info to be stored and has overloaded constructors for varying lengths of player information
 * Sidney Robinson
 * Final Version
 */
public class PInfo extends ScoreCounter
{
    //Instance variable
    private String I1,I2,I3;
    /**
     * Act - do whatever the PInfo wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
       // Scanner s1 = new Scanner(System.in);
      
        setImage(new GreenfootImage("Player: " + toString(), 24, Color.BLACK, Color.WHITE));//sets and constantly updates image at act call
    }//end of act method
    
    public PInfo()//default constructor
    {
        I3 = null;
        I2 = null;
        I3 = null;
    } 
    //three overloaded constructors for the PInfo class
    public PInfo(String I1)
    {
        this.I1 = I1;
    }
    public PInfo(String I1, String I2)
    {
        this.I1= I1;
        this.I2 = I2;
    }
    public PInfo(String I1,String I2, String I3)
    {
        this.I1= I1;
        this.I2 = I2;
        this.I3 = I3;
    }
    //end of overloaded constructor series
    public String toString()//toString
    {
        String toString;
        int score =((MyWorld) getWorld()).score1;
        toString = I1  + I2  + I3 + " " + "Score: " + score;
        
        return toString;
    }//end of toString
}//end of class
