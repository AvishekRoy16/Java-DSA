import java.util.Arrays;

public class RunningSum {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        int[] ans = new int[nums.length];
        int temp = 0;
        for (int i = 0; i < ans.length ; i++) {
            ans[i] = nums[i] + temp;
            temp = ans[i];
        }
        System.out.println(Arrays.toString(ans));
    }
}
