import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        int[] arr = takeInput();
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]> max) {
                max = arr[i];
            }
        }
        System.out.println(max);
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

