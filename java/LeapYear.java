import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner av = new Scanner(System.in);
        System.out.println("Enter the Year: ");
        int year = av.nextInt();
        if(year % 4 == 0  && year % 100 != 0 || year % 400 == 0 ){
          System.out.println("Year is Leap Year: "+year);
        }
        else{
            System.out.println("Year is not Leap Year: "+year);
        }
        av.close();
    }
}
