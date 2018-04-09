import java.util.Scanner;

/*
	ISYS 320
	Name(s):AlfurhudSolomon
	Date: Apr8, 2018
*/

public class P5_PayProgram {

	public static void main(String[] args) {
		Scanner input = new Scanner( System.in );
		
		System.out.println("Enter your hourly rate: ");
		double hourlyRate = input.nextDouble();
		
		System.out.println("Enter the number of hours you worked this week: ");
		int numOfHoursWorked = input.nextInt();
		
		System.out.println(computePay(hourlyRate, numOfHoursWorked));

	}
	
	public static double computePay(double hourlyRate, int numOfHoursWorked) {
		
		double overtimePay = 0;
		int hrs = numOfHoursWorked;
		
		if(numOfHoursWorked > 8) {
			overtimePay = (numOfHoursWorked - 8) * (hourlyRate * 1.5);
			hrs = 8;
		} 
		
		return (hrs * hourlyRate) + overtimePay;
		
	}

}