import java.util.Scanner;

public class CheckPrime {
    public static void main(String[] args) {
        int n;
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        boolean isPrime = checkPrime(n);
        System.out.println(isPrime);
        in.close();
    }

    public static boolean checkPrime(int n) {
        int div = 2;
        while (div <= n/2 ) {
            if (n%div == 0) {
                // Not prime
                return false;
            }
            div += 1;
        }    
        return true;  
    }
}
