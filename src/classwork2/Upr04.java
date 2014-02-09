package classwork2;
/*
а). Създайте метод, който извежда максималното от две цели числа зададени като формални параметри.
б). Извикайте метода в основната програма.
*/
import java.util.Scanner;
public class Upr04 {
    public static void max(){
        Scanner scr=new Scanner(System.in);
        System.out.print("Въведете цяло число: ");
        int a=scr.nextInt();
        System.out.println();
        System.out.print("Въведете второто цяло число: ");
        int b=scr.nextInt();
        if(a<b){
            System.out.println("По-голямото число е: "+b);
        }
        else{
            System.out.println("По-голямото число е: "+a);
        }
    }
}
