import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) throws Exception {
        int a = 0;
        int b = 1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the poition for the Fibonacci Series: ");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 2; i < n; i++) {
            sum = a + b;
            a = b;
            b = sum;
        }
        System.out.println(sum);
        sc.close();
    }
}
