package classwork2;
/*
Създайте програма чрез която при въвеждане на число от 1 до 12 се извежда името на съответния месец.
*/
import java.util.Scanner;
public class Upr09 {
    public static void meseci(){
        System.out.println("Изберете месец като посочите неговото число: ");
        Scanner scr=new Scanner(System.in);
        int m=scr.nextInt();
        switch(m){
            case 1:
                System.out.println("Вие избрахте месец Януари.");
                break;
            case 2:
                System.out.println("Вие избрахте месец Февруари.");
                break;
            case 3:
                System.out.println("Вие избрахте месец Март.");
                break;
            case 4:
                System.out.println("Вие избрахте месец Април.");
                break;
            case 5:
                System.out.println("Вие избрахте месец Май.");
                break;
            case 6:
                System.out.println("Вие избрахте месец Юни.");
                break;
            case 7:
                System.out.println("Вие избрахте месец Юли.");
                break;
            case 8:
                System.out.println("Вие избрахте месец Август.");
                break;
            case 9:
                System.out.println("Вие избрахте месец Септември.");
                break;
            case 10:
                System.out.println("Вие избрахте месец Октомври.");
                break;
            case 11:
                System.out.println("Вие избрахте месец Ноември.");
                break;
            case 12:
                System.out.println("Вие избрахте месец Декември.");
                break;    
            default:
                System.out.println("Месеците са 12, така че въведете число от 1 до 12");
                meseci();
                }
        scr.close();
    }
}
