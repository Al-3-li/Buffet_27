import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		
        int r = (int) (Math.random()*128+128);
        int e = (int) (Math.random()*0);
        int d = (int) (Math.random()*0);
       

        int or = (int) (Math.random()*129+150);
        int an = (int) (Math.random()*128);
        int ge = (int) (Math.random()*0);
        

       int ye = (int) (Math.random()*129+128);
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


       System.out.println("Pick a color from the list above!");
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

    

	public static void getColor(int red, int green, int blue){
        String startColor = "\u001B[48;2;" + red + ";" + green + ";" + blue + "m";
        String resetColor = "\u001B[0m";
        String swatch = startColor + "                    " + resetColor;
        System.out.println(swatch);
    }
}

