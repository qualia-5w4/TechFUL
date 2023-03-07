import java.util.*;

public class Main {
    
    public static void main(String args[] ) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        String a, out = "";
        
        a = sc.next();
        int aLen = a.length();
        
        for (int i = 0; i < aLen; i++) {
            out = out + "*";
        }
        
        System.out.println(out);
        
    }
    
}