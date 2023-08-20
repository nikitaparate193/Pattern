import java.util.*;

public class Qus_24{
    public static void main(String[] args){
        
        int n= 5;

        for(int i=1;i<=n;i++){
            //spaces
            for(int j=i;j<=n-1;j++){
                System.out.print("\t");
            }
            //star
            for(int j=1;j<i+1;j++){
                System.out.print(i+"\t");
            }

            //star
            for(int j=2;j<=i;j++){
                System.out.print(i+"\t");
            }
            System.out.println();
        }
    }
}