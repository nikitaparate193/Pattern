import java.util.*;

public class Qus_18{
    public static void main(String[] args){
        
        int n= 7;

        for(int i=0;i<(n/2);i++){
            //spaces
            for(int j=n/2-i;j>0;j--){
                System.out.print("\t");
            }
            for(int j=0;j<=2*i;j++){
                 System.out.print("*\t");
                }
            for(int j=n/2-i;j>0;j--){
                 System.out.print("\t");
                }
                           
            System.out.println();
        }

        for(int i=n/2;i>=0;i--){
            //spaces
            for(int j=n/2-i;j>0;j--){
                System.out.print("\t");
            }
            for(int j=0;j<=2*i;j++){
                 System.out.print("*\t");
                }
            for(int j=n/2-i;j>0;j--){
                 System.out.print("\t");
                }
                           
            System.out.println();
        }

        
        
        
    }
}

                //            *
                //         *  *  *
                //      *  *  *  *  *
                //   *  *  *  *  *  *  *
                //      *  *  *  *  *  
                //         *  *  *
                //            * 