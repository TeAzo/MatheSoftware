import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class VektorenRechnung {

    public static void main(String[] args) throws IOException {
        System.out.println("wie lang ist dein array: ?");
        int zahl = readinteger();
        double[] array = new double[zahl];
        System.out.println(" gib werte für ersten array an: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = readdouble();
        }
        double[] array1 = new double[zahl];
        System.out.println(" gib werte für zweiten array an: ");
        for (int i = 0; i < array1.length; i++) {
            array1[i] = readdouble();
        }

        System.out.println("------Mal mit einer Ganzzahl--------------");
        double[] maltabelle = MalMitEinerZahl(array);
        vektoranzeigen(maltabelle);
        System.out.println("-------Mal zweier Vektoren-----------");
        double[] zweitabelle = MalMitZweiVektoren(array, array1);
        vektoranzeigen(zweitabelle);
        System.out.println("-------------Plus zweier Vektoren----------");
        double[] plustabelle = PlusMitZweiVektoren(array, array1);
        vektoranzeigen(plustabelle);
    }


    public static double[] PlusMitZweiVektoren(double[] array, double[] array1) throws IOException {
        double[] loesung = new double[array.length];
        for (int i = 0; i < array.length; i++) {
            loesung[i] = array[i] + array1[i];
        }
        return loesung;
    }

    public static double[] MalMitEinerZahl(double[] array) throws IOException {
        System.out.println();
        System.out.print("Nenne Mir eine Ganzzahl mit dem der Vektor mal genommen wird? :");
        int mal = readinteger();
        double[] loesung = new double[array.length];
        for (int i = 0; i < array.length; i++) {
            loesung[i] = array[i] * mal;
        }
        return loesung;
    }

    public static double[] MalMitZweiVektoren(double[] array, double[] array1) throws IOException {
        double[] loesung = new double[array.length];
        for (int i = 0; i < array.length; i++) {
            loesung[i] = array1[i] * array[i];
        }
        return loesung;
    }


    public static void vektoranzeigen(double[] tabelle) throws IOException {
        for (int i = 0; i < tabelle.length; i++) {
            System.out.print(tabelle[i] + "\t");
        }
        System.out.println();

    }


    public static double runden(double wert, int stellen) {
        return Math.round(wert * Math.pow(10, stellen) / Math.pow(10, stellen));

    }


    public static double runden(double wert) {
        return Math.round(wert * 100) / 100.;

    }


    public static String readString() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String text = br.readLine();
        return text;
    }


    public static int readinteger() throws IOException {
        while (true) {
            try {
                int zahl = Integer.parseInt(readString());
                return zahl;
            } catch (NumberFormatException e) {
                System.out.print("Keine Ganzzahl! Bitte erneut versuchen: ");

            }


        }

    }


    public static double readdouble() throws IOException {
        while (true) {
            try {
                String text = readString();
                double kommaZahl = Double.parseDouble(text.replace(',', '.'));
                return kommaZahl;
            } catch (NumberFormatException e) {
                System.out.print("Keine Ganzzahl! Bitte erneut versuchen: ");

            }

        }

    }


    public static boolean readboolean() throws IOException {
        while (true) {
            String eingabe = readString();
            if (eingabe.equals("ja") || eingabe.equals("j") || eingabe.equals("yes")) {
                return true;
            } else if (eingabe.equals("nein") || eingabe.equals("n") || eingabe.equals("no")) {
                return false;
            }
            System.out.println("Gebe ja oder nein ein");

        }

    }


    public static int[] readIntegerArray1D(int anzahl, String text) throws IOException {
        int[] array = new int[anzahl];
        for (int i = 0; i < array.length; i++) {
            System.out.print(text + " " + (i + 1) + " eingaben: ");
            array[i] = readinteger();
        }
        return array;

    }


    public static double[] readDoubleArray1D(String vortext, String[] texte) throws IOException {
        double[] array = new double[texte.length];
        for (int i = 0; i < array.length; i++) {
            System.out.print(vortext + " " + texte[i] + " eingeben: ");
            array[i] = readdouble();
        }
        return array;
    }
    public static String[] readStringArray1D(int anzahl, String text) throws IOException {
        String[] array = new String[anzahl];
        for (int i = 0; i < array.length; i++) {
            System.out.print(text + " " + (i + 1) + " eingaben: ");
            array[i] = readString();
        }
        return array;
    }

}
