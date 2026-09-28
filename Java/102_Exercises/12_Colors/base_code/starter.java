/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		
        int red = (int) (Math.random()*256);
        int green = (int) (Math.random()*256);
        int blue = (int) (Math.random()*256);
        getColor(red, green, blue);

        int inv = 256-red;
        int vin = 256-green;
        int nvi = 256-blue;
        getColor(inv, vin, nvi);

        getColor(red,green,blue);
        getColor(blue,red,green);
        getColor(green,blue,red);

        int du = (int) (Math.random()*129);
        int nk = (int) (Math.random()*129);
        int el = (int) (Math.random()*129);
        getColor(du,nk,el);

       int h = (int) (Math.random()*128+128);
       int e = (int) (Math.random()*128+128);
       int ll = (int) (Math.random()*128+128);
       getColor(h,e,ll);

       int rot = (int) (Math.random()*129);
       int gruen = (int) (Math.random()*129);
       int blau = (int) (Math.random()*129+128);
       getColor(rot, gruen, blau);

       int rosa = (int) (Math.random()*129+128);
       int lila = (int) (Math.random()*255);
       int gelb = (int) (Math.random()*255);
       getColor(rosa, lila, gelb);


		// Call getColor(#, #, #);
	}

	public static void getColor(int red, int green, int blue){
        String startColor = "\u001B[48;2;" + red + ";" + green + ";" + blue + "m";
        String resetColor = "\u001B[0m";
        String swatch = startColor + "                    " + resetColor;
        System.out.println(swatch);
    }
}
