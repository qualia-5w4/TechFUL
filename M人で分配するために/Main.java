//クラス名は必ずMainにする必要があります。
import java.util.*;

public class Main {
    public static void main(String args[] ) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        int[] candies = new int[n];
        
        for (int i = 0; i < n; i++) {
            candies[i] = sc.nextInt();
        }
        
        String out, add = "";
        char index;
        int length, sum = 0, cnt = 0;
        
        // 2進数表現で全パターンを作り、総当りする
        for (int i = 1; i < Math.pow(2, n); i++) {
            
            length = Integer.toBinaryString(i).length();
            
            if (length < n) {
                for (int j = 0; j < n - length; j++) {
                    add += 0;
                }
            }
            
            out = add + Integer.toBinaryString(i);
            add = "";
            
            for (int j = 0; j < out.length(); j++) {
                
                index = out.charAt(j);
                if (index == '1') {
                    sum += candies[j];
                }
                
            }
            
            if (sum % m == 0) {
                cnt++;
            }
            
            sum = 0;
            
        }
        
        System.out.println(cnt);
        
    }
    
}