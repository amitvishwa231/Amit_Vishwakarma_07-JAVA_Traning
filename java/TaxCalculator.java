import java.util.Scanner;

public class TaxCalculator {
    public static void main(String[] args) {
        Scanner av = new Scanner(System.in);
        System.out.println("Enter The Basic Salary");
        float sal = av.nextFloat();
        if(sal <= 9999){
            System.out.println("This is not your net salary amount \nThis is the low salary amount: "+sal);
            }
            else if(sal == 10000){
            System.out.println("YOUR NET SALARY: "+sal);
            }
            else if(sal <= 10000 && sal >= 20000){
                System.out.println("This is your 10% tax from your salary: "+sal * 0.1);
            }
            else if(sal <= 20000 && sal >= 30000){
                System.out.println("This is your 15% tax from your salary: "+sal*.15);
            }
            else{
                System.out.println("This is your 25% & above tax from your salary: "+sal*.25);
            }
            av.close();
        
    }
}
