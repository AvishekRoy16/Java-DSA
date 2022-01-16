// To find out whether the given String is Palindrome or not.
import java.util.Scanner;

public class StringPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str_len = sc.next();
        int a = str_len.length();
        String x = "";
        for (int i = 0; i < a; i++) {
            System.out.println(str_len.charAt(a-(i+1)));
            x += str_len.charAt(a-(i+1));
        }
        sc.close();
    if (str_len.equals(x)) {
        System.out.println("Palindrome");
    }else{
        System.out.println("Not a palindrome");
    }
    }
}
