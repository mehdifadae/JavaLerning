package JavaLerning.JavaLerning;

public class Square {

    public static void main(String[] args) {

        long ZahlPartA;
        long ZahlPartB;
        long counter = 0;

        long EingegebeneNumber = Integer.parseInt(args[0]);
        long AddierenQuadrant = 0;

        // AufGabe Part a und b
        while (counter < EingegebeneNumber) {
            AddierenQuadrant = AddierenQuadrant + EingegebeneNumber;
            counter = counter + 1;
        }
        System.out.println(" Das Quadrant von " + EingegebeneNumber + " Ist:");
        System.out.println("- Berechnet durch " + EingegebeneNumber + "-maliges Addieren von "
                + EingegebeneNumber + " : " + AddierenQuadrant);

        // AufGaben Part c Nach Aufgabe Pdf

        int zahl = 0;
        int summe = 0;

        while (zahl <= EingegebeneNumber * 2) {
            if (zahl % 2 != 0) {
                summe += zahl;
            }
            zahl++;
        }
        System.out.println(
                "- Brechnet als Summe der Erste " + EingegebeneNumber + " ganzen Zahlen: " + summe);

        // AufGaben Part c
        // long AddierenQuadrant = EingegebeneNumber * EingegebeneNumber;
        // Step 1 : An algorithm to obtain square of any number.
        // Divide the number in two parts with one part containing only the number at
        // unit's place say part 'A', and other part say 'B',
        // containing the remaining number.
        // Step 2 : Now square the number at unit's place. The square will be one of
        // these;
        // {0,1,4,9,16,25,36,49,64,81}.
        // The unit's place digit in this square is the unit's place digit in actual
        // final answer.Write it in the answer.
        // If the square of digit at unit's place is a two digit no like from 16 to 81
        // in above set; write only the digit at
        // unit's place from this square in the final answer and carry the remaining
        // digit.
        // Step 3 : Multiply the actual number to be squared by part 'B'(the remaining
        // part than
        // the number at unit's place as described in step 1 ).
        // Step 4 : Multiply the parts 'A' and 'B'.
        // Step 5 : Add results of step 3 with results of step 4.
        // Step 6 : Add the carried digit from step 2 to the sum in prior step, that is
        // step 5.
        // Step 7: Now write this sum before the number we wrote at unit's place of
        // final answer
        // in step 2.
        // Step 8 : This number we now obtain from step 7, is the square of our number.

        // Step 1 Zahlen Trennung in A(%) und B(/)
        ZahlPartB = EingegebeneNumber / 10;
        ZahlPartA = EingegebeneNumber % 10;
        // System.out.println("Zahl / "+ ZahlPartB + " Zahl % " + ZahlPartA);
        // Test Auf Output

        // Step 2 Squer on ZahlPartA und separate it to a(/) und b(%)
        long ZahlAMath = ZahlPartA * ZahlPartA;
        long ZahlAParta = ZahlAMath / 10;
        long ZahlAPartb = ZahlAMath % 10;
        // System.out.println(" ZahlAMathparta " + ZahlAParta + " ZahlAMathPartb " +
        // ZahlAPartb);

        // Step 3 Given Number Multiplied by "ZahlPartB"
        long EingegebMultB = EingegebeneNumber * ZahlPartB;

        // Step 4 A*B
        long AmallB = ZahlPartA * ZahlPartB;

        // Step 5 Step3 + Step 4
        long Step5 = EingegebMultB + AmallB;

        // Step 6 Step 5 + ZahlApartb
        long Step6 = Step5 + ZahlAParta;

        // Step 7 Strings on Step 2 Concatination By Step 6

        System.out.println(
                "- Brechnen Als Durch Indivuale Brechnung" + ": " + Step6 + ZahlAPartb);

        // Aufgabe e und f

        System.out.println("- Brechnet mit Multiplikation: " + EingegebeneNumber * EingegebeneNumber);

    }

}
