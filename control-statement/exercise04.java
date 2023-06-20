public class exercise04 {
    public static void main(String[] args) {
        printEvenV1(9);
        printEvenV2(9);
    }

    // Tạo hàm nhập và 1 số nguyên, in ra tất cả các số chẵn bắt đầu từ 0
    // This has O(n) complexity
    // Mean when n = 10 => Take 10 loop
    static void printEvenV1(int n) {
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) { continue; }
            System.out.println(i);
        }
    }

    // This has O(n/2 - 1) complexity
    // Mean when n = 10 => Take only 4 loop
    static void printEvenV2(int n) {
        int totalEven = Math.floorDiv(n, 2);
        int temp = 2;

        for (int i = 2; i <= totalEven; i++) {
            System.out.println(temp);
            temp += 2;
        }
        System.out.println(temp);
    }
}
