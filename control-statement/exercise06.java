import java.util.Arrays;

public class exercise06 {

    public static void main(String[] args) {

        int[][] a = {{1,2}, {1,2}};
        int[][] b = {{1,2}, {1,2}};

        System.out.println(Arrays.deepToString(mul(a, b)));
    }

    // Nhân 2 ma trận
    // https://www.mathsisfun.com/algebra/matrix-multiplying.html
    static int[][] mul(int[][] x, int[][] y) {
        int rowsX = x.length;
        int colsX = x[0].length;
        int colsY = y[0].length;

        int[][] result = new int[rowsX][colsY];

        for (int i = 0; i < rowsX; i++) {
            for (int j = 0; j < colsY; j++) {
                for (int k = 0; k < colsX; k++) {
                    result[i][j] += x[i][k] * y[k][j];
                }
            }
        }

        return result;
    }
    
}
