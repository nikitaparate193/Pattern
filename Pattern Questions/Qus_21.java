import java.util.*;

public class Qus_21{
    public static void main(String[] args){
        int n= 7;

        for(int i=n/2+2;i>=1;i--){
            //star
            for(int j=1;j<=n/2-i+3;j++){
                System.out.print("* ");
            }

            //spaces
            for(int j=1;j<=i*2-3;j++){
                System.out.print("  ");
            }

            //star
            for(int j=1;j<=n/2-i+3;j++){
                if(i==1 && j==1){
                    continue;
                }
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}