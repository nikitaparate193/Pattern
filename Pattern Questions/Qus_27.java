import java.util.*;

public class Qus_27{
    public static void main(String[] args){
        
        int n=5;

        for(int i=1;i<=n;i++){
            //spaces
            for(int j=i;j<=n-1;j++){
                System.out.print("\t");
            }
            //star
            for(int j=1;j<i+1;j++){
                System.out.print(j+"\t");
            }

            //star
            for(int j=i;j>1;j--){
                System.out.print(j-1+"\t");
            }
            System.out.println();
        }
    }
}