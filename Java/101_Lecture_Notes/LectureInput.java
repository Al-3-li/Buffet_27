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

        System.out.println("Wie viele Schnitzel moechten Sie?");
        Scanner sc = new Scanner(System.in);

        int item1Quant = sc.nextInt();
        System.out.println("Schnitzel kosten:" Eins*item1Quant);

	}
}
