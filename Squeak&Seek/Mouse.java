import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Mouse here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Mouse extends Actor
{
    /**
     * Act - do whatever the Mouse wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        moveMouse();
        checkSnake();
        checkBread();
    }
    
    public void moveMouse() {
        
        
        if (Greenfoot.isKeyDown("left")) {
            setLocation(getX() - 3, getY());
            if (isTouching(MazeWall.class) || isAtEdge()) {
                setLocation(getX() + 3, getY());
            }
        }
        if (Greenfoot.isKeyDown("right")) {
            setLocation(getX() + 3, getY());
            if (isTouching(MazeWall.class) || isAtEdge()) {
                setLocation(getX() - 3, getY());
            }
        }
        if (Greenfoot.isKeyDown("up")) {
            setLocation(getX(), getY() - 3);
            if (isTouching(MazeWall.class) || isAtEdge()) {
                setLocation(getX(), getY() + 3);
            }
        }
        if (Greenfoot.isKeyDown("down")) {
            setLocation(getX(), getY() + 3);
            if (isTouching(MazeWall.class) || isAtEdge()) {
                setLocation(getX(), getY() - 3);
            }
        }
    }
    
    public void checkSnake() {
        if (isTouching(SnakeHorizontal.class) || isTouching(SnakeVertical.class)) {
            removeTouching(Mouse.class);
            removeTouching(SnakeHorizontal.class);
            removeTouching(SnakeVertical.class);
            setImage(new GreenfootImage("You Lose!", 54, Color.BLACK, Color.RED));
            Greenfoot.stop();
        }
    }
    
    public void checkBread() {
        if (isTouching(Bread.class)) {
            removeTouching(Bread.class);
            setImage(new GreenfootImage("You Won!", 54, Color.BLACK, Color.GREEN));
            //GreenfootImage youWon = new GreenfootImage("You Won!" , 54, Color.BLACK, Color.GREEN);
            Greenfoot.stop();
        }
    }
}
