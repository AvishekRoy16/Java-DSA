import java.util.Scanner;


public class SumOfArray {
    public static void main(String[] args) {
        int[] arr = takeInput();
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println(sum);
    }

    public static int[] takeInput() {
         // Taking input of array
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = s.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }
        s.close();
        return arr;
    }
   
}
