import java.util.*;

public class Qus_25{
    public static void main(String[] args){
        
        int n= 5;
        int k=1;

        for(int i=1;i<=n;i++){
            for(int j=n-i;j>=0;j--){
                System.out.print("\t");
            }
            for(int j=1;j<2*i;j++){
                System.out.print(k+"\t");
                k++;
                
            }
            System.out.println();
        }
    }
}