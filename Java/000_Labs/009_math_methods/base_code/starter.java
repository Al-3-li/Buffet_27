/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		System.out.println("Maximum = ");
		Scanner Lolz= new Scanner(System.in);
		double x = Lolz.nextDouble();
		double y= Lolz.nextDouble();
		System.out.println("Max = " + Math.max(x,y));
		System.out.println("Square root = " +(Math.sqrt(y)));
		System.out.println("Power = " + Math.pow(x,y));

	}
}
