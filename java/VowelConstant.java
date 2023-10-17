import java.util.Scanner;

public class VowelConstant {
    public static void main(String[] args) {
        Scanner av = new Scanner(System.in);
        System.out.println("Enter the any character: ");
        // for input character ==int charValue = System.in.read()
        char c = av.next().charAt(0);
        if(c =='a' || c =='A' || c == 'e' || c == 'E' || c == 'i' || c == 'I' || c == 'o' || c == 'O' || c == 'u' || c == 'U'){
            System.out.println("This Character"+ c + "is Vowel.");
        }
        else{
            System.out.println("This Character "+ c+ " is Constanrt.");
        }
        av.close();
    }
}
