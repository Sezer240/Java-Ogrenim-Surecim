public class Desen4 {
    public static void main(String[] args) {
        int N = 7;
        int mid = N / 2;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                boolean outer = (i == 0 || i == N-1 || j == 0 || j == N-1); //ilk satırı ve sütunda, son satırı ve sütunda işlem yap

                boolean innerFrame = (i >= mid-1 && i <= mid+1 && j >= mid-1 && j <= mid+1); //bu kod için 2<=i<=4 ve 2<=j<=4 aralığında işlem yap

                boolean centerPoint = (i==mid && j==mid); //merkez noktada işlem yap

                if ( (outer || innerFrame) && !centerPoint ) { //outer veya innerFrame true ve centerPoint false olduğunda 1 yap
                    System.out.print("1 ");
                } else { //dışarıda kalanları 0 yap
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
}
