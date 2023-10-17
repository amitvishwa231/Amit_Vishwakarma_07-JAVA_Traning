import java.util.Scanner;

public class CountDigits {
 public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter the Number");
    int num = in.nextInt();
    in.close();
     int count = 0;
    for (; num != 0; num /= 10, ++count) {
    }
    System.out.println("Number of digits: " + count);
  } 
 }   
