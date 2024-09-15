package Ex_2;

public class StringTrimMethod {
    public static void main(String[] args) {
        String s = "       My country is Bangladesh     ";
        System.out.println("The String is: ");
        System.out.println(s);
        //The trim() method removes spaces from both ends of a string.
        System.out.println("Here is the string after using trim method: ");
        System.out.println(s.trim());
        System.out.println("Here is the string after using Replace Method: ");
        System.out.println(s.replace(" ", ""));
    }
}

