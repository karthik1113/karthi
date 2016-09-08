public class Line
{
    private int x1;
    private int x2;
    private int y2;
    private int y1;
    
    
    public Line(int x1, int y1, int x2, int y2)
    {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }
    
    
    public int getXLine()
    {
        return x1;
    }
    
    
    public int getYLine()
    {
        return y1;
    }
    
    public int getX2Line()
    {
        return x2;
    }
    
    
    public int getY2Line()
    {
        return y2;
    }
    
}


