public class StringGiris {
    public static void main(String[] args) {
        String kelime = "Programlama";

        for(int i = 0; i < kelime.length(); i++){
            System.out.printf(" Kelimenin %d. harfi: %s%n",i+1, kelime.charAt(i));
        }
    }
}
