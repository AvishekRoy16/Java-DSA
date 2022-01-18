//  Anything used outside we can use inside, anything that is initilised inside cannot be ude outside, but the inside block cannot be updated.
public class Scoping {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        // System.out.println(num);
        {
            // values initialised in the block will remain in the block
            a = 100; // Ressigns the original ref var to some other value
        System.out.println(a);
        }
        System.out.println(a);
        System.out.println(b);

        // Scoping in for loops
        for (int i = 0; i < 4; i++) {
            int num = 90;
            int a = 10;
        }
    }
    static void random(){
        int num = 54;
        // System.out.println(a);
    }
}
