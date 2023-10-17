import java.util.Scanner;

public class solidsqure{
public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter the number :");
    int n = in.nextInt();
    for(int i=0; i<=n; i++){
      //  System.out.println("*");
        for(int j=1; j<=n; j++){
            System.out.print("*");
        }
        System.out.println();
    }
    in.close();
}
}