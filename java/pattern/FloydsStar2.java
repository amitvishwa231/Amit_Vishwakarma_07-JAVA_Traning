package pattern;

import java.util.Scanner;

public class FloydsStar2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = in.nextInt();
        int a=1;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(" "+a);
                a=a+2;
            }
            System.out.println();
        }
        in.close();
    }
}

/*
 1
 3 5
 7 9 11
 13 15 17 19 

 */