package p1;
public class NullMatrixChecker {
    public static void main(String[] args) {
        int[][] matrix = {
            {0, 0, 0},
            {0, 0, 0}
        };
        System.out.println("Is Null Matrix: " + isNullMatrix(matrix));
    }

    public static boolean isNullMatrix(int[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0] == null || matrix[0].length == 0) {
            return false;
        }
        int colCount = matrix[0].length;
        for (int[] row : matrix) {
            if (row == null || row.length != colCount) {
                return false;
            }
            for (int element : row) {
                if (element != 0) {
                    return false;
                }
            }
        }
        return true;
    }
}