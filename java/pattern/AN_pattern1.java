package pattern;
import java.util.Scanner;
public class AN_pattern1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n =in.nextInt();

        for(int i=1; i<=n; i++){
            char a=65;
            for(int j=1; j<=i; j++){
                if(i%2!=0){
                    System.out.print(j+" ");
                }
                else{
                    System.out.print(a+" ");
                }
                a++;
            }
            System.out.println();
        }
        in.close();

    }
}

/*
1 
A B 
1 2 3 
A B C D 
1 2 3 4 5 
*/ 
