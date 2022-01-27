import java.util.Scanner;

public class BasicsOfArrays {
    public static void main(String[] args) {
        // int arr[] = new int[10];
        // arr[0] = 5;
        // System.out.println(arr[0]);

        // Taking user input
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = s.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            // System.out.println("Enter the value at "+i+"th index");
            arr[i] = s.nextInt();
        }

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        s.close();
    }
}
