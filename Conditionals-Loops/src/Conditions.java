import java.util.Scanner;

public class Conditions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int salary = sc.nextInt();
        if (salary >10000){
            salary += 2000;
        } else if(salary >20000){
            salary += 4000;
        } else{
            salary += 1000;
        }
        System.out.println("Your salary after the increment is "+ salary);
    }
}
