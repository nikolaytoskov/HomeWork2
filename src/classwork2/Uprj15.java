/*
Изведете ‘пирамида’ от символи, увеличаващи се с един на всеки следващ ред:
А
АА
ААА
АААА
ААААА
 */
package classwork2;
public class Uprj15 {
    public static void piramida(){
        char a='A';
        for(int i=0;i<5;i++){
            for(int j=0;j<=i;j++)
            System.out.print(a);
            System.out.println("");
            
        }
    }
}
