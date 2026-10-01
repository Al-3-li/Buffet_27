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
		Scanner XD = new Scanner(System.in);
		System.out.print("Pick a number between 1 - 1000: ");
		int ran = XD.nextInt();
		int run = (int)(Math.random()*1000-1);
		if (ran==run){
			System.out.print("Your number was the correct number!");
		}
		else if (ran>run){
			System.out.print("Your number was larger than the number. The number was " + run + ".");
		}
		else{
			System.out.print("Your number was smaller than the number. The number was " + run + ".");
		}
	}
}
