import java.util.*;

public class Main {
    
    public static void main(String args[] ) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        int n, a1, a2, out = 0;
        
        n = sc.nextInt() - 2;
        a1 = sc.nextInt();
        a2 = sc.nextInt();
        
        System.out.print(a1 + " " + a2 + " ");
        
        for (int i = 0; i < n; i++) {
            
            out = a2 - a1;
            a1 = a2;
            a2 = out;
            
            System.out.print(out + " ");   
            
        }
        
    }
    
}