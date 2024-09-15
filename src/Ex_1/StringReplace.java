package Ex_1;

public class StringReplace {
    public static void main(String[] args) {
        String s = "Mississippi";
        s = s.replace("i", "ii");
        System.out.println("Length of the String = " + s.length());
        s = s.replace("ss", "s");
        System.out.println("Length of the String = " + s.length());
    }
}
