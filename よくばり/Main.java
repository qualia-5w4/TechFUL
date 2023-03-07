import static java.lang.String.valueOf;
import java.util.*;

public class Main {
    
    public static void main(String args[] ) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        int n, s, l, out = 0, out1 = 0, result = 0;
        
        n = sc.nextInt();
        
        for (int i = 0; i < n; i++) {
            
            s = sc.nextInt();
            l = sc.nextInt();
            
            out1 = s * l;
            
            if (out < out1) {
                out = out1;
                result = i + 1;
            }
            
        }
        
        System.out.println(result);
        
    }
    
}