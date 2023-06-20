package strings;

public class exercise02 {
    public static void main(String[] args) {
        System.out.println(findChar("Devera KITs", 1)); // 'D'
        System.out.println(findChar("Devera KITs", 6)); // 'a'
        System.out.println(findChar("Devera KITs", 7));// ' '
        System.out.println(findChar("Devera KITs", 11)); // 's'
    }

    // Tìm và trả về ký tự ở vị trí nhập vào
    static char findChar(String str, int pos) {
        return str.charAt(pos - 1);
    }
}
