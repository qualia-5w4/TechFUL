import static java.lang.String.valueOf;
import java.util.*;

public class Main {
    
    public static void main(String args[] ) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        
        int n, intA, intB, result;
        String a, b, out = "";
        
        n = sc.nextInt();
        a = sc.next();
        b = sc.next();
        
        for (int i = 0; i < n; i++) {
            
            intA = Character.getNumericValue(a.charAt(i));
            intB = Character.getNumericValue(b.charAt(i));
            
            result = intA + intB;
            
            if (result == 0) {
                out = out + 0;
            } else if (result == 1) {
                out = out + 1;
            } else {
                out = out + 0;
            }
            
        }
        
        System.out.print(out);
        
    }
    
}