package classwork2;
/*
а). Създайте функция, която връща максималното от две цели числа, зададени като формални параметри.
б). Извикайте метода в основната програма.
*/
import java.util.Scanner;
public class Upr04aAnd05 {
    public static void max2(){
        Scanner scr=new Scanner(System.in);
        System.out.print("Въведете число: ");
        int a=scr.nextInt();
        System.out.print("Въведете число: ");
        int b=scr.nextInt();
        int c=a>b?a:b;
        System.out.println(c);
        System.out.println("Въведете нова стойност: ");
        int d=scr.nextInt();
        int e=c>d?c:d;
        System.out.println("Най-голямото число от трите е: "+e);
        
    }   
}
