package p1;
public class SquareMatrixChecker {

    public static void main(String[] args) {
        int[][] validSquare = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        int[][] rectangular = {
            {1, 2},
            {3, 4},
            {5, 6}
        };

        int[][] ragged = {
            {1, 2, 3},
            {4, 5},
            {6, 7, 8}
        };
         System.out.println("Is validSquare square? " + isSquareMatrix(validSquare));   // true
        System.out.println("Is rectangular square? " + isSquareMatrix(rectangular)); // false
        System.out.println("Is ragged square? " + isSquareMatrix(ragged));           // false
    }

    public static boolean isSquareMatrix(int[][] matrix) {
        if (matrix == null || matrix.length == 0) {
            return false;
        }

        int rowCount = matrix.length;
        for (int i = 0; i < rowCount; i++) {
            if (matrix[i] == null) {
                return false;
            }
            if (matrix[i].length != rowCount) {
                return false;
            }
        }

        return true;
    }
}