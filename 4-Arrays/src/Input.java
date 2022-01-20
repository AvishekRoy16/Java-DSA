import java.util.Scanner;
import java.util.Arrays;

public class Input {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // int[] arr = new int[5];
        // arr[0] = 23;
        // arr[1] = 45;
        // arr[2] = 543;
        // arr[3] = 453;
        // arr[4] = 433;
        // System.out.println(arr[3]);

        //  input using for loops
        // for (int i = 0; i < arr.length; i++) {
        //     arr[i] = in.nextInt();
        // }

        // printing the array using for loop
        // for (int i = 0; i < arr.length; i++) {
        //     System.out.println(arr[i] + " ");
        // }

        // Enhanced for loop - printing for each loop
        // for(int num: arr){ // for every element in the array print the element.
        //     System.out.println(num + " ");  // here num represents the element of the array
        // }

        // Using in build method
        // System.out.println(Arrays.toString(arr));

        // Array of objects
        String[] arr = new String[4];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.next();
        }
        System.out.println(Arrays.toString(arr));
        in.close();
    }
}
