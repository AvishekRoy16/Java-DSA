import java.util.Arrays;

public class Concatination {
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        int arr[] = new int[2*nums.length];
        for (int i = 0; i < nums.length; i++) {
            arr[i] = nums[i];
            arr[i+nums.length] = nums[i];
        }
        System.out.println(Arrays.toString(arr));
    }
}
