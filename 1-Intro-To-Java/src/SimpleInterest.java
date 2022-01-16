// Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Principle, Rate and Time REspectively");
        float p = input.nextFloat();
        float r = input.nextFloat();
        float t = input.nextFloat();
        float ans = (p*r*t)/100;
        System.out.println("The Simple Interest is "+ ans);
        input.close();
    }
    
}
