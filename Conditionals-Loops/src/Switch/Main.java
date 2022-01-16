package Switch;

import java.util.Scanner;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String fruit = in.next();

        // .equal checks the value and not the reference
        // As we can see this is not loking very neat we can use switch cases for this
        // if (fruit.equals("mango")){
        //     System.out.println("king of fruit");
        // }
        // if  (fruit.equals("A sweet red fruit"))


        // If no break is added after the end of a case statement then it will keep on going till it encounters a break
        switch (fruit) {
            case "Mango":
                System.out.println("King of Fruits");
                break;
            case "Apple":
                System.out.println("A sweet red fruit");
                break;
            case "Orange":
                System.out.println("Round Fruit");
                break;
            case "Grapes":
                System.out.println("Small Fruit");
        
            default:
                System.out.println("Please Enter a Valid Fruit");
        }
        in.close();
    }
}
