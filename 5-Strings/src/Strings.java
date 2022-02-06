public class Strings {
    public static void main(String[] args) throws Exception {
        String str = "Hello World";
        String name = " Avishek";

        // To find the length of a string
        System.out.println(str.length());

        // To access the string at a particular char
        System.out.println(str.charAt(2));

        // Concatination
        str += name;
        System.out.println(str);

        // Concat another method
        str = str.concat(name);
        System.out.println(str);

        String a = "Coding";
        String b = "Aoding";
        // Comparing the 2 stings - ASSCI gap b.w two char  
        System.out.println(a.compareTo(b));

        // Contains
        System.out.println(a.contains("ing"));



    }
}
