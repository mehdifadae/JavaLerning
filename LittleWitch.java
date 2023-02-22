package ComCaveHausAufgaben;

public class LittleWitch {

    public static void main(String[] args) {

        int uhr = Integer.parseInt(args[0]);
        String text = "Morgens Früh um";

        while (uhr <= 12) {

            if (uhr <= 10) {
                System.out.println(text + uhr);
            }
            switch (uhr) {
                case 6:
                    System.out.println("kommt die kleine Hex.");
                    break;
                case 7:
                    System.out.println("schabt sie gelbe Rüben.");
                    break;
                case 8:
                    System.out.println("wird Kaffee gemacht.");
                    break;
                case 9:
                    System.out.println("geht sie in die Scheun'.");
                    break;
                case 10:
                    System.out.println("hack sie Holz und Spän'.");
                    break;
                case 11:
                    System.out.println("Feuert an um " + uhr + "," + "\n" + "Koch dann bis um 12:");
                    break;
                case 12:
                    System.out.println("Fröschebein und Krebs und Fish." + "\n" + "Hurtig Kinder Kommt zu Tisch!");
                    break;
            }
            uhr++;
        }
    }
}
