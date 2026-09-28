/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner blb = new Scanner(System.in);
		int lbl= blb.nextInt();
		Scanner nmn = new Scanner(System.in);
		int mnm = nmn.nextInt();

		System.out.println("the first variable is " + lbl);
		System.out.println("the second variable is " + mnm);

		boolean ye = lbl != mnm;
		if (ye){
			System.out.print("The variables are different!");
		}
		boolean nein = lbl == mnm;
		if (nein){
			System.out.print("The variables are the same!");
		}
 
	}
}
