import java.util.Arrays;

public class tryDiagonalExtraction {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        
        int[] primary = new int[matrix.length];
        int[] secondary = new int[matrix.length];

        for(int i = 0; i < matrix.length; i++){
            primary[i] = matrix[i][i];
            secondary[i] = matrix[i][matrix.length - 1 - i];
        }
        System.out.printf("Matrix: %s %n", Arrays.deepToString(matrix));
        System.out.printf("Primary: %s %n", Arrays.toString(primary));
        System.out.printf("Secondary: %s ", Arrays.toString(secondary));
    }
}
