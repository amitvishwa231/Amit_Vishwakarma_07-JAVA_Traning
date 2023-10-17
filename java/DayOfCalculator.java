import java.util.Scanner;

public class DayOfCalculator {
    public static void main(String[] args) {
        Scanner av = new Scanner(System.in );
        System.out.println("1 For Sunday \n2 For Monday \n3 For Tuessday \n4 For Wednesday \n5 For Thursday \n6 For Friday \n7 For Saturday");
        System.out.println("Enter Your Choice: ");
        int num = av.nextInt();
        if(num == 1){
            System.out.println("SUNDAY");
        }
        else if( num == 2){
            System.out.println("MONDAY");
        }
        else if( num == 3){
            System.out.println("TUESDAY");
        }
        else if( num == 4){
            System.out.println("WEDNESDAY");
        }
        else if( num == 5){
            System.out.println("THURSDAY");
        }
        else if( num == 6){
            System.out.println("FRIDAY");
        }
        else if( num == 7){
            System.out.println("SATURDAY");
        }
        else{
            System.out.println("Invalid!!");
        }
        av.close();
    }
}
