public class OtoparkSistemi{
    public static void main(String[] args){

        int[][] otopark = { 
            {1, 0, 0, 1, 1, 0, 0, 1, 0, 0},
            {0, 0, 1, 1, 0, 0, 1, 0, 0, 1},
            {1, 1 ,1, 0, 0, 0, 1, 1, 0, 0},
            {0, 0, 0, 0, 1, 0, 0, 0, 1, 0},
            {1, 0, 1, 0, 0, 1, 0, 1, 0, 1}
        };
       
        int enYogunKat = 0; 
        int enCokAracSayisi = 0; 
        for(int i = 0; i < otopark.length ; i++){
            int sayac = 0; 
            for(int j = 0; j < otopark[i].length; j++){
                if(otopark[i][j] == 1)
                    sayac++;
            }
            if(enCokAracSayisi < sayac){ // 2 ve 4. katlarda anyı sayıda araç var ama algoritmalar genelde ilk bulduğu değeri baz aldığı için sadece "<" kullanıyoruz 
                enCokAracSayisi=sayac;
                enYogunKat=i;
            }
            System.out.println("Kat " + i + ": " + sayac + " arac park etmis");
        }
        System.out.println("En yogun kat " + enYogunKat + ", arac sayisi " + enCokAracSayisi);
        System.out.println();
        for(int k = 0; k < otopark[2].length; k++){
            otopark[2][k] = 0;
        }
        /*
        *System.out.println(Arrays.deepToString(otopark)); 
        *böyle döngü kullanmadan yazdırabilirim
        */
        for(int l = 0; l < otopark.length; l++){
            System.out.print("Kat: " + l + " | ");
            for(int m = 0; m < otopark[l].length; m++){
                System.out.printf(" %d", otopark[l][m]); 
                /*
                *System.out.printf(" " + otopark[l][m]);
                *olarakta yazdırabilirdim ama "printf" kullanmak daha temiz bir görsel verir. "printf" kullanmaya alış
                */
            }
            System.out.println();
        }
    }
}
