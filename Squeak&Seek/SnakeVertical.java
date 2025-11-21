import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SnakeVertical here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SnakeVertical extends Actor
{
    /**
     * Act - do whatever the SnakeVertical wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    private int direction = 2;
    
    public void act()
    {
        moveSnakeVertical();
        checkCollision();
    }
    
    public void moveSnakeVertical() {
        setLocation(getX(), getY() + direction);
        }
        
    public void checkCollision() {
        if (isTouching(MazeWall.class)) {
            setLocation(getX(), getY() - direction);
            direction = -direction;
            flipSnakeVertical();
        }
        
        if (isAtEdge()) {
            direction = -direction;
            flipSnakeVertical();
        }
    }
    
    public void flipSnakeVertical() {
        GreenfootImage imageSnakeVertical = getImage();
        imageSnakeVertical.mirrorHorizontally();
        setImage(imageSnakeVertical);
        
    }
}
