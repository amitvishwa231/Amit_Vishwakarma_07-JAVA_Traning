package pattern;

import java.util.Scanner;

public class UltaPyramidTringle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = in.nextInt();
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i-1; j++){
                System.out.print(" ");
            }
            for(int  k=1; k<=n+1-i; k++){
                System.out.print("* ");
            }
            System.out.println();
        }
        in.close();
    }
}

/*

* * * * * * 
 * * * * * 
  * * * * 
   * * * 
    * * 
     * 

*/ 