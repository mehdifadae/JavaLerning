package AufgabenFunfteTag;

public class LittleWitch {

    public static void main(String[] args) {

        int uhr = Integer.parseInt(args[0]);

        switch (uhr) {

            case 6:
                System.out.println("Morgens Früh um " + uhr + "\n" + "kommt die kleine Hex.");
                break;
            case 7:
                System.out.println("Morgens früh um " + uhr + "\n" + "schabt sie gelbe Rüben.");
                break;
            case 8:
                System.out.println("Morgens früh um " + uhr + "\n" + "wird Kaffee gemacht.");
                break;
            case 9:
                System.out.println("Morgens früh um " + uhr + "\n" + "geht sie in die Scheun'.");
                break;
            case 10:
                System.out.println("Morgens früh um " + uhr + "\n" + "hack sie Holz und Spän'.");
                break;
            case 11:
                System.out.println("Feuert an um " + uhr + "," + "\n" + "Koch dann bis um 12:");
                break;
            default:
                System.out.println("Fröschebein und Krebs und Fish." + "\n" + "Hurtig Kinder Kommt zu Tisch!");
        }
    }

}
