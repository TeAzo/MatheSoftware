package finanzamt;

import KlassenArbeit.IO;

import java.io.IOException;

public class maximaleundminimale {
    public static void main(String[] args) throws IOException {
        System.out.print("anzahl");
        int anzahl = IO.readInteger();
        double[] werte = new double[anzahl];
        for (int i = 0; i < werte.length; i++) {
            werte[i] = IO.readDouble();
        }

        double abweichung = maximale(werte);
        System.out.println(abweichung);
        double c=moahmmad(werte);
        System.out.println("fd");
        System.out.println(c);
    }

    private static double maximale(double[] werte) {
        double a = 0;
        for (int i = 1; i < werte.length; i++) {
            double maximal = Math.abs(werte[i] - werte[i - 1]);
            if (maximal > a) {
                a = maximal;
            }
        }
        return a;
    }



    private static double moahmmad(double [] werte)throws IOException {
        double minimaledistanz=werte[0]-werte[1];
        if (minimaledistanz < 0){
            minimaledistanz=minimaledistanz*-1;
        }
        for (int i = 1; i < werte.length-1; i++) {
            double zahl=werte[i];
            double nachabr=werte[i+1];
            double distanz=zahl-nachabr;

        if (distanz<0){
            distanz=distanz*-1;
        }
        if (distanz<minimaledistanz){
            minimaledistanz=distanz;
        }
    }
        return minimaledistanz;
    }
    }

