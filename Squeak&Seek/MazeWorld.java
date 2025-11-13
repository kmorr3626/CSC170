import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MazeWorld extends World
{

    /**
     * Constructor for objects of class MazeWorld.
     * 
     */
    public MazeWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(900, 600, 1);
        setBackground("weave.jpg");
        
        buildMaze();
        populateMazeWorld();
    }
    
    public void buildMaze(){
        //top squares
        addObject(new MazeWall(), 330, 30);
        addObject(new MazeWall(), 330, 80);
        //addObject(new MazeWall(), 330, 130);
        
        //left side squares
        addObject(new MazeWall(), 30, 370);
        addObject(new MazeWall(), 80, 370);
        addObject(new MazeWall(), 130, 370);
        
        //middle square
        addObject(new MazeWall(), 310, 370);
        
        //bottom row
        for (int x = 180; x <= 730; x += 50)
            addObject(new MazeWall(), x, 500);
        
        //middle row
        for (int x = 180; x <= 480; x += 50)
            addObject(new MazeWall(), x, 230);
            
        //right side row
        for (int x = 670; x <= 890; x += 50)
            addObject(new MazeWall(), x, 130);
            
        //add wall squares on top of left side of middle row
        addObject(new MazeWall(), 180, 180);
        addObject(new MazeWall(), 180, 130);
            
        //middle column
        for (int y = 130; y <= 500; y += 50)
            addObject(new MazeWall(), 480, y);
            
        //rightside column
        for (int y = 130; y <= 310; y += 50)
            addObject(new MazeWall(), 670, y);
            
        //add row going off right colum
        addObject(new MazeWall(), 720, 280);
        addObject(new MazeWall(), 770, 280);
        
        //add column going off the last row mentioned above
        addObject(new MazeWall(), 770, 330);
        addObject(new MazeWall(), 770, 380);
    }
    
    public void populateMazeWorld() {
        addObject(new Mouse(), 60, 570);
        addObject(new Bread(), 860, 30);
        
        Snake snake1 = new Snake();
        Snake snake2 = new Snake();
        
        addObject(snake1, 310, 310);
        addObject(snake2, 850, 310);
    }
}
