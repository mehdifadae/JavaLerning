package JavaLerning.JavaLerning;

public class BoolenVaules {

    public static void main(String[] args) {

        boolean boolVar1 = false;
        boolean boolVar2 = false;
        int counter1 = 0;
        int counter2 = 0;

        System.out.println("Wahrheitstabelle\n");

        while (counter2 <= 1) {
            counter1 = 0;
            // Hier muss counter1 zurückgesetzt werden, damit die innere Schleife erneut
            // aufgerufen werden kann
            while (counter1 <= 1) {
                System.out.println(boolVar1 + " && " + boolVar2 + " liefert " + (boolVar1 && boolVar2));
                System.out.println(boolVar1 + " || " + boolVar2 + " liefert " + (boolVar1 || boolVar2));
                System.out.println(boolVar1 + " ^ " + boolVar2 + " liefert " + (boolVar1 ^ boolVar2) + "\n");
                boolVar2 = !boolVar2;
                counter1++;
                // System.out.print("counter1: " + counter1 );
                // System.out.println(" counter2: " + counter2 + "\n");
            }

            boolVar1 = !boolVar1;
            counter2++;

        }
    }
}
