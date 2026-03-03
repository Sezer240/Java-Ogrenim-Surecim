import java.util.Arrays;

public class DiziKopyalama {
    public static void main(String[] args) {

        int[] orijinal={10, 20, 30};

        int[] kopya=new int[orijinal.length];
        
        for(int i = 0; i < orijinal.length; i++){
            kopya[i] = orijinal[i];
        }
        // int[] kopya = Arrays.copyOf(orijinal, orijinal.length); döngü ile Deep Copy yapmak yerine böyle de yapabilirim

        System.out.printf("Orijinal: %s \n", Arrays.toString(orijinal));
        System.out.printf("Kopya: %s \n \n", Arrays.toString(kopya));

        orijinal[0] = 999;

        System.out.printf("Orijinal: %s \n", Arrays.toString(orijinal));
        System.out.printf("Kopya: %s \n", Arrays.toString(kopya));
    }
}
