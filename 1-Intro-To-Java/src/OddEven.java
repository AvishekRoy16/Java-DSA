// Write a program to print whether a number is even or odd, also take input.

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        if (a%2 == 0) {
            System.out.println("The no is even");
        } else {
            System.out.println("The no is odd");
        }
    }
}
