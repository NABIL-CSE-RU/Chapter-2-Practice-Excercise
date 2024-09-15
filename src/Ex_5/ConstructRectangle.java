package Ex_5;

import java.awt.*;

public class ConstructRectangle {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(10, 20,6,14);
        Rectangle r2 = new Rectangle(10,11,5,6);

        System.out.println("R1 Height = " + r1.getHeight());
        System.out.println("R1 Width = " + r1.getWidth());
        System.out.println("R2 Height = " + r2.getHeight());
        System.out.println("R2 Width = " + r2.getWidth());
    }
}



