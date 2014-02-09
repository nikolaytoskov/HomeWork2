/*
а). Създайте метод, получаващ като параметър едномерен масив от цели числа, 
който връща индекса на първия срещнат елемент със стойност над 30. 

б). В основната програма реализирайте въвеждане на масив от конзолата и като използвате метода 
от т.а) изведете информация за първия срещнат елемент със стойност над 30.
 */
package classwork2;
import java.util.Scanner;
public class Uprj13 {
    public static void masiv(){
     Scanner scr=new Scanner(System.in);
        System.out.println("Въведете елементите на масива");
            int e=scr.nextInt();
            int[] m=new int[e];
        System.out.println("Въведете стойности на масива");
            for(int i=0;i<m.length;i++){
                m[i]=scr.nextInt();
                        
        nadTrideset(m);
            }
        
    }
    public static void nadTrideset(int[] m){
        for(int i=0; i <m.length;i++){
           if(m[i]>30){            
           System.out.println("индекса на първия срещнат елемент със стойност над 30 e: "+i); 
            break;
                    }           
                    }                 
        }
    
    }

