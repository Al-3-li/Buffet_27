/*
 *	Author:
 *  Date:
 * 	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner XD = new Scanner(System.in);
		int dol= 100;
		System.out.println("Slot Machine Rules:"); 
		System.out.println("1. Each player starts with $100.");
		System.out.println("2. Input a wager less than your total amount of money.");
		System.out.println("3. The slot machine will roll 3 numbers from 1 to 10.");
		System.out.println("	a. If two numbers match, you double your money.");
		System.out.println("	b. If three numbers match, you triple your money.");
		System.out.println("	c. If none match, you lose your money.");
		System.out.println("-----------------------------------------------");
		System.out.println("");
		System.out.println("Would you like to play the slots? (Yes/yes/Y/y)");
		String Ja = XD.next();
		while (Ja.equals("Yes") || Ja.equals("yes") || Ja.equals("Y") || Ja.equals("y")){

			System.out.print("You have " + dol + ". How much would you like to wager?");
			int euro= XD.nextInt();
			System.out.println("");
			System.out.println("Great! Let's play!!!");
			System.out.println("Your rolls are:");
			System.out.println("");
			System.out.println("---------------------------");
			int nu = (int)(Math.random()*11+1);
			int mb = (int)(Math.random()*11+1);
			int er = (int)(Math.random()*11+1);
			System.out.println(" | " + nu + " | " + mb + " | " + er + " | ");
			if (nu != er && er != mb && nu !=mb){
				System.out.println("Didn't win this time, better luck next time.");
				System.out.println("You now have $" + (100-euro) + ".");
			}
			else if (nu==er && er!=mb){
				System.out.println("You won! Your wager has now been doubled!");
				System.out.println("You now have $" + (100+(euro*2)) + ".");
			}
			else if (nu!=er && er==mb){
				System.out.println("You won! Your wager has now been doubled!");
				System.out.println("You now have $" + (100+euro*2) + ".");
			}
			else{
				System.out.println("Jackpot! Your wager has now been tripled!");
				System.out.println("You now have $" + (100+euro*3) + ".");
			}
			dol=euro;
			System.out.println("Would you like to play the slots? (Yes/yes/Y/y)");
		}
	}
}
