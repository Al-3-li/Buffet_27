import java.util.Scanner;

class starter {
	public static void main(String args[]) {
        Scanner DX= new Scanner(System.in);

        System.out.println("Please choose a catagory to visit: ");
        System.out.println("I. Farbe");
        System.out.println("II.Gambling");
        System.out.println("III.")
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

       System.out.println("Pick a color from the list above! (E.X 'orange')");
       String Coloore = DX.next();
       if (Coloore.equals("red")){
        
        getColor(r, e, d);
       }
       else if (Coloore.equals("orange")){
        
        getColor(or, an,ge);
       }
       else if (Coloore.equals("yellow")){
        
        getColor(ye,ll,ow);
       }
       else if (Coloore.equals("green")){
        
        getColor(gr,ee,n);
       }
       else if (Coloore.equals("blue")){
        
        getColor(b, lu, eeee);
       }
       else if (Coloore.equals("purple")){
        
        getColor(pu,rp,le);
       }
       else if(Coloore.equals("pink")){
       
        getColor(pi,nn,k);
       }
       else{
        System.out.println("The color is too specific! Please go broader.");
       }
       DX.close();
	}
    else if (cat.equals("Gambling")){
        Scanner XD = new Scanner(System.in);
        System.out.println("What game?");
        System.out.println("~Slots");
        System.out.println("~Guessing");
        System.out.println("~Colors");
        String game= XD.next();
        if (game.equals("Slots")){
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
			dol =100-euro;
			System.out.println("Would you like to play the slots? (Yes/yes/Y/y)");
			Ja=XD.next();
			if (Ja.equals("No") || Ja.equals("no") || Ja.equals("N") || Ja.equals("n")){
			System.out.println("Okay! Come back tomorrow! You still have $" + dol + " left! :D");
		}
	}
        }
    else if (game.equals("Guessing")){
        System.out.println("Rules: ");
        System.out.println("1. You have 6 tries");
        System.out.println("2. Place your wager (You have $100)");
        System.out.println("3.Pick a random number between 1 and 1000");
        System.out.println("Are you ready to begin? (Yes/yes/Y/y)");
        int mon = 5;
        int ey= 100;
        String y= XD.next();
        if (y.equals("No") || y.equals("no") || y.equals("N") || y.equals("n")){
            System.out.println("Such a shame! Come back another time, you have $" + ey + " leftover!");
        }
        if(y.equals("Yes") || y.equals("yes") || y.equals("Y") || y.equals("y")){
            System.out.println("Please place a wager!");
            int wager= XD.nextInt();
            System.out.println("The number has been picked. Please begin guessing!");
            int ran= (int)(Math.random()*1001+1);
            int in= XD.nextInt();
            while(mon!=0){
            if(mon==0){
                System.out.println("You've run out of tries! Please make another attempt.");
                break;
            }
            else if(in==ran){
                System.out.println("You got the number! Your money is tripled.");
                ey= ey*3;
                System.out.println("You now have $" + ey + "to spend.");
                mon= mon-5;
            }
            else if(in>ran && in<=1000){
                System.out.println("That was not the number. Your guess was too high.");
                System.out.println("You now have " + (mon-1) + " tries left!");
                System.out.println("Please input another number!");
                in=XD.nextInt();
                mon= mon-=1;
            }
            else if(in<ran){
                System.out.println("That was not the number. Your guess was too low.");
                System.out.println("You now now have " + (mon-1) + " tries left!");
                System.out.println("Please input another number.");
                in=XD.nextInt();
                mon=mon-=1;
            }
            else{
                System.out.println("That was not an allowed number, please input a different one.");
                in=XD.nextInt();
            }
        }
        }
    }
    else if(game.equals("Colors")){
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
       
        System.out.println("Rules:");
        System.out.println("I. Pick a random color");
        System.out.println("II. Place a bet (You have $100)");
        int moe= 100;
        System.out.println("III. If you guess correctly, your money is tripled");
        System.out.println("IV. If you guess incorrectly, your money is lost");
        System.out.println("Are you ready to play? (Yes/yes/Y/y)");
        String ja= XD.next();
        if(ja.equals("No")|| ja.equals("no")|| ja.equals("N")|| ja.equals("n")){
            System.out.println("Okay! Come again! :)");
            System.out.println("You have $" + moe + " left to spend!");
        }
        else if(ja.equals("Yes")|| ja.equals("yes")|| ja.equals("Y")|| ja.equals("y")){
            System.out.println("Please place a bet!");
            int betts= XD.nextInt();
            System.out.println("The color has been chosen.");
            int co= (int)(Math.random()*8+1);
            System.out.println("Please guess a color:");
            System.out.println("Red");
            System.out.println("Orange");
            System.out.println("Yellow");
            System.out.println("Green");
            System.out.println("Blue");
            System.out.println("Purple");
            System.out.println("Pink");
            String col= XD.next();
            if (co==1 && col.equals("Red")){
                System.out.println("Correct!");
                getColor(r,e,d);
                betts= betts*3;
                moe=betts+moe;
                System.out.println("You now have $" + moe);
            }
            else if (co==2 && col.equals("Orange")){
                System.out.println("Correct!");
                getColor(or,an,ge);
                betts=betts*3;
                moe=betts+moe;
                System.out.println("You now have $" + moe);
            }
            else if (co==3 && col.equals("Yellow")){
                System.out.println("Correct!");
                getColor(ye,ll,ow);
                betts=betts*3;
                moe=betts+moe;
                System.out.println("You now have $" + moe);
            }
            else if (co==4 && col.equals("Green")){
                System.out.println("Correct!");
                getColor(gr,ee,n);
                betts=betts*3;
                moe=betts+moe;
                System.out.println("You now have $" + moe);
            }
            else if (co==5 && col.equals("Blue")){
                System.out.println("Correct!");
                getColor(b,lu,eeee);
                betts=betts*3;
                moe=betts+moe;
                System.out.println("You now have $" + moe);
            }
            else if (co==6 && col.equals("Purple")){
                System.out.println("Correct!");
                getColor(pu,rp,le);
                betts=betts*3;
                moe=betts+moe;
                System.out.println("You now have $" + moe);
            }
            else if (co==7 && col.equals("Pink")){
                System.out.println("Correct!");
                getColor(pi,nn,k);
                betts=betts*3;
                moe=betts+moe;
                System.out.println("You now have $" + moe);
            }
            else{
                System.out.println("That was incorrect!");
                moe=moe-betts;
                System.out.println("You now have $" + moe);
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

