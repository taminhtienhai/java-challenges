package strings;

import java.util.Arrays;

public class exercise01 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(dedupeV1("abca")));
        System.out.println(Arrays.toString(dedupeV1("abcd")));
        System.out.println(Arrays.toString(dedupeV1("abcdac")));
        System.out.println(Arrays.toString(dedupeV1("")));

        System.out.println(Arrays.toString(dedupeV2("abca")));
        System.out.println(Arrays.toString(dedupeV2("abcd")));
        System.out.println(Arrays.toString(dedupeV2("abcdac")));
        System.out.println(Arrays.toString(dedupeV2("")));
    }

    // Tìm các ký tự trùng nhau có trong 1 chuỗi
    static String[] dedupeV1(String str) {
        String result = "";
        for (char c: str.toCharArray()) {
            // "abca".split('a') => [,"bc",] => length = 3
            // "abc".split('b') => ["a", "c"] => length = 2
            if (str.split(String.valueOf(c), 3).length > 2) {
                if (result.indexOf(c) < 0) {
                    result += c;
                }
            }
        }
        return result.split("");
    }

    static String[] dedupeV2(String str) {
        String temp = "";
        String result = "";

        for (char c: str.toCharArray()) {
            if (temp.indexOf(c) >= 0) {
                result += c;
                continue;
            }
            temp += c;
        }

        return result.split("");
    }
}
