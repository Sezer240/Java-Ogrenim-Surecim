public class SinavSistemi{
    public static void main(String[] args){

        int[] notlar={45, 92, 38,75, 55, 10, 98, 62, 49, 88};

        //notu ve yıldızları yazdırdım. Görev1
        for(int i = 0; i < notlar.length ; i++){
            System.out.print("Ogrenci " + i + " " + "(" + notlar[i] + ") ");
            for(int j = 0; j < notlar[i]/10 ; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        //notlar<50 ise +20 değilse +10 yapıyorum ve 100'ü geçen not varsa 100'e eşitliyorum. Görev2
        for(int k = 0 ; k < notlar.length ; k++){
            if(notlar[k] < 50){
                notlar[k] += 20;
            } else {
                notlar[k] += 10;
            } 
            if(notlar[k]>100){
                notlar[k] = 100;
            }
        }
        System.out.println(java.util.Arrays.toString(notlar));

        //en yüksek ve en düşük notları hangi öğrenciye ait olduğu ile birlikte buluyorum. Görev3
        int gecicimax=notlar[0];
        int gecicimin=notlar[0];
        int mutlakMaksIndex=0;
        int mutlakMinIndex=0;

        for(int l = 1 ; l < notlar.length ; l++){
            if(gecicimax < notlar[l]){
                gecicimax = notlar[l];
                mutlakMaksIndex=l;
            }
            if(gecicimin > notlar[l]){
                gecicimin = notlar[l];
                mutlakMinIndex=l;
            }
        }
        System.out.println("En yuksek nota sahip ogrencinin numarasi " + mutlakMaksIndex + " ve notu " + gecicimax);
        System.out.println("En dusuk nota sahip ogrencinin numarasi " + mutlakMinIndex + " ve notu " + gecicimin);
    }
}
