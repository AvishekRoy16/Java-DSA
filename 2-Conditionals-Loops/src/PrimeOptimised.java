import java.util.Scanner;

public class PrimeOptimised {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int div = 2;
        while (div<=n-1) {
            if(n % div == 0){
                System.out.println("Composite");
                // Return acts as end statement
                return;
            }
            div += 1;
        }
        System.out.println("Prime");
        in.close();
    }
}
