import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        // When one type of data is assigned to another type of variable
        Scanner input = new Scanner(System.in);
        // float num = input.nextInt();
        // System.out.println(num);

        int num = (int)(65.76f);
        System.out.println(num);

        // Automatic type promotion in expression
        int a = 257;
        byte b = (byte)(a); // 257 % 256 = 1
        System.out.println(b);
    }
}