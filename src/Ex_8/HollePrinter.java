package Ex_8;

public class HollePrinter {
    public static void main(String[] args) {
       String s = "Hello, World!";
       s = s.replace("e","#");
       s = s.replace("o","e");
       s = s.replace("#","o");
        System.out.println(s);
    }
}
