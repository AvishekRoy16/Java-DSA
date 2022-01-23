// You are given an m x n integer grid accounts where accounts[i][j] is the amount of money the i​​​​​​​​​​​th​​​​ customer has
//  in the j​​​​​​​​​​​th​​​​ bank. Return the wealth that the richest customer has.
// A customer's wealth is the amount of money they have in all their bank accounts. The richest customer is the customer that has the maximum wealth.
public class MaximumWealth {
    public static void main(String[] args) {
        int[][] arr = {
            {1,2,3},
            {3,100,1}
        };
    
        int max = 0;
        
        for(int i = 0; i < arr.length; i++ ){
            int sum = 0;
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
            if (max < sum) {
                max = sum;
            }
            
        }
        System.out.println(max);
    }
    
}
