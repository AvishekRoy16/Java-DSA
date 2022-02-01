import java.util.Scanner;

// https://www.codingninjas.com/codestudio/problems/linear-search_624470

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = takeInput();
        int x = 1;
        int res = linearSearch(arr, x);
        System.out.println(res);
        
        
    }

    public static int linearSearch(int arr[], int x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                return i;
            }
        }
        return -1;
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
