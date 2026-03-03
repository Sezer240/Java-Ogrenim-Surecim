public class Desen5 {
    public static void main(String[] args) {
        int N = 9;
        
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
            if  ((i+j<=N-1&&j>=i) || (i+j>=N-1&&i>=j))  { //kullanılan kontrolleri en altta tek tek yazdım
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
}
