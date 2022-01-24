import java.util.Scanner;

/**
 * LargerOfTwo
 */
public class LargerOfTwo {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();

        if(a>b){
            System.out.println("First Number is Greater");
        }
        else if (b>a) {
            System.out.println("Second Number is Greater");
        }
        else{
            System.out.println("Both are equal");
            
        }




        // if(a>b){
        //     System.out.println("First Number is Greater");
        // }
        // if (b>a) {
        //     System.out.println("Second Number is Greater");
        // }
        // if(a==b){
        //     System.out.println("Both are equal");
            
        // }



        // if(a>b){
        //     System.out.println("First Number is Greater");
        // }else{
        //     if (b>a) {
        //         System.out.println("Second Number is Greater");
        //     }else{
        //         System.out.println("Both are equal");
        //     }
        // }
        in.close();
    }
}