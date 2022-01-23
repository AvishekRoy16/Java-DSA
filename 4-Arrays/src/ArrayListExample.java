import  java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        // Syntax
        ArrayList<Integer> list = new ArrayList<>(10);
        list.add(634);
        list.add(2);
        list.add(64);
        list.add(32);
        list.add(14);
        list.add(94);
        System.out.println(list.contains(634));
        System.out.println(list);
    }
}
