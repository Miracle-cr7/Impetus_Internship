package Point;

/*
Create a Main class & main function that invookes different constructors of the class Point &
also call every function of the class Point atleast once
 */

public class Main {

    public static void main(String[] args) {
        Point p = new Point();
        Point q = new Point(5, 10);
        Point r = new Point(6, 12);
        String s = " y = ";
        System.out.println("Coordinates of Point p : x = " + p.getXCoordinate() + s + p.getYCoordinate());
        System.out.println("Coordinates of Point q : x = " + q.getXCoordinate() + s + q.getYCoordinate());
        System.out.println("Coordinates of Point r : x = " + r.getXCoordinate() + s + r.getYCoordinate());
        
        p.setXCoordinate(3);
        p.setXCoordinate(4);
        
        System.out.println("New Coordinates of Point p : x = " + p.getXCoordinate() + s + p.getYCoordinate());
        
        r.setCoordinates(10, 20);
        System.out.println("New Coordinates of Point r : x = " + r.getXCoordinate() + s + r.getYCoordinate());
        
        System.out.println("Distance between Point p & r = " + p.calculateDistBetPoints(r));
        
        System.out.println("Distance between Point r & p = " + r.calculateDistBetPoints(p));
        
        System.out.println("Distance between Point p & q = " + p.calculateDistBetPoints(q));
        
        System.out.println("Distance between Point q & r = " + q.calculateDistBetPoints(r));
        
        //moving point in different directions
        
        Point t = new Point(9,9);
        System.out.println("Coordinates of Point t : x = " + t.getXCoordinate() + s + t.getYCoordinate());
        
        t.moveHorizontal(1);//right
        System.out.println("Coordinates of Point t after moving right : x = " + t.getXCoordinate() + s + t.getYCoordinate()); 
        
        t.moveVertical(1);//up
        System.out.println("Coordinates of Point t after moving up : x = " + t.getXCoordinate() + s + t.getYCoordinate()); 
        
        Point u = new Point(25, 30);
        System.out.println("Coordinates of Point u : x = " + u.getXCoordinate() + s + u.getYCoordinate());
        
        u.moveHorizontal(-5);//left
        System.out.println("Coordinates of Point u after moving left : x = " + u.getXCoordinate() + s + u.getYCoordinate()); 
        
        u.moveVertical(-5);//down
        System.out.println("Coordinates of Point u after moving down : x = " + u.getXCoordinate() + s + u.getYCoordinate()); 
        
        Point b = new Point(10,20);
        Point a = new Point(b);
        System.out.println("Coordinates of Point u after : x = " + a.getXCoordinate() + s + a.getYCoordinate());
    }
}
