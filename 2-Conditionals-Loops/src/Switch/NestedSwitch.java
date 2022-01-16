package Switch;

import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        int empID = in.nextInt();
        String department = in.next();
        switch(empID){
            case 1:
                System.out.println("Avishek Roy");
                break;
            case 2:
                System.out.println("Rahul Rana");
                break;
            case 3:
            System.out.println("Print Emp no 3");
                switch(department){
                    case "IT":
                        System.out.println("IT department");
                        break;
                    case "Management":
                        System.out.println("Management Department");
                        break;
                    default:
                        System.out.println("No department entered");
                        break;
                }
                break;
            default:
                System.out.println("Enter correct employee id");
        }
        in.close();
    }
}
