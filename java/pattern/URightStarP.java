package pattern;

import java.util.Scanner;

public class URightStarP {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = in.nextInt();
        for(int i=1; i<=n; i++){
             for(int k=1; k<=i-1; k++){
                System.out.print("  ");
            }
            for(int j=1; j<=n+1-i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
       in.close();
    }
}

/*

* * * * * 
  * * * * 
    * * * 
      * * 
        * 

*/ 