package Circle;

public class Point
{
    private float xCoordinate;
    private float yCoordinate;
    Point()
    {
        this.xCoordinate = 0;
        this.yCoordinate = 0;
    }
    Point(float xCor, float yCor)
    {
        this.xCoordinate = xCor;
        this.yCoordinate = yCor;
    }
    Point(Point ref)
    {
        this.xCoordinate = ref.xCoordinate;
        this.yCoordinate = ref.yCoordinate;
    }
    
    public void setCoordinates(float xCor, float yCor)
    {
        this.xCoordinate = xCor;
        this.yCoordinate = yCor;
    }
    public void setXCoordinate( float xCor)
    {
        this.xCoordinate = xCor;   
    }
    public void setYCoordinate( float yCor)
    {
        this.yCoordinate = yCor;
    }
    public float getXCoordinate( )
    {
        return this.xCoordinate;
    }
    public float getYCoordinate( )
    {
        return this.yCoordinate;   
    }
    public void moveVertical(float diff)
    {
        this.yCoordinate += diff;
    }
    public void moveHorizontal(float diff)
    {
        this.xCoordinate += diff;
    }
    double calculateDistBetPoints(Point pRefrence)
    {
        if(pRefrence == null)
            return 0.0;
            
        float x = this.xCoordinate - pRefrence.xCoordinate;
        float y = this.yCoordinate - pRefrence.yCoordinate;
        return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
    }
}
