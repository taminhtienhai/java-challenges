package variable;

public class exercise04 {
    public static void main(String[] args) {
        String str = "abc";

        char[] chars = str.toCharArray();

        String str02 = String.copyValueOf(chars);

        System.out.println(chars);
        System.out.println(str02.toString());
    }
}
