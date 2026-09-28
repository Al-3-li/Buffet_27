/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {



		System.out.print("Enter 2 numbers to create a range for your random number");
		Scanner sc = new Scanner(System.in);
		int scab= sc.nextInt();
		System.out.println("Please enter an integer: " + scab);
		int scar= sc.nextInt();
		System.out.println("Please enter another integer (Bigger than the first): " + scar);
		System.out.println("Your range is " + scab + " to " + scar);
		System.out.println("Here are 5 numbers generated in that range.");
		int s = (int)(Math.random()*(scar-scab)+scab);
		int c = (int)(Math.random()*(scar-scab)+scab);
		int a = (int)(Math.random()*(scar-scab)+scab);
		int b = (int)(Math.random()*(scar-scab)+scab);
		int r = (int)(Math.random()*(scar-scab)+scab);
		System.out.println(s + ", " + c + ", " + a + ", " + b + ", " + r);

		int scat = (int)(Math.random()*10);
		System.out.println("A number between 0-9: " + scat);
		int scap = (int)(Math.random()*11-1);
		System.out.println(("A number between 1-10: ") + scap);
		double scam = Math.random()*1+2.5;
		System.out.println("A number between 2.5 and 3.5: " + scam);
		double scaw = Math.random()*575+14;
		System.out.print("A double betweeen 14 and 589: " + scaw);


	}
}
