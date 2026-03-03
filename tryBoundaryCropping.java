import java.util.Arrays;

public class tryBoundaryCropping {
    public static void main(String[] args) {
        int[][] matrix={
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };

        int[][] innerMatrix = new int[matrix.length-2][matrix.length-2];

        for (int i = 1; i < matrix.length - 1; i++){ 
            for (int j = 1; j < matrix[i].length - 1; j++){ 
                innerMatrix[i-1][j-1] = matrix[i][j];
            }
        }
        System.out.printf("Matrix: %s %n", Arrays.deepToString(matrix));
        System.out.printf("InnerMatrix: %s ", Arrays.deepToString(innerMatrix));
    }
}
