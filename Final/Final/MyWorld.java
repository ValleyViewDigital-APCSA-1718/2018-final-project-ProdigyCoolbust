import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;//Imports Array List to store objects in the end game pop up menu
/**
 * 
 * World Class that spawns actors, and initiaes and counts most of the varaibles used in the game.
 * Sidney Robinson
 * Final Version
 */
public class MyWorld extends World
{
    //Instance variable initiations
    public String s1,s2,s3;
    public String PlInfo;
    public boolean once = false;
    public int score1;
    public int scoreDelay;
    public boolean Running = false;
    private int CactusSpawnTimer;
    private int timer;
    private int speed = 50;
    //arraylist initiation
    ArrayList arrLi = new ArrayList(7);
   
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld() //constructs world
    {    
        // Create a new world with 800x400 cells with a cell size of 1x1 pixels.
        super(800, 400, 1); 
        InitialCol(); // Calls the void that lets the user input their initials for a more customized experience
        //addObject(new Dino(),55,360);
        addObject(new Dino2(),55,362); //creates the dino/playable character
        addObject(new ground(),283,395);//creats the ground layer
        addObject(new ground(),560,395);//creats the second half of the ground layer
    
      
       addObject(new ScoreCounter(), 686,30); //creats the score counter displayed in the upper right
       addObject(new GameRunningText(), 120,30);//creats the gamerunning counter displayed in the upper left
       arrLi.add(23);//adds mock high scores to the initial ArrayList
       arrLi.add(35);//adds to the initial ArrayList
       arrLi.add(41);//adds to the initial ArrayList
       arrLi.add(12);//adds to the initial ArrayList
       arrLi.add(4);//adds to the initial ArrayList
        
       
    }
    public void act() //method called when run is hit
    {
         
        if (getObjects(Dino2.class).size() != 0) //adds the scores as long as the game is running and the dino is still in the world(aka alive)
        {
            addScore();//adds the score by one every 70 frameds aka 1 secondish
        }
         Running = true;//sets running boolean to true
         spawn();//calls spawn method
         prog();//calls prog method making the game get faster as it runs
         if (getObjects(Dino2.class).size() == 0)//Once Dino is removed it displays end game texts and changes variables used in other subclasses
         {
           addObject(new GameOver(), getWidth()/2, getHeight()/2); //creates the game over screen in the middle of the world;
           Running = false; //Switches game running to false changing the input recieved by the GameRunning actor
           addObject(new PInfo(s1,s2,s3), getWidth()/2, getHeight()/4);//creates the player info and score displayed in end games
           arrLi.add(score1);//adds player score to the arraylist
          
           HighScoreCheck();//calls highscore method and displays pop up terminal
           Greenfoot.stop(); //stops game from running
         }
         
         
        
    } //end of act method
   
    
      
    
  
    private void spawn()//spawns cacti
    {
       CactusSpawnTimer = (CactusSpawnTimer+1)%70;//makes it spawn every 70 frames adding a delay
       if( CactusSpawnTimer ==0 && Greenfoot.getRandomNumber(10)<2)
      {
        addObject(new Cactus(),780 - Greenfoot.getRandomNumber(50),367);
      }
      else if  (CactusSpawnTimer ==0 && Greenfoot.getRandomNumber(10)<4)
      {
        addObject(new DCactus(),780 - Greenfoot.getRandomNumber(50),367);
      }else if (CactusSpawnTimer ==0 && Greenfoot.getRandomNumber(10)<6)
      {
       addObject(new TCactus(),(780 - Greenfoot.getRandomNumber(50)) ,367);
      } 
      //spawns cacti at the right edge of the screen every 70 in game frames with a slight variation to the x(adding randomness), each cacti has a different 
      //rate of spawn and it is possible that a cacti doesnt't spawn as well
      
      
       
    }//end of spawn method
    private void InitialCol()//allows for user name input
    {   
        //Asks the initial of the player and stores the values in S1,S2,S3 which is called later(not kittycat proof)
        s1 = Greenfoot.ask("Please Enter Your First Initial and press Enter");
     
        s2 = Greenfoot.ask("Please Enter Your Second Initial and press Enter");
     
        s3 = Greenfoot.ask("Please Enter Your Third Initial and press Enter");
     
        once = true;//sets the once value to true which allows this to only be called once in the act(if graphically desire)
    }//end of void InitialCol
     private void prog()// a void allowing the game to speed up with time
     {
        timer++; //constaly adds time
        if (timer == 300) //an if statement that allows for a delay in the speed up of the game
        {
            timer =0;//resets delay timer
            speed ++;//variable holding the increasing speed of the game
            Greenfoot.setSpeed(speed);//Increased the speed of the game
        }
     }//end of prog
       private void addScore()//adds score
    {
        scoreDelay = (scoreDelay + 1)%30;//allows for a delay
        if (scoreDelay == 0)
        {
            score1++;//score increases
           
        }
        
       
    }//end of addScore void
    private void HighScoreCheck()
    {
        int tempv = 0;//temporary variable for comparason
        
        for (int i = 0; i < arrLi.size(); i++)
        {
           System.out.println(arrLi.get(i)); //prints the array
           if (i == 5)
           {
            System.out.println("Your Score: " + arrLi.get(i));
           }//prints user score at the end of the game
        }
        
        for (int j = 0; j <arrLi.size(); j++)
        {
           
        
            if ( (Integer) arrLi.get(j) <= (Integer) arrLi.get(5))//sets the value of temp to the user score if it is larger than values in the arraylist
           {
            
             tempv = (Integer) arrLi.get(5);//sets the value of tempv as the user score if it is larger than values in array list
           }
            
        }
        
        if (tempv > 41)//highest mock high score
        {
            System.out.println("NEW HighScore! " + s1 + s2 + s3 + "  " + tempv);
        }
        else
        {
            System.out.println("NO new highScore");
        }//prints out information on player score and highscore
    }//end highsscore
  
}//end of class
    