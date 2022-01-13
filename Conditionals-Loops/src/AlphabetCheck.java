import java.util.Scanner;


public class AlphabetCheck {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // CharAt takes the char at gives the input at this index of the string
        char ch = in.next().trim().charAt(0);

        if (ch >= 'a' && ch <= 'z'){
            System.out.println("Lowerclase");
        } else{
            System.out.println("UpperCase");
        }
        in.close();
    }
}
