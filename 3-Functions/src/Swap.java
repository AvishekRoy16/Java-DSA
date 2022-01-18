public class Swap {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        //  Swap numbers code
        // int temp = a;
        // a = b;
        // b = temp;

        // As we are able to see change in the method does not change the variable values inside the main class
        System.out.println(a + " " + b);

        String name = "Avishek Roy";
        changeName(name);
        System.out.println(name);

    }
    static void changeName(String name) {
        name = "Abhimanyu Kumar";
    }

    static void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;
    }
}
