import java.util.*;
public class Qus_29{
    public static void main(String[] args){
        int n=5;

        for (int i = 1; i <= n; i++) {
            // Print spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            System.out.print(i);
            
            for (int j = 1; j < 2 * i - 2; j++) {
                System.out.print(" 0");
            }
            
            if (i != 1) {
                System.out.print(" " + i);
            }
            
            System.out.println();
        }
    }
    
}
