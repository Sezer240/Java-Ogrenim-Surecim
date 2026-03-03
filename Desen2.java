public class Desen2 {
    public static void main(String[] args) {
        int N = 7;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (i % 2 == 0 && j % 2 == 0) { //i ve j'nin çift olduğu koordinatları 1 yap
                    System.out.print("1 ");
                } else if (i % 2 != 0 && j % 2 != 0) { //i ve j'nin tek olduğu koordinatları 1 yap
                    System.out.print("1 ");
                } else { //dışarda kalanları 0 yap
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
}
