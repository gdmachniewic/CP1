import java.util.Scanner;
public class ComputeTaxes {    


public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        
        System.out.println("Calculating Income Tax ");
        
        System.out.print("Total income for the year: $");
         double income = input.nextDouble();
        System.out.println();
       
        System.out.print("Tax to be paid:" ); 
        System.out.println();
       

       
        double tax = 0;

        if (income <= 9525)
            tax = income * 0.10;
            
        else if (income >=9525 && income <= 38700)
            tax = 9525 * 0.10 + (income - 38700) * 0.12;
            
        else if (income >=38700 && income <= 82500)
            tax = 9525 * 0.10 + (income - 38700) * 0.12 + (income - 82500) * 0.22;
            
        else if (income >=82500 && income <= 157500)
            tax = 9525 * 0.10 + (9525 - 38700) * 0.12+ (38701 - 82500) * 0.25 + (income - 157500) + 0.24;
            
        else if (income >=157500 && income <=200000)
            tax = 9525 * 0.10 + (9525 - 38700) * 0.12+ (38701 - 82500) * 0.25 + (82500 - 157500) + 0.28 + (income - 200000) + 0.32;      
            
        else if (income >=200000 && income <=500000)
            tax = 9525 * 0.10 + (9525 - 38700) * 0.12+ (38701 - 82500) * 0.25 + (157500 - 157500) + 0.28 + (157500 - 200000) + 0.33 + (income - 500000) + 0.35;
            
        else if (income >=500000)
            tax = 9525 * 0.10 + (9525 - 38700) * 0.12+ (38701 - 82500) * 0.25 + (157500 - 157500) + 0.28 + (157500 - 200000) + 0.33 + (200000 - 500000) + 0.35 + (income - 500001) + 0.37;
        
        
    

    }
}