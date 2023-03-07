//クラス名は必ずMainにする必要があります。
import java.util.*;

public class Main {
    public static void main(String args[] ) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        
        int c = sc.nextInt();
        int n = sc.nextInt();
        
        int[] calories = new int[n];
        int[] prices = new int[n];
        
        for (int i = 0; i < n; i++) {
            calories[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            prices[i] = sc.nextInt();
        }
        
        String out, add = "";
        char index;
        int length, calorieSum = 0, priceSum = 0, min = -1;
        
        for (int i = 1; i < Math.pow(2, n); i++) {
            
            length = Integer.toBinaryString(i).length();
            
            if (length < n) {
                for (int j = 0; j < n - length; j++) {
                    add += 0;
                }
            }
            
            out = add + Integer.toBinaryString(i);
            add = "";
            
//            System.out.println("out: " + out);
            
            for (int j = 0; j < n; j++) {
                
                index = out.charAt(j);
                
                if (index == '1') {
                    calorieSum += calories[j];
                    priceSum += prices[j];
                }
                
//                System.out.println("calorieSum: " + calorieSum);
                
                if (c <= calorieSum) {
                    if (min == - 1) {
                        min = priceSum;
                    } else if (priceSum < min) {
                        min = priceSum;
//                        System.out.println("min: " + min);
                    }
                }
                
            }
            
            calorieSum = 0;
            priceSum = 0;
            
        }
        
        System.out.println(min);
        
    }
    
}