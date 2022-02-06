// https://www.codingninjas.com/codestudio/problems/find-unique_625159
public class FindUnique {
    public static void main(String[] args) {
        int[] arr = {2  , 3, 100, 6, 3, 6, 2};
        int ans = findUnique(arr);
        System.out.println(ans);
    }

    public static int findUnique(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            int j;
            for(j = i+1; j < arr.length; j++) {
                if(i != j) {
                    if(arr[i] == arr[j]) {
                        break;
                    }
                }
            }
            if(j == arr.length) {
                return arr[i];
            }
        }
        return Integer.MAX_VALUE;
    }
}
