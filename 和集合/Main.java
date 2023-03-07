import java.util.*;

public class Main {
    
    public static void main(String args[] ) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        
        int length = sc.nextInt();
        sc.nextLine();
        String stringA = sc.nextLine();
        String stringB = sc.nextLine();
        
        stringA = stringA.replace("{", "").replace("}", "").replace(",", "");
        stringB = stringB.replace("{", "").replace("}", "").replace(",", "");
        
        String[] A = stringA.split(" ");
        String[] B = stringB.split(" ");
        
        int[] intA = new int[A.length];
        int[] intB = new int[B.length];
        
        for (int i = 0; i < intA.length; i++) {
            intA[i] = Integer.parseInt(A[i]);
        }
        
        for (int i = 0; i < intB.length; i++) {
            intB[i] = Integer.parseInt(B[i]);
        }
        
        int[] AB = new int[A.length + B.length];
        
        for (int i = 0; i < intA.length; i++) {
            AB[i] = intA[i];
        }
        
        for (int i = intA.length; i < intA.length + intB.length; i++) {
            AB[i] = intB[i - intA.length];
        }

        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < AB.length; i++){
            set.add(AB[i]);
        }

        List<Integer> result = new ArrayList<>(set);
        
        System.out.print("{");
        for (int i = 0; i < result.size() - 1; i++) {
            System.out.print(result.get(i) + ", ");
        }
        System.out.print(result.get(result.size() - 1));
        System.out.print("}");
        
    }
    
}