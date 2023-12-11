package finanzamt;

import java.io.IOException;

public class arthischmittel {
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
}
