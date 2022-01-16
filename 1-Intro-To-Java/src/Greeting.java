import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your Name");
        String name = input.nextLine();
        
        System.out.println("Weclome " + name);
        input.close();
    }
}
