import java.util.Scanner;
import java.util.Arrays;

public class Shorter2DArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num[][] = new int[3][3];
        // Input
        for (int row = 0; row < num.length; row++) {
            // for each col in every row
            for (int col = 0; col < num[row].length; col++) {
                num[row][col] = in.nextInt();
            }
        }

        // Smaller than
        for (int i = 0; i < num.length; i++) {
            System.out.println(Arrays.toString(num[i]));
        }
        in.close();
    }
}
