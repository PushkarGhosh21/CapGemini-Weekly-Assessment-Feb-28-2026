package p1;
public class IdentityMatrixChecker {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 0, 0},
            {0, 1, 0},
            {0, 0, 1}
        };
        System.out.println("Is Identity Matrix: " + isIdentityMatrix(matrix));
    }

    public static boolean isIdentityMatrix(int[][] matrix) {
        if (matrix == null || matrix.length == 0) {
            return false;
        }
        int n = matrix.length;
        for (int i = 0; i < n; i++) {
            if (matrix[i] == null || matrix[i].length != n) {
                return false;
            }
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    if (matrix[i][j] != 1) return false;
                } else {
                    if (matrix[i][j] != 0) return false;
                }
            }
        }
        return true;
    }
}