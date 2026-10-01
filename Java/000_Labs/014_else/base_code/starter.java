/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner czeh = new Scanner(System.in);
		System.out.println("Pick a number between 1 - 1000: "); 
		int yeh = czeh.nextInt();
		int ja = (int)(Math.random()*1000-1);
		
		if (yeh==ja){
			System.out.print("Your number was the random number!");
		}
		else if (yeh!=ja){
			System.out.print("Your number wasn't the random number. The number was " + ja + ".");
		}
		czeh.close();

	}
}
