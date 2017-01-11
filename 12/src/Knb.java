/**
 * Created by Pavel on 11.01.2017.
 */
public class Knb {
    public void method(int x, int y){
        if (Math.abs(x-y)==2){
            if(x>y){System.out.println("Победил первый игрок");}
            else {System.out.println("Победил второй игрок");}
        }
        else{if(x>y){System.out.println("Победил второй игрок");}
        else {if (x==y){System.out.println("Ничья");}
        else {System.out.println("Победил первый игрок");}
}}}}