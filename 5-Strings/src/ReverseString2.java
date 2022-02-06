import java.util.Scanner;

public class ReverseString2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        String reverse = reverseString(str);
        System.out.println(reverse);
        s.close();
    }

    public static String reverseString(String str) {
        String reveString = "";
        for (int i = 0; i < str.length(); i++) {
            reveString = str.charAt(i) + reveString;
        }
        return reveString;
    }   
}
