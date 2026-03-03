public class Desen3 {
    public static void main(String[] args) {
        int N = 5;
        
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (i == 0 || i == N - 1 || j == 0 || j == N - 1) { //ilk satır ve sütunu, son satır ve sütunu 1 yap
                    System.out.print("1 ");
                } else if (i == 2 && j == 2) { //3. satırı ve sütunu 1 yap
                    System.out.print("1 ");
                } else { //dışarda kalanları 0 yap
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
}
