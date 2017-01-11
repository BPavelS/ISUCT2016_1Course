/**
 * Created by Pavel on 10.01.2017.
 */
public class LengthConverter {
    public double convertet(double a, String lg) {
        double b = 0;
        if (lg == "Km"){
            b = a * 1.609;}
            else if (lg =="Ml"){
            b = a * 0.621;}
        return b;
        }
    }//из км в мили вводит Km и наоборот.

