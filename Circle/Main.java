package Circle;

/**
 * Main class of the Java program.
 */

public class Main {

    public static void main(String[] args) {
        
        Point p = new Point(5,5);
        Point q = new Point(6,12);
        Point t;
        
        Circle c1 = new Circle();
        Circle c2 = new Circle(1,2);
        Circle c3 = new Circle(p);
        Circle c4 = new Circle(10,6,4);
        Circle c5 = new Circle(20,q);
        
        System.out.println("Circle c1-> " + c1);
        System.out.println("Circle c2-> " + c2);
        System.out.println("Circle c3-> " + c3);
        System.out.println("Circle c4-> " + c4);
        System.out.println("Circle c5-> " + c5);
        
        c1.setRadius(9);
        System.out.println("New Circle c1-> " + c1);
        
        t = c4.getCenterP();
        System.out.println("Coordinates of Point t: (" + t.getXCoordinate() + ", " + t.getYCoordinate() + ")");
        
        System.out.println("Distance between Circle c1 & c2 = "    + c1.getDistanceFromCircle(c2));
        System.out.println("Distance between Circle c5 & t = "     + c5.getDistanceFromPoint(t));
        System.out.println("Distance between Circle c3 & (3,5) = " + c3.getDistanceFromCoordinate(3,5));
        
        Circle c = new Circle(1, 2, 2);
        Point r = c.getCenterP();
        System.out.println("Circle c center -> " + r.getXCoordinate() + " " + r.getYCoordinate());
        r.setCoordinates(4,4);
        System.out.println("Circle c center -> " + c.getCenterX() + " " + c.getCenterY());
        System.out.println(r);
    }
}

