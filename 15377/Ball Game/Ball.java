

public class Ball
{
    private int xPosition;
    private int yPosition;
    private int width;
    private int height;
    private int ground;
    private int roof;
    private int left;
    private int right;

    
    
    public Ball(int xPosition, int yPosition, int width, int height, int ground, int roof, int left, int right)
    {
        this.xPosition = xPosition;
        this.yPosition = yPosition;
        this.width = width;
        this.height = height;
        this.ground = ground;
        this.roof = roof;
        this.left = left;
        this.right = right;
    }
    
    /**
     * Return the ball's current x-position.
     */
    public int getXPos()
    {
        return xPosition;
    }
    
    /**
     * Return the ball's current y-position.
     */
    public int getYPos()
    {
        return yPosition;
    }
    
    /**
     * Return the ball's width.
     */
    public int getWidth()
    {
        return width;
    }
    
    /**
     * Return the ball's width.
     */
    public int getHeight()
    {
        return height;
    }
    
    /**
     * Set a new x-position for the ball.
     */
    public void setXPos(int xpos)
    {
        xPosition = xpos;
    }
    
      
    /**
     * Set a new y-position for the ball.
     */
    public void setYPos(int ypos)
    {
        yPosition = ypos;
    }
    

   
}
