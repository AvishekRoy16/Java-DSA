// Example of pass by value
public class PassByValue {
    public static void main(String[] args) {
        int n = 10;
        increment(n);
        // Will a take the value of the local variable as java is pass by value
        System.out.println("Main " + n);
    }

    public static void increment(int n) {
        // Increentted here
        n++;
        System.out.println("Function " + n);
    }
}
