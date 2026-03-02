package p1;
public class RowMC {

    public static void main(String[] args) {
        // Row Matrix 
        int[][] rowMatrix = {{10, 20, 30}};
        
        //Test Case 2
        int[][] squareMatrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        //Test Case 3
        int[][] columnMatrix = {{1}, {2}, {3}};

        //Test Case 4
        int[][] emptyMatrix = {};
        int[][] nullRow = {null}; 
        int[][] emptyRow = {{}};  

        // Printing Results
        System.out.println("Test 1 (Row Matrix): " + isRowMatrix(rowMatrix));       // Expected: true
        System.out.println("Test 2 (Square Matrix): " + isRowMatrix(squareMatrix)); // Expected: false
        System.out.println("Test 3 (Column Matrix): " + isRowMatrix(columnMatrix)); // Expected: false
        System.out.println("Test 4a (Empty): " + isRowMatrix(emptyMatrix));         // Expected: false
        System.out.println("Test 4b (Null Row): " + isRowMatrix(nullRow));           // Expected: false
        System.out.println("Test 4c (Empty Row): " + isRowMatrix(emptyRow));         // Expected: false
    }

    
    public static boolean isRowMatrix(int[][] matrix) {
        
        if (matrix == null || matrix.length != 1) {
            return false;
        }

        if (matrix[0] == null || matrix[0].length == 0) {
            return false;
        }

        return true;
    }
}