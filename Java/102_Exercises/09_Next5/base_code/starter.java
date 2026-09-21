/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		System.out.println("Please enter a number: ");
		Scanner nummer = new Scanner (System.in);
		int nu = nummer.nextInt();
		System.out.println("Here are the next 5 numbers!");
		
		System.out.print(nu + ", ");
		System.out.print(+(nu +1)+", ");
		System.out.print(+(nu+ 2)+", ");
		System.out.print(+(nu+3)+", ");
		System.out.print(+(nu+4) + ", ");
		System.out.println(+(nu+5));
		System.out.println("Here are the next 5 multiples of " + (nu) + "!");
		System.out.print( +(nu) + ", ");
		System.out.print(+ (nu*2) + ", ");
		System.out.print(+ (nu*3) + ", ");
		System.out.print(+ (nu*4) + ", ");
		System.out.print(+ (nu*5) + ", ");
		System.out.println(+(nu*6));
		System.out.println("Here is " + (nu) + " divided by 100!");
		System.out.println(+(nu/100.0));
		System.out.println("Here is " + (nu) + " divided by 10!");
		System.out.print(+(nu/10.0));
		

	}
}
