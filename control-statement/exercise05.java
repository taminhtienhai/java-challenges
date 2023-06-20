public class exercise05 {
    public static void main(String[] args) {
        pyramid(5);
    }

    // Vẽ kim tự tháp: Tạo hàm nhập vào số n, in ra kim tự tháp có n tầng
    static void pyramid(int n) {
        for (int i = 1; i <= n; i++) {
            String stack = String.valueOf(i).repeat(i);
            System.out.println(stack);
        }
    }
}
