import java.util.Scanner;

public class StringExample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please Enter your name");
        String name = in.nextLine();
        String personalised = myGreet(name);
        System.out.println(personalised);
        in.close();

    }
    static String myGreet(String name) {
        String message = "Hello " + name;
        return message;
    }
    
}
