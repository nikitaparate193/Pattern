import java.util.*;

import java.util.*;

public class Qus_06 {

    public static void main(String[] args){
        
        int n=5;

        for(int i=0;i<n;i++){
            //spaces
            for(int j=0;j<2*i;j++){
                System.out.print("\t");
            }

            //star
            for(int j=n-i;j>0;j--){
                System.out.print("*\t");
            }
            System.out.println();
        }
    }
    
}