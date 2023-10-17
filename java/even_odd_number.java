//package full stack wd;

import java.util.Scanner;

public class even_odd_number{
    public static void main(String[] args) {
        Scanner av = new Scanner(System.in);
        int number ; // replace with the number you want to check
        System.out.println("Enter the number: ");
        number = av.nextInt();
        String result = (number % 2 == 0) ? "even" : "odd";
        System.out.println("The number " + number + " is " + result + ".");
        av.close();
    }
}
