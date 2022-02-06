public class FindDuplicate {
    public static void main(String[] args) {
        int[] arr ={0, 7, 2, 5, 4, 7, 1, 3, 6};
        int ans = findDuplicate(arr);
        System.out.println(ans);
    }

    public static int findDuplicate(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (i != j) {
                    if(arr[i] == arr[j]){
                        return arr[i];
                    }
                }
            }
        }
        return -1;
    }
}
