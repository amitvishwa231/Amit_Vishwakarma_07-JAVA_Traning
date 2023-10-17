package pattern;

import java.util.Scanner;

public class S_pattern3 {
    public static void main(String[] args) {
         Scanner in = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = in.nextInt();
        for(int i=1; i<=n; i++){
            // int a=1;
            for(int j=1; j<=n+1-i; ++j){
                System.out.print(" *");
                // a=n+1-i;
            }
            System.out.println();
        }
        in.close();
    }
}

// * * * * *
// * * * *
// * * *
// * *
// *