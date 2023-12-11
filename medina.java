package finanzamt;

import KlassenArbeit.IO;

import java.io.IOException;
import java.util.Arrays;

public class medina {
    public static void main(String[] args) throws IOException {

        System.out.print("anzahl");
        int anzahl = IO.readInteger();
        double[] werte = new double[anzahl];
        for (int i=0;i< werte.length;i++) {
            werte[i] = IO.readDouble();
        }
        double median=Median(werte);
        System.out.println(median);

    }

    private static double Median(double[] werte) throws IOException {
        for (int i = 0; i < werte.length; i++) {
            Arrays.sort(werte);
            int lange = werte.length;
            int median = lange / 2;
            if (lange %2 == 0){
                return (werte[median-1]+werte[median])/2;
            }else {
                return (werte[median]);
            }

        }
        return 0;
    }
}









