package arrays;

import java.util.Arrays;

public class exercise03 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(findMinMax(new int[] { 1, 2, 3, 4, 5 }))); // [1,5]
        System.out.println(Arrays.toString(findMinMax(new int[] { 1, 1, 1 }))); // [1,1]
    }

    //  Tạo hàm tìm số min và max trong mảng số nguyên
    static int[] findMinMax(int[] arr) {
        int min = arr[0];
        int max = arr[0];
        for (int item : arr) {
            if (item < min) {
                min = item;
            }

            if (item > max) {
                max = item;
            }
        }

        return new int[] { min, max };
    }
}
