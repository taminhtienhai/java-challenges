package arrays;

import java.util.Arrays;

public class exercise01 {
    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(groupBy(new int[] { 1,2,3,4 }))); // [[2,4], [1,3]]
        System.out.println(Arrays.deepToString(groupBy(new int[] { 1,3,5,7 }))); // [[], [1,3,5,7]]
        System.out.println(Arrays.deepToString(groupBy(new int[] { 2,4,6,8 }))); // [[2,4,6,8], []]
    }

    // Tạo hàm nhận đầu vào là 1 chuỗi các số nguyên, trả ra mảng 2 chiều gồm 2 phần tử
    // 1. Phần tử bên trái là chuỗi bao gồm các số chẵn
    // 2. Phần tử bên phải là chuỗi bao gồm các số lẻ
    static int[][] groupBy(int[] arr) {
        int evenSize = 0;
        int oddSize = 0;

        for (int num: arr) {
            if (num % 2 == 0) {
                evenSize += 1;
                continue;
            }

            oddSize += 1;
        }

        int[] evens = new int[evenSize];
        int[] odds = new int[oddSize];


        int eventCounted = 0;
        int oddCounted = 0;


        for (int num: arr) {
            if (num % 2 == 0) {
                evens[eventCounted] = num;
                eventCounted += 1;
                continue;
            }
            odds[oddCounted] = num;
            oddCounted += 1;
        }

        return new int[][] { evens, odds };
    }
}
