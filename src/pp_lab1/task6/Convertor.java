package pp_lab1.task6;

public class Convertor {
    public static double convert_currency(String fCurrency, String sCurrency, double money){
        double[] valutes = {41, 1, 0.89, 1.35};
        double fromCurr = 0;
        double toCurr = 0;

        if(fCurrency.equals("USD")){
            fromCurr = valutes[1];
        } else if(fCurrency.equals("UAN")){
            fromCurr = valutes[0];
        } else if(fCurrency.equals("EUR")){
            fromCurr = valutes[2];
        } else if(fCurrency.equals("CAN")){
            fromCurr = valutes[3];
        }

        if(sCurrency.equals("USD")){
            toCurr = valutes[1];
        } else if(sCurrency.equals("UAN")){
            toCurr = valutes[0];
        } else if(sCurrency.equals("EUR")){
            toCurr = valutes[2];
        } else if(sCurrency.equals("CAN")){
            toCurr = valutes[3];
        }

        double result = money / fromCurr * toCurr;
        return result;
    }
}
