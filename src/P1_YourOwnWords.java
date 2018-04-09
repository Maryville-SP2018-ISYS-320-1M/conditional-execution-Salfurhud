import java.util.Scanner;

/*
	ISYS 320
	Name(s):AlfurhudSolomon
	Date: Apr8, 2018
*/

/*  EXAMPLE
-- Your conditional expression
x < y

-- Your test values for x, y, z and do you expect true or false?
1, 2, 0 -> TRUE
2, 1, 0 -> FALSE
*/

/* 1. 
-- Your conditional expression

	y >=0
	
-- Your test values for x, y, z and do you expect true or false?
	
	y = 1
	TRUE,
	
*/

/* 2. 
-- Your conditional expression

	x != 0

-- Your test values for x, y, z and do you expect true or false?

	x = 0,
	FALSE,
	
	x = 1,
	TRUE, 
	
*/

/* 3.  
-- Your conditional expression

	((y * z ) & 1) != 0

-- Your test values for x, y, z and do you expect true or false?

	y = 3, z = 2
	TRUE
	
	y = 2, z = 2
	FALSE
	
*/

/* 4.  
-- Your conditional expression

	y >= (z + x)

-- Your test values for x, y, z and do you expect true or false?

	y = 10, z = 1, z = 1
	TRUE
	
*/

public class P1_YourOwnWords {

	public static void main(String[] args) {
		Scanner input = new Scanner( System.in );
		
		System.out.println( "Enter test values for x, y, and z, separated by spaces: ");
		double x = input.nextDouble();
		double y = input.nextDouble();
		double z = input.nextDouble();
		
		// Replace the conditional test, x < y below with your conditional expression to verify it is correct
		// using your test values
		if( y >= (z + x) ) {
			System.out.println("The test was TRUE");
		} else {
			System.out.println("The test was FALSE");
		}

	}

}
