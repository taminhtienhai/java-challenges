public class exercise03 {

    public static void main(String[] args) {
        System.out.println(isLeapYear(2020));
        System.out.println(isLeapYear(2022));
        System.out.println(isLeapYear(2023));
    }

    // Tạo 1 method nhận vào 1 số nguyên dương, số này tương ứng với năm (year),
    // trả về 1 nếu số này thuộc về năm nhuận và 0 nếu ngược lại
    static int isLeapYear(int year) {
        return year % 4 == 0 ? 1 : 0; 
    }

}
