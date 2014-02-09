package classwork2;
/*
а). Да се създаде меню за избор на възможности за програма, обслужваща банкомат:
    1. Теглене на сума;
    2. Промяна на PIN;
    3. Проверка на наличност;
    4. Настройки;
    5. Изход.
б). Да се чете от конзолата въведеното число и да се извежда текст с описание на избраната операция.
*/
import java.util.Scanner;
public class Upr07 {
    public static void bankomat(){
        Scanner scr=new Scanner(System.in);
        System.out.println("1. Теглене на сума");
        System.out.println("2. Промяна на PIN");
        System.out.println("3. Проверка на наличност");
        System.out.println("4. Настройки");
        System.out.println("5. Изход");
        System.out.println("Моля, изберете число от 1 до 5");
        int a=scr.nextInt();
        switch(a){
            case 1: 
                System.out.println("Вие избрахте 1: Теглене на сума");
                break;
            case 2: 
                System.out.println("Вие избрахте 2: Промяна на PIN");
                break;
            case 3: 
                System.out.println("Вие избрахте 3: Проверка на наличност");
                break;
            case 4: 
                System.out.println("Вие избрахте 4: Настройки");
                break;
            case 5: 
                System.out.println("Вие избрахте 5: Изход");
                break;
            default: 
                System.out.println("Въвели сте грешен избор!");
                System.out.println("Въвeдете число от 1 до 5!");
                bankomat(); //при грешен избор, викам отново същия метод, за да се избере пак число.
                }
               
               scr.close();
    }
}
