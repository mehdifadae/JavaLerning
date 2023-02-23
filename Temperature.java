package JavaLerning.JavaLerning;

public class Temperature {

    public static void main(String[] args) {

        /*
         * Programe Temprature.java bekommt als argument zwei Werten
         * ausentempratur als integer und precipitation als Boolean wert und wir
         * kontrolliren was für eine aktivitate
         * passt. in switch mode ist unterschidliches text als ausgaben vorgesehen
         */

        // alle variablen werden hier dekleriert und durch argument bei args[] von
        // konsol an program weiter gegeben
        int aussenTemrerature = Integer.parseInt(args[0]);
        boolean precipitation = Boolean.parseBoolean(args[1]); // durch boolean.parseBoolean(args[]) wird angegeben true
                                                               // oder fals String als wer gespeichert

        // hier wird eingegeben boolean wert in int werwandet weil swicht statment wird
        // nur bei int oder string enum funktionirt und nicht mit boolean
        // wert von variable precipitation wird als 1 bei true oder 0 bei falsh in
        // variable precepitationInt gespeichert
        int precipitationInt = precipitation ? 1 : 0;

        if (aussenTemrerature >= 0 && aussenTemrerature <= 19) {

            switch (precipitationInt) {

                case 1:
                    System.out.println("Sauwetter");
                    break;
                case 0:
                    System.out.println("Gehen wir spazieren");
                    break;
            }
        } else if (aussenTemrerature >= 20) {

            switch (precipitationInt) {

                case 0:
                    System.out.println("Gehen wir schwimmen?");
                    break;
            }

        }
        if (aussenTemrerature < 0) {

            switch (precipitationInt) {

                case 1:
                    System.out.println("Komm, geh'n wir Schlittenfahren!");
                    break;
                case 0:
                    System.out.println("Lass uns am Lagerfeuer Glühwin trinken.");
                    break;

            }
        }
    }

}
