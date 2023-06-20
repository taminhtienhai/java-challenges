package arrays;

import java.util.Arrays;

public class exercise02 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(dedupe(new String[] { "a", "b", "a" }))); // ["a"]
        System.out.println(Arrays.toString(dedupe(new String[] { "a", "b", "c" }))); // []
    }

    //  Tạo hàm tìm các phần tử trùng nhau trong mảng String
    static String[] dedupe(String[] arr) {
        String temp = "";
        String result = "";

        for (String item : arr) {
            if (temp.indexOf(item) >= 0) {
                result += item;
                continue;
            }
            temp += item;
        }

        return result.split("");
    }

}
