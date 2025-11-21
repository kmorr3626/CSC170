import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Timer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Timer extends Actor
{
    /**
     * Act - do whatever the Timer wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     * 
     */
    
    private int timeLeft;
    private int counter;
    
    public Timer(int startTime) {
        timeLeft = startTime;
        counter = 0;
    }
    
    public void act()
    {
        if (counter == 0) {
        setImage(new GreenfootImage("Time Left: " + timeLeft, 24, Color.BLACK, new Color(0,0,0,0)));
    }
        
        counter++;
        
        if (counter % 60 == 0 && timeLeft > 0) {
            timeLeft--;
            setImage(new GreenfootImage("Time Left: " + timeLeft, 24, Color.BLACK, new Color(0,0,0,0)));
        }
        
        if (timeLeft == 0) {
            Greenfoot.stop();
            setImage(new GreenfootImage("Time's Up!", 54, Color.BLACK, Color.RED));
        }
        
    }
}
