//クラス名は必ずMainにする必要があります。
import java.util.*;

public class Main {
    
    public static void main(String args[] ) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        int[] num = new int[5];
        
        for (int i = 0; i < 5; i++) {
            num[i] = sc.nextInt();
        }
        
        Arrays.sort(num);
        
        System.out.println(num[n - 1]);
        
    }
    
}