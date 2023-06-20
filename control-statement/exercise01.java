public class exercise01 {
    public static void main(String[] args) {
        var a = evaluate(80);
        var b = evaluate(60);
        var c = evaluate(40);
        var d = evaluate(20);
        var e = evaluate(1);

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);

    }

    // Cho thang điểm từ 0 - 100, sinh viên được xếp hạng dựa trên thứ tự như sau
    // - Từ 80 - 100 tương ứng thang điểm A
    // - Từ 60 - 79 tương ứng thang điểm B
    // - Từ 40 - 59 tương ứng thang điểm C
    // - Từ 20 - 39 tương ứng thang điểm D
    // - Từ 0 - 19 tương ứng thang điểm E
    static String evaluate(int score) {
        if (score > 79) { return "A"; }
        if (score > 59) { return "B"; }
        if (score > 39) { return "C"; }
        if (score > 19) { return "D"; }
        return "E";
    }
}
