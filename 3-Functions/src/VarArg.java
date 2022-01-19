import java.util.Arrays;

//  When we don't know how many arguents we have to give
public class VarArg {
    public static void main(String[] args) {
    fun(2,3,4,5,6,9,10,7,8);
    mixed(2, 199, "Avishek", "Keshav, Abhimanyu");
    }
    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }

    // Mixed arguments
    static void mixed(int a, int b, String ...v){
        System.out.println(Arrays.toString(v));
    }
}
