import java.util.Arrays;

public class tryZigZagMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int k = 0;
        int[] target = new int[9];

        for(int i = 0; i < matrix.length; i++){
            if(i%2==0){
                for(int j = 0; j < matrix[i].length; j++){
                    target[k] = matrix[i][j];
                    k++;
                }
            }else{
                for(int j = matrix[i].length - 1; j >=0; j--){
                    target[k] = matrix[i][j];
                    k++;
                }
            }       
        }
        System.out.printf("Matrix: %s %n", Arrays.deepToString(matrix));
        System.out.printf("Target: %s ", Arrays.toString(target));
    }
}
