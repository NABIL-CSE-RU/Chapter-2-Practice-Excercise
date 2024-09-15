package Ex_7;

public class ReplaceTester {
    public static void main(String[] args) {
        String s = "Mississippi";
        s = s.replace("i","!");
        s = s.replace("s","$");
        System.out.println("After Replace: " + s);
        System.out.println("Expected     : M!$$!$$!pp!");
    }
}
