package pattern;

import java.util.Scanner;

public class S_pattern6 {
    public static void main(String[] args) {
        Scanner in = new  Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = in.nextInt();
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                if(i==(n/2+1) && j==(n/2)+1){
                    System.out.print("A ");
                }
                else{
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
         in.close();
    }
}

/*
* * * * * 
* * * * * 
* * A * * 
* * * * * 
* * * * * 
*/ 