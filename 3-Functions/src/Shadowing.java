// Practice of using 2 var with the same name within the scope that overlaps
public class Shadowing {
    static int x = 10; // It will be available in everything in the box of shadowing
    public static void main(String[] args) {
        System.out.println(x);
        int x = 40;
        System.out.println(x); // Var with a higher level scope is hidden
        fun();
    }
    static void fun(){
        System.out.println(x);
    }
}
