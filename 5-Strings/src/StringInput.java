import java.util.Scanner;

public class StringInput {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        // String str;

        // Only uses token and hence we get only first entry
        // str = s.next();
        // System.out.println(str + " "+ str.length());

        // To take input of the full line
        String str1 = s.nextLine();
        System.out.println(str1 + " "+ str1.length());
        s.close();
    }
}
