public class exercise02 {

    public static void main(String[] args) {
        System.out.println(compare(1, 2));
        System.out.println(compare(2, 1));
        System.out.println(compare(1, 1));
    }

    // Tạo 1 method so sánh 2 số nguyên, trả về -1 nếu `a < b`,
    // trả về 0 nếu `a == b` và 1 nếu `a > b`
    static int compare(int a, int b) {
        return a > b ? 1 : (a < b ? -1 : 0);
    }

}
