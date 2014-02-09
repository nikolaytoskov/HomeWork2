/*
 а). Създайте метод „void m1(int []масив)”, който получава като параметър едномерен 
     масив от цели числа. В тялото на метода се извеждат стойностите на елементите на 
     масива последователно от началото към края.
б). Създайте метод аналогичен на първия, който извежда елементите на масива в обратен ред – 
    последователно от последния към първия елемент.
в). В основната програма задайте масив от цели числа от конзолата като първо въведете броя на елементите на масива
    и след това самите елементи на масива. Извикайте методите от подточки a) и б) с параметър въведения масив. 
 */

package classwork2;
  import java.util.*;
public class Upr11 {
    public static void masiv(){
        Scanner scr=new Scanner(System.in);
        System.out.println("Въведете броя на елементите на масива: ");
        int e=scr.nextInt();
        int[] m=new int[e];
            for(int i=0;i<m.length;i++){
                System.out.println("Въведете стойностите на масива: ");
                m[i]=scr.nextInt();
            
                                   }
        m1(m);
        m2(m);
                               }
    public static void m1(int[] m){
        System.out.print("Стойностите на елементите на масива в Прав ред са: ");
           for(int i=0;i<m.length;i++){       
        }
        System.out.print(Arrays.toString(m));
        System.out.println();
    }
    public static void m2(int[] m){
        System.out.print("Стойностите на елементите на масива в Обратен ред са: ");
        int[] reversed = new int[m.length];
           for (int i = 0; i < m.length; i++) { 
           reversed[m.length - i - 1] = m[i];
       } 
       System.out.println(Arrays.toString(reversed));
              } 
}
