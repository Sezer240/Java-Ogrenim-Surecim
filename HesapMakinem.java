public class HesapMakinem {
    static int kareAl(int n){
        return n*n;
    }
    static double dikdortgenAlan(double kisakenar, double uzunkenar){
        return kisakenar * uzunkenar;
    }
    static boolean ciftMi(int n){
        return n % 2 ==0;
    }
    static double hipotenus(int kenar1, int kenar2){
       return Math.sqrt(kareAl(kenar1) + kareAl(kenar2));
    }
    static int faktoriyel(int sayi1){
        if(sayi1<0){
            return -1;
        }else if(sayi1 == 1 || sayi1 == 0){
            return 1;
        }else{
            return sayi1 * faktoriyel(sayi1-1);
        }
    }

    public static void main(String[] args) {
        System.out.println(kareAl(15));
        System.out.printf("%.2f%n", dikdortgenAlan(6.7, 15.5 ));

        int n = 5;
        if(ciftMi(n)){
            System.out.println(n + " cift sayidir");
        }else{
            System.out.println(n+ " tek sayidir");
        }

        int kenar1 = 6;
        int kenar2 = 8;
        System.out.println(hipotenus(kenar1, kenar2));

        int sayi1 = 6;
        System.out.println(faktoriyel(sayi1));
    }
}
