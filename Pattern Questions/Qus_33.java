import java.util.*;

public class Qus_33 {
    public static void main(String[] args){
       
        int n=10;
        for (int i = n; i >=1; i--) {
            
            //spaces
            for(int j=1;j<=i;j++){
                System.out.print("  ");
            }
            //star
            for(int j=i;j<n;j++){
                System.out.print(j+" ");
            }
            System.out.print(0+" ");

            for(int j=n-1;j>=i;j--){
                System.out.print(j+" ");
            }
            
            System.out.println();
        }
    }
}


    //                   0
    //                 9 0 9
    //               8 9 0 9 8 
    //             7 8 9 0 9 8 7 
    //           6 7 8 9 0 9 8 7 6
    //         5 6 7 8 9 0 9 8 7 6 5
    //       4 5 6 7 8 9 0 9 8 7 6 5 4 
    //     3 4 5 6 7 8 9 0 9 8 7 6 5 4 3
    //   2 3 4 5 6 7 8 9 0 9 8 7 6 5 4 3 2
    // 1 2 3 4 5 6 7 8 9 0 9 8 7 6 5 4 3 2 1


    
    