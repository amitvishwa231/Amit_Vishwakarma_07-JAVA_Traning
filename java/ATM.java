import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner av = new Scanner(System.in);
        System.out.println("\n\n\t\t\t\tWelcom to the Vishwa Bank");
        System.out.println("1.Check Balance");
        System.out.println("2.Deposite Money");
        System.out.println("3.Whithdraw Money");
        System.out.println("Select Your Option:\t  ");
        int choice = av.nextInt();
        float b = 7246;
        switch(choice){
            case 1:
            System.out.println("Your Total Balance is: "+b);
            break;

            case 2:
            System.out.println("Enter Deposite Amount: ");
            float d =av.nextFloat();
            float sum = b+d;
            System.out.println("Balance: "+b);
            System.out.println("Deposite Amount: "+d);
            System.out.println("Your Total Balance is: "+sum );
            break;

            case 3:
            System.out.println("Enter Withdraw Amount: ");
            float s =av.nextFloat();
            float sub = b-s;
            System.out.println("Balance: "+b);
            System.out.println("Withdrwa Amount: "+s);
            System.out.println("Your Total Balance is: "+sub );
            break;

            default:
            System.out.println("Invalid!!");
        }
        av.close();
    }
}
