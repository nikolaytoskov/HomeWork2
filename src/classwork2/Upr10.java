package classwork2;
/*
o Декларирайте едномерен масив от 5 елемента от тип double;
o Задайте стойности на елементите на масива;
o Отпечатайте стойностите на елементите на масива.
*/
public class Upr10 {
    public static void masiv(){
        double[] m=new double[5];
        m[0]=123.54;
        m[1]=12.54;
        m[2]=1234.54;
        m[3]=1235.54;
        m[4]=123.5454;
       for(int i=0; i<5; i++)
           System.out.println(m[i]);
    }
}
