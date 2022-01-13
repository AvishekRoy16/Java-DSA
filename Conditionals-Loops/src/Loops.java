import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        
        /*
        Syntax for loops
        for (initialisation; condition; increment/decrement){
            // body
        }
        */

        // Print numbers from 1 to 5
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // for (int num = 1; num <= n; num++){
        // System.out.print(num + " ");
        // }
        

        /*
        While Loop
        Syntax

        initialisation
        while(condition){
            // body
        }    
        */
        
        // int num = 1;
        // while(num <= 5){
        //     System.out.println(num);
        //     num ++;
        // }

        /*
        Do while loop - Loop will execute at least once
        Syntax
        do{
            // body
        } while(condition)
        */
        int num = 1;
        do{
            System.out.println(num);
            num++;
        } while(num <= 5);
    }
}
