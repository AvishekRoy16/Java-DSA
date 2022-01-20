import java.util.Arrays;

public class PassingFunctions {
    public static void main(String[] args) {
        int[] nums = {0,1,2,3,4};
        System.out.println(Arrays.toString(nums));
        change(nums);
        System.out.println(Arrays.toString(nums));
    }

    // Shows tha the arrays are mutable
    static void change(int[] arr){
        arr[0] = 99;
    }
}
