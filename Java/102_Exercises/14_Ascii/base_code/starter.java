/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {

		System.out.println("Willkommen im ASCII-Museum!");
		System.out.println("Bitte waehlen Sie aus, was moechten sie sehen?");
		Scanner XD = new Scanner(System.in);
		System.out.println("I. Muster");
		System.out.println("II. Pflanzen");
		System.out.println("III. Edelsteine");

		String Section = XD.next();

		String Felsen = ("Muster");
		String Pflanzen = ("Pflanzen");
		String Edelsteine = ("Edelsteine");  

		if (Section.equals("Muster")){
			System.out.println("--Welcher Muster?--");
			System.out.println("Basalt");
			System.out.println("Obsidian");
			String Rock=XD.next();
			if (Rock.equals("Basalt")){
			System.out.println("    /\\    /\\");
			System.out.println("   /  \\  /  \\");
			System.out.println("  / /\\ \\/ /\\ \\");
			System.out.println(" / /  \\ \\/  \\ \\");
			System.out.println("/ /   /\\ \\   \\ \\");
			System.out.println("\\ \\  / /\\ \\  / /");
			System.out.println(" \\ \\/ /  \\ \\/ /");
			System.out.println("  \\/ /    \\/ /");
			System.out.println("  / /\\    / /\\");
			System.out.println(" / /\\ \\  / /\\ \\");
			System.out.println("/ /  \\ \\/ /  \\ \\");
			System.out.println("\\ \\   \\ \\/   / /");
			System.out.println(" \\ \\  /\\ \\  / /");
			System.out.println("  \\ \\/ /\\ \\/ /");
			System.out.println("   \\  /  \\  /");
			System.out.println("    \\/    \\/");
			}
			else if (Rock.equals("Obsidian")){
				System.out.println(" .--..--..--..--.");
				System.out.println("/ .. \\.. \\.. \\.. \\");
				System.out.println("\\ \\/\\ \\/\\ \\/\\ \\/ /");
				System.out.println(" \\/ /\\/ /\\/ /\\/ /");
				System.out.println(" / /\\/ /\\/ /\\/ /\\");
				System.out.println("/ /\\ \\/\\ \\/\\ \\/\\ \\");
				System.out.println("\\ \\/\\ \\/\\ \\/\\ \\/ /");
				System.out.println(" \\/ /\\/ /\\/ /\\/ /");
				System.out.println(" / /\\/ /\\/ /\\/ /\\");
				System.out.println("/ /\\ \\/\\ \\/\\ \\/\\ \\");
				System.out.println("\\ \\/\\ \\/\\ \\/\\ \\/ /");
				System.out.println(" \\/ /\\/ /\\/ /\\/ /");
				System.out.println(" / /\\/ /\\/ /\\/ /\\");
				System.out.println("/ /\\ \\/\\ \\/\\ \\/\\ \\");
				System.out.println("\\ `'\\ `'\\ `'\\ `' /");
				System.out.println(" `'--'`--'`--'`--'");
				

			}
		}
		
		else if (Section.equals(Pflanzen)){
			System.out.println("--Welcher Pflanzen?--");
			System.out.println("Pilz");
			System.out.println("Rose");
			String P = XD.next();
			if (P.equals("Pilz")){ 
System.out.println("                       .-'~~~-.");
System.out.println("                     .'o  oOOOo`.");
System.out.println("                    :~~~-.oOo   o`.");
System.out.println("                     `. \\ ~-.  oOOo.");
System.out.println("                       `.; / ~.  OO:");
System.out.println("                       .'  ;-- `.o.'");
System.out.println("                      ,'  ; ~~--'~");
System.out.println("                      ;  ;");
System.out.println("_______\\|/__________\\\\;_\\\\//___\\|/________");
			}

		else if (P.equals("Rose")){
			System.out.println("       __   __");
System.out.println("      /  \\./  \\/\\_");
System.out.println("  __{^\\_ _}_   )  }/^\\");
System.out.println(" /  /\\_/^\\._}_/  //  /");
System.out.println("(  (__{(@)}\\__}.//_/__A____A_______A________A________A_____A___A___A______");
System.out.println(" \\__/{/(_)\\_}  )\\\\ \\\\---v-----V-----V---Y-----v----Y------v-----V-----v---");
System.out.println("   (   (__)_)_/  )\\ \\>");
System.out.println("    \\__/     \\__/\\/\\/");
System.out.println("       \\__,--'");

}

		}
	else if(Section.equals("Edelsteine")){
		System.out.println("--Welche Edelsteine?--");
		System.out.println("Diamanten");
		System.out.println("Smaragd");
		String Edel = XD.next();
	
		if(Edel.equals("Diamanten")){
System.out.println("   .     '     ,");
System.out.println("    _________");
System.out.println(" _ /_|_____|_\\ _");
System.out.println("   '. \\   / .'");
System.out.println("     '.\\ /.'");
System.out.println("       '.'");

		}
		else if(Edel.equals("Smaragd")){
System.out.println("   .    '    ,");
System.out.println("     _______");
System.out.println("_  .`_|___|_`.  _");
System.out.println("    \\ \\   / /");
System.out.println("     \\ ' ' /");
System.out.println("      \\  /   ");
System.out.println("       \\./");
System.out.println("        V");

		}
	}
	else{
		System.out.println("That exhibit isn't here yet! It'll be finished on [REDACTED]");
	}
	XD.close();
	}

	}
		
	

