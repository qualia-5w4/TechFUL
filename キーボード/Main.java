import java.util.*;

public class Main {

    public static void main(String args[] ) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        
        int variation = sc.nextInt();
        String[][] convertList = new String[variation][2];
        
        for (int i = 0; i < variation; i++) {
            convertList[i][0] = sc.next();
            convertList[i][1] = sc.next();
        }
        
        sc.nextLine();
        String input = sc.nextLine();
        String[] inputArray = input.split(" ");
    
        for (int i = 0; i < inputArray.length; i++) {
            
            for (int j = 0; j < variation; j++) {
                if (convertList[j][0].equals(inputArray[i])) {
                    inputArray[i] = convertList[j][1];
                }
            }
            
            System.out.print(inputArray[i] + " ");

        }

    }
    
}
