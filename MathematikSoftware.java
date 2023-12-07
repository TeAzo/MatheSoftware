package finanzamt;

import KlassenArbeit.IO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class MathematikSoftware {
    public static String readString()throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        String eingabe= br.readLine();

        return eingabe;

    }

    public static int readInteger()throws IOException {
        while (true){
            try {
                String eingabe=readString();
                int zahl =Integer.parseInt(eingabe);
                return zahl;

            }catch (NumberFormatException e ){
                System.out.println("Falch Nummer bitte wieder versuchen");
            }
        }

    }

    public static double readDouble()throws IOException {
        while (true){
            try {
                String eingabe=readString();
                double zahl=Double.parseDouble(eingabe);
                return zahl;
            }
            catch (NumberFormatException e){
                System.out.println("Falch Nummer bitte wieder versuchen");
            }
        }

    }

    public static boolean readBoolean()throws IOException {
        while (true){
            String eingabe=readString();
            if (eingabe.equalsIgnoreCase("ja")||eingabe.equalsIgnoreCase("j")||eingabe.equalsIgnoreCase("yes")){
                return true;
            }
            else if (eingabe.equalsIgnoreCase("nein")||eingabe.equalsIgnoreCase("n")||eingabe.equalsIgnoreCase("no")){
                return false;
            }else {
                System.out.println("fehler");
            }
        }

    }

    public static void main(String[] args)throws IOException {
        System.out.println("x2");
        double x1=IO.readDouble();
        System.out.println("x2");
        double x2=IO.readDouble();

        System.out.println("anzahl");
        int anzahl=IO.readInteger();
        double []werte=new double[anzahl];

        MaximalAbweichung(x1,x2);
        MinimaleAbweichung(x1,x2);
        ArithmetischesMittel(werte,anzahl);
        Median(werte);

    }

    private static void MaximalAbweichung(double x1, double x2)throws IOException {
        double rechenen=Math.max(x1,x2);
        System.out.println("Maximale Abweichung: "+rechenen);


    }

    private static void MinimaleAbweichung(double x1, double x2)throws IOException{
        double rechenen=Math.min(x1,x2);
        System.out.println("Minimale Abweichung: "+rechenen);

    }

    private static double[] ArithmetischesMittel(double []werte,int anzahl)throws IOException {
         double zero=0;
        for (int i = 0; i < werte.length; i++) {
            zero=zero+werte[i];

            System.out.println("sdfasfsdfasdfsdaf");

        }
        double rechnung=zero/anzahl;
        System.out.println(rechnung);
        return werte;

    }

    private static void Median(double []werte)throws IOException {
        Arrays.sort(werte);
        double lange=werte.length;
        double median=lange/2;
        if (lange %2==0){

        }else {

        }


    }
}























