package p1;
public class SingletonMatrixChecker {
    public static void main(String[] args) {
        int[][] matrix = {{5}};
        System.out.println("Is Singleton: " + isSingletonMatrix(matrix));
    }

    public static boolean isSingletonMatrix(int[][] matrix) {
        if (matrix == null || matrix.length != 1) {
            return false;
        }
        if (matrix[0] == null || matrix[0].length != 1) {
            return false;
        }
        return true;
    }
}