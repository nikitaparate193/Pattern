import java.util.*;
/* 
     

*/

public class Qus_14{
    public static void main(String[] args){
        
        int n= 5;
        //upper
        for(int i=0;i<n;i++){
            //spaces
            for(int j=0;j<n-1-i;j++){
                System.out.print(" ");
            }
            //star
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        //lower
        for(int i=n-1;i>0;i--){
            //spaces
            for(int j=0;j<n-i;j++){
                System.out.print(" ");
            }
            //star
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
         
    }
}