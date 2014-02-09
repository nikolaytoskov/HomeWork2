/*
 Даден е едномерен масив от цели числа. 
Извеждайте последователно всички елементи на масива. 
Извеждането спира, ако се срещне елемент със стойност над 30.
 */
package classwork2;
import java.util.Arrays;
public class Uprj12 {
    public static void nadTrideset(){
        int[] m=new int[] {7,13,2,18,29,36,15,8};      
                for(int i=0; i <=m.length;i++){
                    if(m[i]<30){ 
                        System.out.println(m[i]);                  
                    }
                    else{
                        break;
                    }                    
                }                           
        }                     
    }