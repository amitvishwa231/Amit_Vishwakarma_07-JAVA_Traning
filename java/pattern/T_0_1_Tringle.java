package pattern;

import java.util.Scanner;

public class T_0_1_Tringle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = in.nextInt(); 
     //   int a=1;
        for(int i=1; i<=n; i++){
            //if(i%2!=0) a=1;
           // else a=0;
            for(int j=1; j<=i; j++){
                // System.out.print(" "+a);
                // if(a==0) a=1;
                // else a=0;

                //or

                if((i+j)%2==0){
                    System.out.print("1 ");
                }
                else{
                    System.out.print("0 ");
                }
            }
              System.out.println();
        }
        in.close();
    }
}

/*

1 
0 1 
1 0 1 
0 1 0 1 
1 0 1 0 1 
0 1 0 1 0 1 

*/ 