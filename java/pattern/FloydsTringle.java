package pattern;

import java.util.Scanner;

public class FloydsTringle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = in.nextInt();
        int a=1;
        for(int i=1; i<=n; i++ ){
            for(int j=1; j<=i;j++){
                System.out.print(" "+a);
                 a++;
            }     
            System.out.println();
        }
        in.close();
    }
}

/*
 1
 2 3
 4 5 6
 7 8 9 10
 11 12 13 14 15
*/ 