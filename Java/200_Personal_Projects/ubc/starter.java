import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		
        int r = (int) (Math.random()*128+128);
        int e = (int) (Math.random()*0);
        int d = (int) (Math.random()*0);
        getColor(r, e, d);

        int or = (int) (Math.random()*129+150);
        int an = (int) (Math.random()*126+130);
        int ge = (int) (Math.random()*0);
        getColor(or,an,ge);

       int ye = (int) (Math.random()*129+128);
       int ll = (int) (Math.random()*129+128);
       int ow = (int) (Math.random()*0);
       getColor(ye,ll,ow);

       int gr = (int) (Math.random()*0);
       int ee = (int) (Math.random()*129+128);
       int n = (int) (Math.random()*0);
       getColor(gr, ee, n);

       int b = (int) (Math.random()*0);
       int lu = (int) (Math.random()*0);
       int eeee = (int) (Math.random()*129+128);
       getColor(b, lu, eeee);

	   int pu = (int) (Math.random()*129+128);
	   int rp = (int) (Math.random()*0);
	   int le = (int) (Math.random()*129+128);
	   getColor(pu, rp, le);

	   int rose = (91);
	   int gru = (206);
	   int blu = (250);
	   getColor(rose,gru,blu);

       int esor = (245);
       int urg = (169);
       int ulb = (184);
       getColor(esor, urg, ulb);

       int weis = (255);
       int weiss = (255);
       int weisss = (255);
       getColor(weis,weiss,weisss);
       getColor(esor, urg, ulb);
       getColor(rose,gru,blu);

       int pls = (int) (Math.random()*129+150);
       int help = (int) (Math.random()*129+140);
       int me = (int) (Math.random()*128);
       getColor(pls,help,me);

       getColor(r, e, d);
       getColor(or,an,ge);
       getColor(ye,ll,ow);
       getColor(gr,ee,n);
       getColor(b,lu,eeee);
       getColor(pu,rp,le);

       Scanner lzl = new Scanner(System.in);

       String Farbe = lzl.next();


       System.out.print("My favorite color is: " + Farbe);
       if (Farbe.equals("red")){
        System.out.print("red");
        getColor(r, e, d);
       }
       else if (Farbe.equals("orange")){
        System.out.print("orange");
        getColor(or, an,ge);
       }
       else if (Farbe.equals("yellow")){
        System.out.print("yellow");
        getColor(ye,ll,ow);
       }
       else if (Farbe.equals("green")){
        System.out.print("green");
        getColor(gr,ee,n);
       }
       else if (Farbe.equals("blue")){
        System.out.print("blue");
        getColor(b, lu, eeee);
       }
       else if (Farbe.equals("purple")){
        System.out.print("purple");
        getColor(pu,rp,le);
       }


		// Call getColor(#, #, #);
	}

	public static void getColor(int red, int green, int blue){
        String startColor = "\u001B[48;2;" + red + ";" + green + ";" + blue + "m";
        String resetColor = "\u001B[0m";
        String swatch = startColor + "                    " + resetColor;
        System.out.println(swatch);
    }
}

