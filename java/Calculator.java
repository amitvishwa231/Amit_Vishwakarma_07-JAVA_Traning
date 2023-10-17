import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner av = new Scanner(System.in);
        System.out.println("      Simple Calculator\n\n\n");
        System.out.println("Enter 1st Number: ");
        int a = av.nextInt();
        System.out.println("Enter 2nd Number: ");
        int b = av.nextInt();
        System.out.println("Press 1.For Addition:");
        System.out.println("Press 2.For Subtraction:");
        System.out.println("Press 3.For Multiplication:");
        System.out.println("Press 4.For Division:");
        System.out.println("Select Option: ");
        int op = av.nextInt();
        switch (op) {
            case 1 :
                System.out.println("Addition = "+a+b);
                break;
             case 2 :
                // System.out.println("Subtraction = " + a-b);
                break;
             case 3 :
                System.out.println("Multiplication = "+a*b);
                break;
             case 4 :
                 System.out.println("Division = "+a/b);
                break;         
            default:
                System.out.println("Invalid!!");
        }
        av.close();
    }
}
