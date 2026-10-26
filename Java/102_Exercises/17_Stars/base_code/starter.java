/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner DX=new Scanner(System.in);
		System.out.println("Please enter a width: ");
		int s= DX.nextInt();
		System.out.println("Please enter a height: ");
		int t= DX.nextInt();
		int sreat=0;
		while(sreat<t){
			int tears=0;
		while (tears<s){
			System.out.print("*");
			tears++;
		}
		System.out.println();
		sreat++;
		}
		System.out.println("");

		System.out.println("-------------------------");
		System.out.println("Please enter an integer: ");
		int a= DX.nextInt();
		int years= 1;
		while (years<a+1){
			int sreas=0;
			while(sreas<years){
				System.out.print("*");
				sreas++;
			}
			System.out.println("");
			years++;
		}
		System.out.println("");
		System.out.println("----------------------------------------------");
		System.out.println("Reversed Star: ");
		System.out.println("Please enter an integer: ");
		int r= DX.nextInt();
		int fears = 1;
		while (fears< r+1){
			int reafs=r;
			while(reafs>fears){
			System.out.print(" ");
			reafs--;
		}
		int rafes=0;
		while(rafes<fears){
			System.out.print("*");
			rafes++;
		}
		System.out.println("");
		fears++;

		}
		DX.close();

	}
}

