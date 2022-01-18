public class PassingExample {
    public static void main(String[] args) {
        String name  = "Kunal Kushwaha";
        greet(name);
    }

    // Although the name is naam is not same still the greet is printing
    // There is no pass by ref there is only pass by value
    static void greet(String naam) {
        System.out.println(naam);
    }
}
