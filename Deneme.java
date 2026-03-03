public class Deneme {
    public static void main(String[] args) {
        
        //100'den 1'e kadar tek sayılar
        //1.denemem
        System.out.println("100'den 1'e kadar tek sayılar,1.denemem:");
        for(int i = 100; i >= 0; i--){
            if(i%2==1){
                System.out.print(i + " ");
            }

        }
        System.out.println();

        //2.denemem
        System.out.println("100'den 1'e kadar tek sayılar,2.denemem:");
        for(int i = 50; i > 0; i--){
            System.out.print(((i*2)-1) + " ");
        }
        System.out.println();

        //3.denemem
        System.out.println("100'den 1'e kadar tek sayılar,3.denemem:");
        for(int i = 99; i >= 1; i -= 2) {
            System.out.print(i + " ");
        }
        System.out.println();

        //0-100 3 ve 7'ye bölünen sayılar
        //1.denemem
        System.out.println("0-100 3 ve 7'ye bölünen sayılar,1.denemem");
        for(int i = 0; i < 100; i++){
            if(i==0){
                continue;
            }else if(i%7==0 && i%3==0){
                System.out.print(i + " ");
            }
        } 
        System.out.println();

        //2.denemem
        System.out.println("0-100 3 ve 7'ye bölünen sayılar,2.denemem");
        for(int i = 21; i < 100; i+=21){
            if(i%7==0){
                if(i%3==0)
                System.out.print(i + " ");
            }
        }
        System.out.println();

        //3.denemem
        System.out.println("0-100 3 ve 7'ye bölünen sayılar,3.denemem");
        for(int i = 0; i < 100; i++){
            if(i==0){
                continue;
            }
            if(i%7==0){
                if(i%3==0){
                    System.out.print(i + " ");
                }
            }
        }
        System.out.println();

        //4.denemem
        System.out.println("0-100 3 ve 7'ye bölünen sayılar,2.denemem");
        for(int i = 21; i < 100; i+=21){
            System.out.print(i + " ");
        }
        System.out.println();

        //2 4 8 16 2'nin üssü olan sayılar
        //1.denemem
        System.out.println("2'nin üssü olan sayılar,1.denemem");
        for(int i = 0; i < 10; i++){
            System.out.print((int)Math.pow(2, i) + " "); 
        }
        System.out.println();

        //2.denemem
        System.out.println("2'nin üssü olan sayılar,2.denemem");
        int d = 1;
        for(int i = 0; i < 10; i++){
            //i tane 2'yi çarpmak
            int j = i; //istediğimiz gibi kullanmak için
            while(j>0){ //o anki i değeri 0 olana kadar işlem yap
                d *= 2; //d ile 2'yi çarp ve d'ye at
                j--; //i'yi azalt
            }
            System.out.print(d + " ");
            d = 1; //while bitince d'yi eski hâline çevir ki diğer değerleri de hesapla
        }
        System.out.println();

        //3.denemem
        System.out.println("2'nin üssü olan sayılar,3.denemem");
        int power = 1;
        for(int i = 0; i < 10; i++) {
            System.out.print(power + " ");
            power *= 2; 
        }
        System.out.println();

        //1-5 5'e bölünen sayılar
        System.out.println("1-20 5'e bölünen sayılar,1.denemem");
        for(int i = 1; i <= 20; i++){
            if(i%5==0){
                System.out.print(i + " ");
            }
        }
    }
}
