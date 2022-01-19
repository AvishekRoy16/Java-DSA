// Two functions of the same name can exisit if the have different arguments
public class Overloding {
    public static void main(String[] args) {
        fun(67);
        fun("Avihsek Roy");
    }

    static void fun(int a){
        System.out.println(a);
    }

    static void fun(String name){
        System.out.println(name);
    }
}
