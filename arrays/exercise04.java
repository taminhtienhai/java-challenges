package arrays;

import java.util.Arrays;

public class exercise04 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(dedupeBetween(new String[] { "a", "b", "c" }, new String[] { "a", "c" }))); // ["b"]
        System.out.println(Arrays.toString(dedupeBetween(new String[] { "a" }, new String[] { "d", "d" }))); // ["a"]
        System.out.println(Arrays.toString(dedupeBetween(new String[] { "a", "a" }, new String[] { "d", "d" }))); // []
    }

    // Tạo hàm nhận vào 2 mảng, trả về mảng mới có các phần tử không trùng nhau
    static String[] dedupeBetween(String[] left, String[] right) {
        // Extend length of `left` with length of `right`
        String[] concatenate = Arrays.copyOf(left, left.length + right.length);

        // Migrate all value from `right` to `left`
        int pointer = 0;
        for (int i = left.length; i < concatenate.length; i++) {
            concatenate[i] = right[pointer];
            pointer++;
        }

        String temp = "";
        String result = "";

        for (String item : concatenate) {

            if (result.indexOf(item) >= 0) {
                result = result.replace(item, "");
                temp += item;
                continue;
            }

            if (temp.indexOf(item) >= 0) {
                continue;
            }

            temp += item;
            result += item;
        }

        return result.split("");
    }
}
