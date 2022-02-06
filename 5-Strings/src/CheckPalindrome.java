import java.util.Scanner;

public class CheckPalindrome {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.next();
        boolean a = checkPalindrome(str);
        if (a) {
            System.out.println("Palindrome");
        }else{
            System.out.println("Not a Plaindrome");
        }
        s.close();
    }

    public static boolean checkPalindrome(String str) {
        boolean a = false;
        String rev = "";
        for (int i = str.length() - 1; i >=0; i--) {
            rev += str.charAt(i);
        }
        if (str.equals(rev)) {
            a = true;
        }
        return a;
    }
}
