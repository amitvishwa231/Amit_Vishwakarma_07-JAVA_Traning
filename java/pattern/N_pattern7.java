package pattern;

import java.util.Scanner;

public class N_pattern7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = in.nextInt();
        for(int i=1; i<=2*n-1; i=i+2){
            for(int j=1; j<=i; j=j+1+1){
                System.out.print(" "+j);
            }
            System.out.println();
        }
        in.close();
    }
}

/*
1
1 3
1 3 7
1 3 7 9
*/ 