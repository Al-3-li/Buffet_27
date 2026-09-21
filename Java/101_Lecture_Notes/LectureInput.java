/*
    Lecture note example - Input!!
*/
import java.util.Scanner;

class LectureInput{
    public static void main(String args[]) {
        System.out.println("Willkommen zum Deutsch Essen!");
       System.out.println("Unsere Spiesekarte:");
        System.out.print("1. Schnitzel - ");
        Double Eins = 2.5;
        System.out.println(Eins);

        System.out.print("2. Kaesebrot - ");
        Double zwei = 4.5;
        System.out.println(zwei);

        System.out.print("3. Currywurst - ");
        Double drei = 5.6;
        System.out.println(drei);
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Wie viele Schnitzel moechten Sie?");
        int item1Quant = sc.nextInt();
        System.out.println("Schnitzel kosten: " + (Eins*item1Quant));

        System.out.println("Wie viele Kaesebrot moechten Sie?");
        int item2Quant = sc.nextInt();
        System.out.println("Schnitzel kosten: " + (zwei*item2Quant));

        System.out.println("Wie viele Currywurst moechten Sie?");
        int item3Quant = sc.nextInt();
        System.out.println("Schnitzel kosten: " + (drei*item3Quant));

        double grandTotal = (Eins*item1Quant) + (zwei*item2Quant) + (drei*item3Quant);

        System.out.println("Wie viel Trinkgeld moechten Sie geben?");
        double tip = sc.nextDouble();

        double math = (tip/100 * grandTotal);

        System.out.println("Ihr Gesamtbetrag betraegt: " + math);

	}
}
