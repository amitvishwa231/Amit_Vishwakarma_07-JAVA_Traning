import java.util.Scanner;

public class Rombus {
    public static void main(String[] args) {
         System.out.println("Enter the Value of Number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=i;j<=n;j++){
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }           
            System.out.println();
        }

        for(int i=1;i<=n;i++){
            for(int j=i;j<=n;j++){
                System.out.print(" *");
            }
            for(int j=1;j<=i;j++){
                System.out.print(" ");
            }           
            System.out.println("");

            // second code
    }
    System.out.println();
     for(int i=1;i<=n;i++){
            for(int j=i;j<=n;j++){ 
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(" *");
            }           
            System.out.println();
        }

        for(int i=1;i<=n;i++){
            for(int j=i;j<=n;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(" *");
            }           
            System.out.println("");
    sc.close();
    }
}
}
