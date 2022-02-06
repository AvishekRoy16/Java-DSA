import java.util.Arrays;
import java.util.Scanner;

public class SwapAlternate {
    public static void main(String[] args) {
        int[] arr = takeInput();
        swapAlternate(arr);
        System.out.println(Arrays.toString(arr));
    }

    // Function to swap alternate
    public static void swapAlternate(int[] arr) {
        for (int i = 0; i < arr.length; i+=2) {
            int temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;
        }
    }

    //  Function to take array input
    public static int[] takeInput() {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = s.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        s.close();
        return arr;
    }
}
