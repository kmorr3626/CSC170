import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SnakeHorizontal here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SnakeHorizontal extends Actor
{
    /**
     * Act - do whatever the SnakeHorizontal wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    private int direction = 2;
    
    public void act() 
    {
        moveSnakeHorizontal();
        checkCollision();
    }
    
    public void moveSnakeHorizontal() {
        setLocation(getX() + direction, getY());
        }
        
    public void checkCollision() {
        if (isTouching(MazeWall.class)) {
            setLocation(getX() - direction, getY());
            direction = -direction;
            flipSnakeHorizontal();
        }
        
        if (isAtEdge()) {
            direction = -direction;
            flipSnakeHorizontal();
        }
    }
    
    public void flipSnakeHorizontal() {
        GreenfootImage imageSnakeHorizontal = getImage();
        imageSnakeHorizontal.mirrorHorizontally();
        setImage(imageSnakeHorizontal);
        
    }
    }
    
    
