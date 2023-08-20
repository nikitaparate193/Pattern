import java.util.*;

public class Qus_05 {
    public static void main(String[] args){
       
        int n=5;

        for(int i=0;i<n;i++){
            //spaces
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }

            //star
            for(int j=n-1;j>=i;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}