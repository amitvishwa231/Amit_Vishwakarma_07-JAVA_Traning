import java.util.Scanner;

public class WeekDayWeekend{
    public static void main(String[] args) {
        Scanner av = new Scanner(System.in);
        System.out.println("Enter the Index no of  WeekDay: ");
        int m = av.nextInt();
        switch (m) {
            case 1:
            System.out.println("MONDAY");
            case 2 :   
             System.out.println("TUESDAY");           
            case 3 : 
             System.out.println("WEDNESDAY");            
            case 4 : 
             System.out.println("THURSDAY");            
            case 5 :
             System.out.println("FRIDAY");
               System.out.println("Week Day");
                break;
            case 6 :
             System.out.println("SATURDAY");             
            case 7 :
             System.out.println("SUNDAY");
                System.out.println("Weekend Day");
                break;
            default:
                System.out.println("Invalid!!");
        }
        av.close();
    }
}