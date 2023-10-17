package pattern;

import java.util.Scanner;

public class N_pattern {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n =in.nextInt();
        for(int i=1; i<=2*n-1; i=i+2){
           // int a=1; (i<=n; i++)
            for(int j=1; j<=2*n-1; j=j+2){
                System.out.print(" "+j);
             //   a=+2;(j<=n; j++)
            }
            System.out.println();
        }
        in.close();
    }
}

/*
 1 3 5 7 9
 1 3 5 7 9
 1 3 5 7 9
 1 3 5 7 9
*/ 