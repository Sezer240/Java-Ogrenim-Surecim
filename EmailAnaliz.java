public class EmailAnaliz {
    public static void main(String[] args) {
        String email="1234567890@gmail.com";

        int i = email.indexOf('@'); //"_" içeridekinin kaçıncı indekste olduğunu bul

        String kullanciAdi = email.substring(0, i); //(0,i) 0. indeksten başla i'ninci indeks'e kadar yaz
        String domain = email.substring(i+1); //(i+1) i'den sonraki indeksten başla son indeks'e kadar yaz 

        System.out.printf("Kullanici Adi: %s%nDomain: %s", kullanciAdi, domain);
    }
}
