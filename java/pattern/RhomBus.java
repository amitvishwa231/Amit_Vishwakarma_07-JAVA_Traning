package pattern;

import java.util.Scanner;

public class RhomBus {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = in.nextInt();
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i; j++)
                System.out.print("  ");
            
            for(int k=1; k<=n; k++)
                System.out.print("* ");

                // OR
            
            // for(int l=1;l<=n-i; l++)
            // System.out.print("* ");

            System.out.println();
        }
        in.close();
    }
}


/*

        * * * * * 
      * * * * * 
    * * * * * 
  * * * * * 
* * * * * 

*/ 