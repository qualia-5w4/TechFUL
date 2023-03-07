//クラス名は必ずMainにする必要があります。
import java.util.*;

public class Main {
    public static void main(String args[] ) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        
        int h = sc.nextInt();
        int w = sc.nextInt();
        int[][]map = new int[h][w];
        
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                map[i][j] = sc.nextInt();
            }
        }
        
        int i = 0, j = 0, sum = 0;
        boolean o = true;
        
        while (i < h && j < w) {
            
            sum += map[i][j];
            
            if (o) {
                j++;
                o = false;
            } else {
                i++;
                o = true;
            }
            
        }
        
        System.out.println(sum);
        
    }
}