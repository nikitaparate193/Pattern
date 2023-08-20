import java.util.*;

public class Qus_23{
    public static void main(String[] args){
        
        int n= 5;

        for(int i=0;i<n;i++){
            //spaces
            for(int j=i;j<n-1;j++){
                System.out.print("\t");
            }
            //star
            for(int j=0;j<i+1;j++){
                System.out.print("1\t");
            }

            //star
            for(int j=1;j<=i;j++){
                System.out.print("1\t");
            }
            System.out.println();
        }
    }
}