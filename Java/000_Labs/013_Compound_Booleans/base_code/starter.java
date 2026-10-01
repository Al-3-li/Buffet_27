/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		System.out.print("Please enter your first number: "); 
		Scanner eh = new Scanner(System.in);
		int tzeh = eh.nextInt();

		System.out.print("Please enter your second number: ");
		int dah = eh.nextInt();

		System.out.print("Please enter your third number: ");
		int ah = eh.nextInt();
		

		if ((tzeh > dah) && (dah > ah)){
			System.out.println("Your first number is the largest of the three!");
			System.out.println("The number was " + tzeh);
		}
		else if ((dah > tzeh) && (tzeh > ah)){
			System.out.println("Your second number is the largest of the three!");
			System.out.println("The number was " + dah);
		}
		
		else if ((tzeh < dah) && (dah < ah)){
			System.out.println("Your third number is the largest of the three!");
			System.out.println("The number was " + ah);
		}
		if ((tzeh > dah) && (dah > ah)){
			System.out.println("Your third number is the smallest of the three!");
			System.out.println("The number was " + ah);
		}
		else if ((tzeh>ah) && (ah>dah)){
			System.out.println("Your second number is the smallest of the three!");
			System.out.println("The number was " + dah);
		}
		else if ((dah>tzeh) && (tzeh>ah)){
			System.out.println("Your third number is the smallest of the three!");
			System.out.println("The number was " + ah);
		}
		else if ((dah>ah) && (ah>tzeh)){
			System.out.println("Your second number is the smallest of the three!");
			System.out.println("The number was " + tzeh);
		}
		else if ((ah > tzeh) && (tzeh> dah)){
			System.out.println("Your second number is the smallest of the three!");
			System.out.println("The number was " + dah);
		}
		else if ((ah > dah) && (dah>tzeh)){
			System.out.println("Your first number is the smallest of the three!");
			System.out.println("The number was " + tzeh);
		}

		
	}
}