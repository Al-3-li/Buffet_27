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
		boolean k2= false;
		
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
		int Points = 20-strength;
		int f= 0;
		if ((Points>=0) && (Points<=10)){
			System.out.println("You have " + Points + " left to spend.");
		}
		else if (Points==0){
				System.out.println("You have 20 points left to spend!");
		}
		else{
			k2= true;
			System.out.println("Please input a different number 10 or under!");
			int k= Lolz.nextInt();
			f=k+f;
			System.out.println("You have " + (20-f) + " left to spend!");
		}
			System.out.println("Dexterity (1-10): ");
		int Dex = Lolz.nextInt();
		int N= Points-Dex;
		int Ter = 10-Dex;
		int ff=0;
		if ((10>=Ter) && (Ter>0)){
			System.out.println("You have " + N + " left to spend.");
		}
		else if (Points==Ter){
			System.out.println("You have 0 points left to spend!");
		}
		else{
			k2= true;
			System.out.println("Please input a different number 10 or under!");
			int kk = Lolz.nextInt();
			ff=kk+ff;
			System.out.println("You have " + (20-f-ff) + " left to spend");
		}
		System.out.println("Intelligence (1-10) ");
		int inte = Lolz.nextInt();
		int lle= 10-inte;
		int gince= N-inte;
		int fff=0;
		if ((lle>=inte) && (lle>=0)){
			System.out.println("You have " + gince + " left to spend.");
		}
		else if (N==inte){
			System.out.println("You have 0 points left to spend.");
			}
			else{
			k2= true;
			System.out.println("Please input a different number 10 or under!");
			int kkm = Lolz.nextInt();
			fff=kkm+fff;
			System.out.println("You have " + (20-f-ff-fff) + " left to spend");
		}
		System.out.println("Charisma (1-10): ");
		int chari = Lolz.nextInt();
		int sm = 10-chari;
		int ma = N-chari;
		int ffff=0;
		if ((sm>=chari) && (sm>=0)){
			System.out.println("You have " + ma + " left to spend.");
		}
		else if (gince==gince){
			System.out.println("You have 0 points left to spend.");
		}
		else{
			k2= true;
			System.out.println("Please input a different number 10 or under!");
			int kkkk = Lolz.nextInt();
			ffff=kkkk+ffff;
			System.out.println("You have " + (20-f-ff-fff-ffff) + " left to spend!");
		}

		int zero = 0;
		int eins = (int)(ma);
		int zwei = (int)(20-f-ff-fff-ffff);
		
		if (eins==zero){
			System.out.println("You have 0 points remaining.");
		}
		
		else if ((eins>0) && (eins<20)){
			System.out.println("You have " + eins + " to spend for next time.");
		}
		else if (zwei>0 && zwei<20){
			System.out.println("You have " + zwei + " to spend for next time.");
		}
		else{
			System.out.println("You have 0 points for next time!");
		}

		int PS= strength;
		int PD= Dex;
		int PI= inte;
		int PC= chari;
		int Zf= f;
		int Zff= ff;
		int Zfff= fff;
		int Zffff = ffff;

		int SDIC= PS+PD+PC+PI;
		int FfFf= Zf+Zff+Zfff+Zffff;
		boolean C= SDIC==20;
		boolean B= FfFf==20;

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
	else if (B && (x==false)){
		System.out.println("---------------------------------------");
		System.out.println("You are " + name + ", " + Title + " of CVHS.");
		System.out.println("You are a " + Class + " with the following stats!");
		System.out.println("Strength - " + f);
		System.out.println("Dexterity - " + ff);
		System.out.println("Intelligence - " + fff);
		System.out.println("Charisma - " + ffff);
		System.out.println("");
		System.out.println("Good luck on your quest, " + name + "!");
	}
	else if (B && (x==true)){
		System.out.println("---------------------------------------");
		System.out.println("You are " + name + ", " + Title + " of CVHS.");
		System.out.println("You are a farmer with the following stats!");
		System.out.println("Strength - " + f);
		System.out.println("Dexterity - " + ff);
		System.out.println("Intelligence - " + fff);
		System.out.println("Charisma - " + ffff);
		System.out.println("");
		System.out.println("Good luck on your quest, " + name + "!");
	}
	else if (k2=true && B){
		System.out.println("---------------------------------------");
		System.out.println("You are " + name + ", " + Title + " of CVHS.");
		System.out.println("You are a " + Class + " with the following stats!");
		System.out.println("Strength - " + f);
		System.out.println("Dexterity - " + ff);
		System.out.println("Intelligence - " + fff);
		System.out.println("Charisma - " + ffff);
		System.out.println("");
		System.out.println("Good luck on your quest, " + name + "!");
	}
	else if (x=true){
		System.out.println("---------------------------------------");
		System.out.println("You are " + name + ", " + Title + " of CVHS.");
		System.out.println("You are a farmer with the following stats!");
		System.out.println("Strength - " + f);
		System.out.println("Dexterity - " + ff);
		System.out.println("Intelligence - " + fff);
		System.out.println("Charisma - " + ffff);
		System.out.println("");
		System.out.println("Good luck on your quest, " + name + "!");
	}
		Lolz.close();
}
}

