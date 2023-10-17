import java.util.Scanner;

public class TemperatureConverter {

    public static void main(String[] args) {
       Scanner  in = new Scanner(System.in);
       System.out.println("1.Farenheit to Celsius: ");
       System.out.println("2.Celsius to Farenheit: ");
       int n = in.nextInt();
      
       switch (n) {
           case 1:
                 {
                     System.out.println("enter a farenheit temp : ");
                     int f = in.nextInt();
                     double celsius = (f*5)/9 - (160/9);
                     System.out.println("celcius  temp : " + celsius);
                     break; 
                 }
           
            
            case 2:
               System.out.println("Enter Temprature in Celsius: ");
               int celsius = in.nextInt();
               double f = (1.8*celsius)+32;
               System.out.println("farenheit temp : " + f);
               break;
               
               
           default:
           System.out.println("Invalid Option!!");
               
       }
       in.close();
    }
}
// temperature convergter in java?