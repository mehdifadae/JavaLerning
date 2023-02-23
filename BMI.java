package JavaLerning.JavaLerning;

public class BMI {

    /*
     * BMI.java Wird Drei Argumenten Bei Konsol Annehmen Gewicht in Kilogram, Grosse
     * in Meter,Alte als Zahl
     * nach BMI Formel BMI = gwicht(Kilo) / (Gross * gross)(Meter) brechnet ob ihre
     * BMI vergleich ihre Alte gesund oder ungesund ist.
     */

    public static void main(String[] args) {

        // Allr variablen sind hier

        double Gewicht = Integer.parseInt(args[0]);
        double Grosse = Integer.parseInt(args[1]);
        double Alt = Integer.parseInt(args[2]);

        // Hier wird Grose von ganz zahl in CM zu Grosse in Meter umgewandelt
        // danach wird Gross*Gross berechnet
        double GrosseInMeter = Grosse / 100;
        double Grosse2 = (GrosseInMeter * GrosseInMeter);

        // Hierwird BMI Nach Formel Brechnet
        double BmiDouble = (Gewicht) / Grosse2;

        // Hier wird BMI mit Math.round Methode als ganz zahlöiges integer von Duble
        // verwandet
        int Bmi = (int) Math.round(BmiDouble);

        // Hier wird durch if schleiffe Alte range und Bmi Range verglichen und passende
        // aussage als output Raus geben.
        // || (oder veknupfung hilft damit Alte range zwichen beide zahlen bleibt) bei
        // BMI && verknupfung
        // ist dafor da unbedingt bmi zwichen beide zahlen bleibt.

        if ((Alt > 19 || Alt < 24) && (Bmi > 19 && Bmi < 24)) {

            System.out.println(
                    "Sie sind : " + Alt + " jahre Alt und " + "Your Bmi ist : " + Bmi + " Sie Sind Normall Gewicht");

        } else if ((Alt > 25 || Alt < 34) && (Bmi > 20 && Bmi < 25)) {

            System.out.println(
                    "Sie sind : " + Alt + " jahre Alt und " + "Your Bmi ist : " + Bmi + " Sie Sind Normall Gewicht");

        } else if ((Alt > 35 || Alt < 44) && (Bmi > 21 && Bmi < 26)) {

            System.out.println(
                    "Sie sind : " + Alt + " jahre Alt und " + "Your Bmi ist : " + Bmi + " Sie Sind Normall Gewicht");

        } else if ((Alt > 45 || Alt < 54) && (Bmi > 22 && Bmi < 27)) {

            System.out.println(
                    "Sie sind : " + Alt + " jahre Alt und " + "Your Bmi ist : " + Bmi + " Sie Sind Normall Gewicht");

        } else if ((Alt > 55 || Alt < 64) && (Bmi > 23 && Bmi < 28)) {

            System.out.println(
                    "Sie sind : " + Alt + " jahre Alt und " + "Your Bmi ist : " + Bmi + " Sie Sind Normall Gewicht");

        } else if ((Alt > 64) || (Bmi > 24 && Bmi < 29)) {

            System.out.println(
                    "Sie sind : " + Alt + " jahre Alt und " + "Your Bmi ist : " + Bmi + " Sie Sind Normall Gewicht");

        } else {
            System.out
                    .println("Sie sind : " + Alt + " jahre Alt und " + "Your Bmi ist : " + Bmi
                            + " Sie Sind UBERGEWICHT");
        }

    }

}
