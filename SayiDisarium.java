//Bir sayının rakamlarının, bulundukları pozisyona göre kuvvetleri toplamı sayının kendisine eşitse buna Disarium denir.
public class SayiDisarium {

    static boolean isDisarium(int n){

        int temp = n;
        int power=0;

        //sayının basamak sayısını buldum. burada üs sayısı olacağı için power dedim
        while(temp > 0){
            temp /=10;
            power++;
        }
        
        temp=n; //sayıyı orijinal hâline geri çevirdim
        int sum=0; //toplam değeri tutmak için kutucuk

        while(temp > 0){
            int d = temp%10; //son rakamı aldım
            int p = 1; //çarpma işlemi için kutucuk

            for(int i = 0; i < power; i++){ //rakamı power kadar kendisi ile çarp(üs alma işlemi). Burada Math.pow(d,i) olarakta kullanabilirdim bu da doğru sonuç verirdi
                p *= d;
            }
            sum += p; //sonucu toplama ata
            temp /=10; //sayının son rakamını at
            power--; //üs değerini disarium kuralına göre kullanmak için
        }
        return n == sum; //yapılan işlem sonucunda sayı ile toplam doğru ise true çevir
    }
    public static void main(String[] args) {

        int testSayisi=135;

        if(isDisarium(testSayisi)){
            System.out.printf("%d bir Disarium sayidir", testSayisi);
        }else{
            System.out.printf("%d bir Disarium sayisi degildir", testSayisi);
        }
    }
}
