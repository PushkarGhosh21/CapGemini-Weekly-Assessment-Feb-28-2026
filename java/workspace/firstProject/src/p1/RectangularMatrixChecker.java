package p1;
public class RectangularMatrixChecker {

    public static void main(String[] args) {
        int[][] rect = {
            {1, 2, 3},
            {4, 5, 6}
        };
        int[][] square = {
            {1, 2},
            {3, 4}
        };
        int[][] ragged = {
            {1, 2, 3},
            {4, 5}
        };
        System.out.println("Is 'rect' rectangular? " + isRectangularMatrix(rect));     // true
        System.out.println("Is 'square' rectangular? " + isRectangularMatrix(square)); // false
        System.out.println("Is 'ragged' rectangular? " + isRectangularMatrix(ragged)); // false
    }

    public static boolean isRectangularMatrix(int[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0] == null) {
            return false;
        }
        int rowCount = matrix.length;
        int colCount = matrix[0].length;
        if (colCount == 0) return false;
        if (rowCount == colCount) {
            return false;
        }
        for (int i = 0; i < rowCount; i++) {
            if (matrix[i] == null) {
                return false;
            }
            if (matrix[i].length != colCount) {
                return false;
            }
        }

        return true;
    }
}