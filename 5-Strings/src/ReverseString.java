import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        String reverse = reverseString(str);
        System.out.println(reverse);
        s.close();
    }
    public static String reverseString(String str) {
        String reverse = "";
        for (int i = str.length() -1; i >= 0; i--) {
            reverse += str.charAt(i);

        }
        return reverse;
    }
}
