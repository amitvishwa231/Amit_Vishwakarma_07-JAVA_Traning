package pattern;

import java.util.Scanner;

public class A_pattern2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = in.nextInt();
        for(int i=1; i<=n; i++){
            char ch=65;
            for(int j=1; j<=n+1-i; j++){
                System.out.print(" "+ch);
                ch++;
            }
            System.out.println();
        }
        in.close();
    }
}


/*
 A B C D E
 A B C D
 A B C
 A B
 A
*/ 