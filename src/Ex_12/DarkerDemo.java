package Ex_12;

import java.awt.*;


public class DarkerDemo {
    public static void main(String[] args) {
        Color c1 = Color.RED.darker();
        Color c2 = c1.darker();
        System.out.print("Red: ");
        System.out.println(c2.getRed());
        System.out.print("Green: ");
        System.out.println(c2.getGreen());
        System.out.println("Blue: ");
        System.out.println(c2.getBlue());
    }
}
