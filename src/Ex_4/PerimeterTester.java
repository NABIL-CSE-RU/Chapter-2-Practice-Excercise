package Ex_4;

import java.awt.*;

public class PerimeterTester {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(3,4,5,6);
        double perimeter = 2 * (r.getWidth() + r.getHeight());
        System.out.println("Perimeter of Rectangle: " + perimeter);
        System.out.println("Expected Perimeter: 22.0");
    }
}
