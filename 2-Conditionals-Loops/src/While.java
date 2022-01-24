import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("How many times do you want to print hello");
        int n = in.nextInt();
        int i = 1;
        // print natural number from 1 to 10
        while (i <= n) {
            System.out.println(i);
            i += 1;
        }



        // while (i<=n) {
        //     System.out.println("Hello");
        //     i +=1; 
        // }
        in.close();

    }
}
