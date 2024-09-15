package Ex_3;

import java.awt.*;

public class AreaTester {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(3,4,5,6);
        double area = r.getHeight() * r.getWidth();
        System.out.println("Area of Rectangle: " + area);
        System.out.println("Expected Area: 30.0");
    }
}
