public class SifreKontrol {
    public static void main(String[] args) {
        String sifre1 = "Yazilim";
        String sifre2 = new String("Yazilim");
        
        //böyle karşılaştırma yaparsan else bloğuna girer
        if (sifre1 == sifre2) {
            System.out.println("Giris Basarili!");
        } else {
            System.out.println("Sifreler Eslesmiyor!");
        }

        //Stringlerde doğru karşılaştırma budur
        if (sifre1.equals(sifre2)) {
            System.out.println("Giris Basarili!"); 
        }
    }
}

/*
" == " operatörü bu iki değişkenin hafızada aynı adresi gösterip göstermediğine bakar.
sifre2 yepyeni(new ile) bir nesne oldu ve sifre1'le aynı içeriğe sahip olsa bile hafızada saklandıkları yerler ayrıdır.
sifre1 ve sifre2'de sadece bu içeriğin yolunu gösteren değişkenlerdir (referanslardır) bu nedenle uyuşmaz
*/
