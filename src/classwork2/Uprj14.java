/*
Даден е едномерен масив от цели числа. 
Изведете всички положителни елементи на масива. 
Изведете сумата от всички отрицателни елементи. 
1, -5, -4, 20, 0, 5, -4, 7
 */
package classwork2;
public class Uprj14 {
    public static void masiv(){
        int[] m={1, -5, -4, 20, 0, 5, -4, 7};
        int sum = 0;
        for(int i=0;i<m.length;i++){
            if(m[i]>=0){
                System.out.println("положителните числа в масива са: "+m[i]);                
            }
            else{                
                sum+=m[i];               
            }                
      }
        System.out.println("Сумата на отрицателните числа в масива е: "+sum);
        
    }
    
}
