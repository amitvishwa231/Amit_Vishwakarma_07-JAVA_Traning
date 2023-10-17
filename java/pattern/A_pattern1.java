package pattern;

import java.util.Scanner;

public class A_pattern1 {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.print("Enter thr number: ");
        int n = in.nextInt();
        for(int i=1; i<=n; i++){
            char ch=65;
            for(int j=1; j<=i; j++){
                System.out.print(" "+ch);
                ch++;
            }
            System.out.println();
        }
        in.close();    
    }
}
/*
A
 A B
 A B C
 A B C D
 A B C D E
*/ 