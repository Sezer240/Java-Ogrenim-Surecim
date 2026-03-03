import java.util.Arrays;

public class tryDeepCopy {
    public static void main(String[] args) {

        int[][] oldArray ={ 
            {1, 2, 3, 4, 5, 6, 7, 8, 9},
            {10, 11, 12 ,13 ,14 ,15 ,16},
            {17, 18, 19, 20, 21, 22, 23},
        };

        int[][] newArray = new int[oldArray.length][];

        for(int i = 0; i < oldArray.length; i++){
            newArray[i] = new int[oldArray[i].length];
            for(int j = 0; j < oldArray[i].length; j++){
                newArray[i][j] =oldArray[i][j];
            }
        }

        System.out.printf("Old1: %s %n", Arrays.deepToString(oldArray));
        System.out.printf("New1: %s %n%n", Arrays.deepToString(newArray));

        oldArray[0][0]=0;

        System.out.printf("Old2: %s %n", Arrays.deepToString(oldArray));
        System.out.printf("New2: %s", Arrays.deepToString(newArray));
    }
}
// dizilerde kopyalama işlemini denedim
