package classwork2;
/*
a). Създайте метод „void m(int i1, i2)”, който извежда в конзолата списък с всички цели числа между i1 и i2 в нарастващ ред;
б). В основната програма, въведете от конзолата две цели числа и извикайте метода m.
        Примерен вход: 5 и 9.
        Изход от програмата за примерния вход: 5, 6, 7, 8, 9.
*/

import java.util.Arrays;
import java.util.Scanner;
public class Upr06 {
    public static void max(){
        int i1;
        int i2;
    Scanner inp=new Scanner(System.in);
    System.out.print("Въведете първата стойност: ");
    i1=inp.nextInt();
    System.out.print("Въведете втората стойност: ");
    i2=inp.nextInt();
    m(i1,i2);
    }
    public static void m(int i1,int i2){
        if(i1<i2){
        for(;i1<=i2;i1++){
        System.out.print(i1+",");
        }
             }
    else{
         for(;i2<=i1;i2++){
         System.out.print(i2+",");
        }  
                }
    }
    }
