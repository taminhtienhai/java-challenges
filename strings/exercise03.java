package strings;

public class exercise03 {
    public static void main(String[] args) {
        System.out.println(replace("Local Host Server IP is {}", "127.0.0.1"));
        System.out.println(replace("{} love his dog, {} prepare to take him out for walking", "Nick"));
        System.out.println(replace("lorem isum", "lorem"));
    }

    // Tìm và thay thế `{}` trong chuỗi
    static String replace(String str, String param) {
        return String.join(param, str.split("\\{\\}", Integer.MAX_VALUE));

    }
}
