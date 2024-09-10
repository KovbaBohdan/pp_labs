package pp_lab1.task6;

public class Convertor {
    public static double convert_currency(String f_currency, String s_currency, double money){
        double[] valutes = {41, 1, 0.89, 1.35};
        double from_curr = 0;
        double to_curr = 0;

        if(f_currency.equals("USD")){
            from_curr = valutes[1];
        } else if(f_currency.equals("UAN")){
            from_curr = valutes[0];
        } else if(f_currency.equals("EUR")){
            from_curr = valutes[2];
        } else if(f_currency.equals("CAN")){
            from_curr = valutes[3];
        }

        if(s_currency.equals("USD")){
            to_curr = valutes[1];
        } else if(s_currency.equals("UAN")){
            to_curr = valutes[0];
        } else if(s_currency.equals("EUR")){
            to_curr = valutes[2];
        } else if(s_currency.equals("CAN")){
            to_curr = valutes[3];
        }

        double result = money / from_curr * to_curr;
        return result;
    }
}
