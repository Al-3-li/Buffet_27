/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner XD= new Scanner(System.in);
		int ra = (int)(Math.random()*1001+1);
		System.out.println("Please pick a number from 1-1000!");
		int nt = XD.nextInt();
		while (nt!=ra){
			if (nt==ra){
				System.out.println("That was the number!");
				break;
			}
			else if (nt>ra){
				System.out.println("You are more than the number.");
				nt = XD.nextInt();
			}
			else if (ra>nt){
				System.out.println("You are less than the number.");
				nt = XD.nextInt();
			}
		}

XD.close();

		
	}
}
