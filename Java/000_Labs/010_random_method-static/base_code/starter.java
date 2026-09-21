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
		System.out.print(s + ", " + c + ", " + a + ", " + b + ", " + r);
	}
}
