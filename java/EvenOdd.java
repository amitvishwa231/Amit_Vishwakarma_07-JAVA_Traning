import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Range: ");
        int n = input.nextInt();
        for(int i=0; i<=n; i++){
            if((i%2)==0){
                System.out.println("Number is Even: "+i);
            }
            else{
                System.out.println("Number is Odd:"+i);
            }
        }
        input.close();
    }
}   
      
