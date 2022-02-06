public class StringBufferDemo {
    public static void main(String[] args) {
        StringBuffer str = new StringBuffer("Hello");
        str.setCharAt(0, 'Y');
        str.append(" This is Avishek");
        System.out.println(str+ " " + str.length());

    }
}
