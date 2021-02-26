package Circle;

/*"Create a circle class such that it has 
1. Two data members: Radius(double) and a center (an instance of Point class, which we created earlier)

2. Various constructors to create a circle such that
   a. center at (0,0) and Radius as unity 1,
   b. center at (x,y) and radius and Unity 1,
   c. center at (x,y) and radius as R,
   d. centre at (Point P) and Radius as unity 1,
   e. centre at (Point P) and Radius as R

3. Various getter and setter methods as:
   a. getCenterX(), setCenterX(), getCenterY(), setCenterY(),
   c. getCenterP(), setCenterP(), to get and set center as a Point
   d. getRadius(), setRadius(), to get and set the Radius

4. Various distance calculation methods such that it returns the distance from the center of this circle  
   a. to the center of the another Circle given as parameter
   b. from another point given as parameter
   c. from cordinate x,y given as parameter*/
   
   class Circle
   {
       private double radius;
       private Point center;
       //Point a = null;
       
       //create all the constructors & all the methods here
       Circle()
       {
           this.radius = 1;
           this.center = new Point(0, 0);
       }
       
       Circle(float x, float y)
       {
           this.radius = 1;
           this.center = new Point(x, y);
       }
       
       Circle(double rad, float x, float y)
       {
           this.radius = rad;
           this.center = new Point(x, y);
       }
   
       Circle(Point p)
       {
           this.radius = 1;
           this.center = new Point(p);              //this.center = p; what if user changed the coordinates of the point from outside using this Point p 
       }
       
       Circle(double rad, Point p)
       {
           this.radius = rad;
           this.center = new Point(p);
       }
       
       float getCenterX()
       {
           return this.center.getXCoordinate();
       }
       
       float getCenterY()
       {
           return this.center.getYCoordinate();
       }
       
       void setCenterX(float x)
       {
           this.center.setXCoordinate(x);
       }
       
       void setCenterY(float y)
       {
           this.center.setYCoordinate(y);
       }
       
       Point getCenterP()
       {
           return new Point(this.center);
       }
       
       void setCenterP(Point p)
       {
           //Point s = new Point(p.getXCoordinate(), p.getYcoordinate())
           this.center = new Point(p);
       }
       double getRadius()
       {
           return this.radius;
       }
       void setRadius(float rad)
       {
           this.radius = rad;
       }
       
       double getDistanceFromCircle(Circle c)
       {
           Point q = c.center;
           return this.center.calculateDistBetPoints(q);
       }
       double getDistanceFromPoint(Point p)
       {
           return this.center.calculateDistBetPoints(p);
       }
       double getDistanceFromCoordinate(float x, float y)
       {
           Point p = new Point(x, y);
           return this.center.calculateDistBetPoints(p);
       }
       
       public String toString()
       {
           return String.format("Radius = " + this.getRadius() + " Coordinates of center: (" + this.getCenterX() + ", " + this.getCenterY() + ")");
       }           
   }