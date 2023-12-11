package finanzamt;

import KlassenArbeit.IO;

import java.io.IOException;

public class varianz {
    public static void main(String[] args)throws IOException {
        System.out.print("anzahl");
        int anzahl = IO.readInteger();
        double[] werte = new double[anzahl];
        for (int i=0;i< werte.length;i++) {
            werte[i] = IO.readDouble();
        }
        varianz(werte,anzahl);
    }

    private static double varianz(double[]werte,int anzahl )throws IOException {
        double zero=0;
        double a=0;
        double b=0;
        for (int i = 0; i < werte.length; i++) {
            zero=zero+werte[i];


        }
        double rechnung=zero/anzahl;
        for (int j=0;j< werte.length;j++){
            double minus=werte[j]-rechnung;
            a=minus*minus;
            b=b+a;
        }
        System.out.println(b/anzahl);






        return 0;
    }
}
