import java.util.*;

public class Main {
    
    public static void main(String args[] ) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        int wLen;
        String words, out = "Yes", comp1, comp2;
        
        words = sc.nextLine().replaceAll(" ","");
        wLen = words.length();
        
        for (int i = 0; i < wLen; i++) {
            
            if (words.charAt(i) != words.charAt((wLen - 1) - i)) {
                out = "No";
                break;
            }
            
        }
        
        System.out.println(out);
        
    }
    
}