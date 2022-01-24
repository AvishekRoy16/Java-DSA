import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int div = 2;
        boolean isPrime = true;
        while (div<=n-1) {
            if(n % div == 0){
                isPrime = false;
            }
            div += 1;
        }
        if (isPrime == true) {
            System.out.println("Prime");
        }else{
            System.out.println("Composite");
        }
        in.close();
    }
}
