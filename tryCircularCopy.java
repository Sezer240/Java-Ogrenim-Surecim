import java.util.Arrays;

public class tryCircularCopy {
    public static void main(String[] args) {
        int[] source = {10, 20, 30, 40, 50};

        int[] target = new int[5];
        
        for(int i = 0; i < source.length; i++){
            int newIndex = (i+2)%source.length;
            target[newIndex] = source[i];
        }
        System.out.printf("Source: %s %n", Arrays.toString(source));
        System.out.printf("Target: %s ", Arrays.toString(target));
    }
}
/* dizi n kadar sağa ya da sola kaydırdığımızda dışarıya taşmaması için % operatörü kullanrak 
  sınırların dışına çıkan elemanların geri dönmesine yarayan bir kod yazdım */
