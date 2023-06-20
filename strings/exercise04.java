package strings;

public class exercise04 {
    public static void main(String[] args) {
        System.out.println(joinStr(",", "a", "b")); // "a,b"
        System.out.println(joinStr("-", "x", "y", "z")); // "x-y-z"
    }

    static String joinStr(String delimiter, String... strs) {
        return String.join(delimiter, strs);
    }
}
