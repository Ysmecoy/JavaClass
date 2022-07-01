package Assignment_1;

import java.util.Scanner;

public class Payroll {
	public static void main(String [] args) {
		Scanner scanner = new Scanner(System.in);
		String lastName;
		String userSSN;
		double hourlyPayRate;
		int hoursWorked;
		double grossPay;
		double federalTax;
		double stateTax;
		double netPay;
		
		
// Data from user
		
		System.out.print("Please, enter your last name: ");
		lastName = scanner.next();
		
		System.out.print("Please, enter last 4 digits of your SSN: ");
		userSSN = scanner.next();
		
		System.out.print("Please enter your hourly pay rate: ");
		hourlyPayRate = scanner.nextDouble();
		
		System.out.print("Please enter your hours worked: ");
		hoursWorked = scanner.nextInt();
		
		
		
// Calculation of gross pay, federal withholding tax, state withholding tax and net pay
		
		grossPay = hourlyPayRate * hoursWorked;
		federalTax = 0.15 * grossPay;
		stateTax = 0.05 * grossPay;
		netPay = grossPay - federalTax - stateTax;
		
// Program Output
		
		System.out.println();
		System.out.println();
		System.out.println("Payroll Summary for: " + lastName);
		System.out.println("SSN (Last 4 digits): " + userSSN);
		System.out.print("You worked " + hoursWorked + " hours at $");
		System.out.printf( "%.2f" , hourlyPayRate);
		System.out.println(" per hour.");
		System.out.println();
		System.out.println();
		System.out.print("Gross Pay:              $  ");
		System.out.printf("%-10.2f\n", grossPay);
		System.out.print("Federal Withholding:    $  ");
		System.out.printf("%-10.2f\n", federalTax);
		System.out.print("Sate Withholding:       $  ");
		System.out.printf("%-10.2f\n", stateTax);
		System.out.println("---------------------------------------");
		System.out.print("Net Pay:                $  ");
		System.out.printf("%-10.2f\n", netPay);
		
		scanner.close();
		
        
		
	
	}

}
