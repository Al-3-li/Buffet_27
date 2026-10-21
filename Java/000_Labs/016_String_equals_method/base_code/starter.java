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
		System.out.println("Would you like to be a Wizard, Warrior, or Rogue?");
		Scanner XD = new Scanner(System.in);
		String LZ = XD.next();
		if (LZ.equals("Wizard")){
			System.out.println("You've chosen the Wizard! Exelsior!");
		}
		else if (LZ.equals("Warrior")){
			System.out.println("You've chosen the Warrior! For honor!");
		}
		else if (LZ.equals("Rogue")){
			System.out.println("You've chosen the Rogue! How cunning!");
		}
		else{
			System.out.println("You've decided to not chose a role. Rerun program.");
		} 
		LZ.close;
	}
}
