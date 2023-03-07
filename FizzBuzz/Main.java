import java.util.*;

public class Main {
    
    public static void main(String args[] ) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        int a, b;
        String out = "";
        
        a = Integer.parseInt(sc.next());
        b = Integer.parseInt(sc.next());
        
        for (int i = 1; i <= 30; i++) {
            
            if (i % a == 0) {
                out = out + "Fizz";
            }
            if (i % b == 0) {
                out = out + "Buzz";
            }
            if (i % a != 0 && i % b != 0) {
                out = Integer.toString(i);
            }
            
            
            System.out.println(out);
            out = "";
        }
        
    }
    
}