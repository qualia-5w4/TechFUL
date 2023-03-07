//クラス名は必ずMainにする必要があります。
import java.util.*;

public class Main {
    
    public static void main(String args[] ) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        int i = 0;
        
        while (n != 1) {            
            if (n % 2 == 0) {
                n = n / 2;
            } else {
                n = n * 3 + 1;
            }
            i++;
        }
        
        System.out.println(i);
        
    }
    
}