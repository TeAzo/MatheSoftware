package finanzamt;

import KlassenArbeit.IO;

import java.io.IOException;
import java.util.Arrays;

public class modus {
    public static void main(String[] args)throws IOException {
        System.out.print("anzahl");
        int anzahl = IO.readInteger();
        double[] werte = new double[anzahl];
        for (int i=0;i< werte.length;i++) {
            werte[i] = IO.readDouble();
        }
        double balab=modus(werte);
        System.out.println(balab);
    }

    private static double modus(double[] werte)throws IOException {
        double a=0;
        double b=0;

        for (int i = 0; i < werte.length; i++) {
            int nummer=0;
            for (int j=0;j<werte.length;j++){
                if (werte[i]==werte[j]){
                    nummer=nummer+1;
                }
            }
            if (nummer>a){
                a=nummer;
                b=werte[i];
            }

        }
        return b;
    }
}

















