 public class AramaAlgoritmalari {
    static int linearSearch(int[] dizi, int n){
        for(int i = 0; i < dizi.length; i++){
            if(dizi[i]== n){
                return i;
            }
        }
        return -1;
    }
    static int[] selectionSortInPlace(int[] dizi){
        for(int j = 0; j < dizi.length; j++){
            int enKucukIndeks=j;
            for(int k = j + 1; k < dizi.length; k++){
                if(dizi[enKucukIndeks] > dizi[k]){
                    enKucukIndeks=k;
                }
            }
            int temp = dizi[j];
            dizi[j] = dizi[enKucukIndeks];
            dizi[enKucukIndeks] = temp;            
        }
        return dizi;
    }
    static int binarySearch(int[] dizi,int n){
        int low = 0;
        int high = dizi.length-1;

        while(high >= low){
            int mid = (high + low)/2; //int mid = low + (high - low)/2;
            if(dizi[mid]==n){
                return mid;
            }else if(dizi[mid] > n){
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {

        int arananSayi=75;
        int[] notlar = {45, 92, 38, 75, 55, 10, 98};

        // Orijinal diziyi korumak gerekirse:
        // int[] kopya = java.util.Arrays.copyOf(notlar, notlar.length);
        // Mevcut durumda 'notlar' dizisi selectionSortInPlace metodu içinde kalıcı olarak sıralanacaktır.        
        int[] siralanmisDizi = selectionSortInPlace(notlar);

        System.out.printf("Linear Search: %d%n", linearSearch(notlar, arananSayi));
        System.out.printf("Linear Search metodunu Binary'e benzetme: %d%n", linearSearch(siralanmisDizi, arananSayi));
        System.out.printf("Binary Search: %d%n", binarySearch(siralanmisDizi, arananSayi));
    }
}
