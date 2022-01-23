import java.util.Arrays;
import java.util.Scanner;

public class ForEAch2DArray {
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

        // For each
        for(int[]a : num){
            System.out.println(Arrays.toString(a));
        }
        
        in.close();
    }
}
