import java.util.Arrays;

public class ChangeValue {
    public static void main(String[] args) {
        // create and array
        int[] arr = {1,3,4,2,45,6};
        change(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void change(int[] nums){
        // If we make a change to the object via the ref variable same obj will be changed.
        nums[0] = 99;
    }
}
