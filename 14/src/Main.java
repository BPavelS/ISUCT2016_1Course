/**
 * Created by Pavel on 10.01.2017.
 */
public class Main {
    public static void main(String[] args){
        TemperatureConverter tc = new TemperatureConverter();
        String a = tc.convertTemp(36,'F');
        System.out.print(a);
    }
}
