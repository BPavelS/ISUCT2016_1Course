/**
 * Created by Pavel on 10.01.2017.
 */
public class TemperatureConverter {
    public String convertTemp (int temperature, char convertTo){
        double b = 0;
        if (convertTo  == 'F')  {b = temperature*9/5+32;}
        if (convertTo == 'C') {b = (temperature-32)/9/5;}
        String str = Double.toString(b);
        return str;
    }
}
