import java.util.Scanner;

/**
   This program takes a month as input and prints a line of a poem to the console.
*/

public class CRC_Days {
	static Scanner keyboard = new Scanner(System.in);
	
	static String calendar[][] = new String[][]
			{
					new String[] {"January","March", "May", "July","August","October","December"}, //months with 31 days
					new String[] {"April","June","November",}, //months with 30 days
					new String[] {"September"}, //September
					new String[] {"February"} //February
			};

	public static void main(String[] args) {
	//

	boolean gameOver = false;
	String[] poem = new String[]
	{
		"Thirty days hath September",
		"April, June, and November",
		"All the rest have thirty-one",
		"With 28 in February to make it fun",
		"Leap Year happening one in four, Gives February one day more."
	};

	boolean found = false;
	
	while (gameOver == false) {
	int index = -1;
	System.out.println("Please enter the month: ");
	String month = keyboard.nextLine();
	
	
		while (found == false && index < calendar.length) {
			for (int row = 0; row < calendar.length; row++ ) {
				for (int col = 0; col < calendar[row].length; col ++) {
			        if ( (calendar[row][col]).equalsIgnoreCase(month) ) { // if a match is found
			            index = row;
			            found = true;
			            break;
			            
			        } //end if statement
			    
				} //end inner for loop
			
			} //end outer for loop
		
			if (found == false) { // if a match is not found
			System.out.print("Invalid month. Enter the month: ");
			month = keyboard.nextLine();
			}
		
		} //end while loop
		
		if (index == 0) {
			System.out.println(poem[2]); // prints "All the rest have thirty-one"
		} else if (index == 1) {
			System.out.println(poem[1]); // prints "April, June, and November
		} else if (index == 2) {
			System.out.println(poem[0]); // prints "Thirty days hath September
		} else if (index == 3) {
			System.out.println("Enter the year: ");	// asks user for a year
			int year = keyboard.nextInt();
			keyboard.nextLine(); 
	
			if (year % 4 == 0) { // if the year is a leap year
				System.out.println(poem[4]); // prints "Leap Year happening one in four, gives February one day more."
			}
	
			else {
				System.out.println(poem[3]); // prints "With 28 in February to make it fun"
			}
		} else {
			System.out.println("Something went wrong." + index); // should not run
		}
		
		System.out.println("Press 'Y' to enter another month."); 
		String yesOrNo = keyboard.nextLine();
		
		if (yesOrNo.equalsIgnoreCase("Y")) {
			found = false; // resets found so the game can restart
			continue; // continues the loop and restarts the game
		} else {
			gameOver = true; // ends the game
			System.out.println("Thank you for playing!");
		}
		
	} //end game while loop
		
	} //end main
	
} //end