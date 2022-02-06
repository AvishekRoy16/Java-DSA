// https://www.codingninjas.com/codestudio/problems/array-intersection_625161
public class ArrayInsertion {
    public static void main(String[] args) {
        int[] arr1 = {};
        int[] arr2 = {};
    }

    public static void intersections(int arr1[], int arr2[]) {
    	//Your code goes here
        for (int i = 0; i < Math.max(arr2.length,arr1.length); i++) {
            for (int j = i+1; j < arr2.length; j++) {
                if(arr1[i]==arr2[j]){
                    System.out.print(arr1[i] + " ");
                }
            }
        }
    }
}
