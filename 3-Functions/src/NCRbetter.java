import java.util.Scanner;

public class NCRbetter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int r = in.nextInt();
        int factN = factorial(n);
        int factR = factorial(r);
        int factNR = factorial(n-r);
        int result = factN/(factR*factNR);
        System.out.println(result);
    }

    public static int factorial(int num) {
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        return fact;

    }
}
