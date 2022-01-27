import java.util.Scanner;

public class InputArrayFunction {
    public static void main(String[] args) {
        int[] arr = takeInput();    
        printArray(arr);
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

//  Function to print the Array
    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }

}
