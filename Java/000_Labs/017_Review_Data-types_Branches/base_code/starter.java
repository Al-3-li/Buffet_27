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
		System.out.println("What is your name?");
		Scanner Lolz = new Scanner(System.in);
		String name = Lolz.next();
		System.out.println("What is your title? Ex: Slayer of Dragons");
		String Title = Lolz.next();
		System.out.println("Would you like to be a Wizard, Warrior, or Rogue?");
		String Class = Lolz.next();

		boolean x = false;
		
		if (Class.equals("Wizard")){
			System.out.println("You've chosen the Wizard! Exelsior!");
		}
		else if (Class.equals("Warrior")){
			System.out.println("You've chosen the Warrior! For honor!");
		}
		else if (Class.equals("Rogue")){
			System.out.println("You've chosen the Rogue! How cunning!");
		}
		else{
			System.out.println("We don't have that class! Please try again next time.");
			System.out.println("Class- Farmer");
			x = true;
		}
		System.out.println("");
		System.out.println("You have 20 skill points to spend in the following: Strength, Dexterity, Intelligence, and Charisma. Spend them wisely.");
		System.out.println("Strength (1-10): ");
		int strength = Lolz.nextInt();
		int Points = (20-strength);
		int Points1 = 20;
		boolean pls = Points>0;
		if ((Points>=0) && (Points<=20)){
			System.out.println("You have " + Points + " left to spend.");
		}
		else if (Points==0){
				System.out.println("You have 20 points left to spend!");
		}
		else{
			System.out.println("Please input a different number 10 or under once allowed to.");
		}
			System.out.println("Dexterity (1-10): ");
		int Dex = Lolz.nextInt();
		int Ter = Points-Dex;
			if ((Points>=Ter) && (Points>=0)){
			System.out.println("You have " + Ter + " left to spend.");
		}
		else if (Points==Ter){
			System.out.println("You have 0 points left to spend!");
		}
		else{
			System.out.println("Please input a different number 10 or under!");
			int kk = Lolz.nextInt();
			int KB=kk;
		}
		System.out.println("Intelligence (1-10) ");
		int inte = Lolz.nextInt();
		if ((Points>=inte) && (Points>=0)){
			System.out.println("You have " + (Points-Dex-inte) + " left to spend.");
		}
		else if (Points==inte){
			System.out.println("You have 0 points left to spend.");
			}
			else{
			System.out.println("Please input a different number 10 or under!");
			int kkm = Lolz.nextInt();
			int KC=kkm;
		}
		System.out.println("Charisma (1-10): ");
		int chari = Lolz.nextInt();
		if ((Points>=chari) && (Points>=0)){
			System.out.println("You have " + (Points-Dex-inte-chari) + " left to spend.");
		}
		else if (Points==Points){
			System.out.println("You have 0 points left to spend.");
		}
		else{
			System.out.println("Please input a different number 10 or under!");
			int kkkk = Lolz.nextInt();
			int KD=kkkk;
		}
		if (Strength >)int k = Lolz.nextInt();
		int KA=k;

		int zero = 0;
		int eins = (int)(Points-Dex-inte-chari);
		
		if (eins==zero){
			System.out.println("You have 0 points remaining.");
		}
		
		else if ((eins>0) && (eins<20)){
			System.out.println("You have " + eins + " to spend for next time.");
		}

		int PS= strength;
		int PD= Dex;
		int PI= inte;
		int PC= chari;

		int SDIC= PS+PD+PC+PI;
		boolean C= SDIC==20;
		boolean B= SDIC>20;
		boolean k2= false;

		if (C && (x==false)){
		System.out.println("---------------------------------------");
		System.out.println("You are " + name + ", " + Title + " of CVHS.");
		System.out.println("You are a " + Class + " with the following stats!");
		System.out.println("Strength - " + PS);
		System.out.println("Dexterity - " + PD);
		System.out.println("Intelligence - " + PI);
		System.out.println("Charisma - " + PC);
		System.out.println("");
		System.out.println("Good luck on your quest, " + name + "!");
		}
		else if (B && (x=true)){
		System.out.println("---------------------------------------");
		System.out.println("You are " + name + ", " + Title + " of CVHS.");
		System.out.println("You are a " + Class + " changed to: Farmer! With the following stats!");
		System.out.println("Strength - " + 0);
		System.out.println("Dexterity - " + 0);
		System.out.println("Intelligence - " + 0);
		System.out.println("Charisma - " + 0);
		System.out.println("");
		System.out.println("Good luck on your quest, " + name + "!");
	}
		else if (C && (x == true)){
			System.out.println("---------------------------------------");
		System.out.println("You are " + name + ", " + Title + " of CVHS.");
		System.out.println("You are a Farmer with the following stats!");
		System.out.println("Strength - " + PS);
		System.out.println("Dexterity - " + PD);
		System.out.println("Intelligence - " + PI);
		System.out.println("Charisma - " + PC);
		System.out.println("");
		System.out.println("Good luck on your quest, " + name + "!");
	}
	else if (k2=true){
		System.out.println("---------------------------------------");
		System.out.println("You are " + name + ", " + Title + " of CVHS.");
		System.out.println("You are a " + Class + " with the following stats!");
		System.out.println("Strength - " + KA);
		System.out.println("Dexterity - " + KB);
		System.out.println("Intelligence - " + KC);
		System.out.println("Charisma - " + KD);
		System.out.println("");
		System.out.println("Good luck on your quest, " + name + "!");
	}
		Lolz.close();
}
}
