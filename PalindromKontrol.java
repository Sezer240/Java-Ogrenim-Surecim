public class PalindromKontrol {
    static boolean isPalindrome(String kelime){

        kelime = kelime.toLowerCase(); //büyük-küçük harf duyarlılığını ortadan kaldır
        
        int i = 0; // Baştan başlayan işaretçi
        int j = kelime.length() - 1; // Sondan başlayan işaretçi

        while(i < j){
            if(kelime.charAt(i) != kelime.charAt(j)){
                return false;
            } else {
                i++;
                j--;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String kelime = "kabak";

       System.out.println(isPalindrome(kelime) ? "Palindrom" : "Palindrom degil");   
    }
}
