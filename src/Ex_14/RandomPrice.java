package Ex_14;

import java.util.Random;

public class RandomPrice {
    public static void main(String[] args) {
        Random generator = new Random();
        double random = generator.nextDouble(19.95-10.00);
        System.out.println(random + 10);
    }
}
