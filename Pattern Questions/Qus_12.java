import java.util.*;
/* 
        *
      * ! * 
    * ! * ! * 
  * ! * ! * ! *           
* ! * ! * ! * ! *
Give me solution for this

*/

public class Qus_12{
    public static void main(String[] args){
        
        int n= 5;
        for(int i=0;i<n;i++){
            //spaces
            for(int j=0;j<n-i-1;j++){
                System.out.print("  ");
            }
            //star
            for(int j=0;j<=2*i;j++){
                if(j % 2 ==0){
                    System.out.print("* ");
                }else{
                    System.out.print("! ");
                }
            }
            
            
            System.out.println();
        }
       



       
    }
}