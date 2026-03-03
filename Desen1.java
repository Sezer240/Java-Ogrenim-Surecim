public class Desen1 {
    public static void main(String[] args) {
        int N = 7;
        int center = N / 2; // 3

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (Math.abs(i - center) + Math.abs(j - center) <= center) { // |i-3| + |j-3| <= 3 işlemi var.
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
}
