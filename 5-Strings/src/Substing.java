public class Substing {
    public static void main(String[] args) {
        String a = "Coding";

        // Pass the starting index and it will give the string starting from that index
        System.out.println(a.substring(2));

        // givng a range - end index is inclusive so till n-1
        String str = a.substring(1, 5);
        System.out.println(str);
    }
}
