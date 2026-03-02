package p1;
public class DiagonalMatrixChecker {
    public static void main(String[] args) {
        int[][] matrix = {
            {7, 0, 0},
            {0, 0, 0},
            {0, 0, 3}
        };
        System.out.println("Is Diagonal Matrix: " + isDiagonalMatrix(matrix));
    }

    public static boolean isDiagonalMatrix(int[][] matrix) {
        if (matrix == null || matrix.length == 0) {
            return false;
        }
        int n = matrix.length;
        for (int i = 0; i < n; i++) {
            if (matrix[i] == null || matrix[i].length != n) {
                return false;
            }
            for (int j = 0; j < n; j++) {
                if (i != j && matrix[i][j] != 0) {
                    return false;
                }
            }
        }
        return true;
    }
}