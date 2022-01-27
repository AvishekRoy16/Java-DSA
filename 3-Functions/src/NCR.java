import java.util.Scanner;

/**
 * NCR
 */
public class NCR {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int r = in.nextInt();
        int factN = 1;
        for (int i = 1; i <= n; i++) {
            factN *= i;
        }

        int factR = 1;
        for (int i = 1; i <= r; i++) {
            factR *= i;
        }

        int factNR = 1;
        for (int i = 1; i <= n- r; i++) {
            factNR *= i;
        }

        int result = factN/(factR*factNR);
        System.out.println(result);
        in.close();
    }
}
