package Point;

/*
Create a Class ""Point"" such that it has

1. Two Data members representing X & Y cordinates on a 2-D plane
2. Various Constructors
3. Various getter and setter methods
   a. set/get X & Y separately
   b. set/get X&Y simultaneously(no getter method)
4. Method to calculate distance of this point from another point sent as parameter
5. Method to calculate distance between this point and another x,y sent as parameter
6. Move this point right/left by d distance*/
class Point
{
    public static int x = 0;
    private float xCoordinate;
    private float yCoordinate;
    Point()
    {
        x++;
        this.xCoordinate = 0;
        this.yCoordinate = 0;
    }
    Point(float xCor, float yCor)
    {
        this.xCoordinate = xCor;
        this.yCoordinate = yCor;
    }
    
    Point(Point p)
    {
        this.xCoordinate = p.xCoordinate;
        this.yCoordinate = p.yCoordinate;
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
        float x = this.xCoordinate - pRefrence.xCoordinate;
        float y = this.yCoordinate - pRefrence.yCoordinate;
        return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
    }
}