import java.util.Scanner;

class starter {
	public static void main(String args[]) {
        Scanner DX= new Scanner(System.in);

        System.out.println("Please choose a catagory to visit: ");
        System.out.println("I. Farbe");
        System.out.println("II.Gambling");
        String cat= DX.next();

        if (cat.equals("Farbe")){
		
        int r = (int) (Math.random()*128+128);
        int e = (int) (Math.random()*0);
        int d = (int) (Math.random()*0);
       

        int or = (int) (Math.random()*129+150);
        int an = (int) (Math.random()*128+56);
        int ge = (int) (Math.random()*0);
        

       int ye = (int) (Math.random()*129+120);
       int ll = (int) (Math.random()*129+128);
       int ow = (int) (Math.random()*0);
       

       int gr = (int) (Math.random()*0);
       int ee = (int) (Math.random()*129+128);
       int n = (int) (Math.random()*0);
       

       int b = (int) (Math.random()*0);
       int lu = (int) (Math.random()*0);
       int eeee = (int) (Math.random()*129+128);
       

	   int pu = (int) (Math.random()*200+56);
	   int rp = (int) (Math.random()*0);
	   int le = (int) (Math.random()*129+128);
	   
       int pi = (int) (Math.random()*50+206);
       int nn = (int) (100);
       int k = (int) (100);

       getColor(r, e, d);
       getColor(or,an,ge);
       getColor(ye,ll,ow);
       getColor(gr,ee,n);
       getColor(b,lu,eeee);
       getColor(pu,rp,le);
       getColor(pi,nn,k);

       Scanner lzl = new Scanner(System.in);


       System.out.println("Pick a color from the list above! (E.X 'orange')");
       String Farbe = lzl.next();
       if (Farbe.equals("red")){
        
        getColor(r, e, d);
       }
       else if (Farbe.equals("orange")){
        
        getColor(or, an,ge);
       }
       else if (Farbe.equals("yellow")){
        
        getColor(ye,ll,ow);
       }
       else if (Farbe.equals("green")){
        
        getColor(gr,ee,n);
       }
       else if (Farbe.equals("blue")){
        
        getColor(b, lu, eeee);
       }
       else if (Farbe.equals("purple")){
        
        getColor(pu,rp,le);
       }
       else if(Farbe.equals("pink")){
       
        getColor(pi,nn,k);
       }
       else{
        System.out.println("The color is too specific! Please go broader.");
       }
       lzl.close();


		// Call getColor(#, #, #);
	}
    else if (cat.equals("Gambling")){
        System.out.println("What game?");
        System.out.println("~Slots");
        System.out.println("~");
        String game= DX.next();
        if (game.equals("Slots")){
            Scanner XD = new Scanner(System.in);
		int dol= 100;
		System.out.println("Slot Machine Rules:"); 
		System.out.println("1. Each player starts with $100.");
		System.out.println("2. Input a wager less than your total amount of money.");
		System.out.println("3. The slot machine will roll 3 numbers from 1 to 10.");
		System.out.println("	a. If two numbers match, you double your money.");
		System.out.println("	b. If three numbers match, you triple your money.");
		System.out.println("	c. If none match, you lose your money.");
		System.out.println("-----------------------------------------------");
		System.out.println("");
		System.out.println("Would you like to play the slots? (Yes/yes/Y/y)");
		String Ja = XD.next();
		if (Ja.equals("No") || Ja.equals("no") || Ja.equals("N") || Ja.equals("n")){
			System.out.println("Okay! Come back tomorrow! You still have $" + dol + " left! :D");
		}
		while (Ja.equals("Yes") || Ja.equals("yes") || Ja.equals("Y") || Ja.equals("y")){
			if(dol==0){
				System.out.println("You are out of money! Don't go into debt, please come again next time!");
				break;
			}

			System.out.println("You have " + dol + ". How much would you like to wager?");
			int euro= XD.nextInt();
			System.out.println("");
			System.out.println("Great! Let's play!!!");
			System.out.println("Your rolls are:");
			System.out.println("");
			System.out.println("---------------------------");
			int nu = (int)(Math.random()*11+1);
			int mb = (int)(Math.random()*11+1);
			int er = (int)(Math.random()*11+1);
			System.out.println(" | " + nu + " | " + mb + " | " + er + " | ");
			if (nu != er && er != mb && nu !=mb){
				System.out.println("Didn't win this time, better luck next time.");
                euro=euro-dol;
				System.out.println("You now have $" + (dol+euro) + ".");
			}
			else if (nu==er && er!=mb){
				System.out.println("You won! Your wager has now been doubled!");
				System.out.println("You now have $" + (dol+(euro*2)) + ".");
			}
			else if (nu!=er && er==mb){
				System.out.println("You won! Your wager has now been doubled!");
				System.out.println("You now have $" + (dol+euro*2) + ".");
			}
			else if (nu==er && er!=mb){
				System.out.println("You won! Your wager has now been doubled!");
				System.out.println("You now have $" + (dol+euro*2) + ".");
			}
			else if (nu!=er && nu==mb){
				System.out.println("You won! Your wager has now been doubled!");
				System.out.println("You now have $" + (dol+euro*2) + ".");
			}
			else{
				System.out.println("Jackpot! Your wager has now been tripled!");
				System.out.println("You now have $" + (dol+euro*3) + ".");
			}
			dol =dol+euro;
			System.out.println("Would you like to play the slots? (Yes/yes/Y/y)");
			Ja=XD.next();
			if (Ja.equals("No") || Ja.equals("no") || Ja.equals("N") || Ja.equals("n")){
			System.out.println("Okay! Come back tomorrow! You still have $" + dol + " left! :D");
		}
	}
        }
    }
}
public static void getColor(int red, int green, int blue){
        String startColor = "\u001B[48;2;" + red + ";" + green + ";" + blue + "m";
        String resetColor = "\u001B[0m";
        String swatch = startColor + "                    " + resetColor;
        System.out.println(swatch);
    }
}

