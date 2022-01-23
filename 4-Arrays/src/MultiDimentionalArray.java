import java.util.Scanner;

public class MultiDimentionalArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        /*
        123
        456
        789
        */ 
        int [][] arr = new int[3][]; //It is mandetory to specify the number of rows
        System.out.println(arr.length); //no of rows

        // To directly store something
        // int [][] array2D = {
        //     {1,2,3},        // 0thh index
        //     {4,5},          // 2st index
        //     {6,7,8,9}       // 3rd index
        // };


        int [][] arr2D = new int[3][3];
        // Input
        for (int row = 0; row < arr2D.length; row++) {
            // for each col in every row
            for (int col = 0; col < arr2D[row].length; col++) {
                arr2D[row][col] = in.nextInt();
            }
        }

        // output
        for (int row = 0; row < arr2D.length; row++) {
            for (int col = 0; col < arr2D[row].length; col++) {
                System.out.print(arr2D[row][col] + " ");
            }
            // To print a new line
            System.out.println();
        }
        in.close();
    }
}
