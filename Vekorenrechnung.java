import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Vekorenrechnung {
    public static void main(String[] args) throws IOException {


        int zahl1 = IO.readinteger();

        int zahl2 = IO.readinteger();

        double [] vektor = new double[zahl1];


    }public static double[]MultiplikationmiteinerZahl (int zahl1 , int zahl2) throws IOException{
        double [] vektor = new double[zahl1];
        double [] loesungvektoren = new double[zahl1];
        for (int i = 0; i < vektor.length;i++ ){
            loesungvektoren[i]=vektor[i] * zahl2;
        }





return loesungvektoren;
    }
    private static double []AdditionzweierVektoren (int zahl1 , int zahl2) throws IOException{
    double[] adivektor1 = new double[zahl1];
    double[] adivektor2 = new double[zahl2];
    double[] adivektorloesung = new double[zahl1];
        for (int i = 0; i < adivektor1.length;i++){
        adivektorloesung[i] = adivektor1[i]+adivektor2[i];
    }




return adivektor1;
    }
    private static double[]MultiplikationzweierVektoren (int zahl1 , int zahl2) throws IOException {
        double[] multiplikationvektor1 = new double[zahl1];
        double[] multiplikationvektor2 = new double[zahl2];
        double[] Multivektorloesung = new double[zahl1];
        for (int i = 0; i < multiplikationvektor1.length; i++) {
            Multivektorloesung[i] = multiplikationvektor1[i] * multiplikationvektor2[i];




        }

        return multiplikationvektor1;
    }
    public class IO {





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



        public static double[] readDoubleArray1D(int anzahl, String text) throws IOException {



            double[] array = new double[anzahl];

            for (int i = 0; i < array.length; i++) {

                System.out.print(text + " " + (i + 1) + " eingaben: ");

                array[i] = readdouble();

            }

            return array;



        }



        public static int[] readIntegerArray1D(String vortext, String[] texte) throws IOException {

            int[] array = new int[texte.length];

            for (int i = 0; i < array.length; i++) {

                System.out.print(vortext + " " + texte[i] + " eingeben: ");

                array[i] = readinteger();

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



        public static String[] readStringArray1D(String vortext, String[] texte) throws IOException {

            String[] array = new String[texte.length];

            for (int i = 0; i < array.length; i++) {

                System.out.print(vortext + " " + texte[i] + " eingeben: ");

                array[i] = readString();

            }

            return array;



        }



    }




}

