package finanzamt;

import java.io.IOException;

public class maximalundminimal {
    private static void MaximalAbweichung(double x1, double x2)throws IOException {
        double rechenen=Math.max(x1,x2);
        System.out.println("Maximale Abweichung: "+rechenen);


    }

    private static void MinimaleAbweichung(double x1, double x2)throws IOException{
        double rechenen=Math.min(x1,x2);
        System.out.println("Minimale Abweichung: "+rechenen);

    }
}
