public class LabirentCozucu {
    public static int yollariSay(int[][] matris, int r, int c, int konumR, int konumC) { //r satır, c sütun 
        if(r >= matris.length || c >= matris[r].length){
            return 0;
        }else if(matris[r][c] == 0){
            return 0; 
        }else if(r == konumR && c == konumC){
            return 1;
        }
        return yollariSay(matris, r+1, c, konumR, konumC) + yollariSay(matris, r, c+1, konumR, konumC);
    }

    public static void main(String[] args) {
        int[][] labirent = {
            {1, 1, 1, 1, 1},
            {1, 0, 1, 0, 1},
            {1, 1, 1, 1, 1},
            {1, 1, 0, 1, 1},
            {1, 1, 1, 1, 1}
        };
        System.out.println("Toplam Yol Sayısı: " + yollariSay(labirent, 0, 0, 4, 4));
    }
}
