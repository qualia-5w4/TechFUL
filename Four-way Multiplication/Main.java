import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        int c = b / a;

        int[] p = new int[4];
        nearestNumber(p, c);
        
        int[] multiplier = {2, 3, 5, 7};
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < p[i]; j++) {
                a *= multiplier[i];
            }
        }
        
        System.out.println(a);
        
    }
    
    static int[] nearestNumber(int[] p, int c) {
        
        if (c <= 1) {
            return p;
        } else if (c % 2 == 0) {
            p[0]++;
            nearestNumber(p, c / 2);
        } else if (c % 3 == 0) {
            p[1]++;
            nearestNumber(p, c / 3);
        } else if (c % 5 == 0) {
            p[2]++;
            nearestNumber(p, c / 5);
        } else if (c % 7 == 0) {
            p[3]++;
            nearestNumber(p, c / 7);
        } else {
            nearestNumber(p, --c);
        }
        
        return p;
        
    }
        
}